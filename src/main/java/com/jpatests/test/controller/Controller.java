package com.jpatests.test.controller;

import com.jpatests.test.model.AgentsResponse;
import com.jpatests.test.service.AgentsService;
import com.jpatests.test.service.impl.AgentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private AgentsService agentsService;

    @GetMapping("/api/agents")
    public ResponseEntity<AgentsResponse> getAgentsList() throws Exception {
        AgentsResponse response = agentsService.getAgents();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
