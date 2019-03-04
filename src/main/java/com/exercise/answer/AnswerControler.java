package com.exercise.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.exercise.answer.util.RandomAnswer.parseAnswer;

@Controller
public class AnswerControler {

    @PostMapping("/answer")
    @ResponseBody
    public String answer(@RequestBody(required = false) String question){
        return parseAnswer(question);
    }

    @RequestMapping("/")
    public String Home() {
        return "index.html";
    }
}
