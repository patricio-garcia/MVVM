package cl.desafiolatam.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cl.desafiolatam.mvvm.model.Generator;

public class MyViewModel extends ViewModel {
    private Generator generator;
    public MutableLiveData<String> mldPassword;

    public MyViewModel() {
        this.generator = new Generator();
        mldPassword = new MutableLiveData();
    }

    public void passwordGenerate() {
        String password = generator.passwordGenerator();
        mldPassword.setValue(password);
    }


}
