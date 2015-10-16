package com.sctdroid.reader;

import org.androidannotations.annotations.EBean;

import java.util.List;

/**
 * Created by lixindong on 10/16/15.
 */
@EBean
public class ItemFinder implements Finder<TItem> {
    int parentId;
    TaskFinder finder;
    List<TItem> items;

    @Override
    public TItem find(int id) {
        items = findAll();
        return items.size() > id ? items.get(id) : null;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
        finder = new TaskFinder();
        items = findAll();
    }

    @Override
    public List<TItem> findAll() {
        return finder.find(parentId).items;
    }

    @Override
    public int size() {
        return items == null ? 0 : items.size();
    }
}
