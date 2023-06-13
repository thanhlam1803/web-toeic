package com.sangtt.toeic_test.service.model;

public class Proposition {
    private String props;
    private boolean correct;

    public Proposition(String props, boolean correct) {
        this.props = props;
        this.correct = correct;
    }

    public String getProps() {
        return props;
    }

    public boolean isCorrect() {
        return correct;
    }
}
