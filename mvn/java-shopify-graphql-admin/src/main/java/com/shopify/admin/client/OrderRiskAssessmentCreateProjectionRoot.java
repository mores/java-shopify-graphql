package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskAssessmentCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskAssessmentCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderRiskAssessmentCreatePayload"));
  }

  public OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderRiskAssessmentProjection<OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>, OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>> orderRiskAssessment(
      ) {
    OrderRiskAssessmentProjection<OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>, OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>> projection = new OrderRiskAssessmentProjection<>(this, this);    
    getFields().put("orderRiskAssessment", projection);
    return projection;
  }

  public OrderRiskAssessmentCreateUserErrorProjection<OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>, OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderRiskAssessmentCreateUserErrorProjection<OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>, OrderRiskAssessmentCreateProjectionRoot<PARENT, ROOT>> projection = new OrderRiskAssessmentCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
