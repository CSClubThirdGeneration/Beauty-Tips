package com.firststep.beautytips.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.firststep.beautytips.BeautyTips;
import com.firststep.beautytips.R;

public class Main2Activity extends AppCompatActivity {

    private TextView textAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About Us");



        textAbout= (TextView) findViewById(R.id.about_desc);
        String desc = "သင္တို႕ရဲ႕အလွအပကိုသဘာဝပစၥည္းမ်ားသံုးျပီးထိန္းသိမ္းႀကပါစို႕";
        BeautyTips.typefaceSetter.Setter(textAbout,desc);
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
