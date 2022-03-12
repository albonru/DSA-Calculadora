package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public String n1 = "";
    public double num1 = 0;
    public String n2 = "";
    public double num2 = 0;
    public boolean pendingOp = false;
    public String op = "";
    public double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "0";
                else
                    n1 = n1 + "0";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "1";
                else
                    n1 = n1 + "1";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "2";
                else
                    n1 = n1 + "2";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "3";
                else
                    n1 = n1 + "3";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "4";
                else
                    n1 = n1 + "4";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "5";
                else
                    n1 = n1 + "5";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "6";
                else
                    n1 = n1 + "6";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "7";
                else
                    n1 = n1 + "7";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "8";
                else
                    n1 = n1 + "8";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + "9";
                else
                    n1 = n1 + "9";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button sumBtn = (Button) findViewById(R.id.sumBtn);
        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pendingOp) {
                    num1 = Double.parseDouble(n1);
                    num2 = Double.parseDouble(n2);
                    switch(op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    num1 = result;
                    n1 = Double.toString(num1);
                    n2 = "";
                }
                else
                    pendingOp = true;
                op = "+";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button resBtn = (Button) findViewById(R.id.resBtn);
        resBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pendingOp) {
                    num1 = Double.parseDouble(n1);
                    num2 = Double.parseDouble(n2);
                    switch(op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    num1 = result;
                    n1 = Double.toString(num1);
                    n2 = "";
                }
                else
                    pendingOp = true;
                op = "-";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pendingOp) {
                    num1 = Double.parseDouble(n1);
                    num2 = Double.parseDouble(n2);
                    switch(op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    num1 = result;
                    n1 = Double.toString(num1);
                    n2 = "";
                }
                else
                    pendingOp = true;
                op = "/";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pendingOp) {
                    num1 = Double.parseDouble(n1);
                    num2 = Double.parseDouble(n2);
                    switch(op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    num1 = result;
                    n1 = Double.toString(num1);
                    n2 = "";
                }
                else
                    pendingOp = true;
                op = "*";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button eqBtn = (Button) findViewById(R.id.eqBtn);
        eqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(n1);
                num2 = Double.parseDouble(n2);
                switch(op) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(result + "");
                n1 = "";
                n2 = "";
                pendingOp = false;
                result = 0;
                op = "";
            }
        });

        Button sinBtn = (Button) findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button cosBtn = (Button) findViewById(R.id.cosBtn);
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button tanBtn = (Button) findViewById(R.id.tanBtn);
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button comaBtn = (Button) findViewById(R.id.comaBtn);
        comaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pendingOp)
                    n2 = n2 + ".";
                else
                    n1 = n1 + ".";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(n1 + op + n2);
            }
        });

        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                pendingOp = false;
                result = 0;
                op = "";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(result + "");
            }
        });
    }
}