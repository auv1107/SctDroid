package com.sctdroid.reader;

/**
 * Created by lixindong on 10/14/15.
 */
public class TItem {
    public static int STATUS_UNFINISHED = 0;
    public static int STATUS_FINISHED = 1;
    public int time;
    public String description;
    public int status;
    public boolean selected;
    public TItem(int time, String description, int status, boolean selected) {
        this.time = time;
        this.description = description;
        this.status = status;
        this.selected = selected;
    }
}
