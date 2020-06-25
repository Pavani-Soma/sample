package com.example.ShruthiSports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Statusactivity extends AppCompatActivity {
    TextView status;
    TextView sport;
    EditText teamid;
    Spinner spinner;
    Button viewstatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusactivity);
        status=(TextView)findViewById(R.id.teamstatus);
        sport=(TextView)findViewById(R.id.sportname);
        teamid=(EditText)findViewById(R.id.teamid);
        spinner=(Spinner)findViewById(R.id.spinner);
        viewstatus=(Button)findViewById(R.id.viewstatus);
        viewstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(teamid.length()==0)
                {
                    teamid.setError("Enter Teamid");
                }
                else {
                    Toast.makeText(Statusactivity.this,"Recode added",Toast.LENGTH_SHORT);
                }
            }
        });


    }
}