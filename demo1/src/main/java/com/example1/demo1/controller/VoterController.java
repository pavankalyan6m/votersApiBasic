package com.example1.demo1.controller;

import com.example1.demo1.entity.Voter;
import com.example1.demo1.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VoterController {
    @Autowired
    private VoterService voterService;

    @GetMapping("/voters/all")
    public List<Voter> getVoters()
    {
        System.out.println("Inside voters all");
        return voterService.getAllVoters();
    }

    @PostMapping("/voters/create")
    public void createVoter(@RequestBody Voter voter)
    {
        voterService.createVoter(voter);
    }

}
