package com.example.estructura_mvp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.estructura_mvp.MainInterface;
import com.example.estructura_mvp.R;
import com.example.estructura_mvp.presentador.MainActivityPresenter;

public class MainActivityView extends AppCompatActivity implements MainInterface.View {

    Button btn;
  TextView txt;
EditText edt;
    private MainInterface.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);
        edt = (EditText) findViewById(R.id.edt);
        presenter = new MainActivityPresenter(this);

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