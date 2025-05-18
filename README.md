
# Flashcard Quiz App (True/False Edition)

Welcome to the **Flashcard Quiz App**, a lightweight Android application designed to help users test their general knowledge with fun and quick **True or False** questions.

## Features

- Simple **True/False** quiz format
- **Score tracking** to monitor progress
- **Personalized greeting** using a username
- **Review screen** showing final score and motivational messages
- **Answer review** screen displaying all questions with correct answers
- **Easy navigation** with options for Main Menu, Play Again, and Exit

## How It Works

### **Login Screen (`MainActivity.kt`)**
- Users must enter a **username** to proceed.
- Input validation ensures the field isn't empty.
- Username is passed to the next screen for a **personalized experience**.

### **Game Menu (`gameMenu.kt`)**
- Displays a greeting with the entered username.
- Options available:
  - **Start Game**
  - **Review History** (view previous answers)
  - **Exit the app**

### **Gameplay Screen (`game_play.kt`)**
- Displays **one True/False question at a time**.
- Increments score for correct answers.
- **Toast messages** notify users whether their answer is correct.
- After the last question, navigates to the **Review Page**.

#### Example Questions:
- Was John F. Kennedy assassinated in 1963? →  **True**
- Did World War II end in 1943? →  **False**
- Did the Roman Empire build the pyramids? →  **False**
- The Cold War involved direct battles between the USA and the USSR? →  **False**
- The Declaration of Independence was signed in 1776. →  **True**

### **Review Page (`reviewPage.kt`)**
- Displays **final score** and a motivational message based on performance.
- Buttons available to:
  - **Play Again**
  - **Return to Main Menu**
  - **Exit App**
  - **View All Answers**

### **Answer Review (`ReviewAnswers.kt`)**
- Lists **all questions** with their correct answers.
- Navigation buttons for **Back** and **Main Menu**.

## Technologies Used
- **Kotlin**
- **Android SDK** (Jetpack, AppCompat)
- **Activity & Intent-based Navigation**
- **View Components:** `TextView`, `EditText`, `Buttons`, `Toasts`

## Future Improvements
- Add **user score history** with persistent storage
- **Randomize question order** each session
- Add **categories** (History, Science, etc.)
- Improve UI with **animations and sound effects**
- Add a **timer** for each question

## Get Involved!
We welcome **feedback and contributions**! If you'd like to:
- Add more questions
- Enhance the UI
- Implement a new feature

Feel free to **fork**, **clone**, or **open an issue**. 🚀  
Enjoy the game!

---

This README is well-structured and easy to navigate—let me know if you'd like any changes or formatting tweaks! 👍



