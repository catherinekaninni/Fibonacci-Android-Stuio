package dev.kanini.fimborachinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.kanini.fimborachinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()
    }
    fun displayNumbers(){


        var numbersList = numbers(100)

        val numbersAdapter = NumberRecyclerViewAdapter(numbersList)

        binding.rvnumbers.layoutManager = LinearLayoutManager(this)
        binding.rvnumbers.adapter=numbersAdapter
    }

    fun numbers(args: Int):List<Int> {
        val list = ArrayList<Int> ()
        var t1 = 0
        var t2 = 1

        for (i in 1..args) {
//            print("$t1 + ")

            var sum = t1 + t2
            t1 = t2
            t2 = sum
            list+=sum
        }
        return list
    }
}