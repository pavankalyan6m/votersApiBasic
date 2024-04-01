package com.example1.demo1.service;

import com.example1.demo1.entity.Voter;
import com.example1.demo1.repository.voterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {

    @Autowired
    private voterRepo vr;
    public List<Voter> getAllVoters() {
        return vr.findAll();
    }

    public void createVoter(Voter voter) {
         vr.save(voter);
    }
}
