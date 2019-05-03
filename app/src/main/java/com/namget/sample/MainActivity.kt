package com.namget.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.namget.sample.recyclerview.RecyclerViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(){
        myRecyclerView.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerViewActivity::class.java))
        }

        myRecyclerView2.setOnClickListener {
//            startActivity(Intent(this@MainActivity, RecyclerviewActivity2::class.java))
        }

        myRecyclerView3.setOnClickListener {
//            startActivity(Intent(this@MainActivity, RecyclerviewActivity3::class.java))
        }

    }


}
