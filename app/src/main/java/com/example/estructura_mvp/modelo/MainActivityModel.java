package com.example.estructura_mvp.modelo;

import com.example.estructura_mvp.MainInterface;
import com.example.estructura_mvp.presentador.MainActivityPresenter;

public class MainActivityModel implements MainInterface.model {
    private MainInterface.Presenter presenter;
    String data;

    public MainActivityModel(MainInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {

        data = s + " " + "prueba";
        presenter.showResult(data);
    }
}
