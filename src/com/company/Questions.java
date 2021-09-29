package com.company;

public class Questions {
//    private String question;
//    private String answer;
//    public Question(String question, String answer) {
//        this.question = question;
//        this.answer = answer;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }

    // Properties
    private String[] questions = {
            "Who won the ladies US Open Final in 2021? \nA. Emma Radacanu, B. Naomi Osaka, C. Leylah Fernandez",
            "How many Olympic gold medals has Andy Murray won? \nA. 1 medal, B. 2 medals, C. 3 medals",
            "How many Grand Slam singles titles has Serena Williams won? \nA. 17 titles, B. 23 titles, C. 29 titles",
            "Which tennis superstar is the only player to achieve a Golden Slam? (Winning all four Grand Slams and an Olympic gold in the same calendar year) \nA. Steffi Graf, B. Serena Williams, C. Martina Navratilova",
            "Roger Federer was born in which Swiss city? \nA. Geneva, B. Zurich, C. Basel",
    };

    private String[] answers = {
            "A",
            "B",
            "B",
            "A",
            "C",
    };

    // Methods
    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;
    }
}
