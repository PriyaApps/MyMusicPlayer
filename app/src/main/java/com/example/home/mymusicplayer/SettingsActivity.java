package com.example.home.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Finding the view corresponding to the "To Home Screen" option
        TextView home = findViewById(R.id.main_screen);

        // Setting onClick Listener to the corresponding view
        home.setOnClickListener(new View.OnClickListener() {

            // Specifying to open the respective activity when that view is clicked
            @Override
            public void onClick(View view) {
                // Creating a new intent to open the MainActivity
                Intent MainActIntent = new Intent(view.getContext(), MainActivity.class);

                // Starting the new activity
                startActivity(MainActIntent);
            }
        });
    }
}
