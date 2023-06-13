package com.sangtt.toeic_test.service.model;

import java.util.List;

public class QuestionModel {
    private String question;
    private List<Proposition> propositions;

    public QuestionModel(String question, List<Proposition> propositions) {
        this.question = question;
        this.propositions = propositions;
    }

    public String getQuestion() {
        return question;
    }

    public List<Proposition> getPropositions() {
        return propositions;
    }
}
