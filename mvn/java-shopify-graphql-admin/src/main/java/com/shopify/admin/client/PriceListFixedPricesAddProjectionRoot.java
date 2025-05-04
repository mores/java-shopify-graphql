package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListFixedPricesAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListFixedPricesAddProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListFixedPricesAddPayload"));
  }

  public PriceListFixedPricesAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListPriceProjection<PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>, PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>> prices(
      ) {
    PriceListPriceProjection<PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>, PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceProjection<>(this, this);    
    getFields().put("prices", projection);
    return projection;
  }

  public PriceListPriceUserErrorProjection<PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>, PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListPriceUserErrorProjection<PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>, PriceListFixedPricesAddProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
