package com.example.ShruthiSports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
    TextView registration;
    TextView teamsize;
    Spinner size;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registration = (TextView) findViewById(R.id.textregister);
        teamsize = (TextView) findViewById(R.id.textteamsize);
        size = (Spinner) findViewById(R.id.spinner);
        next = (Button) findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openregistration();
            }
        });



    }
    public void openregistration() {
        Intent intent = new Intent(this,registration.class);
        startActivity(intent);


    }
}