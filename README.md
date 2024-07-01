- Model 클래스 (Quiz.java)
    - String 타입의 question과 answer 필드를 가집니다.
    - 생성자를 통해 question과 answer를 초기화합니다.
getQuestion()과 getAnswer() 메서드를 제공합니다.
View 클래스 (QuizView.java)
displayQuestion(String question) 메서드: 주어진 question을 출력합니다.
getUserAnswer() 메서드: 사용자로부터 답변을 입력받아 반환합니다.
displayResult(boolean isCorrect) 메서드: 퀴즈의 결과를 출력합니다. isCorrect가 true이면 "정답입니다!"를, false이면 "오답입니다."를 출력합니다.
Controller 클래스 (QuizController.java)
Quiz 객체와 QuizView 객체를 필드로 가집니다.
생성자를 통해 Quiz 객체와 QuizView 객체를 초기화합니다.
startQuiz() 메서드: 퀴즈를 시작하고 진행합니다.
QuizView의 displayQuestion() 메서드를 호출하여 질문을 출력합니다.
QuizView의 getUserAnswer() 메서드를 호출하여 사용자의 답변을 받습니다.
사용자의 답변과 Quiz 객체의 정답을 비교하여 결과를 판단합니다.
QuizView의 displayResult() 메서드를 호출하여 결과를 출력합니다.
메인 클래스 (Main.java)
Quiz 객체를 생성하고 질문과 정답을 초기화합니다.
QuizView 객체를 생성합니다.
QuizController 객체를 생성하고 Quiz 객체와 QuizView 객체를 전달합니다.
QuizController의 startQuiz() 메서드를 호출하여 퀴즈를 시작합니다.