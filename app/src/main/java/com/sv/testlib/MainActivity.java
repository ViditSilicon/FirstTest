package com.sv.testlib;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sv.mylibrary.TestClass;

public class MainActivity extends TestClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Below Line is user for show toast
        displayMessage(MainActivity.this,"Vidit Shah");
    }
}
