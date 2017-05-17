package com.atguigu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // system.out.println("hello world");
        for(int i=0;i<100;i++){
            Log.e("TAG","i=="+i);
        }
        Toast.makeText(MainActivity.this, "我真帅", Toast.LENGTH_SHORT).show();
    }
}
