package com.example.ben.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float v1=0;
    float v2=0;
    boolean addb,subtract,divide,mul=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText e;
        e=(EditText)findViewById(R.id.editText);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"1");



            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"2");



            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"3");



            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"4");



            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"5");



            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"6");



            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"7");



            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"8");



            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"9");



            }
        });
        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+"0");



            }
        });
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(" ");
               falisify();



            }
        });

        findViewById(R.id.Decimal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");



            }
        });

        findViewById(R.id.Add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e.getText().toString());
                addb=true;
                e.setText(" ");





            }
        });

        findViewById(R.id.sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e.getText().toString());
                subtract=true;
                e.setText(" ");





            }
        });

        findViewById(R.id.Mulitply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e.getText().toString());
                mul=true;
                e.setText(" ");

            }
        });


        findViewById(R.id.Divison).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(e.getText().toString());
                divide=true;
                e.setText(" ");

            }
        });


        findViewById(R.id.Equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    v2 = Float.parseFloat(e.getText().toString());
                    if (addb == true) {
                        e.setText(Float.toString(v1 + v2));

                    }

                    else if (subtract == true) {
                        e.setText(Float.toString(v1 - v2));
                    }

                    else if (divide == true) {
                        e.setText(Float.toString(v1 / v2));
                    }

                    else if (mul == true) {
                        e.setText(Float.toString(v1 * v2));
                    }

                falisify();


            }







        });






    }

    public void falisify(){
        addb=false;
        subtract=false;
        divide=false;
        mul=false;


    }

}
