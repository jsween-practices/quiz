public class QuizController {
  private final Quiz quiz;
  private final QuizView view;

  public QuizController(Quiz quiz, QuizView view) {
    this.quiz = quiz;
    this.view = view;
  }

  void startQuiz() {
    view.displayQuestion(quiz.getQuestion());
    String userAnswer = view.getUserAnswer();
    boolean isCorrect = quiz.isCorrect(userAnswer);
    view.displayResult(isCorrect);
  }
}
