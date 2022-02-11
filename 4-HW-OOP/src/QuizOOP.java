public class QuizOOP {
    public static void main(String[] args){
        // задаем количество вопросов - от 1 до 6
        final int NUMBER_OF_QUESTIONS = 3;

        // вывод вопросов и сбор ответов
        String[] userAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println("Вопрос " + (i+1));

            QuestionAsker.readQuestion(Questions.getQuestions()[i], Questions.getVariants()[i]);
            AnswerReceiver answer = new AnswerReceiver();

            userAnswers[i] = answer.getUserAnswer();
            System.out.println();
    }


        // подсчет количества правильных ответов и вывод результата
        AnswersCalculator result = new AnswersCalculator(userAnswers, NUMBER_OF_QUESTIONS);


        System.out.println("ВАШ РЕЗУЛЬТАТ: ");
        System.out.println("Кол-во правильных ответов: " + result.getNumberOfCorrectAnswers() + " из " + NUMBER_OF_QUESTIONS);
        System.out.println();

        if (result.getNumberOfCorrectAnswers() < NUMBER_OF_QUESTIONS) {
            System.out.println("Тест НЕ пройден.");
            System.out.println();
            System.out.println("Ошибки: ");
            for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
                if (result.getListOfScores()[i]) {
                    System.out.println("Вопрос " + (i + 1) + ". Правильный ответ - " + Questions.getRightAnswers()[i]);
                }
            }
        }
        else {
            System.out.println("ТЕСТ ПРОЙДЕН!");
        }

    }
}
