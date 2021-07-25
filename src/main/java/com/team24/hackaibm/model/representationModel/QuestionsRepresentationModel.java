package com.team24.hackaibm.model.representationModel;

import com.team24.hackaibm.model.Question;

import java.io.Serializable;
import java.util.List;

public class QuestionsRepresentationModel implements Serializable {

    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
