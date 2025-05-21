package vcmsa.ashvaan12me.flashcard_app

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gameMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //first we declare the variables needed
        val btnStartGame = findViewById<Button>(R.id.btnStartGame)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnHistory = findViewById<Button>(R.id.btnHistory)
        //now we get the questions and answers this is because it needs to be passed to the review page and the answer page if we navigate from the history button
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getStringArrayExtra("answers")
        // we get the score from the answer page
        val score = intent.getIntExtra("score", 0)
        val answer = intent.getStringExtra("answer")
        val question = intent.getStringExtra("question")

        //now we get the username from the main activity and display it in the game menu page
        val username = intent.getStringExtra("username")
        val tvUserGreeting = findViewById<TextView>(R.id.tvUserGreeting)
        tvUserGreeting.text = "ARE YOU READY TO PLAY $username"

        // we do logging
        //We use log to check if the questions, answers and score are received correctly and its passed to the next page
        Log.d(TAG, "Received questions: $questions")
        Log.d(TAG, "Received score: $score")
        Log.d(TAG, "Received answers: $answers")
        // Use Log to check if the username is received correctly and its passed to the next page
        Log.d(TAG, "Received username: $username")

        //set the start game button to take the user to the in game play page and send the username so we can it pass it to the next page
        btnStartGame.setOnClickListener {
            val intent = Intent(this, game_play::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()
        }
        //set the exit button to exit the app
        btnExit.setOnClickListener {
            // now we set the score to zero when we exit the app
            // we used the save score to set the score to zero when we exit the app
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putInt("score", 0)
            editor.apply()
            finishAffinity()
        }
        //set the history button to take the user to the review page
        btnHistory.setOnClickListener {
            val intent = Intent(this, reviewPage::class.java)
            // we send the username to the review page so it can display it again if we moving through pages so it will display
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val score = sharedPreferences.getInt("score", score )
            intent.putExtra("username", username)
            // we send the questions and answers to the review page so it can display them if we press answer button in the history page
            intent.putExtra("questions", questions)
            intent.putExtra("answers", answers)
            // we send the score to the review page so it can display it if history button and then answer button is pressed
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
                }
    }//end of onCreate
}//end of gameMenu