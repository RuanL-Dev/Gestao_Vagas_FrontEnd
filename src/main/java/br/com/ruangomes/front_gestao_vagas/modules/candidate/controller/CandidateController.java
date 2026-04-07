package br.com.ruangomes.front_gestao_vagas.modules.candidate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/candidate")
public class CandidateController {

    @GetMapping("/login")
    public String login() {
        return "candidate/login";
    }

}
