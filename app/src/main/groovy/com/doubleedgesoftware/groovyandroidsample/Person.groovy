package com.doubleedgesoftware.groovyandroidsample

import groovy.transform.CompileStatic
import groovy.transform.ToString;

@CompileStatic
@ToString
class Person {
    String name
    Integer age
    List<String> pets
}