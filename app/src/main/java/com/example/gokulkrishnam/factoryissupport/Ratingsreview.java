package com.example.gokulkrishnam.factoryissupport;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.Toolbar;

public class Ratingsreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingsreview);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_ratings);
        mToolbar.setTitle(R.string.ratingreviewtitle);
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        Button send = findViewById(R.id.sendbutton);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RatingBar ratingBar = findViewById(R.id.ratingBar);
                EditText reviewtext = findViewById(R.id.textarea_ratings);
                float rating = ratingBar.getRating();

                String Toaststring = "Ratings: " + String.valueOf(rating) + "\n" + "Review: "
                                        + reviewtext.getText();

                Toast.makeText(Ratingsreview.this,Toaststring,Toast.LENGTH_LONG).show();
            }
        });
        
    }
}
