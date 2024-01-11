package com.example.courseoffering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.mylist);

        String[] names={"Data_base","Software_engeneer","AI","numerical_method","Real_alysis","Discrete2","Data_structure","Discrete1","OOP","image_proccesing","Fisrt_aid","intoduction_programing","Algorithm","Web_programing","Arabic","English","Traffic_safty","Itali"};
        Myclass adapter = new Myclass(this,names);
        listView.setAdapter(adapter);
    }

}