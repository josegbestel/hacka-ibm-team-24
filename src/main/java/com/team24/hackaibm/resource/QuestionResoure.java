package com.team24.hackaibm.resource;


import com.team24.hackaibm.model.Question;
import com.team24.hackaibm.model.representationModel.QuestionsRepresentationModel;
import com.team24.hackaibm.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/question")
@CrossOrigin(origins = "*")
public class QuestionResoure {

    @Autowired
    QuestionService questionService;

    //CREATE
    @PostMapping
    @ApiOperation("Create questions massive")
    public ResponseEntity<QuestionsRepresentationModel> create(@RequestBody List<Question> questions){
        return ResponseEntity.ok(questionService.create(questions));
    }

    //GET ALL
    @GetMapping
    @ApiOperation("Get all questions")
    public ResponseEntity<QuestionsRepresentationModel> getAll(){
        return ResponseEntity.ok(questionService.getAll());
    }
}
