package com.firststep.beautytips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ListView item_list;
    private String[] item_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        item_title = getIntent().getStringArrayExtra("itemtitle");
        item_list = (ListView) findViewById(R.id.item_details);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item_title);
        item_list.setAdapter(adapter);


    }
}
