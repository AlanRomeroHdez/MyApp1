package mx.itson.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.btnAceptar)).setOnClickListener(this);


    }

    @Override
    public void onClick(View view){
        String nombre = ((TextView)findViewById(R.id.txtNombre)).getText().toString();
        Toast.makeText(getApplicationContext(), "Hola " + nombre + "Bienvenido a android", Toast.LENGTH_LONG).show();
    }

}