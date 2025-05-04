package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListFixedPricesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListFixedPricesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListFixedPricesUpdatePayload"));
  }

  public PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public PriceListPriceProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> pricesAdded(
      ) {
    PriceListPriceProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceProjection<>(this, this);    
    getFields().put("pricesAdded", projection);
    return projection;
  }

  public PriceListPriceUserErrorProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListPriceUserErrorProjection<PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PriceListFixedPricesUpdateProjectionRoot<PARENT, ROOT> deletedFixedPriceVariantIds() {
    getFields().put("deletedFixedPriceVariantIds", null);
    return this;
  }
}
