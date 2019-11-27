package com.example.recyclerviewcontact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<com.example.recyclerviewcontact.Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Keanu Reeves", "50", "Balaju", "male", null));
        contactsList.add(new Contacts("Brad Pitt", "60", "Kathmandu", "male", null));
        contactsList.add(new Contacts("Angelina Jolie", "45", "Bhaktapur", "female", null));

        ContactsAdapter adapterContact = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(adapterContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
