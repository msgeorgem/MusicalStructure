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

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.search_activity_todo)
    TextView mSearchActivityToDo;
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
        showSearchToDo();
    }

    @OnClick(R.id.playing_button)
    public void onClickPlaying() {
        Intent NowPlayingActivity = new Intent(SearchActivity.this, NowPlaying.class);
        startActivity(NowPlayingActivity);
    }

    @OnClick(R.id.folders_button)
    public void onClickFolders() {
        Intent FoldersActivity = new Intent(SearchActivity.this, FoldersActivity.class);
        startActivity(FoldersActivity);
    }

    @OnClick(R.id.artists_button)
    public void onClickArtists() {
        Intent ArtistsIntent = new Intent(SearchActivity.this, ArtistsActivity.class);
        startActivity(ArtistsIntent);
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
