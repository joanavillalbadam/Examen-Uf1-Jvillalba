package com.example.alumnedam.examen_uf1_jvillalba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URISyntaxException;
import java.util.Random;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class activity2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent intent = new Intent();
        //recoje la operacion desde el intent
     /*   int operacions = intent.getIntExtra("opc",0);
        Toast.makeText(this, operacions, Toast.LENGTH_SHORT).show();
        if(operacions == 1){
            suma();
        }else if(operacions == 2){
            resta();
        }else if(operacions == 3){
            multiplicacion();
        }else if(operacions == 4){
            division();
        }
    }

    public void suma(){
        Random rand = new Random();
        int x = rand.nextInt(9);
        int y = rand.nextInt(9);
            TextView view1 = (TextView) findViewById(R.id.textView3);
            view1.setText(x);
            TextView view2 = (TextView) findViewById(R.id.textView2);
            view2.setText(y);
                int r = x+y;
                EditText text1 = (EditText) findViewById(R.id.editText2);
                Editable m = text1.getText();
             //Si r i m són iguales mandar 0, sino mandar 1
      //  int s = m;
        if( s == 0){

            }
    }
    public void resta(){
        Random rand = new Random();
        int x = rand.nextInt(9);
        int y = rand.nextInt(9);
        TextView view1 = (TextView) findViewById(R.id.textView3);
        view1.setText(x);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        view2.setText(y);
        int r = x-y;
        EditText text1 = (EditText) findViewById(R.id.editText2);
        text1.getText();
        //Si r i m són iguales mandar 0, sino mandar 1

    }
    public void multiplicacion(){
        Random rand = new Random();
        int x = rand.nextInt(9);
        int y = rand.nextInt(9);
        TextView view1 = (TextView) findViewById(R.id.textView3);
        view1.setText(x);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        view2.setText(y);
        int r = x*y;
        EditText text1 = (EditText) findViewById(R.id.editText2);
        text1.getText();
        //Si r i m són iguales mandar 0, sino mandar 1

    }
    public void division(){
        Random rand = new Random();
        int x = rand.nextInt(9);
        int y = rand.nextInt(9);
        TextView view1 = (TextView) findViewById(R.id.textView3);
        view1.setText(x);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        view2.setText(y);
        int r = x/y;
        EditText text1 = (EditText) findViewById(R.id.editText2);
        text1.getText();
        //Si r i m són iguales mandar 0, sino mandar 1*/
    }
}


