package edu.desu.dsuappacademy.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuestion(View view) {

        EditText theAnswer = (EditText) findViewById(R.id.answer);
        int math = Integer.parseInt(theAnswer.getText().toString());

        if (math == 25) {
            Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }
}