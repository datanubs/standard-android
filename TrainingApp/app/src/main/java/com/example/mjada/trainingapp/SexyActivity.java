package com.example.mjada.trainingapp;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by Wahman on 2016-11-10.
 */

@EActivity(R.layout.activity_sexy)
public class SexyActivity extends BaseActivity
{

    @AfterViews
    public void afterViews()
    {
        setHomeAsUpEnabled(true);
    }
}
