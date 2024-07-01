import java.util.Scanner;

public class QuizView {
  private final Scanner scanner;

  public QuizView(Scanner scanner) {
    this.scanner = scanner;
  }

  void displayQuestion(String question) {
    System.out.println("question = " + question);
  }
  String getUserAnswer() {
    return scanner.nextLine();
  }
  void displayResult(boolean isCorrect) {
    System.out.println(isCorrect ? "정답입니다!" : "오답입니다.");
  }


}
