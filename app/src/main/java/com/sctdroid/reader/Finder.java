package com.sctdroid.reader;

import org.androidannotations.annotations.EBean;

import java.util.List;

/**
 * Created by lixindong on 10/16/15.
 */
@EBean
public interface Finder<T> {
    public List<T> findAll();
    public int size();
    public T find(int id);
}
