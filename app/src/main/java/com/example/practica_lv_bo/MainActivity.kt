package com.example.practica_lv_bo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button

    val cardImages: IntArray = intArrayOf(
        R.drawable.ascaro,
        R.drawable.doicaro,
        R.drawable.treicaro,
        R.drawable.patrucaro,
        R.drawable.cincicaro,
        R.drawable.sasecaro,
        R.drawable.saptecaro,
        R.drawable.optcaro,
        R.drawable.nouacaro,
        R.drawable.zececaro,
        R.drawable.valetcaro,
        R.drawable.damacaro,
        R.drawable.popacaro,
        R.drawable.ascupa,
        R.drawable.doicupa,
        R.drawable.treicupa,
        R.drawable.patrucupa,
        R.drawable.cincicupa,
        R.drawable.sasecupa,
        R.drawable.saptecupa,
        R.drawable.optcupa,
        R.drawable.nouacupa,
        R.drawable.zececupa,
        R.drawable.valetcupa,
        R.drawable.damacupa,
        R.drawable.popacupa,
        R.drawable.aspica,
        R.drawable.doipica,
        R.drawable.treipica,
        R.drawable.patrupica,
        R.drawable.cincipica,
        R.drawable.sasepica,
        R.drawable.saptepica,
        R.drawable.optpica,
        R.drawable.nouapica,
        R.drawable.zecepica,
        R.drawable.valetpica,
        R.drawable.damapica,
        R.drawable.popapica,
        R.drawable.astrefla,
        R.drawable.doitrefla,
        R.drawable.treitrefla,
        R.drawable.patrutrefla,
        R.drawable.cincitrefla,
        R.drawable.sasetrefla,
        R.drawable.saptetrefla,
        R.drawable.opttrefla,
        R.drawable.nouatrefla,
        R.drawable.zecetrefla,
        R.drawable.valettrefla,
        R.drawable.damatrefla,
        R.drawable.popatrefla,
        
    )

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    }
