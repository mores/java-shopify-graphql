package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleTraitProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleTraitProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleTrait"));
  }

  public PriceRuleTraitProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
