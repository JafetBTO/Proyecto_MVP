package com.example.estructura_mvp.interactor;

import com.example.estructura_mvp.interfaces.InterInteractor;
import com.example.estructura_mvp.interfaces.InterPresenter;

public class MainActivityInteractorImpl implements InterInteractor {
    private InterPresenter presenter;
    String data;

    public MainActivityInteractorImpl(InterPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {

        data = s + " " + "prueba";
        presenter.showResult(data);
    }
}
