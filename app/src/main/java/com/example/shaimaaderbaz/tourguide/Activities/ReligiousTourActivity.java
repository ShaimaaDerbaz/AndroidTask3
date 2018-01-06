package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.ItemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class ReligiousTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
         items.add(new itemTour(getString(R.string.mosesmountin),getString(R.string.mosesmountindescerption),R.drawable.moses));
        items.add(new itemTour(getString(R.string.saint),getString(R.string.saintdescription),R.drawable.saint));
        items.add(new itemTour(getString(R.string.khankhalili),getString(R.string.khankhalilidescription),R.drawable.khan));
        items.add(new itemTour(getString(R.string.moez),getString(R.string.moezdescription),R.drawable.moez));
        items.add(new itemTour(getString(R.string.hakim),getString(R.string.hakimdescription) +
                "\n" +
                getString(R.string.hakimdescription2),R.drawable.alhakim));
        items.add(new itemTour(getString(R.string.hussein),getString(R.string.husseindescription),R.drawable.hussein));
        items.add(new itemTour(getString(R.string.salahdin),getString(R.string.salahdindescription),R.drawable.salahdin));

        ItemTourAdapter adapter = new ItemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_religious_tour);
        listView.setAdapter(adapter);
    }
}
