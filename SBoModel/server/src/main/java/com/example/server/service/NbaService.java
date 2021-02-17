package com.example.server.service;

import com.example.server.model.NbaTeams;

public interface NbaService {
    Iterable<NbaTeams> getTeams();
}
