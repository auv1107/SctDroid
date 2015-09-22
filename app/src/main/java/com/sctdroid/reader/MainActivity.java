package com.sctdroid.reader;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.layout_tolearnlist)
public class MainActivity extends AppCompatActivity {

//    @ViewById(R.id.tv)
//    TextView tv;
//
//    @StringRes(R.string.annotation_test)
//    String promt;
//
//    @AfterViews
//    void afterViews(){
//        tv.setText(promt);
//    }

    @ViewById(R.id.button)
    ImageButton button;

    @AfterViews
    void afterViews() {
    }

    @Click
    public void button() {
        ((TransitionDrawable)button.getDrawable()).startTransition(500);
    }

}
