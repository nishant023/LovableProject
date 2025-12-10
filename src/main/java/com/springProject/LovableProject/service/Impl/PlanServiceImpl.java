package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.subscription.PlanResponse;
import com.springProject.LovableProject.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
