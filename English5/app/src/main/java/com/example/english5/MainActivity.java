package com.example.english5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity  {

   // private FirebaseAnalytics mFirebaseAnalytics;
  //  FirebaseDatabase firebaseDatabase;
  private DatabaseReference reference;
    RecyclerView rec;
    ArrayList<Post> list;
    MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        FirebaseApp.initializeApp(MainActivity.this);

        rec = (RecyclerView) findViewById(R.id.rec);
        rec.setLayoutManager( new LinearLayoutManager(this));  //直行排下來

       //  firebaseDatabase = FirebaseDatabase.getInstance();
       // reference=firebaseDatabase.getReference("English5");
        reference=FirebaseDatabase.getInstance().getReferenceFromUrl("https://english5-eb486.firebaseio.com/English5");

        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                  //list = new ArrayList<>();
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                     Post p = dataSnapshot1.getValue(Post.class);

                     list.add(p);
                }
                adapter = new MyAdapter(MainActivity.this,list);
                rec.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Android", "Error " +databaseError);
            }

        });
       // reference=FirebaseDatabase.getInstance().getReference().child("English5");
             adapter.notifyDataSetChanged();  //讀取完資料更新清單

      }
}





