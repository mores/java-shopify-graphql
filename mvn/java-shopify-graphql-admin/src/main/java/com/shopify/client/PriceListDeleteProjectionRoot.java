package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListDeletePayload"));
  }

  public PriceListDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListUserErrorProjection<PriceListDeleteProjectionRoot<PARENT, ROOT>, PriceListDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListUserErrorProjection<PriceListDeleteProjectionRoot<PARENT, ROOT>, PriceListDeleteProjectionRoot<PARENT, ROOT>> projection = new PriceListUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PriceListDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
