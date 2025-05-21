package vcmsa.ashvaan12me.flashcard_app

import android.annotation.SuppressLint
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
    @SuppressLint("SetTextI18n")
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
        val username = intent.getStringExtra("username")
        // Use Log to check if the username is received correctly and its passed to the next page
        Log.d(TAG, "Received username: $username")

        //now we create the arrays for the questions and answers
        //used a youtube video to assist with code
        //https://www.youtube.com/watch?v=K13fR2RHTak
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
        // end of youtube assisted with code


        // used a youtube video as a reference to assist with code and idea to create my own
        //https://www.youtube.com/watch?v=K13fR2RHTak
        // True button  we if and else statement to check if the answer is correct or not
        btnAnswerTrue.setOnClickListener {
            // we use log to check if the answer is correct or not
            Log.d(TAG, "User clicked true as the answer ${questionIndex + 1}: ${questions[questionIndex]}")
            // we check if the answer is correct or not
            if (answers[questionIndex] == "True") {
                score++
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            }
            // we move to the next question
            questionIndex++
            if (questionIndex < questions.size) {
                tvQuestions.text = questions[questionIndex]
                // we update the score counter
                tvScoreCounter.text = "Score: $score"
                // we use log to check the score and the question index
                Log.d(TAG, "Current score: $score")
                Log.d(TAG, "Current question index: $questionIndex")
            } else {
                // now we move to the review page as soon as the quiz is completed
                val intent = Intent(this, reviewPage::class.java)
                intent.putExtra("username", username)
                // we send the score and the questions and answers to the review page and the we send the questions and answers to the answer page
                intent.putExtra("score", score)
                intent.putExtra("questions", questions)
                intent.putExtra("answers", answers)
                startActivity(intent)
                finish()
            }
        }

        // now we do the false button we do if and else statement to check if the answer is correct or not
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
                // we use log to check the score and the question index
                Log.d(TAG, "Current score: $score")
                Log.d(TAG, "Current question index: $questionIndex")
            } else {
                // Once all questions are answered, move to the review page
                val intent = Intent(this, reviewPage::class.java)
                intent.putExtra("score", score)
                intent.putExtra("questions", questions)
                intent.putExtra("answers", answers)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
                // end of youtube assisted with code

            }

        }





    }//end of onCreate


}//end of inGamePlay



