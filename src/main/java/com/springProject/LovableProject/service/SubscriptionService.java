package com.springProject.LovableProject.service;

import com.springProject.LovableProject.dto.subscription.CheckoutRequest;
import com.springProject.LovableProject.dto.subscription.CheckoutResponse;
import com.springProject.LovableProject.dto.subscription.PortalResponse;
import com.springProject.LovableProject.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
