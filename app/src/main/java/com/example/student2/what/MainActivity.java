package com.example.student2.what;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enter; TextView write; int s = 465; RadioButton div, arrr;
    String []arr = {"Jan", "Feb", "March", "Aprl", "May", "June"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enter = findViewById(R.id.eText);
        write = findViewById(R.id.textView);
        div = findViewById(R.id.div);
        arrr = findViewById(R.id.arr);
        setContentView(R.layout.activity_main);
    }
    void press(View c) { int entr = Integer.parseInt(enter.getText().toString());
     try {if (div.isChecked()) write.setText(s/entr + "");
     if (arrr.isChecked()) write.setText(arr[entr]);)
         catch (ArithmeticException ) {
    write setText(s + "");
         )
         

     }
    }
}
