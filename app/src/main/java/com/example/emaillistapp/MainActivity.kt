// MainActivity.kt
package com.example.emaillistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emaillistapp.adapter.EmailAdapter
import com.example.emaillistapp.utils.SampleData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Get sample data
        val emails = SampleData.getEmails()

        // Set up RecyclerView with adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emails)
    }
}
