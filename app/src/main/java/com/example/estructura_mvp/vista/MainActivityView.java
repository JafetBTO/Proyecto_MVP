package com.example.estructura_mvp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.estructura_mvp.R;
import com.example.estructura_mvp.interfaces.InterPresenter;
import com.example.estructura_mvp.interfaces.InterfaceView;
import com.example.estructura_mvp.presentador.MainActivityPresenterImpl;

public class MainActivityView extends AppCompatActivity implements InterfaceView {

    Button btn;
  TextView txt;
EditText edt;
    private InterPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);
        edt = (EditText) findViewById(R.id.edt);
        presenter = new MainActivityPresenterImpl(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sendData();

            }
        });
    }

    private void sendData(){
presenter.addName(edt.getText().toString());

    }

    @Override
    public void showResult(String s) {
txt.setText(s);
    }
}