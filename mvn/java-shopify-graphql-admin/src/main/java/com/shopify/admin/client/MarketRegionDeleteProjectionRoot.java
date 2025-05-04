package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRegionDeletePayload"));
  }

  public MarketRegionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketRegionDeleteProjectionRoot<PARENT, ROOT>, MarketRegionDeleteProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketRegionDeleteProjectionRoot<PARENT, ROOT>, MarketRegionDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketUserErrorProjection<MarketRegionDeleteProjectionRoot<PARENT, ROOT>, MarketRegionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<MarketRegionDeleteProjectionRoot<PARENT, ROOT>, MarketRegionDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketRegionDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
