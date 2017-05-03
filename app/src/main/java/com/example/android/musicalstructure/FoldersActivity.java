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

public class FoldersActivity extends AppCompatActivity {


    @BindView(R.id.folders_activity_todo)
    TextView mFoldersToDo;
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
        showFoldersToDo();
    }

    @OnClick(R.id.playing_button)
    public void onClickPlaying() {
        Intent NowPlayingActivity = new Intent(FoldersActivity.this, NowPlaying.class);
        startActivity(NowPlayingActivity);
        finish();
    }

    @OnClick(R.id.search_button)
    public void onClickSearch() {
        Intent SearchActivity = new Intent(FoldersActivity.this, SearchActivity.class);
        startActivity(SearchActivity);
        finish();
    }

    @OnClick(R.id.artists_button)
    public void onClickArtists() {
        Intent ArtistsIntent = new Intent(FoldersActivity.this, ArtistsActivity.class);
        startActivity(ArtistsIntent);
        finish();
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
