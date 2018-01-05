package com.example.shaimaaderbaz.tourguide.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shaimaaderbaz.tourguide.R;

public class ToursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        TextView culturalToursTextView =(TextView)findViewById(R.id.cultural_tour_text_view);
        culturalToursTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ToursActivity.this,CulturalTourActivity.class);
                startActivity(i);

            }
        });
        TextView religionToursTextView =(TextView)findViewById(R.id.religious_tour_text_view);
        religionToursTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ToursActivity.this,ReligiousTourActivity.class);
                startActivity(i);

            }
        });
        TextView EntertaningToursTextView =(TextView)findViewById(R.id.entertaning_tour_text_view);
        EntertaningToursTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ToursActivity.this,EntertainingTourActivity.class);
                startActivity(i);

            }
        });
    }


}
