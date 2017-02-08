package com.sv.mylibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by android4 on 8/2/17.
 */

public class TestClass extends AppCompatActivity{

    public void displayMessage(Context context, String message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
