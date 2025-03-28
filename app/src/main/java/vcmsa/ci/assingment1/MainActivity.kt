package vcmsa.ci.assingment1

import android.os.Bundle
import android.widget.tvDisplay
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Define the Time of Day string
        val timeOfDay = listOf(
            "Morning",
            "Midday Snack",
            "Afternoon",
            "Afternoon Snack",
            "Evening",
            "Midnight Snack"
        )

        // Join the list into a single string with line breaks
        val timeOfDayString = timeOfDay.joinToString("\n")

        // Find the TextView and set the text
        val textView = findViewById<tvDisplay>(R.id.tvDisplay)
        textView.text = timeOfDayString
    }



}






