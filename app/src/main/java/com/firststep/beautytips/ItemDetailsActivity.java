package com.firststep.beautytips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDetailsActivity extends AppCompatActivity {

    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        String itemtitle = getIntent().getStringExtra("itemtitle");
        String itemdescription = getIntent().getStringExtra("itemdescription");


        description = (TextView) findViewById(R.id.item_description);


        description.setText(itemdescription);

    }
}
