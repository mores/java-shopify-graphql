package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskRecommendationResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskRecommendationResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRiskRecommendationResult"));
  }

  public OrderRiskRecommendationResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
