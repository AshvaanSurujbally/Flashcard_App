
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


![Screenshot 2025-05-19 204358](https://github.com/user-attachments/assets/d800d88b-7124-42a2-8849-483b484e50ab)
![Screenshot 2025-05-19 204430](https://github.com/user-attachments/assets/166704c1-33ea-443f-b786-292b1f3a78d0)
![Screenshot 2025-05-19 204!417](https://github.com/user-attachments/assets/b5102f0b-eb4d-448b-bf1c-c12b0e4f4dad)
![Screenshot 2025-05-19 204451](https://github.com/user-attachments/assets/cb22d330-d6bf-46f7-9304-6e0850cb4157)
![Screenshot 2025-05-19 204551](https://github.com/user-attachments/assets/0bcab56c-94d6-403d-b92a-3a980a294fca)
![Screenshot 2025-05-19 204602](https://github.com/user-attachments/assets/ca820546-0db9-4215-9c9f-03be9cc248c0)
![Screenshot 2025-05-19 204616](https://github.com/user-attachments/assets/e1229316-3010-4aac-b2d7-db6cd6eb42f9)
![Screenshot 2025-05-19 204640](https://github.com/user-attachments/assets/7b44f216-ec32-4485-b99e-107565eb3362)



**Youtube demostration video :**
https://youtu.be/Oadg8N-rk6s 

**Link to github repositoty**
[GitHub](https://github.com/AshvaanSurujbally/Flashcard_App)

Report:

This app is a flashcard application that uses arrays to ask users questions and allow them to respond. The app was designed for students who are currently studying history to help them study more effectively and easily.

To run the application, you first need to clone this repository in Android Studio. Make sure your version of Android Studio is up to date — you might need to update the project files depending on new releases or updates to Android Studio. Once the project has built, open Bluestacks and run it as your emulator. Once the app is running, you will be able to play the game and explore its features.

The app logic consists of a set of questions that appear when you start the game, and the user selects either True or False. There are five questions based on history. After the user has completed the game, the app will take them to a review page, which displays their score and a message based on that score. There is also a score counter in the game to keep users informed of their progress. On the review page, there is an option for users to view all five questions along with the correct answers. This feature helps users identify where they made mistakes during the game.

The app includes additional features such as a login page, which leads to a menu page with three choices for the user:

1. A Start button to begin gameplay.

2. An Exit button to close the game. 

3.  History button that takes the user to the review page. If the user has played before, their previous score will be displayed.

A major consideration in the development of this app was its design and user interface. The app is intentionally simple, without any complex features or activities. The background includes subtle historical pictures, and the buttons are color-coded to indicate their functions — for example, green means “Start” and red means “Exit.” Because the app is intended for studying, it has been designed to minimize distractions.

The motivational messages in the review page are intended to encourage users, even if they receive a low score, not to give up and to try again. The code for the application was written to be simple and bug-free, ensuring a smooth user experience. The game is personalized for each user — their name appears in the menu and on the review page, where every score includes the username along with the motivational message. There are four buttons on the review page to help users navigate through the application.

In summary, this Android application was designed with the goal of helping students study in an interactive and user-friendly way. It provides an engaging quiz experience, personalized feedback, and a clean UI to enhance learning without distractions. With its simple design and motivational features, the app aims to make studying both effective and enjoyable. Everything in the application is simple, allowing anyone to use it easily and avoiding any potential bias toward users, which could lead to legal concerns.


## AI acknowledgement
This README was created with assistance from ChatGPT by OpenAI, which provided support with the layout, structure, and overall design of the document.






