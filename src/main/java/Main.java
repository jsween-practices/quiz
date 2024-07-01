import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Quiz quiz = new Quiz("질문", "답");
    QuizView view = new QuizView(scanner);
    QuizController controller = new QuizController(quiz, view);
    controller.startQuiz();
    scanner.close();
  }
}
