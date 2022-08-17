package com.example.loqshproject.viewModel

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loqshproject.databinding.FragmentLoginBinding

class МainViewModel: ViewModel() {
    var loginLiveData = MutableLiveData<Editable>()
    var passwordLiveData = MutableLiveData<Editable>()

    fun saveState(email:Editable, password:Editable){
            loginLiveData.value = email
            passwordLiveData.value = password
    }
}