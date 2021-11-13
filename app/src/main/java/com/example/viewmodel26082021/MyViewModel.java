package com.example.viewmodel26082021;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> stringLiveData = new MutableLiveData<>();

    public LiveData<String> getStringLiveData(){
        return stringLiveData;
    }
    public void setStringLiveData(String string){
        stringLiveData.setValue(string);
    }
}
