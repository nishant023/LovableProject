package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {

    List<PlanResponse> getAllActivePlans();
}
