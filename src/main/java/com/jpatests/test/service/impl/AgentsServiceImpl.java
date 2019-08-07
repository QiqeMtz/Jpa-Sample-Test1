package com.jpatests.test.service.impl;

import com.jpatests.test.model.Agent;
import com.jpatests.test.model.AgentsResponse;
import com.jpatests.test.repository.AgentRepository;
import com.jpatests.test.service.AgentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentsServiceImpl implements AgentsService {

    private static final Logger LOG = LoggerFactory.getLogger(AgentsServiceImpl.class);

    @Autowired
    private AgentRepository repository;

    @Override
    public AgentsResponse getAgents() throws Exception {
        List<Agent> list;
        try {
            list = repository.findAll();
            AgentsResponse response = new AgentsResponse();
            response.setAgents(list);
            return response;
        } catch (Exception ex) {
            LOG.info(ex.toString());
            throw new Exception("Ocurrio un error", ex);
        }
    }
}
