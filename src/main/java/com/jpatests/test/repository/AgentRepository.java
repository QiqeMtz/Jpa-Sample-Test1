package com.jpatests.test.repository;

import com.jpatests.test.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AgentRepository extends JpaRepository<Agent, String> {

    @Query(value = "SELECT * FROM \"AGENTS\"", nativeQuery = true)
    public List<Agent> findAll();

    @Query(value = "SELECT * FROM \"AGENTS\" WHERE \"WORKING_AREA\" = ?1", nativeQuery = true)
    public List<Agent> findByWorkingArea(String workingArea);
}
