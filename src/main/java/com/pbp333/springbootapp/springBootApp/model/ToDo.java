package com.pbp333.springbootapp.springBootApp.model;

import java.util.Date;
import java.util.Objects;

public class ToDo {

    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean done;

    public ToDo(int id, String user, String desc, Date targetDate, boolean done){
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo)) return false;
        ToDo toDo = (ToDo) o;
        return id == toDo.id &&
                done == toDo.done &&
                Objects.equals(user, toDo.user) &&
                Objects.equals(desc, toDo.desc) &&
                Objects.equals(targetDate, toDo.targetDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, desc, targetDate, done);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + done +
                '}';
    }
}
