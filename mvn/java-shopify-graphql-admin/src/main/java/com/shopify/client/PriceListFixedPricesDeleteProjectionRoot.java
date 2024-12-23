package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListFixedPricesDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListFixedPricesDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListFixedPricesDeletePayload"));
  }

  public PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListPriceUserErrorProjection<PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT>, PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListPriceUserErrorProjection<PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT>, PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PriceListFixedPricesDeleteProjectionRoot<PARENT, ROOT> deletedFixedPriceVariantIds() {
    getFields().put("deletedFixedPriceVariantIds", null);
    return this;
  }
}
