package com.sctdroid.reader;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixindong on 10/16/15.
 */
@EBean
public class TaskFinder implements Finder<Task> {
    List<Task> list_task = new ArrayList<>();

    public TaskFinder() {
        initSimulateData();
    }

    @Override
    public Task find(int id) {
        return size() > id ? list_task.get(id) : null;
    }

    @Override
    public List<Task> findAll() {
        return list_task;
    }

    @Override
    public int size() {
        return list_task == null ? 0 : list_task.size();
    }

    void initSimulateData() {
        List<TItem> list = new ArrayList<>();

        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));
        list.add(new TItem(45, "description", 0, false));

        list_task.add(new Task("guita", 20, list));
        list_task.add(new Task("guita", 20, list));
        list_task.add(new Task("guita", 20, list));
        list_task.add(new Task("guita", 20, list));
        list_task.add(new Task("guita", 20, list));
    }
}
