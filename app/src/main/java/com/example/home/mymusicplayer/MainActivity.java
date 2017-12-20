package com.example.home.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the view corresponding to the "Recently Played" option
        TextView recent = findViewById(R.id.recent_option);

        // Setting onClick Listener to the corresponding view
        recent.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the RecentActivity
                Intent recentActIntent = new Intent(view.getContext(), RecentActivity.class);

                // Starting the new activity
                startActivity(recentActIntent);
            }
        });


        // Finding the view corresponding to the "Music Library" option
        TextView library = findViewById(R.id.library);

        // Setting onClick Listener to the corresponding view
        library.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the LibraryActivity
                Intent libraryActIntent = new Intent(view.getContext(), LibraryActivity.class);

                // Starting the new activity
                startActivity(libraryActIntent);
            }
        });


        // Finding the view corresponding to the "Latest Collections" option
        TextView latest = findViewById(R.id.latest);

        // Setting onClick Listener to the corresponding view
        latest.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the LatestActivity
                Intent latestActIntent = new Intent(view.getContext(), LatestActivity.class);

                // Starting the new activity
                startActivity(latestActIntent);
            }
        });


        // Finding the view corresponding to the "Settings" option
        TextView settings = findViewById(R.id.settings);

        // Setting onClick Listener to the corresponding view
        settings.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the SettingsActivity
                Intent settingsActIntent = new Intent(view.getContext(), SettingsActivity.class);

                // Starting the new activity
                startActivity(settingsActIntent);
            }
        });


        // Finding the view corresponding to the "Now Playing" option
        TextView now_playing = findViewById(R.id.now_playing);

        // Setting onClick Listener to the corresponding view
        now_playing.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the NowPlayingActivity
                Intent nowPlayingActIntent = new Intent(view.getContext(), NowPlayingActivity.class);

                // Starting the new activity
                startActivity(nowPlayingActIntent);
            }
        });
    }

}
