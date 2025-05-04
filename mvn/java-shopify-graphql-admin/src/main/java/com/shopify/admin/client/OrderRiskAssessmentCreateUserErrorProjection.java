package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskAssessmentCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskAssessmentCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRiskAssessmentCreateUserError"));
  }

  public OrderRiskAssessmentCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderRiskAssessmentCreateUserErrorCodeProjection<OrderRiskAssessmentCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderRiskAssessmentCreateUserErrorCodeProjection<OrderRiskAssessmentCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskAssessmentCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderRiskAssessmentCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderRiskAssessmentCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
