package com.doubleedgesoftware.groovyandroidsample

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.OnClick
import groovy.json.JsonSlurper
import groovy.transform.CompileStatic

@CompileStatic
class SecondActivity extends AppCompatActivity{

    List<String> names;

    @OnClick(R.id.button1)
    void onButtonClick(){
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView R.layout.activity_second
        SwissKnife.inject this

        JsonSlurper slurper = new JsonSlurper();

        ResponseResult result = slurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}') as ResponseResult

        Log.d('groovyandroidsample', result.toString())

        names = ['person1', 'person2', 'person3']

        names.each {
            Log.d("groovyandroidsample", it)
        }
    }


}