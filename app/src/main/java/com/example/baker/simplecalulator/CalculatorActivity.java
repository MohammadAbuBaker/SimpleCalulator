package com.example.baker.simplecalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText eTextFirstNumber,eTextSecondNumber;
    Button btnPlus,btnSub,btnMulti,btnDiv;
    TextView txtResult;

    public float firstNumber=0,secondNumber=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //initialization
        eTextFirstNumber=(EditText)findViewById(R.id.eTextFirstNumber);
        eTextSecondNumber=(EditText)findViewById(R.id.eTextSecondNumber);

        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);

        txtResult=(TextView)findViewById(R.id.txtResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber+secondNumber;
                txtResult.setText(firstNumber+" + "+secondNumber+" = "+result);
                eTextFirstNumber.setText("");
                eTextSecondNumber.setText("");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber-secondNumber;
                txtResult.setText(firstNumber+" - "+secondNumber+" = "+result);

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber*secondNumber;
                txtResult.setText(firstNumber+" * "+secondNumber+" = "+result);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result=firstNumber+secondNumber;
                txtResult.setText(firstNumber+" / "+secondNumber+" = "+result);
            }
        });

    }

    public void numberInput(){
        //checking number fields empty or not
        if(TextUtils.isEmpty((eTextFirstNumber.getText().toString()))|| TextUtils.isEmpty(eTextSecondNumber.getText().toString())){

            return;
        }
        else{ //parse string value to Folat values
            firstNumber=Float.parseFloat(eTextFirstNumber.getText().toString());
            secondNumber=Float.parseFloat(eTextSecondNumber.getText().toString());
        }

    }
}
