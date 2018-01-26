package com.sunshuai.common_adapter;

/**
 * Created by sunshuai on 2018/1/23
 */

public class User {
    public User(String name, String says, int iconId) {
        this.name = name;
        this.says = says;
        this.iconId = iconId;
    }

    private String name;
    private String says;
    private int iconId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}
