package com.example.sueldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sueldo.model.PagoSueldo;

public class MainActivity extends AppCompatActivity {
//Paso 1:Declara los Views a manipular
   Button btnSalir;
   Button btnNuevo;
   Button btnCalcular;
   EditText txtNombre;
   EditText txtHoras;
   EditText txtPrecio;
   Spinner Empleado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Paso 2:Inicializar los Views con su identificador (id) del .xml
        txtHoras=findViewById(R.id.EtHoras);
        txtNombre=findViewById(R.id.EtNombre);
        txtPrecio=findViewById(R.id.EtPrecio);
        btnCalcular=findViewById(R.id.Calcular);
        btnNuevo=findViewById(R.id.Nuevo);
        btnSalir=findViewById(R.id.Salir);
        Empleado=findViewById(R.id.Empleado);

        //Paso 7:definir los elementos de la lista despleglable
        String [] Tipo_Empleado = {"Tipo 1","Tipo 2","Tipo 3","Tipo 4"};

        //Paso 4:Crear adaptador
        ArrayAdapter<String> Opciones= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,Tipo_Empleado);

        //Paso 3:Crear eventos clic para el boton calcular
        Empleado.setAdapter(Opciones);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                int horas;
                int precio;
                String puesto;

                //Paso 5:Recibir los datos de los EditText
                horas=Integer.parseInt(txtHoras.getText().toString());
                precio=Integer.parseInt(txtPrecio.getText().toString());
                nombre=txtNombre.getText().toString();
                puesto=Empleado.getSelectedItem().toString();

                //Paso 6:Comunicar con el TDA
                PagoSueldo pago = new PagoSueldo();
                pago.setHoras(horas);
                pago.setPrecioHora(precio);
                pago.setNombre(nombre);
                pago.setPuesto(puesto);
                Toast.makeText(getApplicationContext(),pago.nuevoSalario(),Toast.LENGTH_LONG).show();


            }
        });
    }


    public void salir(View view){
        finish();
    }
}