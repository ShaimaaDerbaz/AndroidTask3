package com.example.shaimaaderbaz.tourguide.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shaimaaderbaz.tourguide.R;

public class TransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);
        String d="https://www.travelstart.com.eg/";

        TextView airplanesTextView =(TextView)findViewById(R.id.airplanes_text_view);
        airplanesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.travelstart.com.eg/");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                //Intent i =new Intent(TransportationActivity.this,uriUrl);
                startActivity(i);

            }
        });
        TextView busesTextView =(TextView)findViewById(R.id.buses_text_view);
        busesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://go-bus.com/en");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);


            }
        });
        TextView trainsTextView =(TextView)findViewById(R.id.trains_text_view);
        trainsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://enr.gov.eg/ticketing/public/login.jsf");
                Intent i = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(i);

            }
        });


    }
}
