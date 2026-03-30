import java.util.Scanner;

public class QuestionService {
        Question[] questions = new Question[5];
        // Selections
        String[] selection = new String[questions.length];

        public QuestionService() {
                questions[0] = new Question(1, "What keyword is used to create an object in Java?",
                                new String[] { "class", "new", "void", "static" }, "b");

                questions[1] = new Question(2, "Which of the following is a valid way to declare a private field?",
                                new String[] { "public int age", "void int age", "private int age",
                                                "protected void age" },
                                "c");

                questions[2] = new Question(
                                3, "What does the 'this' keyword refer to inside a constructor?",
                                new String[] { "The parent class",
                                                "The current object instance", "A static method", "The return value" },
                                "b");

                questions[3] = new Question(4, "Which method is automatically called when you print an object?",
                                new String[] { "getDetails()", "print()", "toString()", "display()" }, "c");

                questions[4] = new Question(5, "What is encapsulation in Java?",
                                new String[] { "Inheriting from a parent class",
                                                "Keeping fields private and exposing them through methods",
                                                "Creating multiple constructors",
                                                "Overriding a parent method" },
                                "b");
        }

        public void startQuiz() {
                for (int i = 0; i < questions.length; i++) {
                        // Choice Options:
                        char choice = 'a';

                        // Questions
                        System.out.println("Question " + questions[i].getId() + ": " + questions[i].getQuestion());

                        // Options
                        for (int j = 0; j < questions[i].getOptions().length; j++) {
                                System.out.println(choice + ". " + questions[i].getOptions()[j]);
                                choice += 1;
                        }

                        // User Input
                        Scanner sc = new Scanner(System.in);
                        selection[i] = sc.nextLine();

                }
        }

        public void printScore() {
                int score = 0;
                for (int i = 0; i < questions.length; i++) {

                        Question question = questions[i];
                        String actualAnswer = question.getAnswer();
                        String userAnswer = selection[i];

                        // Check scores
                        if (actualAnswer.equals(userAnswer)) {
                                score++;
                        }
                }

                System.out
                                .println("Your Score: " + score + "/" + questions.length + " - "
                                                + (Math.round(((double) score / questions.length) * 100))
                                                + "%");
        }
}
