package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.itemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class EntertainingTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertaining_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
        items.add(new itemTour("South Sinai - Sharm El-sheikh","Sharm el-Sheikh is an Egyptian resort town between the desert of the Sinai Peninsula and the Red Sea. It's known for its sheltered sandy beaches, clear waters and coral reefs. Naama Bay, with a palm tree-lined promenade, is filled with bars and restaurants. Ras Muhammad National Park is a major diving destination, with marine life around the Shark and Yolanda reefs and the Thistlegorm wreck.",R.drawable.sharmelsheikh));
        items.add(new itemTour("South Sinai - Dahab","Dahab is a small town on the southeast coast of the Sinai Peninsula in Egypt, approximately 80 km northeast of Sharm el-Sheikh. Formerly a Bedouin fishing village, Dahab is now considered to be one of Sinai's most treasured diving destinations. ",R.drawable.dahab));
        items.add(new itemTour("Mersa Matruh","Marsa Matruh is a resort town on Egypt’s Mediterranean coast, known for its lagoons and white-sand beaches. It’s on a large bay, with the resort stretching along the shore. West of the town, Cleopatra’s Beach is surrounded by rocks, creating a natural pool called Cleopatra’s Bath. Near Rommel’s Beach is the Rommel Museum, with memorabilia and maps, in caves that served as the German WWII commander’s headquarters.",R.drawable.mersamatrouh));
        items.add(new itemTour("Hurghada ","Hurghada is a beach resort town stretching some 40km along Egypt’s Red Sea coast. It’s renowned for scuba diving, and has numerous dive shops and schools in its modern Sekalla district. There are many restaurants, bars and nightclubs, while the old town, El Dahar, is home to traditional Egyptian coffee shops and souks. Hurghada’s long stretch of sandy beach is lined with resort hotels.",R.drawable.hurghada));
        items.add(new itemTour("South Sinai - Nuweiba ","Nuweiba is a coastal town in the eastern part of Sinai Peninsula, Egypt. Located on the coast of the Gulf of Aqaba . "
                +"\n"+"Between the town and the port are a strip of modern hotels, catering to beach holiday makers and divers. One km north of Nuweiba City, Tarabin village is well known for its Bedouin-style camps where cheap huts are available for rent. Further north, in the direction of Taba, are several other beaches with similar accommodation options.",R.drawable.nueiba));
        items.add(new itemTour("Alexandria","Alexandria is a Mediterranean port city in Egypt. During the Hellenistic period, it was home to a lighthouse ranking among the Seven Wonders of the Ancient World as well as a storied library. Today the library is reincarnated in the disc-shaped, ultramodern Bibliotheca Alexandrina. The city also has Greco-Roman landmarks, old-world cafes and sandy beaches. Its 15th-century seafront Qaitbay Citadel is now a museum.",R.drawable.alex));

        itemTourAdapter adapter = new itemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_entertaining_tour);
        listView.setAdapter(adapter);
    }
}
