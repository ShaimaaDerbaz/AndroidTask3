package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.ItemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class CulturalTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
        items.add(new itemTour(getString(R.string.abusimbel),getString(R.string.abusimbeldescription) +
                getString(R.string.abusimbeldescription2),R.drawable.abusimbel));
        items.add(new itemTour(getString(R.string.philae),getString(R.string.phileadescription),R.drawable.philae));
        items.add(new itemTour(getString(R.string.karnak),getString(R.string.karnakdescription),R.drawable.karnak));
        items.add(new itemTour(getString(R.string.kingsvalley),getString(R.string.kingsvalleydescription),R.drawable.kingsvalley));
        items.add(new itemTour(getString(R.string.pyramids),getString(R.string.pyramidsdescription),R.drawable.pyramids));
        items.add(new itemTour(getString(R.string.saqqara),getString(R.string.saqqaradescreption),R.drawable.saqqara));
        items.add(new itemTour(getString(R.string.egymuem),getString(R.string.egymuesumdescription),R.drawable.egyptmeusum));
        items.add(new itemTour(getString(R.string.libalex),getString(R.string.libalexdescription),R.drawable.alexlibrary));

        ItemTourAdapter adapter = new ItemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_cultural_tour);
        listView.setAdapter(adapter);
    }
}
