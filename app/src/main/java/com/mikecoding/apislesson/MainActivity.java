package com.mikecoding.apislesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RetrieveFeedTask().execute("http://api.sl.se/api2/typeahead.json?key=4cfa136f50c14cb1bad7a91d84ce14f8&searchstring=kallhäll&stationsonly=true");


    }
}
