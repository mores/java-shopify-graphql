package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPresenceDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPresenceDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPresenceDeletePayload"));
  }

  public WebPresenceDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketUserErrorProjection<WebPresenceDeleteProjectionRoot<PARENT, ROOT>, WebPresenceDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<WebPresenceDeleteProjectionRoot<PARENT, ROOT>, WebPresenceDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebPresenceDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
