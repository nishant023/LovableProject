package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.subscription.PlanLimitsResponse;
import com.springProject.LovableProject.dto.subscription.UsageTodayResponse;
import com.springProject.LovableProject.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitOfUser(Long userId) {
        return null;
    }
}
