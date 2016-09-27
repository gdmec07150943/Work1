package com.example.asus.work1;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (TextView) findViewById(R.id.textView2);
        tv2= (TextView) findViewById(R.id.textView3);
        tv1.setText("哈哈哈，你就到这了！");
        tv2.setText("1233");
    }
}
