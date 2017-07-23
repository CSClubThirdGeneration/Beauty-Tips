package com.firststep.beautytips;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TitleAdapter titleAdapter;
    private RecyclerView recyclerView;
    private SliderLayout sliderLayout;

    private List<TitleModel> list;
    private String image[] = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20106290_324338398018958_378012957201157341_n.jpg?oh=8c6a07ed84dd0a98fa3b58c69c32ed19&oe=5A00D900",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20106371_324338504685614_7132753281548666227_n.jpg?oh=92f6762317f36aa490332aeb10341fa2&oe=5A0DD73A",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989374_324338514685613_4156284849736897831_n.jpg?oh=b96a390ae580c5d4555c7c46fb986f81&oe=59F5E76C",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989466_324338684685596_8170140822491746749_n.jpg?oh=c414082b871ae3363e41d954f21d3514&oe=59C8A7E7",
    "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20046564_324338548018943_2807348972295989033_n.jpg?oh=0e1d04e313414a171c25d6adc976a1ad&oe=5A0E3598", "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989562_324338411352290_4253680013037305054_n.jpg?oh=24d38d2fa202579949342a1a16b28ed4&oe=5A024CDB",
    "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19990113_324338631352268_2092134916778617823_n.jpg?oh=482c62eec5e1eeec161d6b279b746059&oe=5A00332E",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19959250_324338498018948_6593757178145956370_n.jpg?oh=15e78190ed7c4733ef75d652a0cbfd18&oe=59FB0E58"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         sliderLayout = (SliderLayout) findViewById(R.id.slider);

        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView
                .description("Acene")
                .image(R.drawable.a4);

        sliderLayout.addSlider(textSliderView);
        TextSliderView textSliderView1 = new TextSliderView(this);
        textSliderView1
                .description("Eye")
                .image(R.drawable.eye1);

        sliderLayout.addSlider(textSliderView1);
        TextSliderView textSliderView3 = new TextSliderView(this);
        textSliderView3
                .description("Hair")
                .image(R.drawable.h2);

        sliderLayout.addSlider(textSliderView3);
        TextSliderView textSliderView4 = new TextSliderView(this);
        textSliderView4
                .description("Skin Care")
                .image(R.drawable.s2);


        sliderLayout.addSlider(textSliderView4);

        TextSliderView textSliderView2 = new TextSliderView(this);
        textSliderView2
                .description("Lips")
                .image(R.drawable.ll7);

        sliderLayout.addSlider(textSliderView2);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        list = new ArrayList<>();
        titleAdapter = new TitleAdapter(this, list);
        LinearLayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        TitleAdapter.OnItemClickListener itemClickListener = new TitleAdapter.OnItemClickListener() {
            @Override
            public void OnItemCLick(View view, int position) {
                String[] title = getResources().getStringArray(R.array.title);
                String[] eye_title=getResources().getStringArray(R.array.eye_title);
                String[] lips_title=getResources().getStringArray(R.array.lips_title);
                String[] nails_title=getResources().getStringArray(R.array.nails_title);
                String[] acne_title=getResources().getStringArray(R.array.acne_title);
                String[] skincare_title=getResources().getStringArray(R.array.skincare_title);
                String[] hair_title=getResources().getStringArray(R.array.hair_title);
                String[] weight_title=getResources().getStringArray(R.array.weight_title);
                String[] teeth_title=getResources().getStringArray(R.array.teeth_title);
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                        intent.putExtra("title",title[position]);
                        intent.putExtra("itemtitle",eye_title);
                        startActivity(intent);
                        break;


                    case 1:
                        Intent intent1=new Intent(MainActivity.this,DetailsActivity.class);
                        intent1.putExtra("title",title[position]);
                        intent1.putExtra("itemtitle",lips_title);
                        startActivity(intent1);
                        break;


                    case 2:
                        Intent intent2=new Intent(MainActivity.this,DetailsActivity.class);
                        intent2.putExtra("title",title[position]);
                        intent2.putExtra("itemtitle",nails_title);
                        startActivity(intent2);
                        break;


                    case 3:
                        Intent intent3=new Intent(MainActivity.this,DetailsActivity.class);
                        intent3.putExtra("title",title[position]);
                        intent3.putExtra("itemtitle",acne_title);
                        startActivity(intent3);
                        break;


                    case 4:
                        Intent intent4=new Intent(MainActivity.this,DetailsActivity.class);
                        intent4.putExtra("title",title[position]);
                        intent4.putExtra("itemtitle",skincare_title);
                        startActivity(intent4);
                        break;


                    case 5:
                        Intent intent5=new Intent(MainActivity.this,DetailsActivity.class);
                        intent5.putExtra("title",title[position]);
                        intent5.putExtra("itemtitle",hair_title);
                        startActivity(intent5);
                        break;


                    case 6:
                        Intent intent6=new Intent(MainActivity.this,DetailsActivity.class);
                        intent6.putExtra("title",title[position]);
                        intent6.putExtra("itemtitle",weight_title);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7=new Intent(MainActivity.this,DetailsActivity.class);
                        intent7.putExtra("title",title[position]);
                        intent7.putExtra("itemtitle",teeth_title);
                        startActivity(intent7);
                        break;
                }
            }
        };
        titleAdapter.setOnItemClickListener(itemClickListener);
        recyclerView.setAdapter(titleAdapter);
        prepareData();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    protected void onStop() {
        sliderLayout.stopAutoCycle();
        super.onStop();
    }

    private void prepareData() {
        String[] title = getResources().getStringArray(R.array.title);
        for (int i = 0; i < title.length; i++) {
            TitleModel model = new TitleModel(image[i], title[i]);
            list.add(model);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    }

