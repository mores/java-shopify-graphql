package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEngagementsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEngagementsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingEngagementsDeletePayload"));
  }

  public MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityUserErrorProjection<MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT>, MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT>, MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MarketingEngagementsDeleteProjectionRoot<PARENT, ROOT> result() {
    getFields().put("result", null);
    return this;
  }
}
