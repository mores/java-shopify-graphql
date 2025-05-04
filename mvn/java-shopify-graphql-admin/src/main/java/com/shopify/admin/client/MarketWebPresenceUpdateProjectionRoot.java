package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketWebPresenceUpdatePayload"));
  }

  public MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>, MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>, MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>, MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>, MarketWebPresenceUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
