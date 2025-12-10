package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.subscription.PlanLimitsResponse;
import com.springProject.LovableProject.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitOfUser(Long userId);
}
