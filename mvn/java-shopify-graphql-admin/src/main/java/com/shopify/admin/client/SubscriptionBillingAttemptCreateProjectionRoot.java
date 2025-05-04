package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingAttemptCreatePayload"));
  }

  public SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>> subscriptionBillingAttempt(
      ) {
    SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptProjection<>(this, this);    
    getFields().put("subscriptionBillingAttempt", projection);
    return projection;
  }

  public BillingAttemptUserErrorProjection<SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BillingAttemptUserErrorProjection<SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptCreateProjectionRoot<PARENT, ROOT>> projection = new BillingAttemptUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
