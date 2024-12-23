package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPricingByVariantUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPricingByVariantUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPricingByVariantUserError"));
  }

  public QuantityPricingByVariantUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityPricingByVariantUserErrorCodeProjection<QuantityPricingByVariantUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     QuantityPricingByVariantUserErrorCodeProjection<QuantityPricingByVariantUserErrorProjection<PARENT, ROOT>, ROOT> projection = new QuantityPricingByVariantUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public QuantityPricingByVariantUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public QuantityPricingByVariantUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
