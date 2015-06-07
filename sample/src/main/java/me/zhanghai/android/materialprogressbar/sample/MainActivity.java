/*
 * Copyright (c) 2015 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialprogressbar.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.zhanghai.android.materialprogressbar.ProgressHorizontalDrawable;
import me.zhanghai.android.materialprogressbar.ProgressIndeterminateDrawable;
import me.zhanghai.android.materialprogressbar.ProgressIndeterminateHorizontalDrawable;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.horizontal_progress_library)
    ProgressBar libraryHorizontalProgress;
    @InjectView(R.id.indeterminate_horizontal_progress_library)
    ProgressBar libraryIndeterminateHorizontalProgress;
    @InjectView(R.id.indeterminate_progress_large_library)
    ProgressBar libraryIndeterminateProgressLarge;
    @InjectView(R.id.indeterminate_progress_library)
    ProgressBar libraryIndeterminateProgress;
    @InjectView(R.id.indeterminate_progress_small_library)
    ProgressBar libraryIndeterminateProgressSmall;
    @InjectView(R.id.horizontal_progress_toolbar)
    ProgressBar toolbarHorizontalProgress;
    @InjectView(R.id.indeterminate_horizontal_progress_toolbar)
    ProgressBar toolbarIndeterminateHorizontalProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        ButterKnife.inject(this);

        libraryHorizontalProgress.setProgressDrawable(new ProgressHorizontalDrawable(this));

        libraryIndeterminateHorizontalProgress.setIndeterminateDrawable(
                new ProgressIndeterminateHorizontalDrawable(this));

        libraryIndeterminateProgressLarge.setIndeterminateDrawable(new ProgressIndeterminateDrawable(this));
        libraryIndeterminateProgress.setIndeterminateDrawable(new ProgressIndeterminateDrawable(this));
        libraryIndeterminateProgressSmall.setIndeterminateDrawable(new ProgressIndeterminateDrawable(this));

        ProgressHorizontalDrawable toolbarDrawable = new ProgressHorizontalDrawable(this);
        toolbarDrawable.setShowTrack(false);
        toolbarDrawable.setUseIntrinsicPadding(false);
        toolbarHorizontalProgress.setProgressDrawable(toolbarDrawable);

        ProgressIndeterminateHorizontalDrawable toolbarIndeterminateDrawable =
                new ProgressIndeterminateHorizontalDrawable(this);
        toolbarIndeterminateDrawable.setShowTrack(false);
        toolbarIndeterminateDrawable.setUseIntrinsicPadding(false);
        toolbarIndeterminateHorizontalProgress.setIndeterminateDrawable(
                toolbarIndeterminateDrawable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                startActivity(new Intent(this, AboutActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}