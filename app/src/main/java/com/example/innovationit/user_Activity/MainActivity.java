package com.example.innovationit.user_Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.innovationit.Fragment.ContactUsFragment;
import com.example.innovationit.Fragment.HomeFragment;
import com.example.innovationit.Fragment.OurTeamFragment;
import com.example.innovationit.Fragment.PortfolioFragment;
import com.example.innovationit.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameConatiner,new HomeFragment()).commit();

        bnv=(BottomNavigationView)findViewById(R.id.bottomNavigation);
        bnv.getMenu().findItem(R.id.menu_home).setChecked(true);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment temp=null;


                switch (item.getItemId())
                {
                    case R.id.menu_home : temp=new HomeFragment();
                        break;
//                    case R.id.menu_team : temp=new OurTeamFragment();
//                        break;
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