package com.example.maxz.tum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    double sum11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);








        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Editext.class);
                startActivity(intent2);
            }
        });


        Bundle bundle = getIntent().getExtras();
        sum11 = bundle.getDouble("Sum");
        Toast.makeText(getApplicationContext(),""+sum11+"",Toast.LENGTH_LONG).show();
//
//        textView.setText(String.valueOf(sum11));
    }
}
