package com.cookandroid.helloandroid;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMod = (Button) findViewById(R.id.BtnMod);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (Double.parseDouble(num2) == 0) {
                        textResult.setText("0으로 나눌 수 없습니다.");
                    } else {
                        double divResult = Double.parseDouble(num1) / Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + divResult);
                    }
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}