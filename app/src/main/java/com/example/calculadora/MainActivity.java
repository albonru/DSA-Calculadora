package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
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
    public boolean radians = false;
    public String trigonometry ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "0";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "0";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "1";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "1";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "2";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "2";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "3";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "3";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "4";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "4";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "5";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "5";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "6";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "6";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "7";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "7";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "8";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "8";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + "9";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + "9";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
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

                    switch(trigonometry) {
                        case "sin":
                            if (radians)
                                num2 = Math.sin(num2);
                            else
                                num2 = Math.sin(num2* ((2*Math.PI)/365));
                            trigonometry = "";
                            break;
                        case "cos":
                            if (radians)
                                num2 = Math.cos(num2);
                            else
                                num2 = Math.cos(num2* ((2*Math.PI)/365));
                            trigonometry = "";
                            break;
                        case "tan":
                            if (radians)
                                num2 = Math.tan(num2);
                            else
                                num2 = Math.tan(num2* ((2*Math.PI)/365));
                            trigonometry = "";
                            break;
                        default:
                            num2 = num2;
                            break;
                    }

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
                    op = "*";

                    TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                    resultTextView.setText(n1 + op + n2);
                }
                else {
                    switch (trigonometry) {
                        case "sin":
                            if (radians)
                                result = Math.sin(num1);
                            else
                                result = Math.sin(num1 * ((2 * Math.PI) / 360));
                            trigonometry = "";
                            break;
                        case "cos":
                            if (radians)
                                result = Math.cos(num1);
                            else
                                result = Math.cos(num1 * ((2 * Math.PI) / 360));
                            trigonometry = "";
                            break;
                        case "tan":
                            if (radians)
                                result = Math.tan(num1);
                            else
                                result = Math.tan(num1 * ((2 * Math.PI) / 360));
                            trigonometry = "";
                            break;
                        default:
                            result = num1;
                            break;
                    }
                    num1 = result;
                    n1 = Double.toString(num1);
                    pendingOp = true;
                    op = "*";
                    TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
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
                num1 = 0;
                num2 = 0;
                pendingOp = false;
                result = 0;
                op = "";
            }
        });

        Button sinBtn = (Button) findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trigonometry = "sin";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(trigonometry);
            }
        });

        Button cosBtn = (Button) findViewById(R.id.cosBtn);
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trigonometry = "cos";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(trigonometry);
            }
        });

        Button tanBtn = (Button) findViewById(R.id.tanBtn);
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trigonometry = "tan";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(trigonometry);
            }
        });

        Button comaBtn = (Button) findViewById(R.id.comaBtn);
        comaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                if(pendingOp) {
                    n2 = n2 + ".";
                    resultTextView.setText(n1 + op + trigonometry + n2);
                }
                else {
                    n1 = n1 + ".";
                    resultTextView.setText(trigonometry + n1 + op + n2);
                }
            }
        });

        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                n1 = "";
                n2 = "";
                pendingOp = false;
                result = 0;
                op = "";
                trigonometry = "";
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText(result + "");
            }
        });

        Switch radSw = (Switch) findViewById(R.id.radSW);
        radSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                    radians = true;
                else
                    radians = false;
            }
        });
    }

}