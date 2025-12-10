package com.springProject.LovableProject.service.Impl;

import com.springProject.LovableProject.dto.subscription.CheckoutRequest;
import com.springProject.LovableProject.dto.subscription.CheckoutResponse;
import com.springProject.LovableProject.dto.subscription.PortalResponse;
import com.springProject.LovableProject.dto.subscription.SubscriptionResponse;
import com.springProject.LovableProject.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
