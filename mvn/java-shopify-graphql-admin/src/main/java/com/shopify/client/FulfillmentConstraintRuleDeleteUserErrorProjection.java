package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentConstraintRuleDeleteUserError"));
  }

  public FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleDeleteUserErrorCodeProjection<FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentConstraintRuleDeleteUserErrorCodeProjection<FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConstraintRuleDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentConstraintRuleDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
