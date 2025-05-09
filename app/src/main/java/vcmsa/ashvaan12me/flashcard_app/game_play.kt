package vcmsa.ashvaan12me.flashcard_app

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class game_play : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game_play)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// end of viewCompat
        // code start here
        ///first we declare the variables needed
        val btnAnswerTrue = findViewById<Button>(R.id.btnAnswerTrue)
        val btnAnswerFalse = findViewById<Button>(R.id.btnAnswerFalse)
        val tvScoreCounter = findViewById<TextView>(R.id.tvScoreCounter)
        val tvQuestions = findViewById<TextView>(R.id.tvQuestions)
        //now we create the arrays for the questions and answers
        val questions = arrayOf(
            "Was John F. Kennedy assassinated in 1963 ?",
            "Did World War 2 end in 1943 ?",
            "Did the Roman Empire build the pyramids ?",
            "The Cold War involved direct battles between the USA and the USSR ?.",
            "The Declaration of Independence was signed in 1776."
        )

        val answers = arrayOf(
            "True",
            "False",
            "False",
            "False",
            "True"
        )
        //now we create a counter for the questions and the score so that qwe know the score and can move on to the next question
        var questionIndex = 0
        var score = 0
        Log.d(TAG, "Starting quiz. Initial score: $score")
        // Show the first question
        tvQuestions.text = questions[questionIndex]
        tvScoreCounter.text = "Score: $score"

        // True button logic
        btnAnswerTrue.setOnClickListener {
            Log.d(TAG, "User clicked true as the answer ${questionIndex + 1}: ${questions[questionIndex]}")
            if (answers[questionIndex] == "True") {
                score++
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()

            }

            questionIndex++
            if (questionIndex < questions.size) {
                tvQuestions.text = questions[questionIndex]
                tvScoreCounter.text = "Score: $score"
            } else {
                // now we move to the review page as soon as the quiz is completed
                val intent = Intent(this, reviewPage::class.java)
                // we send the score and the questions and answers to the review page and the we send the questions and answers to the answer page
                intent.putExtra("score", score)
                intent.putExtra("questions", questions)
                intent.putExtra("answers", answers)
                startActivity(intent)
            }
        }

        // now we do the false button
        btnAnswerFalse.setOnClickListener {
            Log.d(TAG, "User clicked false as the answer ${questionIndex + 1}: ${questions[questionIndex]}")
            if (answers[questionIndex] == "False") {
                score++
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            questionIndex++
            if (questionIndex < questions.size) {
                tvQuestions.text = questions[questionIndex]
                tvScoreCounter.text = "Score: $score"
            } else {
                // Once all questions are answered, move to the review page
                val intent = Intent(this, reviewPage::class.java)
                intent.putExtra("score", score)
                intent.putExtra("questions", questions)
                intent.putExtra("answers", answers)
                startActivity(intent)
                finish() // Finish the current activity to prevent returning to the quiz
            }

        }





    }//end of onCreate


}//end of inGamePlay



