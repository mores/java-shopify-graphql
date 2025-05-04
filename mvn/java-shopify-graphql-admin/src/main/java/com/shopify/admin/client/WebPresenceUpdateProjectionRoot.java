package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPresenceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPresenceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPresenceUpdatePayload"));
  }

  public WebPresenceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketUserErrorProjection<WebPresenceUpdateProjectionRoot<PARENT, ROOT>, WebPresenceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<WebPresenceUpdateProjectionRoot<PARENT, ROOT>, WebPresenceUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketWebPresenceProjection<WebPresenceUpdateProjectionRoot<PARENT, ROOT>, WebPresenceUpdateProjectionRoot<PARENT, ROOT>> webPresence(
      ) {
    MarketWebPresenceProjection<WebPresenceUpdateProjectionRoot<PARENT, ROOT>, WebPresenceUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("webPresence", projection);
    return projection;
  }
}
