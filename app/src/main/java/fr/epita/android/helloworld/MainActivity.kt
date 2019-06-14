package fr.epita.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter : Int = 0
    var step : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_btn_clickme.setOnClickListener{
            counter = counter + step
            activity_main_text_counter.text = counter.toString()
        }

        activity_main_btn_reset.setOnClickListener{
            counter = 0
            activity_main_text_counter.text = counter.toString()
        }

        activity_main_btn_reverse.setOnClickListener{
            step = step * -1
        }

        activity_main_btn_big.setOnClickListener{
            if (step > 0)
                step = 5
            else
                step = -5
        }

        activity_main_btn_normal.setOnClickListener({
            if (step > 0)
                step = 1
            else
                step = -1
        })
    }
}
