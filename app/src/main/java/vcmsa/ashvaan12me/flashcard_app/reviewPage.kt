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

        //now we get the score from the previous page and display it on the screen and wrirte a message based on the score the user got
        val score = intent.getIntExtra("score", 0)
        Log.d("Recevied Score", "Score: $score")
        tvScore.text = score.toString()

        if (score == 0) {
            tvDisplayMeassage.text = "OH NO! Study harder and try again"
        }
            else if (score ==1) {
                tvDisplayMeassage.text = "You got $score  but you can do better than that"
        }
            else if (score ==2) {
            tvDisplayMeassage.text = " You got $score, Pratice alittle more and you will get it "
            }
            else if (score ==3) {
            tvDisplayMeassage.text = "Nicly done you got $score you almost got it!!"
            }
           else if (score ==4) {
            tvDisplayMeassage.text = "WOW!you are really good at this"
            }
            else {
            tvDisplayMeassage.text = "YOU NAILED!!!!,$score Well done you are really intelligent"
        }
        //now we set the play again button to go back to the game page
        btnPlayAgain.setOnClickListener {
            Log.d(TAG, " User clicked play again button clicked")
            val intent = Intent(this, game_play::class.java)
            startActivity(intent)
        }
        //now we set the exit login button to go back to the login page
        btnExitLogin.setOnClickListener {
            Log.d(TAG, " User clicked exit login button clicked")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //now we set the menu button to go back to the main page
        btnMenu.setOnClickListener {
            Log.d(TAG, " User clicked menu button clicked")
            val intent = Intent(this, gameMenu::class.java)
            startActivity(intent)
        }




    }
}