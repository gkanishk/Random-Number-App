package com.example.kanis.higherlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.Double;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        int rn=new Random().nextInt(19)+1;
    public void checkFunction(View view)
    {

        EditText nu=(EditText)findViewById(R.id.editText);

        int n=Integer.parseInt(nu.getText().toString());
        if(n==rn)
        {
            Toast.makeText(MainActivity.this, "good found the no", Toast.LENGTH_SHORT).show();
        }
        else if(n>rn)
        {
            Toast.makeText(MainActivity.this, "go lower", Toast.LENGTH_SHORT).show();
        }
        else if(n<rn)
        {
            Toast.makeText(MainActivity.this, "go higher", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
