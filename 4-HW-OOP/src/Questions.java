final class Questions {

    private static final String[] allQuestions = new String[]{
            "Назовите столицу РФ:",
            "Назовите столицу Германии:",
            "Назовите столицу Бельгии:",
            "Назовите столицу Франции:",
            "Назовите столицу Испании:",
            "Назовите столицу Польши:"
            };

    private static final String[] allVariants = new String[]{
            "\tА. Москва \n\tБ. Париж \n\tВ. Мадрид \n\tГ. Варшава",
            "\tА. Москва \n\tБ. Париж \n\tВ. Берлин",
            "\tА. Москва \n\tБ. Брюссель \n\tВ. Мадрид \n\tГ. Варшава \n\tД. Амстердам",
            "\tА. Москва \n\tБ. Париж \n\tВ. Мадрид \n\tГ. Брюссель",
            "\tА. Москва \n\tБ. Париж \n\tВ. Мадрид \n\tГ. Варшава",
            "\tА. Москва \n\tБ. Париж \n\tВ. Мадрид \n\tГ. Варшава",
            };

    private static final String[] allRightAnswers = {"А", "В", "Б", "Б", "В", "Г"};

    static String[] getRightAnswers(){
        return allRightAnswers;
    }

    static String[] getQuestions(){
        return allQuestions;
    }

    static String[] getVariants(){
        return allVariants;
    }

}
