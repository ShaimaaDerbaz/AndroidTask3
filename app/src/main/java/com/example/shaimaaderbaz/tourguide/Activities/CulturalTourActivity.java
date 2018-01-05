package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.itemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class CulturalTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
        items.add(new itemTour("Aswan - Abu Simbel temple","The Abu Simbel temples are two massive rock temples at Abu Simbel, a village in Nubia,Aswan, southern Egypt, near the border with Sudan. They are situated on the western bank of Lake Nasser ,Founded: Approximately 1264 BCE\n" +
                "it is founded: Approximately 1264 BCE ,builder: Ramesses II .",R.drawable.abusimbel));
        items.add(new itemTour("Aswan - Philae island and temple","Philae is currently an island in the reservoir of the Aswan Low Dam ,the island contains the Pharonie temple ",R.drawable.philae));
        items.add(new itemTour("Luxor - Karnak temple","The Karnak Temple Complex, commonly known as Karnak, comprises a vast mix of decayed temples, chapels, pylons, and other buildings in Egypt ",R.drawable.karnak));
        items.add(new itemTour("Luxor - Valley of the Kings","The Valley of the Kings, the Valley of the Gates of the Kings, is a valley in Egypt where, for a period of nearly 500 years from the 16th to 11th century BC, rock cut tombs were excavated for the Pharaohs and powerful nobles of the New Kingdom ",R.drawable.kingsvalley));
        items.add(new itemTour("Giza - Egyptian Pyramids","The oldest and largest of the three pyramids at Giza, known as the Great Pyramid, is the only surviving structure out of the famed seven wonders of the ancient world. It was built for Khufu (Cheops, in Greek), Sneferu's successor and the second of the eight kings of the fourth dynasty. ",R.drawable.pyramids));
        items.add(new itemTour("Giza - Saqgara Pyramid","The Pyramid of Djoser, or step pyramid is an archeological remain in the Saqqara necropolis, Egypt, northwest of the city of Memphis. It was built during the 27th century BC for the burial of Pharaoh Djoser by his vizier, Imhotep ",R.drawable.saqqara));
        items.add(new itemTour("Cairo - Egyptian Museum","The Egyptian Museum in Cairo contains the world's most extensive collection of pharaonic antiquities; no visit to Egypt is complete without a trip through its galleries. The original collection was established in the late 19th century under Auguste Mariette and housed in Boulaq , current location in Tahrir Square Down town ",R.drawable.egyptmeusum));
        items.add(new itemTour("Alexandria -Library of Alexandria","The Royal Library of Alexandria or Ancient Library of Alexandria in Alexandria, Egypt, was one of the largest and most significant libraries of the ancient world. It was dedicated to the Muses, the nine goddesses of the arts.[1] It flourished under the patronage of the Ptolemaic dynasty and functioned as a major center of scholarship from its construction in the 3rd century BC until the Roman conquest of Egypt in 30 BC, with collections of works, lecture halls, meeting rooms, and gardens. The library was part of a larger research institution called the Musaeum of Alexandria, where many of the most famous thinkers of the ancient world studied.",R.drawable.alexlibrary));

        itemTourAdapter adapter = new itemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_cultural_tour);
        listView.setAdapter(adapter);
    }
}
