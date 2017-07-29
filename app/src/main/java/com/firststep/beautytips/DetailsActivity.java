package com.firststep.beautytips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
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
    private String[] item_image;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = getIntent().getStringExtra("title");
        item_title = getIntent().getStringArrayExtra("itemtitle");
        item_description = getIntent().getStringArrayExtra("itemdescription");
        item_image = getIntent().getStringArrayExtra("itemimage");

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        item_list = (ListView) findViewById(R.id.item_details);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item_title);
        item_list.setAdapter(adapter);
        item_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DetailsActivity.this,ItemDetailsActivity.class);
                intent.putExtra("itemtitle",item_title[position]);
                intent.putExtra("itemdescription",item_description[position]);
                intent.putExtra("itemimage",item_image[position]);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
