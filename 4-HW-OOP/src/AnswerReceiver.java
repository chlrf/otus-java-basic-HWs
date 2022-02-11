import java.util.Scanner;

class AnswerReceiver {
    final private String userAnswer;

   AnswerReceiver(){
       Scanner scan = new Scanner(System.in);
       userAnswer = scan.next();
    }

    String getUserAnswer(){
        return userAnswer;
    }

}
