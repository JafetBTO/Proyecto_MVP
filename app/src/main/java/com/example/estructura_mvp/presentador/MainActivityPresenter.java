package com.example.estructura_mvp.presentador;

import com.example.estructura_mvp.MainInterface;
import com.example.estructura_mvp.modelo.MainActivityModel;
import com.example.estructura_mvp.vista.MainActivityView;

public class MainActivityPresenter implements MainInterface.Presenter {

    private MainInterface.View view;
    private MainInterface.model model;

    public MainActivityPresenter(MainInterface.View view ) {

        this.view = view;
        model = new MainActivityModel(this);
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
    model.addName(s);
}
    }
}
