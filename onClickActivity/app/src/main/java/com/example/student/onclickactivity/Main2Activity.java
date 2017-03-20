package com.example.student.onclickactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = (ListView)findViewById(R.id.list1);
        Button upisi = (Button)findViewById(R.id.button2);
        final EditText text = (EditText)findViewById(R.id.editText);
       final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        upisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(text.getText().toString());
            }
        });


        adapter.add("Pera");
        adapter.add("Djura");
        adapter.add("Burz");
        listView.setAdapter(adapter);
    }
}
