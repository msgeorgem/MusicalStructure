package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Marcin on 2017-04-27.
 */

public class NowPlaying extends AppCompatActivity {

    private TextView mNowPlayingToDo;
    private Button mArtistsButton;
    private Button mFoldersButton;
    private Button mNowPlayingButton;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_view);

        mNowPlayingToDo =(TextView) findViewById(R.id.now_playing_todo);
        mArtistsButton =(Button) findViewById(R.id.artists_button);
        mFoldersButton =(Button) findViewById(R.id.folder_button);
        mNowPlayingButton =(Button) findViewById(R.id.playing_button);
        mSearchButton =(Button) findViewById(R.id.search_button);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchActivity = new Intent(NowPlaying.this, SearchActivity.class);
                startActivity(SearchActivity);
            }
        });

        mFoldersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FoldersIntent = new Intent(NowPlaying.this, FoldersActivity.class);
                startActivity(FoldersIntent);
            }
        });

        mArtistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistsActivity = new Intent(NowPlaying.this, ArtistsActivity.class);
                startActivity(ArtistsActivity);
            }
        });
        showNowPlayingToDo();
    }

    private void showNowPlayingToDo(){
        mNowPlayingToDo.setVisibility(View.VISIBLE);
        mArtistsButton.setVisibility(View.VISIBLE);
        mFoldersButton.setVisibility(View.VISIBLE);
        mNowPlayingButton.setVisibility(View.INVISIBLE);
        mSearchButton.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mNowPlayingToDo.setVisibility(View.INVISIBLE);
        mArtistsButton.setVisibility(View.INVISIBLE);
        mFoldersButton.setVisibility(View.INVISIBLE);
        mNowPlayingButton.setVisibility(View.INVISIBLE);
        mSearchButton.setVisibility(View.INVISIBLE);
    }
}
