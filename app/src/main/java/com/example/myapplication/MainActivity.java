package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void sendMessage(View view) {
        Log.d("TAG", "sendMessage: ");

        Intent my_Intent=new Intent(this, Main2Activity.class);
        startActivity(my_Intent);
    }
    
}
