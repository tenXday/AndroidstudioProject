package com.example.testx

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollbutton: Button = findViewById(R.id.rollbutton)
        rollbutton.setOnClickListener { rolldice() }
        rolldice()


    }

    fun sendusername(view: View) {
        var username: EditText = findViewById(R.id.username)
        var intent = Intent(this, ResultActivy::class.java)
        intent.putExtra("username", username.text.toString())
        startActivity(intent)
    }

    fun rolldice() {
        var sixdice = Dice(6)
        var dicenum = sixdice.roll()

        var diceview: TextView = findViewById(R.id.dicenumview)
        diceview.text = dicenum.toString()

        var diceimgsorce = when (dicenum) {
            1 -> R.drawable.ic_launcher_background
            2 -> R.drawable.ic_launcher_foreground
            3 -> R.drawable.ic_launcher_background
            4 -> R.drawable.ic_launcher_foreground
            5 -> R.drawable.ic_launcher_background
            else -> R.drawable.ic_launcher_foreground
        }

        var diceView: ImageView = findViewById(R.id.imageView)
        diceView.setImageResource(diceimgsorce)
    }

    var sum = 0
    fun increment(view: View) {
        sum++
        showScores(sum)
    }

    fun decrement(view: View) {
        sum--
        showScores(sum)
    }

    private fun showScores(sum: Int) {
        val textView: TextView = findViewById(R.id.textView)
        textView.text = sum.toString()
        /*  for(i:Int in 1..10 step 2){
              this.sum +=i
              textView.text=sum.toString()
             System.out.println(i)
          }*/
    }
}

class Dice(var dicenumber: Int) {
    fun roll(): Int {
        return (1..dicenumber).random()
    }
}