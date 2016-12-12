package com.mkapps.day1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.*;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void toto(View View) {
        Log.i ( "Info", "Button Tapped" );
        Toast.makeText ( this, "Hello To MK Apps", Toast.LENGTH_SHORT ).show ( );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

    }

}
