package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.subscription.PlanLimitsResponse;
import com.springProject.LovableProject.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageofUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitOfUser(Long userId);
}
