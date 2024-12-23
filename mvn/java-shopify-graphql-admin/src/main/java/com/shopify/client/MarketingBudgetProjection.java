package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingBudgetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingBudgetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingBudget"));
  }

  public MarketingBudgetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingBudgetBudgetTypeProjection<MarketingBudgetProjection<PARENT, ROOT>, ROOT> budgetType(
      ) {
     MarketingBudgetBudgetTypeProjection<MarketingBudgetProjection<PARENT, ROOT>, ROOT> projection = new MarketingBudgetBudgetTypeProjection<>(this, getRoot());
     getFields().put("budgetType", projection);
     return projection;
  }

  public MoneyV2Projection<MarketingBudgetProjection<PARENT, ROOT>, ROOT> total() {
     MoneyV2Projection<MarketingBudgetProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("total", projection);
     return projection;
  }
}
