package com.dxdemo.dxdemolibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dxdemo.dxdemolibrary.util.toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.toast("Test Toast",Toast.LENGTH_SHORT)
    }

}