package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPresenceCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPresenceCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPresenceCreatePayload"));
  }

  public WebPresenceCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketUserErrorProjection<WebPresenceCreateProjectionRoot<PARENT, ROOT>, WebPresenceCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<WebPresenceCreateProjectionRoot<PARENT, ROOT>, WebPresenceCreateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketWebPresenceProjection<WebPresenceCreateProjectionRoot<PARENT, ROOT>, WebPresenceCreateProjectionRoot<PARENT, ROOT>> webPresence(
      ) {
    MarketWebPresenceProjection<WebPresenceCreateProjectionRoot<PARENT, ROOT>, WebPresenceCreateProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("webPresence", projection);
    return projection;
  }
}
