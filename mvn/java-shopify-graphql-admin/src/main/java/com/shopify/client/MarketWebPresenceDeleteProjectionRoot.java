package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketWebPresenceDeletePayload"));
  }

  public MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>, MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>, MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>, MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>, MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketWebPresenceDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
