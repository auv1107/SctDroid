package com.sctdroid.reader.views;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sctdroid.reader.R;
import com.sctdroid.reader.TItem;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by lixindong on 10/16/15.
 */
@EViewGroup(R.layout.listview_item)
public class TItemView extends RelativeLayout {
    public TItemView(Context context) {
        super(context);
    }

    @ViewById(R.id.fl_status)
    FrameLayout fl_status;

    @ViewById(R.id.tv_time)
    TextView tv_time;

    @ViewById(R.id.tv_description)
    TextView tv_description;

    @ViewById(R.id.iv_checkbox)
    ImageView iv_checkbox;

    public void bind(TItem item) {
        if (item != null) {
//        fl_status
            tv_time.setText(item.time + " mins");
            tv_description.setText(item.description);
            iv_checkbox.setSelected(item.selected);
        }
    }
}
