package com.app.mue.sg8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void click1(View v) {
        Log.i("clicks","Next");
        Intent i=new Intent(
                MainActivity.this,
                MainActivity2.class);
        startActivity(i);
    }

}
