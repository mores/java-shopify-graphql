package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("AppSubscriptionCancelPayload"));
  }

  public AppSubscriptionCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionProjection<AppSubscriptionCancelProjectionRoot<PARENT, ROOT>, AppSubscriptionCancelProjectionRoot<PARENT, ROOT>> appSubscription(
      ) {
    AppSubscriptionProjection<AppSubscriptionCancelProjectionRoot<PARENT, ROOT>, AppSubscriptionCancelProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("appSubscription", projection);
    return projection;
  }

  public UserErrorProjection<AppSubscriptionCancelProjectionRoot<PARENT, ROOT>, AppSubscriptionCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<AppSubscriptionCancelProjectionRoot<PARENT, ROOT>, AppSubscriptionCancelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
