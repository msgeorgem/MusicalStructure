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

public class FoldersActivity extends AppCompatActivity {

    private TextView mFoldersToDo;
    private Button mArtistsButton;
    private Button mFoldersButton;
    private Button mNowPlayingButton;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_view);

        mFoldersToDo = (TextView) findViewById(R.id.folders_activity_todo);
        mArtistsButton =(Button) findViewById(R.id.artists_button);
        mFoldersButton =(Button) findViewById(R.id.folder_button);
        mNowPlayingButton =(Button) findViewById(R.id.playing_button);
        mSearchButton =(Button) findViewById(R.id.search_button);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchActivity = new Intent(FoldersActivity.this, SearchActivity.class);
                startActivity(SearchActivity);
            }
        });

        mNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NowPlayingIntent = new Intent(FoldersActivity.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });

        mArtistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistsActivity = new Intent(FoldersActivity.this, ArtistsActivity.class);
                startActivity(ArtistsActivity);
            }
        });

        showFoldersToDo();

    }
    private void showFoldersToDo(){
        mFoldersToDo.setVisibility(View.VISIBLE);
        mArtistsButton.setVisibility(View.VISIBLE);
        mFoldersButton.setVisibility(View.INVISIBLE);
        mNowPlayingButton.setVisibility(View.VISIBLE);
        mSearchButton.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mFoldersToDo.setVisibility(View.INVISIBLE);
        mArtistsButton.setVisibility(View.INVISIBLE);
        mNowPlayingButton.setVisibility(View.INVISIBLE);
        mSearchButton.setVisibility(View.INVISIBLE);
    }
}
