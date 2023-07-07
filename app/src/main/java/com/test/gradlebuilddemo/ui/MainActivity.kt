package com.test.gradlebuilddemo.ui

import android.app.ActivityManager
import android.app.Notification
import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.gradlebuilddemo.MainViewModel
import com.test.gradlebuilddemo.R
import com.test.gradlebuilddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val vm by lazy { MainViewModel() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //R.layout.activity_main转换为view binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //通过view binding拿到activity_main.xml中的tv_text
        binding.tv.text = vm.getText()
        binding.tv.setBackgroundResource(R.drawable.drawable_main)

        generateName(System.currentTimeMillis())

    }

    private fun generateName(currentTimeMillis: Long) {
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        val builder = Notification.Builder(this)

        val activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager

        val runningAppProcesses = activityManager.runningAppProcesses
    }



}
