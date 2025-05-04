package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionTrialExtendProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionTrialExtendProjectionRoot() {
    super(null, null, java.util.Optional.of("AppSubscriptionTrialExtendPayload"));
  }

  public AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionProjection<AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>, AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>> appSubscription(
      ) {
    AppSubscriptionProjection<AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>, AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("appSubscription", projection);
    return projection;
  }

  public AppSubscriptionTrialExtendUserErrorProjection<AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>, AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AppSubscriptionTrialExtendUserErrorProjection<AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>, AppSubscriptionTrialExtendProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionTrialExtendUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
