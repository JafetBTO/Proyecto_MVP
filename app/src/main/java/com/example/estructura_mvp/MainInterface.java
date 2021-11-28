package com.example.estructura_mvp;

public interface MainInterface {

    interface View{
void showResult(String s);
    }

    interface Presenter{
        void showResult(String s);

        void addName( String s);

    }
    interface model{
void addName( String s);
    }
}

