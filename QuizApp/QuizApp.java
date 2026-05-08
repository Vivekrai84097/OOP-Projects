package QuizApp;

import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("Question : " + questionText);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return correctAnswer == userAnswer;
    }
}

class Quiz {
    Question[] questions = new Question[5];
    int count = 0;

    Quiz(int size) {
        questions = new Question[size];
    }

    public void addQuestion(Question q) {
        if (count < questions.length) {
            questions[count] = q;
            count++;
        } else {
            System.out.println("Quiz is full");
        }
    }

    public void startQuiz(UserScore user) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            questions[i].displayQuestion();
            
             System.out.print("Enter your answer: ");
            int userAnswer = sc.nextInt();

            if (questions[i].checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                user.increaseScore();
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}

class UserScore {

    String userName;
    int score;

    UserScore(String userName) {
        this.userName = userName;
        this.score = 0;
    }

    public void increaseScore(){
        score++;
    }

     public void displayScore(int totalQuestions) {
        System.out.println("\n" + userName + ", Your Score: " + score + " out of " + totalQuestions);
    }
}

public class QuizApp {

    public static void main(String[] args) {
        String[] option1 = { "Java", "HTML", "CSS", "SQL" };
        Question q1 = new Question("Which language is oops", option1, 1);

        String[] options2 = { "1995", "2000", "1985", "2010" };
        Question q2 = new Question(
                "In which year was Java created?",
                options2,
                3);

        String[] options3 = { "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum" };
        Question q3 = new Question(
                "Who invented Java?",
                options3,
                1);

        String[] options4 = { "extends", "implements", "inherit", "super" };
        Question q4 = new Question(
                "Which keyword is used for inheritance in Java?",
                options4,
                1);

        String[] options5 = { "Class", "Object", "Method", "Loop" };
        Question q5 = new Question(
                "Which is the blueprint of an object?",
                options5,
                1);

                Quiz quiz = new Quiz(5);
                quiz.addQuestion(q1);
                quiz.addQuestion(q2);
                quiz.addQuestion(q3);
                quiz.addQuestion(q4);
                quiz.addQuestion(q5);

                UserScore user = new UserScore("Vivek");

                quiz.startQuiz(user);

                user.displayScore(quiz.count);
    }
}