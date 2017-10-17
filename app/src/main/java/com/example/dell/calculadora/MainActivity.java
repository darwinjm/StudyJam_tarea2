package com.example.dell.calculadora;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cajaUno;
    private double operando1, operando2, res;

    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        cajaUno = (EditText) findViewById(R.id.caja1);


    }

    public void bt1(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "1";
        cajaUno.setText(cap);
    }

    public void bt2(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "2";
        cajaUno.setText(cap);
    }

    public void bt3(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "3";
        cajaUno.setText(cap);
    }

    public void bt4(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "4";
        cajaUno.setText(cap);
    }

    public void bt5(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "5";
        cajaUno.setText(cap);
    }

    public void bt6(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "6";
        cajaUno.setText(cap);
    }

    public void bt7(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "7";
        cajaUno.setText(cap);
    }

    public void bt8(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "8";
        cajaUno.setText(cap);
    }

    public void bt9(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "9";
        cajaUno.setText(cap);
    }

    public void bt0(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + "0";
        cajaUno.setText(cap);
    }

    public void btpt(View v) {
        String cap = cajaUno.getText().toString();
        cap = cap + ".";
        cajaUno.setText(cap);
    }

    public void sum(View v) {
        {
            try {
                String aux1 = cajaUno.getText().toString();
                operando1 = Double.parseDouble(aux1);

            } catch (NumberFormatException nfe) {
            }

            cajaUno.setText("");
            ope = 1;

        }

    }

    public void resta(View v)
    {
        try {
            String aux1 = cajaUno.getText().toString();
            operando1 = Double.parseDouble(aux1);

        } catch (NumberFormatException fe) {
        }
        cajaUno.setText("");
        ope = 2;

    }
    public void  multiplicacion (View v){
        try{
            String aux1=cajaUno.getText().toString();
            operando1=Double.parseDouble(aux1);

        }catch(NumberFormatException nfe){}
        cajaUno.setText("");
        ope=3;

    }
    public void  division(View v){
        try{
            String aux1=cajaUno.getText().toString();
            operando1=Double.parseDouble(aux1);

        }catch(NumberFormatException fe){}
        cajaUno.setText("");
        ope=4;

    }
    public void igual (View v){
        try{
            String aux2=cajaUno.getText().toString();
            operando2=Double.parseDouble(aux2);

        }catch(NumberFormatException fe){}
        cajaUno.setText(" ");

        if (ope==1){
            res=operando1+operando2;
        }else if (ope==2){
            res=operando1-operando2;
        }else if (ope==3){
            res=operando1*operando2;
        }else if (ope==4){
            if (operando2==0) {
                cajaUno.setText("Error");
            }else {
                res = operando1 / operando2;
            }
        }
        cajaUno.setText(""+res);
        operando1=res;
    }
    public  void clear (View v){
        cajaUno.setText("");
        operando1=0;
        operando2=0;
        res=0;
    }

    public void off (View v){

        finish();
    }

    public void dell(View v){
        if (!cajaUno.getText().toString().equals("")){
            cajaUno.setText(cajaUno.getText().subSequence(0,cajaUno.getText().length()-1)+"");
        }
    }

}
