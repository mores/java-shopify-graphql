package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListUpdatePayload"));
  }

  public PriceListUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListProjection<PriceListUpdateProjectionRoot<PARENT, ROOT>, PriceListUpdateProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<PriceListUpdateProjectionRoot<PARENT, ROOT>, PriceListUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public PriceListUserErrorProjection<PriceListUpdateProjectionRoot<PARENT, ROOT>, PriceListUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListUserErrorProjection<PriceListUpdateProjectionRoot<PARENT, ROOT>, PriceListUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
