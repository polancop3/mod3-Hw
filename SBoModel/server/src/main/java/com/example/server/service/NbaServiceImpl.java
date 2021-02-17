package com.example.server.service;

import com.example.server.model.NbaTeams;
import com.example.server.repository.NbaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NbaServiceImpl implements NbaService {
    @Autowired
    NbaRepository nbaRepository;


    @Override
    public Iterable<NbaTeams> getTeams() {
        return nbaRepository.findAll();
    }
}
