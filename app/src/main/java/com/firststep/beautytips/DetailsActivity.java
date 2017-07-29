package com.firststep.beautytips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ListView item_list;
    private String[] item_title;
    private String[] item_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        item_title = getIntent().getStringArrayExtra("itemtitle");
        item_description = getIntent().getStringArrayExtra("itemdescription");

        item_list = (ListView) findViewById(R.id.item_details);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item_title);
        item_list.setAdapter(adapter);
        item_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DetailsActivity.this,ItemDetailsActivity.class);
                intent.putExtra("itemtitle",item_title);
                intent.putExtra("itemdescription",item_description[position]);
                startActivity(intent);
            }
        });

    }
}
