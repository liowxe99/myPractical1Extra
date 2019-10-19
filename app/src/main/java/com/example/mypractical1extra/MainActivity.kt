package com.example.prac1extracha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener{ sum1() }
    }

    private fun rollDice(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        val resultText3: TextView = findViewById(R.id.result3_text)
        resultText3.text = randomInt.toString()

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice2() }

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener{ sum2() }

    }

    private fun rollDice2(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        val resultText2: TextView = findViewById(R.id.result2_text)
        resultText2.text = randomInt.toString()

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice3() }

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener{ sum3() }
    }

    private fun rollDice3(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { end() }

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener{ sum4() }
    }

    private fun sum1(){

        Toast.makeText(this, "must contain at least one number", Toast.LENGTH_SHORT).show()
    }

    private fun sum2(){
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultText4: TextView = findViewById(R.id.result4_text)
        Toast.makeText(this, resultText4.text.toString(), Toast.LENGTH_SHORT).show()

        resultText4.text = resultText3.text

    }

    private fun sum3(){
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultText4: TextView = findViewById(R.id.result4_text)


        val first = Integer.parseInt(resultText2.text.toString())
        val second = Integer.parseInt(resultText3.text.toString())
        val sum = first + second

        resultText4.text = sum.toString()

    }
    private fun sum4(){

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultText4: TextView = findViewById(R.id.result4_text)

        val sum1 = Integer.parseInt(resultText.text.toString()) + Integer.parseInt(resultText2.text.toString())
        val sum2 = sum1 + Integer.parseInt(resultText3.text.toString())

        resultText4.text = sum2.toString()


    }


    private fun end(){
        Toast.makeText(this, "only can roll for 3 times", Toast.LENGTH_SHORT).show()
    }


}
