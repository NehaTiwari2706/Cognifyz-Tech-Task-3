package com.example.listdisplaytask3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView = findViewById<ListView>(R.id.myListView)

        val fruits = listOf("APPLE", "ORANGE", "BANANA", "WATER MELON","Chiku",
            "Mango",
            "Grapes",
            "Pineapple",
            "Strawberry",
            "Cherry",
            "Peach",
            "Pear",
            "Kiwi",
            "Plum",
            "Apricot",
            "Blueberry",
            "Raspberry",
            "Blackberry",
            "Cantaloupe",
            "Honeydew",
            "Lemon",
            "Lime",
            "Coconut",
            "Pomegranate",
            "Fig",
            "Date",
            "Guava",
            "Papaya",
            "Passion Fruit",
            "Lychee",
            "Starfruit",
            "Cranberry",
            "Tangerine",
            "Clementine",
            "Nectarine",
            "Persimmon",
            "Kumquat",
            "Dragon Fruit",
            "Mulberry",
            "Jackfruit",
            "Durian",
            "Pitaya (Dragon Fruit)")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
        myListView.adapter = arrayAdapter

        myListView.setOnItemClickListener { parent, _, position, _ ->
            val item = parent.getItemAtPosition(position)
            Toast.makeText(applicationContext, "Clicked on $item at position ${position + 1}", Toast.LENGTH_SHORT).show()
        }
    }
}

