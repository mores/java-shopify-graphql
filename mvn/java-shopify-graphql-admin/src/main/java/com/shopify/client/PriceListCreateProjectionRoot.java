package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListCreatePayload"));
  }

  public PriceListCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListProjection<PriceListCreateProjectionRoot<PARENT, ROOT>, PriceListCreateProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<PriceListCreateProjectionRoot<PARENT, ROOT>, PriceListCreateProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public PriceListUserErrorProjection<PriceListCreateProjectionRoot<PARENT, ROOT>, PriceListCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListUserErrorProjection<PriceListCreateProjectionRoot<PARENT, ROOT>, PriceListCreateProjectionRoot<PARENT, ROOT>> projection = new PriceListUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
