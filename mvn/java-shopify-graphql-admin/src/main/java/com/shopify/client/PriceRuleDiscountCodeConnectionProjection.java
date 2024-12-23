package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDiscountCodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDiscountCodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleDiscountCodeConnection"));
  }

  public PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleDiscountCodeEdgeProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PriceRuleDiscountCodeEdgeProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleDiscountCodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<PriceRuleDiscountCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
