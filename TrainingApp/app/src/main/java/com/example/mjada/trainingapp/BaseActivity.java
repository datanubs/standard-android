package com.example.mjada.trainingapp;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;

import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


/**
 * A base class to wrap communication with the Google Play Services PlusClient.
 */
@EActivity
public class BaseActivity extends AppCompatActivity
{
    private boolean homeAsUpEnabled = false;

    protected void setStatusbarColor(int color)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(color));
        }
    }
    protected void setHomeAsUpEnabled(boolean enabled)
    {
        if (getSupportActionBar() != null)
        {
            homeAsUpEnabled = enabled;
            getSupportActionBar().setDisplayHomeAsUpEnabled(enabled);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (homeAsUpEnabled && item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
