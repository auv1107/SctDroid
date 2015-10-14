package com.sctdroid.reader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {
    @FragmentById(R.id.fragment)
    Fragment fragment;


}
