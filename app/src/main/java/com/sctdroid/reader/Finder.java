package com.sctdroid.reader;

import java.util.List;

/**
 * Created by lixindong on 10/16/15.
 */
public interface Finder<T> {
    public List<T> findAll();

    public int size();

    public T find(int id);
}
