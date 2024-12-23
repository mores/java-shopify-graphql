package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionLineItemUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionLineItemUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("AppSubscriptionLineItemUpdatePayload"));
  }

  public AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionProjection<AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>, AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>> appSubscription(
      ) {
    AppSubscriptionProjection<AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>, AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>> projection = new AppSubscriptionProjection<>(this, this);    
    getFields().put("appSubscription", projection);
    return projection;
  }

  public UserErrorProjection<AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>, AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>, AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public AppSubscriptionLineItemUpdateProjectionRoot<PARENT, ROOT> confirmationUrl() {
    getFields().put("confirmationUrl", null);
    return this;
  }
}
