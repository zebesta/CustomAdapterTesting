package com.example.chrissebesta.customadaptertesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Geodata geo1 = new Geodata("Austin", "10,70");
        Geodata geo2 = new Geodata("New York", "129, 80");
        Geodata geo3 = new Geodata("OneTwo", "1,2");

        ArrayList<Geodata> Geolist = new ArrayList<>();
        Geolist.add(geo1);
        Geolist.add(geo2);
        Geolist.add(geo3);

        ListView lv = (ListView) findViewById(R.id.geo_data_list);
        GeodataAdapter adapter = new GeodataAdapter(this, Geolist);
        lv.setAdapter(adapter);
        //lv.notify();

        Geolist.add(new Geodata ("San Fran", "100, 101"));

    }
}
