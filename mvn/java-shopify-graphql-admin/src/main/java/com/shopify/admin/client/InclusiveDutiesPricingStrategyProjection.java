package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InclusiveDutiesPricingStrategyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InclusiveDutiesPricingStrategyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InclusiveDutiesPricingStrategy"));
  }

  public InclusiveDutiesPricingStrategyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
