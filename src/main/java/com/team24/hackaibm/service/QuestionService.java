package com.team24.hackaibm.service;

import com.team24.hackaibm.model.HowToDo;
import com.team24.hackaibm.model.Product;
import com.team24.hackaibm.model.Question;
import com.team24.hackaibm.model.StepToDo;
import com.team24.hackaibm.model.representationModel.QuestionsRepresentationModel;
import com.team24.hackaibm.repository.HowToDoRepository;
import com.team24.hackaibm.repository.ProductRepository;
import com.team24.hackaibm.repository.QuestionRepository;
import com.team24.hackaibm.repository.StepToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    HowToDoRepository howToDoRepository;

    @Autowired
    StepToDoRepository stepToDoRepository;

    //CREATE
    public QuestionsRepresentationModel create(List<Question> questions){
        List<Question> createds = new ArrayList<>();
        for(Question question : questions){
            List<Product> products = question.getProducts();
            question.setProducts(new ArrayList<Product>());
            question = questionRepository.save(question);

            for(Product product : products){
                product.setQuestion(question);
                List<HowToDo> hows = product.getHowtodo();
                product.setHowtodo(new ArrayList<HowToDo>());
                product = productRepository.save(product);

                for(HowToDo how : hows){
                    how.setProduct(product);
                    List<StepToDo> steps = how.getSteps();
                    how.setSteps(new ArrayList<StepToDo>());
                    how = howToDoRepository.save(how);

                    for(StepToDo step : steps){
                        step.setHowtodo(how);
                        step = stepToDoRepository.save(step);
                        how.setStep(step);
                    }
                    product.setHowTodo(how);
                }
                question.setProduct(product);
            }
            createds.add(question);
        }
        QuestionsRepresentationModel questionsRep = new QuestionsRepresentationModel();
        questionsRep.setQuestions(createds);
        return questionsRep;
    }

    //GET ALL
    public QuestionsRepresentationModel getAll(){
        QuestionsRepresentationModel questions = new QuestionsRepresentationModel();
        questions.setQuestions(questionRepository.findAll());
        return questions;
    }
}
