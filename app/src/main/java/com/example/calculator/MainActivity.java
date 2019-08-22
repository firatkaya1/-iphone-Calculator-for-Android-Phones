package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;
    Button btnAc,btnPercent,btnMemory,btnDivide,btnMultiple,btnExtraction,btnAdd,btnEqual,btnCommo;
    TextView txtResult;
    double numbera1,numbera2;
    boolean add,mul,extra,divide;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbera1=Double.parseDouble(txtResult.getText().toString());
                add=true;
                txtResult.setText(null);
            }
        });
        btnExtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbera1=Double.parseDouble(txtResult.getText().toString());
                extra=true;
                txtResult.setText(null);
            }
        });
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbera1=Double.parseDouble(txtResult.getText().toString());
                mul=true;
                txtResult.setText(null);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbera1=Double.parseDouble(txtResult.getText().toString());
                divide=true;
                txtResult.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbera2=Double.parseDouble(txtResult.getText()+"");
                if(add==true){
                    txtResult.setText((numbera1+numbera2)+"");
                    add=false;
                }
                if(mul==true){
                    txtResult.setText((numbera1*numbera2)+"");
                    mul=false;
                }
                if(extra==true){
                    txtResult.setText((numbera1-numbera2)+"");
                    extra=false;
                }
                if(divide==true){
                    if(numbera2!=0) {
                        txtResult.setText((numbera1 / numbera2) + "");
                        divide = false;
                    }
                    else {
                        txtResult.setText("infinity");
                        divide=false;
                    }
                }


            }
        });

    }
    public void init(){
        btnZero=findViewById(R.id.btnZero);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);

        btnAc=findViewById(R.id.btnAC);
        btnPercent=findViewById(R.id.btnPercent);
        btnDivide=findViewById(R.id.btnDivide);
        btnMultiple=findViewById(R.id.btnMultiplication);
        btnExtraction=findViewById(R.id.btnExtraction);
        btnAdd=findViewById(R.id.btnAdd);
        btnEqual=findViewById(R.id.btnEqual);
        btnCommo=findViewById(R.id.btnCommo);
        btnMemory=findViewById(R.id.btnMemory);

        txtResult=findViewById(R.id.txtResult);


        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);

        btnAc.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiple.setOnClickListener(this);
        btnExtraction.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnCommo.setOnClickListener(this);
        btnMemory.setOnClickListener(this);


    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnZero:
                txtResult.setText(txtResult.getText()+""+0);

                break;
            case R.id.btnOne:
                txtResult.setText(txtResult.getText()+""+1);

                break;
            case R.id.btnTwo:
                txtResult.setText(txtResult.getText()+""+2);

                break;
            case R.id.btnThree:
                txtResult.setText(txtResult.getText()+""+3);

                break;
            case R.id.btnFour:
                txtResult.setText(txtResult.getText()+""+4);

                break;
            case R.id.btnFive:
                txtResult.setText(txtResult.getText()+""+5);

                break;
            case R.id.btnSix:
                txtResult.setText(txtResult.getText()+""+6);

                break;
            case R.id.btnSeven:
                txtResult.setText(txtResult.getText()+""+7);

                break;
            case R.id.btnEight:
                txtResult.setText(txtResult.getText()+""+8);

                break;
            case R.id.btnNine:
                txtResult.setText(txtResult.getText()+""+9);

                break;
            case R.id.btnAC:

                txtResult.setText("");
                break;
            case R.id.btnPercent:
                double number1=0;
                number1=Double.valueOf(txtResult.getText().toString());
                txtResult.setText(""+((number1)/100));

                break;
            case R.id.btnMemory:
                double deger=Double.parseDouble(txtResult.getText().toString());
                txtResult.setText(""+((Double.parseDouble(txtResult.getText().toString())*(-1))));
                break;

        }


    }


    public static double add(double x,double y){
        return x+y;
    }
    public static double extraction(double x,double y){
        return x-y;
    }
    public static double multiple(double x,double y){
        return x*y;
    }
    public static double divide(double x,double y){
        return x/y;
    }


}
