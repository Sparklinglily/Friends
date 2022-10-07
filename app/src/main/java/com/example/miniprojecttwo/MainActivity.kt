package com.example.miniprojecttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
//    private lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        toolbar = findViewById(R.id.tool_bar)
//        setSupportActionBar(toolbar)



        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
//        val friendsList = List<Friends>
        recyclerView.adapter = FriendAdapter(this)

        recyclerView.addItemDecoration(DividerItemDecoration(this,androidx.recyclerview.widget.RecyclerView.VERTICAL))

    }



}