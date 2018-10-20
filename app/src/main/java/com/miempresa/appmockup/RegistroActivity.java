package com.miempresa.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistroActivity extends AppCompatActivity {

    //@BindView(R.id.btnRegresar) Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ButterKnife.bind(this);

        obtenerParametros();
    }

    private void obtenerParametros() {
        Bundle datosRecbidos = getIntent().getExtras();
        if (datosRecbidos != null) {
            String datosRecuperado = datosRecbidos.getString("pantalla");
            if (datosRecuperado != null) {
                Log.i("RegistroActivity", "pantalla: " + datosRecuperado);
            }
        }
    }

    @OnClick(R.id.btnRegresar)
    void regresarPantallaMenu() {
        Intent iPantallaMenu =
                new Intent(RegistroActivity.this, MenuActivity.class);
        startActivity(iPantallaMenu);
        finish();
    }


}
