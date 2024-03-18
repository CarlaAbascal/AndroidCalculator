package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSuma,btnResta,btnMulti,btnDiv,btnSIN,btnCOS,btnTAN,btnIgual,btnClear,btnComa,swDegRad;//declarar buttons

    Switch sw_DrgRad;
    TextView text;
    Operation operation;
    double num1;
    double num2;
    double res;
    boolean trig= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textView);
        btn0=findViewById(R.id.button0);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnSuma=findViewById(R.id.buttonSuma);
        btnResta=findViewById(R.id.buttonResta);
        btnMulti=findViewById(R.id.buttonMulti);
        btnDiv=findViewById(R.id.buttonDiv);
        btnSIN=findViewById(R.id.buttonSIN);
        btnCOS=findViewById(R.id.buttonCOS);
        btnTAN=findViewById(R.id.buttonTAN);
        btnIgual=findViewById(R.id.buttonIgual);
        btnClear=findViewById(R.id.buttonClear);
        btnComa=findViewById(R.id.buttonComa);
        swDegRad=findViewById(R.id.switchDegRad);
        //acabar tots els botons
    }

    //amb tots els butons cambiar nom del click
    public void btn0Click(android.view.View v){
        text.setText(text.getText()+"0");}
    public void btn1Click(android.view.View v){
        text.setText(text.getText()+"1");}
    public void btn2Click(android.view.View v){
        text.setText(text.getText()+"2");}
    public void btn3Click(android.view.View v){
        text.setText(text.getText()+"3");}
    public void btn4Click(android.view.View v){
        text.setText(text.getText()+"4");}
    public void btn5Click(android.view.View v){
        text.setText(text.getText()+"5");}
    public void btn6Click(android.view.View v){
        text.setText(text.getText()+"6");}
    public void btn7Click(android.view.View v){
        text.setText(text.getText()+"7");}
    public void btn8Click(android.view.View v){
        text.setText(text.getText()+"8");}
    public void btn9Click(android.view.View v){
        text.setText(text.getText()+"9");}
    public void btnComaClick(android.view.View v){
        text.setText(text.getText()+",");}

    public void btnClearClick(android.view.View v){
        if(text.getText().length()>0)
            text.setText("");}
    public void btnSumaClick(android.view.View v){
        operation =new Suma();
        Suma sum=(Suma) operation;
        num1= Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnRestaClick(android.view.View v) {
        operation = new Resta();
        Resta resta = (Resta) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnMultiClick(android.view.View v) {
        operation = new Multiplicacio();
        Multiplicacio multi = (Multiplicacio) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnDivClick(android.view.View v) {
        operation = new Divisio();
        Divisio div = (Divisio) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnSinClick(android.view.View v) {
        operation = new Sinus();
        Sinus sin = (Sinus) operation;
        trig = true;
    }
    public void btnCosClick(android.view.View v) {
        operation = new Cosinus();
        Cosinus cos = (Cosinus) operation;
        trig = true;
    }
    public void btnTanClick(android.view.View v) {
        operation = new Tangent();
        Tangent tan = (Tangent) operation;
        trig = true;
    }
    public void btnIgualClick (View v){
        if (operation == null){
            return;
        }
        if (trig){
            num1 = Double.parseDouble(text.getText().toString());
            if(swDegRad.isPressed()){
                num2 = 1; //graus
            }
            else{
                num2 = 0;//radians
            }
            trig = false;
        }
        else{
            num2 = Double.parseDouble(text.getText().toString());
        }
        res = operation.operation(num1,num2);
        text.setText(String.valueOf(res));
    }


}
