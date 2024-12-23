package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketUpdatePayload"));
  }

  public MarketUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketUpdateProjectionRoot<PARENT, ROOT>, MarketUpdateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketUpdateProjectionRoot<PARENT, ROOT>, MarketUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketUpdateProjectionRoot<PARENT, ROOT>, MarketUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketUpdateProjectionRoot<PARENT, ROOT>, MarketUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
