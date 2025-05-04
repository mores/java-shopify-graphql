package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRegionsDeletePayload"));
  }

  public MarketRegionsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketUserErrorProjection<MarketRegionsDeleteProjectionRoot<PARENT, ROOT>, MarketRegionsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketRegionsDeleteProjectionRoot<PARENT, ROOT>, MarketRegionsDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketRegionsDeleteProjectionRoot<PARENT, ROOT> deletedIds() {
    getFields().put("deletedIds", null);
    return this;
  }
}
