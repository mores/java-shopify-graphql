package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentConstraintRuleDeletePayload"));
  }

  public FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleDeleteUserErrorProjection<FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentConstraintRuleDeleteUserErrorProjection<FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConstraintRuleDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public FulfillmentConstraintRuleDeleteProjectionRoot<PARENT, ROOT> success() {
    getFields().put("success", null);
    return this;
  }
}
