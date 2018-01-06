package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.ItemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class EntertainingTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertaining_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
        items.add(new itemTour(getString(R.string.sharm),getString(R.string.sharmdescription),R.drawable.sharmelsheikh));
        items.add(new itemTour(getString(R.string.dahab),getString(R.string.dahabdescription),R.drawable.dahab));
        items.add(new itemTour(getString(R.string.marsamatrouh),getString(R.string.marsamatrouhdescription),R.drawable.mersamatrouh));
        items.add(new itemTour(getString(R.string.hurghada),getString(R.string.hurghadadescription),R.drawable.hurghada));
        items.add(new itemTour(getString(R.string.nuweiba),getString(R.string.nuweibadescription)
                +"\n"+getString(R.string.nuweibadescription2),R.drawable.nueiba));
        items.add(new itemTour(getString(R.string.alex),getString(R.string.alexdescription),R.drawable.alex));

        ItemTourAdapter adapter = new ItemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_entertaining_tour);
        listView.setAdapter(adapter);
    }
}
