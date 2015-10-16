package com.sctdroid.reader.views;

import android.content.Context;
import android.widget.RelativeLayout;

import com.sctdroid.reader.R;

import org.androidannotations.annotations.EViewGroup;

/**
 * Created by lixindong on 10/16/15.
 */
@EViewGroup(R.layout.listview_header)
public class HeaderView extends RelativeLayout {
    public HeaderView(Context context) {
        super(context);
    }
}
