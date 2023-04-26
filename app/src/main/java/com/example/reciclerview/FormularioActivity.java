package com.example.reciclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class FormularioActivity extends AppCompatActivity {
    private TextInputEditText tietnombre;
    private TextInputEditText tietapellidos;
    private Spinner spinner;
    private Button bAceptar;
    private Button bCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        tietnombre = findViewById(R.id.tietNombre);
        tietapellidos = findViewById(R.id.tietApellidos);
        spinner = findViewById(R.id.spinner);
        bAceptar = findViewById(R.id.buttonAceptar);
        bCancelar = findViewById(R.id.buttonCancelar);

        //Cargamos el spinner con las profesiones
        ArrayAdapter<Profesion> myAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                ProfesionRepository.getInstance().getAll());
        spinner.setAdapter(myAdapter);
//gestionamos el botón cancelar comunicando que el resultado se canceló
        bCancelar.setOnClickListener(v -> {
            Intent i = new Intent();
            setResult(RESULT_CANCELED,i);
            finish();
        });
//gestionamos el botón aceptar comunicando la intención con la información a pasar al layout que llamó
        bAceptar.setOnClickListener(v -> {
            Intent i = new Intent();
            String nombre = tietnombre.getText().toString();
            String apellidos = tietapellidos.getText().toString();
            Profesion profesion = (Profesion) spinner.getSelectedItem();
            i.putExtra("usuario", new Usuario(nombre, apellidos,
                    profesion.getImg()));
            setResult(RESULT_OK,i);
            finish();
        });
    }
}
