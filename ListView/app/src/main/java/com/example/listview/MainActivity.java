package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mail> mailList;
    RecyclerView mailListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mailList = new ArrayList<Mail>();

        mailList.add(new Mail("1","A", "Demo mail", "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbb", "01/01/2020"));
        mailList.add(new Mail("2","B", "Demo mail", "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbb","01/01/2020"));
        mailList.add(new Mail("3","C", "Demo mail", "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbb","01/01/2020"));
        mailList.add(new Mail("4","D", "Demo mail", "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbb","01/01/2020"));
        mailList.add(new Mail("5","E", "Demo mail", "aaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbb", "01/01/2020"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mailListView = findViewById(R.id.mailListView);
        MailAdapter mailAdapter = new MailAdapter(mailList,MainActivity.this);


        mailListView.setAdapter(mailAdapter);
        mailListView.setLayoutManager(new LinearLayoutManager(this));
    }

}