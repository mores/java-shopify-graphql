package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketWebPresenceCreatePayload"));
  }

  public MarketWebPresenceCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>, MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>, MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>, MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>, MarketWebPresenceCreateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
