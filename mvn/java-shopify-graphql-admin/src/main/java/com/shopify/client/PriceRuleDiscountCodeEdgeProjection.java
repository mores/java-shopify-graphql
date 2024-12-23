package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDiscountCodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDiscountCodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleDiscountCodeEdge"));
  }

  public PriceRuleDiscountCodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PriceRuleDiscountCodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
