package com.exercise.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.exercise.answer.util.RandomAnswer.parseAnswer;

@Controller
public class AnswerControler {

    @GetMapping("/answer")
    @ResponseBody
    public String answer(@RequestParam(required = false) String question){
        return parseAnswer(question);
    }

    @RequestMapping("/")
    public String Home() {
        return "index.html";
    }
}
