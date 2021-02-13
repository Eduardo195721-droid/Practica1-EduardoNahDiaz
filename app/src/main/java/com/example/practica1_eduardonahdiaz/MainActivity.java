package com.example.practica1_eduardonahdiaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View vista){
        etNombre = findViewById(R.id.et_name);
        String nombre = String.valueOf(etNombre.getText());
        Toast.makeText(getBaseContext(), "hola "+nombre, Toast.LENGTH_SHORT).show();
    }
}