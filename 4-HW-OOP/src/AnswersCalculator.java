
class AnswersCalculator {
    private int numberOfCorrectAnswers;
    boolean[] answerIsIncorrect;

    AnswersCalculator(String[] userAnswers, int numberOfQuestions) {
        answerIsIncorrect = new boolean[numberOfQuestions];
        for (int i = 0; i < numberOfQuestions; i++){
            if (userAnswers[i].equalsIgnoreCase(Questions.getRightAnswers()[i])) {
                numberOfCorrectAnswers++;
            }
            else{
                answerIsIncorrect[i] = true;
            }
        }
    }

    int getNumberOfCorrectAnswers(){
        return numberOfCorrectAnswers;
    }

    boolean[] getListOfScores(){
        return answerIsIncorrect;
    }

}
