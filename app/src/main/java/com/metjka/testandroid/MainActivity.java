package com.metjka.testandroid;

import android.app.Activity;
import android.app.Service;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
    private EditText mainTextView;
    private TextView textView;
    private boolean isFull = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);
        mainTextView = (EditText) findViewById(R.id.editText);
        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonB = (Button) findViewById(R.id.buttonB);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);
        Button buttonH = (Button) findViewById(R.id.buttonH);
        Button buttonI = (Button) findViewById(R.id.buttonI);
        Button buttonK = (Button) findViewById(R.id.buttonK);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonO = (Button) findViewById(R.id.buttonO);
        Button buttonP = (Button) findViewById(R.id.buttonP);
        Button buttonT = (Button) findViewById(R.id.buttonT);
        Button buttonX = (Button) findViewById(R.id.buttonX);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonDel = (Button) findViewById(R.id.buttonDel);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonK.setOnClickListener(this);
        buttonM.setOnClickListener(this);
        buttonO.setOnClickListener(this);
        buttonP.setOnClickListener(this);
        buttonT.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDel.setOnClickListener(this);


        mainTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (mainTextView.getText().length() == 2) {
                    RegistrationPlates reg = new RegistrationPlates(MainActivity.this);
                    if (reg.getName(mainTextView.getText().toString().toLowerCase()) == null) {
                        //Toast.makeText(getApplicationContext(), "This kod does not exist!!", Toast.LENGTH_LONG).show();
                        textView.setText("This kod does not exist!!");

                    } else {
                        textView.setText(reg.getName(mainTextView.getText().toString().toLowerCase()));
                    }
                } else if (mainTextView.getText().length() < 2) {

                    //Toast.makeText(getApplicationContext(), "Fill text", Toast.LENGTH_LONG).show();
                    textView.setText("Fill me");
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonA:
                mainTextView.append("A");
                break;
            case R.id.buttonB:
                mainTextView.append("B");
                break;
            case R.id.buttonC:
                mainTextView.append("C");
                break;
            case R.id.buttonE:
                mainTextView.append("E");
                break;
            case R.id.buttonH:
                mainTextView.append("H");
                break;
            case R.id.buttonI:
                mainTextView.append("I");
                break;
            case R.id.buttonK:
                mainTextView.append("K");
                break;
            case R.id.buttonM:
                mainTextView.append("M");
                break;
            case R.id.buttonO:
                mainTextView.append("O");
                break;
            case R.id.buttonP:
                mainTextView.append("P");
                break;
            case R.id.buttonT:
                mainTextView.append("T");
                break;
            case R.id.buttonX:
                mainTextView.append("X");
                break;
            case R.id.buttonClear:
                mainTextView.setText("");
                break;
            case R.id.buttonDel:
                String textString = mainTextView.getText().toString();
                if (textString.length() > 0) {
                    mainTextView.setText(textString.substring(0, textString.length() - 1));
                }
                break;

        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */

}