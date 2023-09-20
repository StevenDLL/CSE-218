package Homeworks.HW_04.Custom;

import java.util.LinkedList;

public class Link {
    private String data;
    private LinkedList<Link> babyList;

    public Link() {
        data = null;
        babyList = new LinkedList<>();
    }

    public Link(String str) {
        data = str;
        babyList = new LinkedList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkedList<Link> getBabyList() {
        return babyList;
    }

    public void setBabyList(LinkedList<Link> babyList) {
        this.babyList = babyList;
    }

    public void addToBabyList(Link link) {
        this.babyList.add(link);
    }

    @Override
    public String toString() {
        return data;
    }
}
