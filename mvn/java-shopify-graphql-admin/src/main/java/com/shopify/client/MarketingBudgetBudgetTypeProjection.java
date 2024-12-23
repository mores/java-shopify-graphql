package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingBudgetBudgetTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingBudgetBudgetTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingBudgetBudgetType"));
  }

  public MarketingBudgetBudgetTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
