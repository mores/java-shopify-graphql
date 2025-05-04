package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptsProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingAttemptConnection"));
  }

  public SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptEdgeProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SubscriptionBillingAttemptEdgeProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
