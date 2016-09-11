package com.example.clarinetmaster.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);
    }

    public void onClick(View v){
        /*Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        t.show();
        t = Toast.makeText(this, "Android", Toast.LENGTH_SHORT);
        t.show();*/
        int id = v.getId();
        TextView tv = (TextView) findViewById(R.id.textView2);
        if(id == R.id.button_1){
            tv.setText("1");
        }else if(id == R.id.button_2){
            tv.setText("2");
        }

    }

}
