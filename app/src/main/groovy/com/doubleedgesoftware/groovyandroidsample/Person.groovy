package com.doubleedgesoftware.groovyandroidsample

import groovy.transform.CompileStatic;

@CompileStatic
class Person {
    String name
    String age
    List<String> pets

    String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", pets=" + pets +
                '}';
    }
}