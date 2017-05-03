package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Marcin on 2017-04-27.
 */

public class NowPlaying extends AppCompatActivity {

    @BindView(R.id.now_playing_todo)
    TextView mNowPlayingToDo;
    @BindView(R.id.artists_button)
    TextView mArtistsButton;
    @BindView(R.id.folders_button)
    TextView mFoldersButton;
    @BindView(R.id.playing_button)
    TextView mNowPlayingButton;
    @BindView(R.id.search_button)
    TextView mSearchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_view);
        ButterKnife.bind(this);
        showNowPlayingToDo();
    }

    @OnClick(R.id.artists_button)
    public void onClickArtists() {
        Intent ArtistsActivity = new Intent(NowPlaying.this, ArtistsActivity.class);
        startActivity(ArtistsActivity);
        finish();
    }

    @OnClick(R.id.search_button)
    public void onClickSearch() {
        Intent SearchActivity = new Intent(NowPlaying.this, SearchActivity.class);
        startActivity(SearchActivity);
        finish();
    }

    @OnClick(R.id.folders_button)
    public void onClickFolders() {
        Intent FoldersIntent = new Intent(NowPlaying.this, FoldersActivity.class);
        startActivity(FoldersIntent);
        finish();
    }

    private void showNowPlayingToDo() {
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
