package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleShareableUrlTargetTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleShareableUrlTargetTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleShareableUrlTargetType"));
  }

  public PriceRuleShareableUrlTargetTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
