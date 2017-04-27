package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists_activity);
        //Set a clicklistener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open the Artists view", Toast.LENGTH_SHORT).show();
                Intent ArtistsActivityIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(ArtistsActivityIntent);
            }
        });

        //Find the View that shows the Folders category
        TextView folders = (TextView) findViewById(R.id.folders_activity);
        //Set a clicklistener on that View
        folders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open the folders view", Toast.LENGTH_SHORT).show();
                Intent FoldersActivity = new Intent(MainActivity.this, FoldersActivity.class);
                startActivity(FoldersActivity);
            }
        });
        //Find the View that shows the now playing category
        TextView playing = (TextView) findViewById(R.id.now_playing);
        //Set a clicklistener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open the now playing view", Toast.LENGTH_SHORT).show();
                Intent NowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });
        //Find the View that shows the Search category
        TextView search = (TextView) findViewById(R.id.search_activity);
        //Set a clicklistener on that View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open the search view", Toast.LENGTH_SHORT).show();
                Intent SearchActivity = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(SearchActivity);
            }
        });
    }
}
