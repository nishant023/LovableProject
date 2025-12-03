package com.springProject.LovableProject.entity;

import java.time.Instant;

public class UsageLog {
    //this is to manage the subscription and plan

    Long id;

    User user;
    Project project;


    String action;

    Integer tokensUsed;

    Integer durationMs;

    String metaData;//JSON of {model_used, prompt_used}

    Instant createdAt;

}
