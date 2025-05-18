Flashcard Quiz App (True/False Edition)

Welcome to the Flashcard Quiz App, a lightweight Android application designed to help users test their general knowledge with fun and quick True or False questions.

 Features

Simple True/False quiz format

Score tracking

Personalized greeting using a username

Review screen showing final score and motivational messages

Answer review screen showing all questions with correct answers

Easy navigation: Main Menu, Play Again, and Exit

 How It Works

1. Login Screen (MainActivity.kt)

Users must enter a username to proceed.

Input validation ensures the field isn't empty.

Username is passed to the next screen for a personalized experience.

2. Game Menu (gameMenu.kt)

Displays a greeting with the entered username.

Options:

Start Game

Review History (answers)

Exit the app

3. Gameplay Screen (game_play.kt)

Displays one True/False question at a time.

Increments score for correct answers.

Toast messages notify user if the answer was correct or not.

After last question, navigates to review page.

 Example Questions:

1. Was John F. Kennedy assassinated in 1963? -> True
2. Did World War 2 end in 1943? -> False
3. Did the Roman Empire build the pyramids? -> False
4. The Cold War involved direct battles between the USA and the USSR? -> False
5. The Declaration of Independence was signed in 1776. -> True

4. Review Page (reviewPage.kt)

Displays final score and a message based on performance.

Buttons to:

Play Again

Return to Main Menu

Exit App

View All Answers

5. Answer Review (ReviewAnswers.kt)

Lists all questions with their correct answers.

Navigation buttons for Back and Main Menu

 Technologies Used

Kotlin

Android SDK (Jetpack, AppCompat)

Activity & Intent-based Navigation

View Components: TextView, EditText, Buttons, Toasts

 Future Improvements

Add user score history with persistent storage

Randomize question order each session

Add categories (History, Science, etc.)

Improve UI with animations and sound effects

Add a timer for each question

 Get Involved

We welcome feedback and contributions! If you'd like to add more questions, enhance the UI, or implement a feature — feel free to fork, clone, or open an issue.
Enjoy the game!!!

