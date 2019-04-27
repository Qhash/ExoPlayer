package com.google.android.exoplayer2.ui;

/**
 * Created by Denis Dyakov on 20.02.2017.
 */

public class ExoEpgItem {
    private Long start;
    private Long finish;
    private String name;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getFinish() {
        return finish;
    }

    public void setFinish(Long finish) {
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
