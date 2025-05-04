package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("AppSubscriptionCreatePayload"));
  }

  public AppSubscriptionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionProjection<AppSubscriptionCreateProjectionRoot<PARENT, ROOT>, AppSubscriptionCreateProjectionRoot<PARENT, ROOT>> appSubscription(
      ) {
    AppSubscriptionProjection<AppSubscriptionCreateProjectionRoot<PARENT, ROOT>, AppSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("appSubscription", projection);
    return projection;
  }

  public UserErrorProjection<AppSubscriptionCreateProjectionRoot<PARENT, ROOT>, AppSubscriptionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<AppSubscriptionCreateProjectionRoot<PARENT, ROOT>, AppSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public AppSubscriptionCreateProjectionRoot<PARENT, ROOT> confirmationUrl() {
    getFields().put("confirmationUrl", null);
    return this;
  }
}
