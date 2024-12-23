package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionsCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionsCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRegionsCreatePayload"));
  }

  public MarketRegionsCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketRegionsCreateProjectionRoot<PARENT, ROOT>, MarketRegionsCreateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketRegionsCreateProjectionRoot<PARENT, ROOT>, MarketRegionsCreateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketRegionsCreateProjectionRoot<PARENT, ROOT>, MarketRegionsCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketRegionsCreateProjectionRoot<PARENT, ROOT>, MarketRegionsCreateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
