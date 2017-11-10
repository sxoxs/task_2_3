package com.company;

/**
 * Created by Денис on 09/11/17.
 */
public class Lesson {

    private String name;
    private int countHours;
    private String view;

    public Lesson() {

    }

    public Lesson(String name, int countHours, String view) {
        this.name = name;
        this.countHours = countHours;
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountHours() {
        return countHours;
    }

    public void setCountHours(int countHours) {
        this.countHours = countHours;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(name);
        sb.append(" { часы: ").append(countHours);
        sb.append(", вид зачета: ").append(view);
        sb.append(" }");
        return sb.toString();
    }
}
