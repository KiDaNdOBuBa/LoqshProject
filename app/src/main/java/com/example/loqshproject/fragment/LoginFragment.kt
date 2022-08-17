package com.example.loqshproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.loqshproject.R
import com.example.loqshproject.databinding.FragmentLoginBinding
import com.example.loqshproject.viewModel.МainViewModel


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel: МainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        binding = FragmentLoginBinding.bind(view)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            viewModel.saveState(etEmail.text!!, etPass.text!!)
            etEmail.text = viewModel.loginLiveData.value
            etPass.text = viewModel.passwordLiveData.value
        }

//        with(binding){
//            viewModel.saveState(etEmail.text.toString(), etPass.text.toString())
//            viewModel.loginLiveData.observe(viewLifecycleOwner){
//                etEmail.setText(it)
//            }
//            viewModel.passwordLiveData.observe(viewLifecycleOwner){
//                etPass.setText(it)
//            }
//        }
    }
}