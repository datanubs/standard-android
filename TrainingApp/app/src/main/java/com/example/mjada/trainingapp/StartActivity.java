package com.example.mjada.trainingapp;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

/**
 * Created by Wahman on 2016-11-10.
 */

@EActivity(R.layout.activity_start)
public class StartActivity extends BaseActivity
{

    @AfterViews
    public void afterViews(){
        setHomeAsUpEnabled(false);
    }

    @Click(R.id.sexy)
    protected void goToSexy(){
        SexyActivity_.intent(StartActivity.this).start();
    }

    @Click(R.id.puke)
    protected void goToPuke(){
        PukeActivity_.intent(StartActivity.this).start();
    }
}
