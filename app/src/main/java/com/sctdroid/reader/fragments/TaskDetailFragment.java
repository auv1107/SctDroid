package com.sctdroid.reader.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sctdroid.reader.Constants;
import com.sctdroid.reader.ItemFinder;
import com.sctdroid.reader.ItemFinder_;
import com.sctdroid.reader.R;
import com.sctdroid.reader.TItem;
import com.sctdroid.reader.views.FooterView;
import com.sctdroid.reader.views.FooterView_;
import com.sctdroid.reader.views.HeaderView;
import com.sctdroid.reader.views.HeaderView_;
import com.sctdroid.reader.views.TItemView;
import com.sctdroid.reader.views.TItemView_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by lixindong on 10/16/15.
 */
@EFragment(R.layout.viewpager_task)
public class TaskDetailFragment extends Fragment {

    @ViewById(R.id.lv_task)
    ListView lv_task;

    HeaderView lv_header;
    FooterView lv_footer;

    ItemFinder finder;
    LayoutInflater inflater;

    int parentId;
    List<TItem> list_item;
    int count;
    String name;
    TaskAdapter adapter;

    @AfterViews
    void init() {
        inflater = LayoutInflater.from(getActivity());
        list_item = finder.findAll();
        initView();
    }

    void initView() {
        lv_header = HeaderView_.build(getActivity());
        lv_footer = FooterView_.build(getActivity());
        ((TextView) lv_header.findViewById(R.id.tv_title)).setText(name);
        lv_task.addFooterView(lv_footer, null, false);
        lv_task.addHeaderView(lv_header, null, false);
        lv_task.setAdapter(adapter);
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        parentId = args.getInt(Constants.PARENT_ID, 0);
        name = args.getString(Constants.TASK_NAME, "Random Exercise");
        count = args.getInt(Constants.TASK_COUNT, 0);
        finder = ItemFinder_.getInstance_(getActivity());
        finder.setParentId(parentId);
        adapter = new TaskAdapter();
    }

    class TaskAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return list_item == null ? 0 : list_item.size();
        }

        @Override
        public Object getItem(int i) {
            return getCount() > i ? list_item.get(i) : null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            TItemView itemView;
            if (convertView == null) {
                itemView = TItemView_.build(getActivity());
            } else {
                itemView = (TItemView_) convertView;
            }
            itemView.bind(finder.find(position));

            return itemView;
        }
    }
}
