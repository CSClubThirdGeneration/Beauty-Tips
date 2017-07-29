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

import static com.firststep.beautytips.R.array.lips_description;

public class MainActivity extends AppCompatActivity {
    private TitleAdapter titleAdapter;
    private RecyclerView recyclerView;
    private SliderLayout sliderLayout;

    private List<TitleModel> list;
    private String image[] = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20106290_324338398018958_378012957201157341_n.jpg?oh=8c6a07ed84dd0a98fa3b58c69c32ed19&oe=5A00D900",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20106371_324338504685614_7132753281548666227_n.jpg?oh=92f6762317f36aa490332aeb10341fa2&oe=5A0DD73A",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989374_324338514685613_4156284849736897831_n.jpg?oh=b96a390ae580c5d4555c7c46fb986f81&oe=59F5E76C",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989466_324338684685596_8170140822491746749_n.jpg?oh=c414082b871ae3363e41d954f21d3514&oe=59C8A7E7",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20046564_324338548018943_2807348972295989033_n.jpg?oh=0e1d04e313414a171c25d6adc976a1ad&oe=5A0E3598",
    "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19989562_324338411352290_4253680013037305054_n.jpg?oh=24d38d2fa202579949342a1a16b28ed4&oe=5A024CDB", "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19990113_324338631352268_2092134916778617823_n.jpg?oh=482c62eec5e1eeec161d6b279b746059&oe=5A00332E",
   "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/19959250_324338498018948_6593757178145956370_n.jpg?oh=15e78190ed7c4733ef75d652a0cbfd18&oe=59FB0E58"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sliderLayout = (SliderLayout) findViewById(R.id.slider);

        sliderLayout.setPresetTransformer(4);
        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView
                .description("BeautyTips")
                .image(R.drawable.cover1);

        sliderLayout.addSlider(textSliderView);
        TextSliderView textSliderView1 = new TextSliderView(this);
        textSliderView1
                .description("BeautyTips")
                .image(R.drawable.cover2);

        sliderLayout.addSlider(textSliderView1);
        TextSliderView textSliderView3 = new TextSliderView(this);
        textSliderView3
                .description("BeautyTips")
                .image(R.drawable.cover3);
        sliderLayout.addSlider(textSliderView3);


        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        list = new ArrayList<>();
        titleAdapter = new TitleAdapter(this, list);
        LinearLayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        TitleAdapter.OnItemClickListener itemClickListener = new TitleAdapter.OnItemClickListener() {
            @Override
            public void OnItemCLick(View view, int position) {
                String[] title = getResources().getStringArray(R.array.title);

                //title
                String[] eye_title=getResources().getStringArray(R.array.eye_title);
                String[] lips_title=getResources().getStringArray(R.array.lips_title);
                String[] nails_title=getResources().getStringArray(R.array.nails_title);
                String[] acne_title=getResources().getStringArray(R.array.acne_title);
                String[] skincare_title=getResources().getStringArray(R.array.skincare_title);
                String[] hair_title=getResources().getStringArray(R.array.hair_title);
                String[] weight_title=getResources().getStringArray(R.array.weight_title);
                String[] teeth_title=getResources().getStringArray(R.array.teeth_title);

                //Description
                String[] eye_description = getResources().getStringArray(R.array.eye_description);
                String[] lips_description=getResources().getStringArray(R.array.lips_description);
                String[] nails_description=getResources().getStringArray(R.array.nails_description);
                String[] acene_description=getResources().getStringArray(R.array.acene_description);
                String[] skincare_description=getResources().getStringArray(R.array.skincare_description);
                String[] hair_description=getResources().getStringArray(R.array.hair_description);
                String[] bodyweight_description=getResources().getStringArray(R.array.bodyweight_description);
                String[] teeth_description=getResources().getStringArray(R.array.teeth_description);


                //Images
                String[] eye_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374465_330929367359861_8293647982767148109_n.jpg?oh=9a687411953894472e97a0d4631035f2&oe=5A392AC1"
                ,"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294309_330929187359879_3320701163239412197_n.jpg?oh=6152f0e477565e1f904a5fef1d53ccee&oe=59EF64CB",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20431653_330929230693208_8038944730573696584_n.jpg?oh=91a43964fa734ca8f94948eb1dbf9e0e&oe=59F717B3",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20525782_330929297359868_8423685001745818031_n.jpg?oh=cedbf91a0cc7e1d39f2fd5caa7d1d411&oe=59F5DF50"};

                String[] lips_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20431667_330949510691180_421606953948640082_n.jpg?oh=d6a452393fdb32d0cf79a61e6f0ce4ef&oe=59EDFCA1",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20431677_330948094024655_6016754033208684808_n.jpg?oh=558abb364d9d5c0d4e06bc360c422f86&oe=59EFF2CF"};

                String[] nails_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20429625_330949244024540_7249794338695702046_n.jpg?oh=b7fdebaf68baa6ce30c049e5810f983d&oe=59F3B43F",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20375736_330956820690449_1753735862441848585_n.jpg?oh=6d8f7e41c9d67150ce4de09574873643&oe=59FABA89",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374277_330956870690444_3965863455315686387_n.jpg?oh=6ffc5cf8c630e81b4b52ac2692fdb04d&oe=59FFA349",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20429649_330955590690572_2298884280605777385_n.jpg?oh=db603e9ac5a454b1a45e3660412e3559&oe=5A376F52",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374411_330955624023902_5931205527003408867_n.jpg?oh=9b831adca9172f8956afd94f3f291938&oe=59EFB257"};


                String[] acene_image ={"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294585_330963760689755_8865827788356559943_n.jpg?oh=fd64c7cd843dbc9bc56ec6547fe8af8f&oe=5A3216F1",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374277_330956870690444_3965863455315686387_n.jpg?oh=6ffc5cf8c630e81b4b52ac2692fdb04d&oe=59FFA349",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294162_330963870689744_9017210684237094525_n.jpg?oh=666d5740386f42f8540ceac7223ff517&oe=59EBBB43",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-0/p235x165/20375839_330965694022895_6627097541580043567_n.jpg?oh=d759484316bf7bed60b749decea9a83d&oe=5A07B063",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20479822_330965700689561_4289058705705254453_n.jpg?oh=e183ae7fb5ad38d333b08e214d7f2023&oe=59EEB23C",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374658_330966514022813_2498737333051710238_n.jpg?oh=254d8b5f910fe4901e8c006dc75eba0c&oe=5A36B884",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20376144_330966510689480_1539533531852019644_n.jpg?oh=116e88056d2c4d90241a185838e1abbf&oe=5A02FCFA",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20479561_330967817356016_4466988665239095353_n.jpg?oh=588d54aa3f7a0b243e0f795d3cff180b&oe=5A31CAFB"};

                String[] skin_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294375_330969047355893_2816832907350518180_n.jpg?oh=888163373d7525ba2f624b69e829e6b2&oe=59EF6C69",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20526007_330968864022578_301252181041214194_n.jpg?oh=594e0e38048a25eb936870f7555c54b1&oe=59ED00BC",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20476581_330968454022619_5545376952806252992_n.jpg?oh=06835c2d640a3b0c6f8f6f056edc7374&oe=59FB384D",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20429692_330949250691206_6613712279404896931_n.jpg?oh=6ddcaed3438bf1f085fe360261f1caa2&oe=59F5ECEE",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20376153_330968444022620_8138762648559455357_n.jpg?oh=5fc3c47aeb61572a9b6033fff29907c4&oe=5A3792ED",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20479789_330968880689243_7743459290278560649_n.jpg?oh=5bdb2d0b948ee48bbeedb80ab029f18b&oe=5A32885E",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294018_330976040688527_7260022847404743218_n.jpg?oh=3ae610f43400b2aaf35e228e3713a8d5&oe=5A357B23",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20526200_330956817357116_3869410505189928258_n.jpg?oh=e0f0e62cbd1e663f6023a8eb640e67e1&oe=59EB0C34"};


                String[] hair_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20375781_330978510688280_7690007003896501316_n.jpg?oh=ce2c89c6e4761429fa7b5289daa8551c&oe=59FE9BA7",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20430021_330979387354859_3354053295926170413_n.jpg?oh=2e6ab46623f6806a7bb8067e493fd5f0&oe=59F5D937",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294162_330963870689744_9017210684237094525_n.jpg?oh=666d5740386f42f8540ceac7223ff517&oe=59EBBB43",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20525895_330982447354553_6947275872355780936_n.jpg?oh=3358d4bea8d35f862e8e43826bb2a164&oe=5A02E5BC",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20431463_330983307354467_702839978972817215_n.jpg?oh=e672375512079d517dbf0305aa991611&oe=5A001E56",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374562_330984267354371_3013388116760379747_n.jpg?oh=f3dcafe27cb78e0c4091bdbc99c97a48&oe=59F4A07C"};

                String[] body_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20376121_330984747354323_8371644922629281132_n.jpg?oh=bcbc82c91e46c5fb17ecdb855a7607d2&oe=59FD0023",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-0/p261x260/20479645_330985960687535_1478331645503395984_n.jpg?oh=b520688e8d6e17c931330e98e8ba7a81&oe=59F2EC00",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-0/p235x350/20431311_330986334020831_5080804332205151015_n.jpg?oh=1da3f7f64c5aff08d387c02c248695ab&oe=5A3615EC",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-0/p235x350/20374568_330987297354068_5792729476679515682_n.jpg?oh=98c92fab635a872490a0a9f8304012e3&oe=59F72748",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374762_330990784020386_4141339237348023446_n.jpg?oh=28fe8a1e97676ce991e2eb9368fafdad&oe=59FFD577",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374597_330989570687174_6257744560287152620_n.jpg?oh=991a3d4d73fd9577eced4f738f7c94bf&oe=5A02DCA3",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20294224_330990194020445_2834814377498207445_n.jpg?oh=414234e4c5ebc57f732e30527e908ff9&oe=59F93D74"};

                String[] teeth_image = {"https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20376083_330992100686921_6111781555398953787_n.jpg?oh=e9d009ff7fa1b73792851657567d378e&oe=59F0904B",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20374348_330995497353248_3537631988988243742_n.jpg?oh=bd29302a26942d265f018b47326d2ca7&oe=59FB5CF6",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20431708_330995920686539_246234647266032933_n.jpg?oh=b865125fa6584c1907ae36cce45da9b8&oe=59FF0971",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20525258_330996207353177_1720733155934297082_n.jpg?oh=1ea83ca4139a92ca8fc3de2727acb1e9&oe=5A04EC3D",
                "https://scontent.frgn1-1.fna.fbcdn.net/v/t1.0-9/20429578_330996090686522_2886082210936896692_n.jpg?oh=e492ea62f843db9659cca13c4acfd9fb&oe=59F84B84"};
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                        intent.putExtra("title",title[position]);
                        intent.putExtra("itemtitle",eye_title);
                        intent.putExtra("itemdescription", eye_description);
                        intent.putExtra("itemimage", eye_image);
                        startActivity(intent);
                        break;


                    case 1:
                        Intent intent1=new Intent(MainActivity.this,DetailsActivity.class);
                        intent1.putExtra("title",title[position]);
                        intent1.putExtra("itemtitle",lips_title);
                        intent1.putExtra("itemdescription", lips_description);
                        intent1.putExtra("itemimage" ,lips_image);
                        startActivity(intent1);
                        break;


                    case 2:
                        Intent intent2=new Intent(MainActivity.this,DetailsActivity.class);
                        intent2.putExtra("title",title[position]);
                        intent2.putExtra("itemtitle",nails_title);
                        intent2.putExtra("itemdescription",nails_description);
                        intent2.putExtra("itemimage", nails_image);
                        startActivity(intent2);
                        break;


                    case 3:
                        Intent intent3=new Intent(MainActivity.this,DetailsActivity.class);
                        intent3.putExtra("title",title[position]);
                        intent3.putExtra("itemtitle",acne_title);
                        intent3.putExtra("itemdescription",acene_description);
                        intent3.putExtra("itemimage",acene_image);
                        startActivity(intent3);
                        break;


                    case 4:
                        Intent intent4=new Intent(MainActivity.this,DetailsActivity.class);
                        intent4.putExtra("title",title[position]);
                        intent4.putExtra("itemtitle",skincare_title);
                        intent4.putExtra("itemdescription",skincare_description);
                        intent4.putExtra("itemimage",skin_image);
                        startActivity(intent4);
                        break;


                    case 5:
                        Intent intent5=new Intent(MainActivity.this,DetailsActivity.class);
                        intent5.putExtra("title",title[position]);
                        intent5.putExtra("itemtitle",hair_title);
                        intent5.putExtra("itemdescription",hair_description);
                        intent5.putExtra("itemimage",hair_image);
                        startActivity(intent5);
                        break;


                    case 6:
                        Intent intent6=new Intent(MainActivity.this,DetailsActivity.class);
                        intent6.putExtra("title",title[position]);
                        intent6.putExtra("itemtitle",weight_title);
                        intent6.putExtra("itemdescription",bodyweight_description);
                        intent6.putExtra("itemimage",body_image);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7=new Intent(MainActivity.this,DetailsActivity.class);
                        intent7.putExtra("title",title[position]);
                        intent7.putExtra("itemtitle",teeth_title);
                        intent7.putExtra("itemdescription",teeth_description);
                        intent7.putExtra("itemimage",teeth_image);
                        startActivity(intent7);
                        break;

                }
            }
        };
        titleAdapter.setOnItemClickListener(itemClickListener);
        recyclerView.setAdapter(titleAdapter);
        prepareData();


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

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    }

