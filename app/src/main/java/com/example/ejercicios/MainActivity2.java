package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // UPDATE TEXT
        textView = (TextView) findViewById(R.id.inputResultActivity2);
        inputText = (EditText) findViewById(R.id.inputEditTextActivity2);

        // FORM 1
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("key"));

        // FORM 2
        Button button1 = (Button) findViewById(R.id.changeActivity2Form2);
        button1.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
            intent2.putExtra("key", String.valueOf(textView.getText()));
            this.startActivity(intent2);
        });

        // FORM 3
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            textView.setText(extras.getString("key"));
        }
    }

    // UPDATE TEXT
    public void updateText (View view) {
        textView.setText(inputText.getText());
    }

    // FORM 1
    public void goToActivityForm1 (View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        myIntent.putExtra("key", String.valueOf(textView.getText()));
        this.startActivity(myIntent);
    }

    // FORM 3
    public void goToActivityForm3 (View view) {
        Intent i = new Intent(getBaseContext(), MainActivity2.class);
        i.putExtra("key", String.valueOf(textView.getText()));
        this.startActivity(i);
    }
}