package com.example.l703;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.view.View;
public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText nameInput;
    Button nappi;
    String teksti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        nameInput = (EditText) findViewById(R.id.editText);
        nappi = (Button) findViewById(R.id.button);

        //tapahtuu kun painaa napppia
        nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksti = nameInput.getText().toString();
                text.setText(teksti);
                nameInput.setText("");
            }
        });
    }
}