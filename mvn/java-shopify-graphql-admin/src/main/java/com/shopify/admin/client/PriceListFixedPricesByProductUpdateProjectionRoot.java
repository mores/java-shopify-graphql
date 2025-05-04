package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListFixedPricesByProductUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListFixedPricesByProductUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListFixedPricesByProductUpdatePayload"));
  }

  public PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public ProductProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> pricesToAddProducts(
      ) {
    ProductProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("pricesToAddProducts", projection);
    return projection;
  }

  public ProductProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> pricesToDeleteProducts(
      ) {
    ProductProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("pricesToDeleteProducts", projection);
    return projection;
  }

  public PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>, PriceListFixedPricesByProductUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceListFixedPricesByProductBulkUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
