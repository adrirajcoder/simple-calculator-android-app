package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //declared here so that this binding instance can also be used in other functions
    private lateinit var binding : ActivityMainBinding

    private lateinit var recievedText : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //LayoutInflater creates View objects based on layouts defined in XML
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.add.setOnClickListener{
            val num1 = binding.firstNumber.text.toString().toInt()
            val num2 = binding.secondNumber.text.toString().toInt()
            val result = addition(num1, num2)
            binding.answer.text = result.toString()
        }

        binding.sub.setOnClickListener{
            val num1 = binding.firstNumber.text.toString().toInt()
            val num2 = binding.secondNumber.text.toString().toInt()
            val result = subtraction(num1, num2)
            binding.answer.text = result.toString()
        }

        binding.mul.setOnClickListener{
            val num1 = binding.firstNumber.text.toString().toInt()
            val num2 = binding.secondNumber.text.toString().toInt()
            val result = multiplication(num1, num2)
            binding.answer.text = result.toString()
        }

        binding.div.setOnClickListener{
            val num1 = binding.firstNumber.text.toString().toDouble()
            val num2 = binding.secondNumber.text.toString().toDouble()
            val result = division(num1, num2)
            binding.answer.text = result.toString()
        }

        binding.clearButton.setOnClickListener{
            binding.firstNumber.text = null
            binding.secondNumber.text = null
            binding.answer.text = null
        }
    }

    private fun division(num1: Double, num2: Double): Double {
        return num1/num2
    }

    private fun multiplication(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    private fun subtraction(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    private fun addition(num1: Int, num2: Int): Int {
        return num1 + num2
    }


}