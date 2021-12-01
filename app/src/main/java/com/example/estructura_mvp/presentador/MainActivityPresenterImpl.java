package com.example.estructura_mvp.presentador;

import com.example.estructura_mvp.interactor.MainActivityInteractorImpl;
import com.example.estructura_mvp.interfaces.InterInteractor;
import com.example.estructura_mvp.interfaces.InterPresenter;
import com.example.estructura_mvp.interfaces.InterfaceView;
import com.example.estructura_mvp.listeners.OnLogin;

public class MainActivityPresenterImpl implements InterPresenter, OnLogin {

    private InterfaceView view;
    private InterInteractor interactor;

    public MainActivityPresenterImpl(InterfaceView view ) {

        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }


    @Override
    public void login(String user, String pass) {
        if(view != null){
            view.showProgreso();
            interactor.validate(user,pass,this);
        }

    }

    @Override
    public void onSucces() {

        view.hideProgreso();
        view.succeful();
    }

    @Override
    public void onError() {
view.hideProgreso();
view.denied();
    }
}
