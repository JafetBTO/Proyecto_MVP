package com.example.estructura_mvp.presentador;

import com.example.estructura_mvp.interactor.MainActivityInteractorImpl;
import com.example.estructura_mvp.interfaces.InterInteractor;
import com.example.estructura_mvp.interfaces.InterPresenter;
import com.example.estructura_mvp.interfaces.InterfaceView;

public class MainActivityPresenterImpl implements InterPresenter {

    private InterfaceView view;
    private InterInteractor interactor;

    public MainActivityPresenterImpl(InterfaceView view ) {

        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }


    @Override
    public void showResult(String s) {
if(view != null){
    view.showResult(s);
}
    }

    @Override
    public void addName(String s) {
if(view != null){
    interactor.addName(s);
}
    }
}
