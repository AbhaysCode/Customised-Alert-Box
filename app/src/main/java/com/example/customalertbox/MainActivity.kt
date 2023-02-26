package com.example.customalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.customalertbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.customised_alert)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg))

        var btnFeedback = dialog.findViewById<Button>(R.id.btnFeedback)
        var btnCoolCool = dialog.findViewById<Button>(R.id.btnCoolCool)

        btnFeedback.setOnClickListener{
            Toast.makeText(this,"Bro Feedback Send..",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        btnCoolCool.setOnClickListener{
            Toast.makeText(this,"Bro You Cool Too..",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        binding.btnClickMe.setOnClickListener{
            dialog.show()
        }
    }
}