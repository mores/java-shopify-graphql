package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentConstraintRuleCreateUserError"));
  }

  public FulfillmentConstraintRuleCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleCreateUserErrorCodeProjection<FulfillmentConstraintRuleCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentConstraintRuleCreateUserErrorCodeProjection<FulfillmentConstraintRuleCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConstraintRuleCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentConstraintRuleCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentConstraintRuleCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
