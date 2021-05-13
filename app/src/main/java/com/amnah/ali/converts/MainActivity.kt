package com.amnah.ali.converts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.amnah.ali.converts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    @SuppressLint("SetTextI18n")
    fun centimetreToKilometre(view: View) {
        val num = binding.inputTxt.text.toString()
        binding.result.text = num + "e-5"
    }
    fun meterToKilometre(view: View) {
        val num = binding.inputTxt.text.toString().toDouble()
        binding.result.text = (num.div(1000)).toString()
    }
    @SuppressLint("SetTextI18n")
    fun kilometreToMillimetre(view: View) {
        val num = binding.inputTxt.text.toString()
        binding.result.text = num + "e+6"
    }
    fun mileToMeter(view: View) {
        val num = binding.inputTxt.text.toString().toDouble()
        binding.result.text = (num*(1609)).toString()
    }

    fun celsiusToFahrenheit(view: View) {
        val num = binding.inputTxt.text.toString().toDouble()
        binding.result.text = num.plus(273.15 ).toString()
    }
    fun celsiusToKelvin(view: View) {
        val num = binding.inputTxt.text.toString().toDouble()
        binding.result.text = (num* 9/5).plus(32 ).toString()
    }

    fun literToMilliliter(view: View) {
        val num = binding.inputTxt.text.toString().toInt()
        binding.result.text = (num * 1000).toString()
    }
}