package com.example.estructura_mvp.interactor;

import android.os.Handler;

import com.example.estructura_mvp.interfaces.InterInteractor;
import com.example.estructura_mvp.interfaces.InterPresenter;
import com.example.estructura_mvp.listeners.OnLogin;


public class MainActivityInteractorImpl implements InterInteractor {
    private InterPresenter presenter;
    String data;

    public MainActivityInteractorImpl(InterPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void validate(String user, String pass, OnLogin listener) {
 new Handler().postDelayed(new Runnable() {
     @Override
     public void run() {
         if(user.length()>0 && pass.length()>0){
             listener.onSucces();
         }else{
             listener.onError();
         }
     }
 },3000);

    }
}
