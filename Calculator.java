package com.felight.codeig;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
         Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
}


    @Override
    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.textView11);
        switch(v.getId()) {
            case R.id.button2:
                textView.setText("Add is not implimented");
                break;
            case R.id.button3:
                textView.setText("Sub is not implimented");
                break;
            case R.id.button4:
                textView.setText("mul is not implimented");
                break;
        }


    }


}


