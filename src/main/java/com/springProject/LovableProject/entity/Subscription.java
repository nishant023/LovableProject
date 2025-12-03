package com.springProject.LovableProject.entity;


import com.springProject.LovableProject.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    User user;//here we are not using id of user, using direct user hibernate will play the role here.
    Plan plan;

    SubscriptionStatus status;//these field can have only specific data which is define in  enums.
    String stripeCustomerId;//inside each subscription we are storing info about customer and this is
    // present at the stipe dashboard it will give use

    String stripeSubscriptionId;//if user want to see its stripe subscription on his dashboard

    Instant currentPeriodStart;//this will be dynamic as time changes it will keep updating
    Instant currentPeriodEnd;

    Boolean cancelAtPeriodEnd=false;

    Instant createdAt;
    Instant updatedAt;









}
