package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.view.View.INVISIBLE;

/**
 * Created by Marcin on 2017-04-27.
 */

public class ArtistsActivity extends AppCompatActivity {

    @BindView(R.id.artists_activity_todo)
    TextView mArtistsToDo;
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
        showArtistsToDo();
    }

    @OnClick(R.id.playing_button)
    public void onClickPlaying() {
        Intent NowPlayingActivity = new Intent(ArtistsActivity.this, NowPlaying.class);
        startActivity(NowPlayingActivity);
        finish();
    }

    @OnClick(R.id.search_button)
    public void onClickSearch() {
        Intent SearchActivity = new Intent(ArtistsActivity.this, SearchActivity.class);
        startActivity(SearchActivity);
        finish();
    }

    @OnClick(R.id.folders_button)
    public void onClickFolders() {
        Intent FoldersIntent = new Intent(ArtistsActivity.this, FoldersActivity.class);
        startActivity(FoldersIntent);
        finish();
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
