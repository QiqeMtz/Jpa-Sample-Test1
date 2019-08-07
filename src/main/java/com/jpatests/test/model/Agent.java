package com.jpatests.test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "agents2", schema = "public")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AGENT_CODE")
    private String agentCode;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "WORKING_AREA")
    private String workingArea;

    @Column(name = "COMMISSION")
    private Double commission;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "COUNTRY")
    private String country;
}
