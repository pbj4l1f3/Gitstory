package com.example.kotton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.Month

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(){
   println("Pick 1 or 2 for a story")
    var inputYourMonth = readLine()?.toInt()
    if(inputYourMonth != null)
    if(inputYourMonth > 1 && inputYourMonth < 3) {
        println("You are walking through the woods. A distinct voice warns you from going further" +
                "If you choose to continue press 1 otherwise press 2")
    }else if(inputYourMonth < 2 && inputYourMonth >0) {
        println(
            "Its midnight and your car has broken down. A decrepit mansion looms overhead " +
                    "blocking the moonlight and impairing you vision. Press 1 to enter mansion " +
                    "otherwise press 2"
        )
    } else {
        println("You have entered an invalid option and will terminate program")
    }
}