package com.example.estructura_mvp.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.estructura_mvp.R;
import com.example.estructura_mvp.interfaces.InterPresenter;
import com.example.estructura_mvp.interfaces.InterfaceView;
import com.example.estructura_mvp.presentador.MainActivityPresenterImpl;

public class Login extends AppCompatActivity implements InterfaceView {

 private   Button btn;
private EditText edt;
 private   EditText edt2;
 private ProgressBar pb;

    private InterPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        edt = (EditText) findViewById(R.id.edt);
        edt2 = (EditText) findViewById(R.id.edt);
        pb = (ProgressBar) findViewById(R.id.pb);

        presenter = new MainActivityPresenterImpl(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sesion();

            }
        });
    }

    private void sesion(){

        presenter.login( edt.getText().toString(),edt2.getText().toString());

    }

    @Override
    public void showProgreso() {
pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgreso() {
pb.setVisibility(View.INVISIBLE);
    }

    @Override
    public void succeful() {
        Toast.makeText(this, "Acceso correcto", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void denied() {
        Toast.makeText(this, "Acceso incorrecto", Toast.LENGTH_SHORT).show();

    }
}