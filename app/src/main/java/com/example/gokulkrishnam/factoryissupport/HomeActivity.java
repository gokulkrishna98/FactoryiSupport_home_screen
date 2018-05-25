package com.example.gokulkrishnam.factoryissupport;

import android.app.ActionBar;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

public class HomeActivity extends AppCompatActivity {

    private home_fragment home;
    private history_fragment history;
    private engineer_fragment Engineer;
    private date_fragment date;
    private more_fragment More;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home = new home_fragment();
        history = new history_fragment();
        Engineer = new engineer_fragment();
        date = new date_fragment();
        More = new more_fragment();

        addFragment(home);

        BottomNavigationView bottom_nav = findViewById(R.id.NavBar);
        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.Home:
                        addFragment(home);
                        return true;
                    case R.id.history:
                        addFragment(history);
                        return true;
                    case R.id.Engineer:
                        addFragment(Engineer);
                        return true;
                    case R.id.Date:
                        addFragment(date);
                        return true;
                    case R.id.More:
                        addFragment(More);
                        return true;
                    default:
                        return true;
                }

            }
        });

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(HomeActivity.this,mDrawerLayout,R.string.navbar_open,R.string.navbar_close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }

        SearchView search = (SearchView) item.getActionView();
        search.setLayoutParams(new ActionBar.LayoutParams(Gravity.RIGHT));

        return super.onOptionsItemSelected(item);
    }

    private void addFragment(Fragment fragment)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.fragment_frame,fragment);
        ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
