package com.example.practrab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

private const val TAG = "Эдуард Асадов - Баллада о ненависти и любви"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Метель ревет, как седой исполин,")

    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "Вторые сутки не утихая,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Ревет как пятьсот самолетных турбин,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И нет ей, проклятой, конца и края!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Пляшет огромным белым костром,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Глушит моторы и гасит фары.")
    }


}
