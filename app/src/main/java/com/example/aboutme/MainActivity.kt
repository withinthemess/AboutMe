package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val MyName: MyName = MyName("Ahmed")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneBtn.setOnClickListener {
            addNick(it)
        }

        binding.myName = MyName

    }


    public fun addNick(view: View) {
        //no idea what .apply and invalidateAll do. literally no difference in functionality
        binding.apply {

            //binding.nickTextView.text = binding.editTextTextPersonName.text
            myName?.nickname = editTextTextPersonName.text.toString()
            invalidateAll()
            binding.editTextTextPersonName.visibility = View.GONE
            binding.doneBtn.visibility = View.GONE
            binding.nickTextView.visibility = View.VISIBLE
        }
    }
}