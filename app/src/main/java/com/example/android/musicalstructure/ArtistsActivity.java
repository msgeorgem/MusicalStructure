package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.INVISIBLE;

/**
 * Created by Marcin on 2017-04-27.
 */

public class ArtistsActivity extends AppCompatActivity {

    private TextView mArtistsToDo;
    private Button mArtistsButton;
    private Button mFoldersButton;
    private Button mNowPlayingButton;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_view);

        mArtistsToDo =(TextView) findViewById(R.id.artists_activity_todo);
        mArtistsButton =(Button) findViewById(R.id.artists_button);
        mFoldersButton =(Button) findViewById(R.id.folder_button);
        mNowPlayingButton =(Button) findViewById(R.id.playing_button);
        mSearchButton =(Button) findViewById(R.id.search_button);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchActivity = new Intent(ArtistsActivity.this, SearchActivity.class);
                startActivity(SearchActivity);
            }
        });

        mNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowPlayingIntent = new Intent(ArtistsActivity.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });

        mFoldersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FoldersActivity = new Intent(ArtistsActivity.this, FoldersActivity.class);
                startActivity(FoldersActivity);
            }
        });

        showArtistsToDo();

    }
    private void showArtistsToDo(){
        mArtistsToDo.setVisibility(View.VISIBLE);
        mArtistsButton.setVisibility(View.INVISIBLE);
        mFoldersButton.setVisibility(View.VISIBLE);
        mNowPlayingButton.setVisibility(View.VISIBLE);
        mSearchButton.setVisibility(View.VISIBLE);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mArtistsToDo.setVisibility(INVISIBLE);
        mFoldersButton.setVisibility(View.INVISIBLE);
        mNowPlayingButton.setVisibility(View.INVISIBLE);
        mSearchButton.setVisibility(View.INVISIBLE);


    }
}
