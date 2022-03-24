package com.example.innovationit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameConatiner,new HomeFragment()).commit();

        bnv=(BottomNavigationView)findViewById(R.id.bottomNavigation);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment temp=null;

                switch (item.getItemId())
                {
                    case R.id.menu_home : temp=new HomeFragment();
                        break;
                    case R.id.menu_team : temp=new OurTeamFragment();
                        break;
                    case R.id.menu_portfolio : temp=new PortfolioFragment();
                    break;
                    case R.id.menu_contact : temp=new ContactUsFragment();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.FrameConatiner,temp).commit();
                return true;
            }
        });
    }
}