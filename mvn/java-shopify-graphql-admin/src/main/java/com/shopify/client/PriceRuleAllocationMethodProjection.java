package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleAllocationMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleAllocationMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleAllocationMethod"));
  }

  public PriceRuleAllocationMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
