package com.sctdroid.reader;

import java.util.List;

/**
 * Created by lixindong on 10/14/15.
 */
public class Task {
    public String task;
    public int count;
    public List<TItem> items;
    public Task(String task, int count, List<TItem> list) {
        this.task = task;
        this.count = count;
        this.items = list;
    }
}
