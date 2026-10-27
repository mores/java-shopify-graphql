package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleContractEditCalculateUserErrorProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleContractEditCalculateUserError"));
  }

  public SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleContractEditCalculateUserErrorCodeProjection<SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingCycleContractEditCalculateUserErrorCodeProjection<SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleContractEditCalculateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionBillingCycleContractEditCalculateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
