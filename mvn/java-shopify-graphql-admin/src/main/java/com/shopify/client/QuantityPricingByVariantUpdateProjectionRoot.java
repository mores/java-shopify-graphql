package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPricingByVariantUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPricingByVariantUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("QuantityPricingByVariantUpdatePayload"));
  }

  public QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>, QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantProjection<QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>, QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public QuantityPricingByVariantUserErrorProjection<QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>, QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    QuantityPricingByVariantUserErrorProjection<QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>, QuantityPricingByVariantUpdateProjectionRoot<PARENT, ROOT>> projection = new QuantityPricingByVariantUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
