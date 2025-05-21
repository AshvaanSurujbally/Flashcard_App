package vcmsa.ashvaan12me.flashcard_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewAnswers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_answers)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// end of viewCompat
        // code start here
        //now we declare the variables needed
        val tvDisplayAnswers = findViewById<TextView>(R.id.tvDisplayAnswers)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnMainMenu = findViewById<Button>(R.id.btnMainMenu)
        // we get the username from the intent and pass back to the review page and the game menu page so it can display it again
        val username = intent.getStringExtra("username")
        // Use Log to check if the username is received correctly and its passed to the next page
        Log.d("ReviewAnswers", "Received username: $username")

        // we get the questions and answers from the intent
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getStringArrayExtra("answers")
        val score = intent.getIntExtra("score", 0)

        //now we got to display the questions and answers in the textview
        // Combine and display in the TextView (AI assisted with the idea of the  code and website for the idea to use the string builder)
        // link to website: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/-string-builder/
        // link to chatgpt chatroom :https://chatgpt.com/c/682d8071-4cac-8001-8ee9-86db6e178afc
        // questioned asked :  "I want to display a list of questions and their answers stored in two separate arrays using
        // Kotlin in Android. Could you generate code that uses a StringBuilder to combine the questions and answers
        // into a formatted string and set it to a TextView?"

        val stringBuilder = StringBuilder()
        val count = minOf(questions?.size ?: 0, answers?.size ?: 0)
        for (i in 0 until count) {
            stringBuilder.append("${i + 1}. ${questions?.get(i)}\n")
            stringBuilder.append("Correct Answer: ${answers?.get(i)}\n\n")
            // Log the question and answer for debugging if theres any problems
            Log.d("ReviewAnswers", "Question: ${questions?.get(i)}, Answer: ${answers?.get(i)}")
        }
        // now we display the score in the textview
        tvDisplayAnswers.text = stringBuilder.toString()
        // end of assisted code
        // we set the back button to go back to the review page
        btnBack.setOnClickListener {
            finish()
        }
        // we set the main menu button to go back to the game menu
        btnMainMenu.setOnClickListener {
            val intent = Intent(this, gameMenu::class.java)
            // we send the score to the game menu page so it can display it again
            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val score = sharedPreferences.getInt("score",score)
            val username = sharedPreferences.getString("username", null)
            // we send the username to the game menu page so it can display it again
            intent.putExtra("username", username)
            //  we send the questions and answers to the game menu page so it can display them if we press  the history button again and the answer button
            intent.putExtra("questions", questions)
            intent.putExtra("answers", answers)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()

        }




    }//end of onCreate
}//end of ReviewAnswers