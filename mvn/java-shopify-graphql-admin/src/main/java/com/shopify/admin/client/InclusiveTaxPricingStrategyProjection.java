package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InclusiveTaxPricingStrategyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InclusiveTaxPricingStrategyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InclusiveTaxPricingStrategy"));
  }

  public InclusiveTaxPricingStrategyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
