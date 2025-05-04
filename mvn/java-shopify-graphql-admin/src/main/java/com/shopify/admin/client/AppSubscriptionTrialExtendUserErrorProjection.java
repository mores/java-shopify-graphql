package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionTrialExtendUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionTrialExtendUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionTrialExtendUserError"));
  }

  public AppSubscriptionTrialExtendUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionTrialExtendUserErrorCodeProjection<AppSubscriptionTrialExtendUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AppSubscriptionTrialExtendUserErrorCodeProjection<AppSubscriptionTrialExtendUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionTrialExtendUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AppSubscriptionTrialExtendUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AppSubscriptionTrialExtendUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
