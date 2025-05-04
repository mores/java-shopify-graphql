package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRiskSummary"));
  }

  public OrderRiskSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderRiskAssessmentProjection<OrderRiskSummaryProjection<PARENT, ROOT>, ROOT> assessments(
      ) {
     OrderRiskAssessmentProjection<OrderRiskSummaryProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskAssessmentProjection<>(this, getRoot());
     getFields().put("assessments", projection);
     return projection;
  }

  public OrderRiskRecommendationResultProjection<OrderRiskSummaryProjection<PARENT, ROOT>, ROOT> recommendation(
      ) {
     OrderRiskRecommendationResultProjection<OrderRiskSummaryProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskRecommendationResultProjection<>(this, getRoot());
     getFields().put("recommendation", projection);
     return projection;
  }
}
