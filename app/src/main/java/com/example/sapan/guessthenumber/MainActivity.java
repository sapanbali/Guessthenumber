package com.example.sapan.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int rand;
    int click = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Random random = new Random();
        rand = random.nextInt(20) + 1;


    }


    public void submit(View view) {
        EditText e1 = (EditText) findViewById(R.id.et);
        int x = Integer.parseInt(e1.getText().toString());


//       int click = 0;
        click--;


        if (click >0) {

            if (x > rand) {
               Toast.makeText(MainActivity.this, "Guess lower", Toast.LENGTH_SHORT).show();
            } else if (x < rand)
                Toast.makeText(MainActivity.this, "Guess higher", Toast.LENGTH_SHORT).show();

            else {
                Toast.makeText(MainActivity.this, "Right number!! Guess Again", Toast.LENGTH_SHORT).show();
                Random random = new Random();
                rand = random.nextInt(20) + 1;

            }
        }else{
            Toast.makeText(this,"You are out of try ! number was "+rand ,Toast.LENGTH_SHORT).show();
            Random random = new Random();
            rand = random.nextInt(20) + 1;
            click=4;
        }
        Toast.makeText(MainActivity.this, click + "left", Toast.LENGTH_SHORT).show();
    }
}