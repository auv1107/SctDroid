package com.sctdroid.reader.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.sctdroid.reader.Constants;
import com.sctdroid.reader.Finder;
import com.sctdroid.reader.ItemFinder;
import com.sctdroid.reader.R;
import com.sctdroid.reader.TItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
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

    @Bean(ItemFinder.class)
    ItemFinder finder;

    int parentId;
    List<TItem> list_item;
    TaskAdapter adapter;

    @AfterViews
    void init() {
        list_item = finder.findAll();
        lv_task.setAdapter(adapter);
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        parentId = args.getInt(Constants.PARENT_ID, 0);
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
            if (convertView == null) {

            } else {

            }
            return null;
        }
    }
}
