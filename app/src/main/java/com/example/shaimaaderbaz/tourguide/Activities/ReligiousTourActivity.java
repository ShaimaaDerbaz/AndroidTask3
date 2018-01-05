package com.example.shaimaaderbaz.tourguide.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shaimaaderbaz.tourguide.Adapters.itemTourAdapter;
import com.example.shaimaaderbaz.tourguide.R;
import com.example.shaimaaderbaz.tourguide.itemTour;

import java.util.ArrayList;

public class ReligiousTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_tour);

        ArrayList<itemTour> items=new ArrayList<itemTour>();
         items.add(new itemTour("South Sinai - The Mountain of Moses","The ascent of 2,285-meter-high Mount Sinai (Jebel Musa in Arabic) is a tiring but extremely rewarding hike that is also very meaningful for pilgrims. Jebel Musa is revered as the mountain that the prophet Moses received the 10 Commandments on and is a sacred mountain to Jews, Christians, and Muslims. ",R.drawable.moses));
        items.add(new itemTour("South Sinai - Saint Cathrine",",Saint Catherine's Monastery, officially \"Sacred Monastery of the God-Trodden Mount Sinai\", lies on the Sinai Peninsula, at the mouth of a gorge at the foot of Mount Sinai, in the city of Saint Catherine, Egypt in the South Sinai Governorate",R.drawable.saint));
        items.add(new itemTour("Cairo - Khan el-Khalili ","Khan el-Khalili is a major souk in the historic center of Islamic Cairo. The bazaar district is one of Cairo's main attractions for tourists and Egyptians alike.",R.drawable.khan));
        items.add(new itemTour("Cairo - El Moez street","Muizz Street (Egyptian Arabic: شارع المعز\u200E Shareʻ El Muizz, full name; Shariʻa al-Muizz li-Din Illah), also known as Al Moez Ldin Allah Al Fatimi Street in Islamic Cairo, Egypt is one of the oldest streets in Cairo, approximately one kilometer long. A United Nations study found it to have the greatest concentration of medieval architectural treasures in the Islamic world.[1] The street (shariʻa in Arabic) is named for Al-Mu'izz li-Din Allah, the fourth caliph of the Fatimid dynasty. It stretches from Bab Al-Futuh in the north to Bab Zuweila in the south",R.drawable.moez));
        items.add(new itemTour("Cairo - Al-Hakim Mosque","The Mosque of al-Hakim (Arabic: مسجد الحاكم بأمر الله\u200E, translit. Masjid al-Ḥākim bi Amr Allāh), nicknamed al-Anwar (Arabic: الانور\u200E, lit. 'the Illuminated'),[1] is a major Islamic religious site in Cairo, Egypt. It is named after Al-Hakim bi-Amr Allah (985–1021), the sixth Fatimid caliph and 16th Ismaili Imam.\n" +
                "\n" +
                "The mosque was originally built as an enclosure by the Fatimid vizier Gawhar Al-Siqilli (c. 928–992), but was incorporated into the extended fortifications built by Badr al-Jamali. It consists of an irregular rectangle with four arcades surrounding the courtyard. An unusual feature is the monumental entrance with its projecting stone porch. It is located in \"Islamic Cairo\", on the east side of Muizz Street, just south of Bab Al-Futuh (the northern gate). ",R.drawable.alhakim));
        items.add(new itemTour("Cairo - AlHussein Mosque and street","The Al-Hussain Mosque is a mosque built in 1154. The mosque is located in Cairo, Egypt, near the Khan El-Khalili bazaar. It is considered to be one of the holiest Islamic sites in Egypt",R.drawable.hussein));
        items.add(new itemTour("Cairo - Salahdin Citadel","The Saladin Citadel of Cairo is a medieval Islamic fortification in Cairo, Egypt. The location, on Mokattam hill near the center of Cairo, was once famous for its fresh breeze and grand views of the city",R.drawable.salahdin));

        itemTourAdapter adapter = new itemTourAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.activity_religious_tour);
        listView.setAdapter(adapter);
    }
}
