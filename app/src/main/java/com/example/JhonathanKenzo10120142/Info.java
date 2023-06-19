package com.example.JhonathanKenzo10120142;

// 10120142_JhonathanKenzo_IF4

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Info extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager2 viewPager2;
    private InfoAdapter infoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navmenu);
        bottomNavigationView.setSelectedItemId(R.id.nav_info);
        viewPager2 = (ViewPager2) findViewById(R.id.viewPager2);
        infoAdapter = new InfoAdapter(InfoObject.createData());
        viewPager2.setAdapter(infoAdapter);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext()
                                ,MapsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_identitas:
                        startActivity(new Intent(getApplicationContext()
                                ,Identitas.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_info:
                        return true;
                }
                return false;
            }
        });
    }
}