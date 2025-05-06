import vcmsa.ashvaan12me.flashcard_app.R

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class inGamePlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_in_game_play)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // first we delcare the variables
        val btnAnswerTure = findViewById<Button>(R.id.btnAnswerTure)
        val btnAnswerFalse = findViewById<Button>(R.id.btnAnswerFalse)
        val tvScoreCounter = findViewById<TextView>(R.id.tvScoreCounter)
        val tvQuestions = findViewById<TextView>(R.id.tvQuestions)
        //now we create the array of questions which can be answered as true or false
        val questions = arrayOf(
            "Was John f kennedy assassinated in 1963?",
            "Did world war 2 end in 19439?",
            "Did the roman empire the build the pyramids",
            "The Cold War involved direct battles between the USA and the USSR",
            "The Declaration of Independence was signed in 1776"
        )
        //now we create the array of answers
        val answers = arrayOf(
            "True",
            "False",
            "False",
            "False",
            "True"
        )


    }
}




