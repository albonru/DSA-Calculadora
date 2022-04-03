package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Double firstNum, secondNum, result;

    Boolean add, res, div, mult;
    Boolean tan, sin, cos;
    Boolean operation; //pending operation

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button sumBtn, resBtn, multBtn, divBtn;
    Button clearBtn, eqBtn;
    Button sinBtn, cosBtn, tanBtn;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button initialization
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener((View.OnClickListener) this);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener((View.OnClickListener) this);

        sumBtn = findViewById(R.id.sumBtn);
        sumBtn.setOnClickListener((View.OnClickListener) this);
        resBtn = findViewById(R.id.resBtn);
        resBtn.setOnClickListener((View.OnClickListener) this);
        multBtn = findViewById(R.id.multBtn);
        multBtn.setOnClickListener((View.OnClickListener) this);
        divBtn = findViewById(R.id.divBtn);
        divBtn.setOnClickListener((View.OnClickListener) this);
        clearBtn = findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener((View.OnClickListener) this);
        eqBtn = findViewById(R.id.eqBtn);
        eqBtn.setOnClickListener((View.OnClickListener) this);
        tanBtn = findViewById(R.id.tanBtn);
        tanBtn.setOnClickListener((View.OnClickListener) this);
        sinBtn = findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener((View.OnClickListener) this);
        cosBtn = findViewById(R.id.cosBtn);
        cosBtn.setOnClickListener((View.OnClickListener) this);

        // textview initialization
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setText("");
    }

        @Override
        public void onClick(View view) {
            String x = resultTextView.getText().toString();
            Button btn = (Button) view;

            try{
                switch (btn.getId()) {
                    case R.id.btn0:
                        resultTextView.setText(x + "0");
                        break;
                    case R.id.btn1:
                        resultTextView.setText(x + "1");
                        break;
                    case R.id.btn2:
                        resultTextView.setText(x + "2");
                        break;
                    case R.id.btn3:
                        resultTextView.setText(x + "3");
                        break;
                    case R.id.btn4:
                        resultTextView.setText(x + "4");
                        break;
                    case R.id.btn5:
                        resultTextView.setText(x + "5");
                        break;
                    case R.id.btn6:
                        resultTextView.setText(x + "6");
                        break;
                    case R.id.btn7:
                        resultTextView.setText(x + "7");
                        break;
                    case R.id.btn8:
                        resultTextView.setText(x + "8");
                        break;
                    case R.id.btn9:
                        resultTextView.setText(x + "9");
                        break;
                    case R.id.clearBtn:
                        resultTextView.setText("");
                        break;
                    case R.id.sumBtn:
                        add = true;
                        firstNum=Double.parseDouble(x);
                        resultTextView.setText(String.valueOf(x + "+"));
                        break;
                    case R.id.resBtn:
                        res = true;
                        firstNum=Double.parseDouble(x);
                        resultTextView.setText(String.valueOf(x + "-"));
                        break;
                    case R.id.multBtn:
                        mult = true;
                        firstNum=Double.parseDouble(x);
                        resultTextView.setText(String.valueOf(x + "*"));
                        break;
                    case R.id.divBtn:
                        div = true;
                        firstNum=Double.parseDouble(x);
                        resultTextView.setText(String.valueOf(x + "/"));
                        break;
                    case R.id.cosBtn:
                        firstNum= Double.parseDouble(x);
                        resultTextView.setText(String.valueOf("cos " + firstNum));
                        result = Math.cos(firstNum  * Math.PI/180);
                        resultTextView.setText(String.valueOf(result));
                        break;
                    case R.id.sinBtn:
                        firstNum= Double.parseDouble(x);
                        resultTextView.setText("sin " + firstNum));
                        result = Math.sin(firstNum * Math.PI/180);
                        resultTextView.setText(String.valueOf(result));
                        break;
                    case R.id.tanBtn:
                        firstNum= Double.parseDouble(x);
                        resultTextView.setText(String.valueOf("tan " + firstNum));
                        result = Math.tan(firstNum * Math.PI/180);
                        resultTextView.setText(String.valueOf(result));
                        break;
                    case R.id.eqBtn:
                        secondNum = Double.parseDouble(x);
                        if(add){
                            resultTextView.setText(String.valueOf(firstNum + "+" + secondNum));
                            result = firstNum + secondNum;
                            resultTextView.setText(String.valueOf(result));
                        }else if (res){
                            resultTextView.setText(String.valueOf(firstNum + "-" + secondNum));
                            result = firstNum - secondNum;
                            resultTextView.setText(String.valueOf(result));
                        }else if (mult){
                            resultTextView.setText(String.valueOf(firstNum + "*" + secondNum));
                            result = firstNum * secondNum;
                            resultTextView.setText(String.valueOf(result));
                        }else if (div){
                            resultTextView.setText(String.valueOf(firstNum + "/" + secondNum));
                            result = firstNum / secondNum;
                            resultTextView.setText(String.valueOf(result));
                        }
                        add = false;
                        res = false;
                        mult = false;
                        div = false;
                        break;
                }
            }catch (Exception e){
                resultTextView.setText("ERROR");
            }
        }
}