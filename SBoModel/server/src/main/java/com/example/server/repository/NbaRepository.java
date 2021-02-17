package com.example.server.repository;

import com.example.server.model.NbaTeams;
import org.springframework.data.repository.CrudRepository;

public interface NbaRepository extends CrudRepository<NbaTeams, Long> {
}
