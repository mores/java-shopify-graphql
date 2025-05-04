package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketCreatePayload"));
  }

  public MarketCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketCreateProjectionRoot<PARENT, ROOT>, MarketCreateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketCreateProjectionRoot<PARENT, ROOT>, MarketCreateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketCreateProjectionRoot<PARENT, ROOT>, MarketCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketCreateProjectionRoot<PARENT, ROOT>, MarketCreateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
