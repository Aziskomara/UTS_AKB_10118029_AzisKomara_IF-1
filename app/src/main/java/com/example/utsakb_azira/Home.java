// Tanggal : 28 05 2021 - 04 06 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.utsakb_azira.galery.Galery_adapter;
import com.example.utsakb_azira.galery.Galery_item;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    // friendlist
    private RecyclerView rvFRD;
    private ArrayList<Friendly> fnd = new ArrayList<>();

    //daily List
    private  RecyclerView dailyR;
    private ArrayList<Friendly> listD = new ArrayList<>();

    //music List
    private  RecyclerView musicR;
    private ArrayList<Friendly> listM = new ArrayList<>();

    //profile
    ImageButton facebook, instagram, map;
    Dialog dialog;

    //costum buton
    Button btn_about;

    LinearLayout home, daily, musik_video, profile;
    ConstraintLayout galery_menu;
    MaterialToolbar title;

    //video view
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //costum button
        btn_about = findViewById(R.id.btn_about);
        dialog = new Dialog(this);

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        //profile
        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.intagram);
        map = findViewById(R.id.map);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/azis.komara.9/");
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/azis_komara16/");
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/9bMnJkwAKhAe82cj8");
            }
        });

        //recalce view galery
        RecyclerView galeryRecylerView = findViewById(R.id.galery);
        galeryRecylerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        // list
        List<Galery_item> galery_items = new ArrayList<>();
        galery_items.add(new Galery_item(R.drawable.galery1));
        galery_items.add(new Galery_item(R.drawable.galery2));
        galery_items.add(new Galery_item(R.drawable.galery3));
        galery_items.add(new Galery_item(R.drawable.galery4));
        galery_items.add(new Galery_item(R.drawable.galery5));
        galery_items.add(new Galery_item(R.drawable.galery6));
        galery_items.add(new Galery_item(R.drawable.galery7));
        galery_items.add(new Galery_item(R.drawable.galery8));
        galery_items.add(new Galery_item(R.drawable.galery9));
        galery_items.add(new Galery_item(R.drawable.galery10));
        galery_items.add(new Galery_item(R.drawable.galery11));
        galery_items.add(new Galery_item(R.drawable.galery12));
        galery_items.add(new Galery_item(R.drawable.galery13));
        galery_items.add(new Galery_item(R.drawable.galery14));

        galeryRecylerView.setAdapter(new Galery_adapter(galery_items));


        // App bar
        MaterialToolbar toolbar = findViewById(R.id.topAppbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.getMenu().getItem(0).setChecked(true);

        home = findViewById(R.id.home_layout);
        daily = findViewById(R.id.daily_layout);
        galery_menu = findViewById(R.id.galery_layout);
        musik_video = findViewById(R.id.musik_video_layout);
        profile = findViewById(R.id.profile_layout);
        title = findViewById(R.id.topAppbar);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id){

                    case R.id.nav_home:
                        home.setVisibility(View.VISIBLE);
                        daily.setVisibility(View.GONE);
                        galery_menu.setVisibility(View.GONE);
                        musik_video.setVisibility(View.GONE);
                        profile.setVisibility(View.GONE);
                        title.setTitle("Home");
                        break;

                    case R.id.nav_activity:
                        home.setVisibility(View.GONE);
                        daily.setVisibility(View.VISIBLE);
                        galery_menu.setVisibility(View.GONE);
                        musik_video.setVisibility(View.GONE);
                        profile.setVisibility(View.GONE);
                        title.setTitle("Daily Activity");
                        break;

                    case R.id.nav_galeri:
                        home.setVisibility(View.GONE);
                        daily.setVisibility(View.GONE);
                        galery_menu.setVisibility(View.VISIBLE);
                        musik_video.setVisibility(View.GONE);
                        profile.setVisibility(View.GONE);
                        title.setTitle("Galery");
                        break;


                    case R.id.nav_musik_video:
                        home.setVisibility(View.GONE);
                        daily.setVisibility(View.GONE);
                        galery_menu.setVisibility(View.GONE);
                        musik_video.setVisibility(View.VISIBLE);
                        profile.setVisibility(View.GONE);
                        title.setTitle("Musik Dan Video");
                        break;


                    case R.id.nav_profile:
                        home.setVisibility(View.GONE);
                        daily.setVisibility(View.GONE);
                        galery_menu.setVisibility(View.GONE);
                        musik_video.setVisibility(View.GONE);
                        profile.setVisibility(View.VISIBLE);
                        title.setTitle("Musik Dan Video");
                        break;

                    default:
                        return true;
                }

                return true;

            }
        });
        // FriendList
        rvFRD = findViewById(R.id.rvFR);
        rvFRD.setHasFixedSize(true);
        fnd.addAll(Data_Friendly.getListData());
        showRlist();

        //Daily List
        dailyR = findViewById(R.id.rvDaily);
        dailyR.setHasFixedSize(true);
        listD.addAll(Data_Friendly.getLiskegiatan());
        showlistDaily();

        //video view
        videoView = findViewById(R.id.video);
        MediaController mediaController = new MediaController(this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoakb));
        videoView.start();

        //vier music
        musicR = findViewById(R.id.RV_M);
        musicR.setHasFixedSize(true);
        listM.addAll(Data_Friendly.getListMusic());
        showlistMusic();


    }

    private void openDialog() {
        dialog.setContentView(R.layout.dialog_layout);
        dialog.getWindow();

        ImageView imageviewclose = dialog.findViewById(R.id.img_close);
        dialog.show();

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void showRlist(){
        rvFRD.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ListFriendly_adapter LFadapter = new ListFriendly_adapter(fnd);
        rvFRD.setAdapter(LFadapter);
    }

    private void showlistDaily(){
        dailyR.setLayoutManager(new LinearLayoutManager(this));
        Daily_adapter LD = new Daily_adapter(listD);
        dailyR.setAdapter(LD);
    }

    private void showlistMusic(){
        musicR.setLayoutManager(new LinearLayoutManager(this));
        Musik_adapter LM = new Musik_adapter(listM);
        musicR.setAdapter(LM);
    }


}