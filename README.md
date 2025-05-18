
# Flashcard Quiz App (True/False Edition)

Welcome to the **Flashcard Quiz App**, a  Android application designed to help users test their general knowledge with fun and quick **True or False** questions.

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

Feel free to **Play**, **clone**, or **open an issue**.   
Enjoy the game

**Scrrenshots from APP**



![Screenshot 2025-05-18 143459](https://github.com/user-attachments/assets/e94d1a77-1522-4858-aa82-402a66730120)
![Screenshot 2025-05-18 143544](https://github.com/user-attachments/assets/26968d11-76a8-459a-adac-10b048a3977e)
![Screenshot 2025-05-18 143604](https://github.com/user-attachments/assets/e405ce34-856a-49b6-ab7b-5d5cf67adea6)
![Screenshot 2025-05-18 143632](https://github.com/user-attachments/assets/03821785-90f0-4e17-afaa-848849b5afba)
![Screenshot 2025-05-18 143652](https://github.com/user-attachments/assets/dbd6aee1-51d8-47d0-8a67-6851239c8a78)

**Code from Application**
![Screenshot 2025-05-18 143727](https://github.com/user-attachments/assets/410ef0f7-921a-4912-8c22-1defa569084e)
![Screenshot 2025-05-18 143810](https://github.com/user-attachments/assets/9fded30c-8f70-47f5-9c50-00f89788317b)
![Screenshot 2025-05-18 143824](https://github.com/user-attachments/assets/4fff9491-4e95-4d92-b1e4-f7285cafe219)
![Screenshot 2025-05-18 143901](https://github.com/user-attachments/assets/a8e86154-37ca-4354-a10f-4d12419424d8)
![Screenshot 2025-05-18 143924](https://github.com/user-attachments/assets/6b643d33-7678-4631-939d-b204364251bf)
![Screenshot 2025-05-18 144001](https://github.com/user-attachments/assets/d8f845b3-b1ed-4632-b9a3-06e7627c1215)
![Screenshot 2025-05-18 144024](https://github.com/user-attachments/assets/7ef454e2-2c50-4521-bec6-6b1c6942033b)
