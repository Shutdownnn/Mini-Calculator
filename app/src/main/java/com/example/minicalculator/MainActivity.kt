package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if (n1 == "" || n2 == ""){
                toast {
                    "Please Input Num1 and Num2 !!!"
                }
            }else{
                var result = n1.toDouble() + n2.toDouble()
                cal.setText("+")
                ans.setText("$result")
            }
        }

        minus.setOnClickListener {
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if (n1 == "" || n2 == ""){
                toast {
                    "Please Input Num1 and Num2 !!!"
                }
            }else{
                var result = n1.toDouble() - n2.toDouble()
                cal.setText("-")
                ans.setText("$result")
            }
        }

        multiply.setOnClickListener {
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if (n1 == "" || n2 == ""){
                toast {
                    "Please Input Num1 and Num2 !!!"
                }
            }else{
                var result = n1.toDouble() * n2.toDouble()
                cal.setText("*")
                ans.setText("$result")
            }
        }

        divider.setOnClickListener {
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if (n1 == "" || n2 == ""){
                toast {
                    "Please Input Num1 and Num2 !!!"
                }
            }
            if (n2 == "0") {
                toast {
                    "Do Not Num2 is Zero or Null"
                }
            }else {
                var result = n1.toDouble() / n2.toDouble()
                cal.setText("/")
                ans.setText("$result")
            }
            ans.setText("")
        }

        modulo.setOnClickListener {
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if (n1 == "" || n2 == ""){
                toast {
                    "Please Input Num1 and Num2 !!!"
                }
            }
            if (n2 == "0") {
                toast {
                    "Do Not Num2 is Zero or Null"
                }
            }else {
                var result = n1.toDouble() % n2.toDouble()
                cal.setText("%")
                ans.setText("$result")
            }
            ans.setText("")
        }

        clear.setOnClickListener {
            cal.setText("")
            num1.setText("")
            num2.setText("")
            ans.setText("")
        }
    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
}