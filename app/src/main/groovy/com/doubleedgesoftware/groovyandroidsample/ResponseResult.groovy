package com.doubleedgesoftware.groovyandroidsample;

import groovy.transform.CompileStatic;

/**
 * Created by kevintanhongann on 5/31/15.
 */
@CompileStatic
public class ResponseResult {
    Person person

    String toString() {
        return "ResponseResult{" +
                "person=" + person +
                '}';
    }
}
