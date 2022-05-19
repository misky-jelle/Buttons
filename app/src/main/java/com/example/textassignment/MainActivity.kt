package com.example.textassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var etNumber:EditText
    lateinit var etNum:EditText
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var btnAdd:Button
    lateinit var tvAnswer:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnMultiply=findViewById(R.id.btnMultiply)
        etNumber=findViewById(R.id.etNumber)
        etNum=findViewById(R.id.etNum)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {
            var num=etNumber.text.toString().toDouble()
            var num1=etNum.text.toString().toDouble()
            add(num,num1)

        }
        btnSubtract.setOnClickListener {
            var num2 = etNumber.text.toString().toDouble()
            var num3 = etNum.text.toString().toDouble()
            subtract(num2, num3)
        }
        btnMultiply.setOnClickListener {
            var num4 = etNumber.text.toString().toDouble()
            var num5 = etNum.text.toString().toDouble()
            multiply(num4, num5)
        }
        btnModulus.setOnClickListener {
            var num6 = etNumber.text.toString().toDouble()
            var num7 = etNum.text.toString().toDouble()
            modulus(num6, num7)
        }
    }

     fun modulus(num6: Double, num7: Double) {
         var modulus=num6%num7
         tvAnswer.text=modulus.toString()

    }

    fun multiply(num4: Double, num5: Double) {
        var multiply=num4*num5
        tvAnswer.text=multiply.toString()

    }

    fun subtract(num2: Double, num3: Double) {
        var subtract=num2-num3
        tvAnswer.text=subtract.toString()

    }

    fun add(num: Double, num1: Double) {
        var add=num+num1
        tvAnswer.text=add.toString()

     }

    }

