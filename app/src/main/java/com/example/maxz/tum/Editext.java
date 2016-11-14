package com.example.maxz.tum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editext extends AppCompatActivity {

    EditText WigEditText,HightEditText, AgeEditText;
    Button yesButton;
    double WAnInt,HAnInt,GAnInt;
    final  double BurnAnInt =66;
    final double WigoneAnInt =13.7;
    final double Thor = 5;
    final double Old =6.8;
    double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editext);

        WigEditText = (EditText) findViewById(R.id.editText);
        HightEditText = (EditText) findViewById(R.id.editText2);
        AgeEditText = (EditText) findViewById(R.id.editText3);

        yesButton = (Button) findViewById(R.id.button2);

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WAnInt =Double.parseDouble(WigEditText.getText().toString().trim());


                HAnInt =Double.parseDouble(HightEditText.getText().toString().trim());
                GAnInt = Double.parseDouble(AgeEditText.getText().toString().trim());

               sum = BurnAnInt + WigoneAnInt * WAnInt +Thor * HAnInt - Old * GAnInt;

//                Toast.makeText(getApplicationContext(),"โชว์ ="+ sum+"",Toast.LENGTH_LONG).show();

//
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Sum", sum);
                startActivity(intent);


            }
        });



    }


}
