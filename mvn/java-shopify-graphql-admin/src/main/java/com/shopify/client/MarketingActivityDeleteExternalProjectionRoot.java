package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityDeleteExternalProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityDeleteExternalProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivityDeleteExternalPayload"));
  }

  public MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityUserErrorProjection<MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT>, MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT>, MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketingActivityDeleteExternalProjectionRoot<PARENT, ROOT> deletedMarketingActivityId() {
    getFields().put("deletedMarketingActivityId", null);
    return this;
  }
}
