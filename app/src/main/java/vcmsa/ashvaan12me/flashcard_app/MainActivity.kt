package vcmsa.ashvaan12me.flashcard_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code start here
        // first we declare the variables needed
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val edtUsername = findViewById<EditText>(R.id.edtUsername)
        // now we the user to enter a username and check if they did when they click the button
        btnLogin.setOnClickListener {
            val username = edtUsername.text.toString()
            if (username.isEmpty() || username.isBlank()) {
                edtUsername.error = "Please enter a username"
                // I didn't check if the user enters a number or special character because it's a username
            }
            // now we move to the game menu page if the user enters a valid username
            else {
                val intent = Intent(this, gameMenu::class.java)
                //now we take the username and add it to the game menu page as a greeting message in the next page
                intent.putExtra("username", username)
                startActivity(intent)
                finish()

            }

        }

    } //end of onCreate
} //end of MainActivity