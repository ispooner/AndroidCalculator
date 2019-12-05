package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView greetingText;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] ages = {"Newborn", "Toddler", "Child", "Tween", "Teen", "Adult", "Senior", "Dead"};
        index = 0;
        final int len = ages.length;

        greetingText = findViewById(R.id.greeting_textview);
        greetingText.setText(ages[0]);
        greetingText.setOnClickListener(new View.OnClickListener() {
            int counter = 0;

            @Override
            public void onClick(View v) {
                greetingText.setText(ages[++index]);
                Toast.makeText(MainActivity.this, "I have been clicked", Toast.LENGTH_LONG).show();
                counter++;
                index = index % (len - 1);
            }
        } );
    }
}
