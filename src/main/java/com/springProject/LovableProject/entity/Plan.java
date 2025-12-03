package com.springProject.LovableProject.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;

    String stripePriceId;

    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews;//Application is store in the pod and for preview we have to hit to that
    //and we are allocating some resources which is advance feature.

    Boolean unlimitedAi;//If this is true then it will ignore the max token per day and unlimited use
    //of LLM


    Boolean active;//this is for the admin whether they want to make the plan active or not
}
