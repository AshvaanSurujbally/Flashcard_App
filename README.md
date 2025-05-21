
# Flashcard Quiz App (True/False Edition)

 (AI assisted with the design and layout on how to create it will diffrenct styles.)
 

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
https://github.com/AshvaanSurujbally/Flashcard_App

Report:

TO run the application you first need to clone this  repository in andriod stuido.Make sure your version of andriod studio is up to date, you migth need to update the project file depending on new realeses of update to andriod stuidio studio. Once the project has built 
open bulestacks and run bluestacks as your emulator. once the app
This application was created as a form of studying for students. The intention of this app was to make studying easier for students in the form of a flashcard app. The app logic is for a set of questions that will appear when you start the game and the user will select either true or false. There are five questions based on history. After the user has completed the game, the app will take them to a review page which will display their score and a message based on their score. There is also a score counter in the game to alert users of their score. In the review page there is an option for the users to check all five questions along with the correct answers. This was created because it helps users to check where they went wrong during the game. The app has more features like a login page which then takes you to a menu page which displays 3 choices for the user to pick from. The first option is a start button which will enable gameplay, the second choice will allow users to exit the game, and finally there is a history button which will take the user to the review page and if the user has played once before, their score will be displayed — hence why the button is called history. A major consideration I have taken into account is the app design and UI. The app is as simple as it needs to be without any complex features (activities). The background is themed with small pieces of history and the buttons are in different colours which will help determine their usage — for example, green means start and red means exit. Another fact that I have taken into account is that the application is meant for studying purposes so I have designed it not to be distracting. The messages I picked in the review page are meant to encourage and motivate users, even if they get a bad score, not to give up and try again. The coding part of the application was meant to be simple, good code with no bugs to make the user experience better. The game is meant to be exclusive to the user so in the menu there is a message for the user with their name and in the review page, every score has the username included along with the message. There are four buttons in the review page to help navigate the user throughout the application.




