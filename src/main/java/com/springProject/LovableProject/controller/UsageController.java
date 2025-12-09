package com.springProject.LovableProject.controller;

import com.springProject.LovableProject.dto.subscription.PlanLimitsResponse;
import com.springProject.LovableProject.dto.subscription.UsageTodayResponse;
import com.springProject.LovableProject.service.UsageService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse>getUsageTodayResponse(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageofUser(userId));
    }
    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse>getPlanLimits(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitOfUser(userId));
    }
}
