public class Quiz {
  private final String question;
  private final String answer;

  public Quiz(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  public String getQuestion() {
    return question;
  }

  public boolean isCorrect(String userAnswer) {
    return answer.equals(userAnswer);
  }
}
