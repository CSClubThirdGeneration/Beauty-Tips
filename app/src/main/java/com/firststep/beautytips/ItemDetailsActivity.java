package com.firststep.beautytips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

public class ItemDetailsActivity extends AppCompatActivity {

    private TextView description;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);



        String itemtitle = getIntent().getStringExtra("itemtitle");
        String itemdescription = getIntent().getStringExtra("itemdescription");
        String itemimage = getIntent().getStringExtra("itemimage");
        description = (TextView) findViewById(R.id.item_description);
        description.setText(itemdescription);

        image = (ImageView) findViewById(R.id.item_image);
        Picasso.with(getApplicationContext()).load(itemimage).error(R.mipmap.ic_launcher).into(image);

        getSupportActionBar().setTitle(itemtitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


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
