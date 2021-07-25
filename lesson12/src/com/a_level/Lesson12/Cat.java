package com.a_level.Lesson12;

import com.sun.jdi.Value;

import java.util.Objects;

public class Cat implements Comparable {
    Integer age;
    String name;

    public Cat(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(age, cat.age) && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.getName());
    }
}

