package com.sctdroid.reader.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.sctdroid.reader.R;
import com.sctdroid.reader.Task;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixindong on 10/14/15.
 */

@EFragment(R.layout.fragment_tolearnlist)
public class TaskFragment extends Fragment {
    @ViewById
    ImageView iv_pencil;

    @ViewById(R.id.iv_bin)
    ImageView iv_bin;

    @ViewById(R.id.iv_checkmark2)
    ImageView iv_checkmark2;

    @ViewById(R.id.iv_drawer2)
    ImageView iv_drawer2;

    @ViewById(R.id.vp_pager)
    ViewPager vp_pager;
    List<Task> list_task = new ArrayList<>();
    List<Fragment> list_fragments = new ArrayList<>();

    @AfterViews
    void afterviews() {
        vp_pager.setAdapter(new PagerAdapter(getActivity().getSupportFragmentManager()));
    }

    private class PagerAdapter extends FragmentStatePagerAdapter {
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (getCount() == 1 || position == getCount() - 1) {
                return new NewtaskFragments_();
            } else {
                return new NewtaskFragments_();
            }
        }

        @Override
        public int getCount() {
            return list_task == null ? 1 : list_task.size() + 1;
        }
    }

}
