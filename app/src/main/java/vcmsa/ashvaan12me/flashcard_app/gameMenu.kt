package vcmsa.ashvaan12me.flashcard_app

import android.content.Intent
import android.os.Bundle
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
        //first we delare the variables needed
        val btnStartGame = findViewById<Button>(R.id.btnStartGame)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnHistory = findViewById<Button>(R.id.btnHistory)

        //now we get the username from the main activity and display it in the game menu page
        // AI helped to with idea of how to get the username from the main activity but coding was my own work.
        val username = intent.getStringExtra("username")
        val tvUserGreeting = findViewById<TextView>(R.id.tvUserGreeting)
        tvUserGreeting.text = "ARE YOU READY TO PLAY $username"

        //set the start game button to take the user to the in game play page
        btnStartGame.setOnClickListener {
            val intent = Intent(this, game_play::class.java)
            startActivity(intent)

        }

        //now we set the exit button to take the user back to the main activity(the login page)
        btnExit.setOnClickListener {
            finish()
        }

        //set the history button to take the user to the review page
        btnHistory.setOnClickListener {
            val intent = Intent(this, reviewPage::class.java)
            startActivity(intent)
                }




    }
}