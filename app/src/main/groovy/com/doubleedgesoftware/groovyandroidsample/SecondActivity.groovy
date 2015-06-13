package com.doubleedgesoftware.groovyandroidsample

import android.content.Intent
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.arasthel.swissknife.annotations.OnClick
import groovy.json.JsonSlurper
import groovy.transform.CompileStatic

@CompileStatic
class SecondActivity extends AppCompatActivity{

    List<String> names

    @OnClick(R.id.button1)
    void onButtonClick(){
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
        Intent intent = new Intent(this, MainActivity.class)
        startActivity intent
    }

    @InjectView(R.id.button1)
    Button button1

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView R.layout.activity_second
        SwissKnife.inject this

        //parsing json example using jsonslurper
        JsonSlurper slurper = new JsonSlurper();
        ResponseResult result = slurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}') as ResponseResult

        Log.d('groovyandroidsample', result.toString())

        names = ['person1', 'person2', 'person3']

        names.each {
            Log.d("groovyandroidsample", it)
        }

        //POJO instantiation
        Person person1 = new Person(name: 'kevin', age: 12, pets: ['lucy', 'lassy'])
        Log.d("TEST", "person1"+ person1);

        //groovy truth to show not null
        if(person1){
            Log.d("TEST", "person 1 not null")
        }

        button1.onClickListener = {

        }

    }
}