package com.miempresa.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btnIngresar;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        enlazarElementos();
        configurarEventoClick();

    }

    private void configurarEventoClick() {
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle datosEnviar = new Bundle();
                datosEnviar.putString("pantalla", "login");

                // creacion del intent para cambiar de pantalla
                Intent iPantallaLogin =
                        new Intent(MenuActivity.this, LoginActivity.class);

                iPantallaLogin.putExtras(datosEnviar);

                startActivity(iPantallaLogin);
                finish(); // para cerrar la actividad actual

            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle datosEnviar = new Bundle();
                datosEnviar.putString("pantalla", "registro");

                // creacion del intent para cambiar de pantalla
                Intent iPantallaRegistro =
                        new Intent(MenuActivity.this, RegistroActivity.class);

                iPantallaRegistro.putExtras(datosEnviar);

                startActivity(iPantallaRegistro);
                finish(); // para cerrar la actividad actual

            }
        });
    }

    private void enlazarElementos() {
        btnIngresar = findViewById(R.id.btnIngresar);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }

}
