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

class reviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// end of viewCompat
        // code start here
        //first we declare the variables needed
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val tvDisplayMeassage = findViewById<TextView>(R.id.tvDisplayMeassage)
        val btnMenu = findViewById<Button>(R.id.btnMenu)
        val btnExitLogin = findViewById<Button>(R.id.btnExitLogin)
        val btnPlayAgain = findViewById<Button>(R.id.btnPlayAgain)
        val btnAnswers = findViewById<Button>(R.id.btnAnswers)
        var username = intent.getStringExtra("username")
        // we get the questions and answers from the intent
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getStringArrayExtra("answers")

        //logging
        // Use Log to check if the username is received correctly and its passed to the next page
        Log.d(TAG, "Received username: $username")
        //We use log to check if the questions are received correctly and its passed to the next page
        Log.d(TAG, "Received questions: $questions")
        //We use log to check if the answers are received correctly and its passed to the next page
        Log.d(TAG, "Received answers: $answers")
        // Use Log to check if the username is received correctly and its passed to the next page
        Log.d(TAG, "Received username: $username")

        //now we get the score from the previous page and display it on the screen and write a message based on the score the user got
        val score = intent.getIntExtra("score", 0)
        Log.d(TAG, "Received score: $score")
        tvScore.text = score.toString()
         // now we save the username because if we don't save it and play again if will show null (Ai assisted with code and idea)
        if (username != null) {
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("username", username)
            editor.apply()


        }
         // now we write a message based on the score the user got and display it on the textview
        if (score == 0) {
            tvDisplayMeassage.text = "OH NO! $username you got $score  Study harder and try again"
        } else if (score == 1) {
            tvDisplayMeassage.text = " $username You got $score  but you can do better than that"
        } else if (score == 2) {
            tvDisplayMeassage.text = " You got $score,$username you'll get it next time "
        } else if (score == 3) {
            tvDisplayMeassage.text = "Nicely done $username you got $score you almost got it!!"
        } else if (score == 4) {
            tvDisplayMeassage.text = "WOW! $username you are really good at this"
        } else {
            tvDisplayMeassage.text =
                " $username YOU NAILED IT!!!!,$score Well done you are really intelligent"
        }
        //now we set the play again button to go back to the game page with the saved username (AI only assisted with the saving the username)
        btnPlayAgain.setOnClickListener {
            Log.d(TAG, " User clicked play again button clicked")
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val username = sharedPreferences.getString("username", null)
            val intent = Intent(this, game_play::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()

        }
        //now we set the exit login button to go back to the login page
        btnExitLogin.setOnClickListener {
            Log.d(TAG, " User clicked exit  button clicked")
            // now we set the score to zero when we exit the app
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putInt("score", 0)
            editor.apply()
            finishAffinity()
        }

        btnMenu.setOnClickListener {
            Log.d(TAG, " User clicked menu button clicked")
            val intent = Intent(this, gameMenu::class.java)
            //  we send the questions and answers to the game menu page so it can display them if we press  the history button again and the answer button
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val score = sharedPreferences.getInt("score", 0)
            val username = sharedPreferences.getString("username", null)
            intent.putExtra("username", username)
            intent.putExtra("score", score)
            intent.putExtra("questions", questions)
            intent.putExtra("answers", answers)
            startActivity(intent)
            finish()
        }
        //set the button to take us to the review answers page

        btnAnswers.setOnClickListener {
            Log.d(TAG, " User clicked answers button clicked")
            val answerIntent = Intent(this, ReviewAnswers::class.java)
            answerIntent.putExtra("questions", questions)
            answerIntent.putExtra("answers", answers)
            answerIntent.putExtra("username", username)
            answerIntent.putExtra("score", score)
            startActivity(answerIntent)

        }
        // we save the user score so when we go to different pages and come to the review page it will display the score currently(AI did not assist with this i used
        // the saving username code to create mt own for this
        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val scores = sharedPreferences.getInt("score", 0)
        val editor = sharedPreferences.edit()
        editor.putInt("score", score)
        editor.apply()



    } //end of onCreate


}//end of reviewPage
