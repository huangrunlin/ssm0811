package com.saber.model;

public class User {

    private Integer id;
    private String name;
    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    @Override
    public String toString(){

        return "User{"+id+name+mark+"}";

    }
}
