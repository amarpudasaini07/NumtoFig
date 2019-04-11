package com.e.numtofig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnumber;
    private TextView result;
    private Button btnconvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumber = findViewById(R.id.etnumber);
        result = findViewById(R.id.result);
        btnconvert = findViewById(R.id.btnconvert);
        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number =Integer.parseInt(etnumber.getText().toString());
                Convert c=new Convert();
                String word=c.conversion(number);
                result.setText(word);
            }
        });
    }
}
