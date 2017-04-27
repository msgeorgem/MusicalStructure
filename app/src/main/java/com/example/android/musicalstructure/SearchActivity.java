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

public class SearchActivity extends AppCompatActivity {

    private TextView mSearchActivityToDo;
    private Button mArtistsButton;
    private Button mFoldersButton;
    private Button mNowPlayingButton;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_view);

        mSearchActivityToDo =(TextView) findViewById(R.id.search_activity_todo);
        mArtistsButton =(Button) findViewById(R.id.artists_button);
        mFoldersButton =(Button) findViewById(R.id.folder_button);
        mNowPlayingButton =(Button) findViewById(R.id.playing_button);
        mSearchButton =(Button) findViewById(R.id.search_button);

        mFoldersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FoldersActivity = new Intent(SearchActivity.this, FoldersActivity.class);
                startActivity(FoldersActivity);
            }
        });

        mNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowPlayingIntent = new Intent(SearchActivity.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });

        mArtistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistsActivity = new Intent(SearchActivity.this, ArtistsActivity.class);
                startActivity(ArtistsActivity);
            }
        });
        showSearchToDo();
    }

    private void showSearchToDo(){
        mSearchActivityToDo.setVisibility(View.VISIBLE);
        mArtistsButton.setVisibility(View.VISIBLE);
        mFoldersButton.setVisibility(View.VISIBLE);
        mNowPlayingButton.setVisibility(View.VISIBLE);
        mSearchButton.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSearchActivityToDo.setVisibility(View.INVISIBLE);
        mArtistsButton.setVisibility(View.INVISIBLE);
        mFoldersButton.setVisibility(View.INVISIBLE);
        mNowPlayingButton.setVisibility(View.INVISIBLE);
        mSearchButton.setVisibility(View.INVISIBLE);
    }
}
