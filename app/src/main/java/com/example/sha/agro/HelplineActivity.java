package com.example.sha.agro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class HelplineActivity extends AppCompatActivity {


    private ViewPager helpViewPager;
    private TabLayout helpTabLayout;
    private HelplineTAA helpTabAccessorAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);


        helpViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_H);
        helpTabAccessorAdapter = new HelplineTAA(getSupportFragmentManager());
        helpViewPager.setAdapter(helpTabAccessorAdapter);

        helpTabLayout = (TabLayout) findViewById(R.id.main_tabs_H);
        helpTabLayout.setupWithViewPager(helpViewPager);









    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.profile:
                Intent profile = new Intent(this, Main2Activity.class);
                startActivity(profile);
                break;

            case R.id.set:
                Intent settings = new Intent(this, Main2Activity.class);
                startActivity(settings);
                break;

            case R.id.logout:

                FirebaseAuth.getInstance().signOut();
                finish();
                Intent logout = new Intent(this, MainActivityPhoneAuth.class);
                startActivity(logout);
                break;
        }
        return true;

    }

}
