package com.sctdroid.reader.views;

import android.content.Context;
import android.widget.FrameLayout;

import com.sctdroid.reader.R;

import org.androidannotations.annotations.EViewGroup;

/**
 * Created by lixindong on 10/16/15.
 */
@EViewGroup(R.layout.listview_footer)
public class FooterView extends FrameLayout {
    public FooterView(Context context) {
        super(context);
    }
}
