package com.example.alumnedam.examen_uf1_jvillalba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAceptar = (Button) findViewById(R.id.guardar);
        btnAceptar.setOnClickListener(this);
    }

       public void onClick(View v) {
           if (v.getId() == R.id.guardar) {
               RadioGroup grupo = (RadioGroup) findViewById(R.id.grupobtn);
               final Intent intent = new Intent(this, activity2.class);
               // comprueba cual de los checkbox a sido seleccionado
               int pregun = 0;
               RadioGroup grupo1 = (RadioGroup) findViewById(R.id.grupobtn2);
               int opc = 0;
               switch (grupo.getCheckedRadioButtonId()) {
                   case R.id.checkBox:
                       switch (grupo.getCheckedRadioButtonId()) {
                           case R.id.checkBox8:
                               pregun = 10;
                               break;
                           case R.id.checkBox10:
                               pregun = 15;
                               break;
                           case R.id.checkBox12:
                               pregun = 20;
                               break;
                       }
                       opc = 1;
                       intent.putExtra("opc", opc);
                       intent.putExtra("pregun", pregun);
                       break;
                   case R.id.checkBox2:
                       switch (grupo.getCheckedRadioButtonId()) {
                           case R.id.checkBox8:
                               pregun = 10;
                               break;
                           case R.id.checkBox10:
                               pregun = 15;
                               break;
                           case R.id.checkBox12:
                               pregun = 20;
                               break;
                       }
                            opc = 2;
                           intent.putExtra("opc", opc);
                           break;
                           case R.id.checkBox3:
                               switch (grupo.getCheckedRadioButtonId()) {
                                   case R.id.checkBox8:
                                       pregun = 10;
                                       break;
                                   case R.id.checkBox10:
                                       pregun = 15;
                                       break;
                                   case R.id.checkBox12:
                                       pregun = 20;
                                       break;
                               }
                                   opc = 3;
                                   intent.putExtra("opc", opc);
                                   break;
                                   case R.id.checkBox4:
                                       switch (grupo.getCheckedRadioButtonId()) {
                                           case R.id.checkBox8:
                                               pregun = 10;
                                               break;
                                           case R.id.checkBox10:
                                               pregun = 15;
                                               break;
                                           case R.id.checkBox12:
                                               pregun = 20;
                                               break;
                                       }
                                           opc = 4;
                                           intent.putExtra("opc", opc);
                                           break;
                                       }
                                       //envia cual ha sido seleccionado a activity2
                                       startActivity(intent);
                               }
                       }
               }


