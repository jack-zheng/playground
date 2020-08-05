package com.playground.anno;

public class Person {
    private String name;
    private int age;
    private boolean isSelected;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Marked
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Marked(value = true)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
