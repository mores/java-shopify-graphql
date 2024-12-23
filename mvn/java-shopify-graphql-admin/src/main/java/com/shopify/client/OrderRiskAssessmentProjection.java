package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskAssessmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskAssessmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRiskAssessment"));
  }

  public OrderRiskAssessmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RiskFactProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> facts() {
     RiskFactProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> projection = new RiskFactProjection<>(this, getRoot());
     getFields().put("facts", projection);
     return projection;
  }

  public AppProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> provider() {
     AppProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("provider", projection);
     return projection;
  }

  public RiskAssessmentResultProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> riskLevel(
      ) {
     RiskAssessmentResultProjection<OrderRiskAssessmentProjection<PARENT, ROOT>, ROOT> projection = new RiskAssessmentResultProjection<>(this, getRoot());
     getFields().put("riskLevel", projection);
     return projection;
  }
}
