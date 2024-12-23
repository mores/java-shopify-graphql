package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentConstraintRuleCreatePayload"));
  }

  public FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleProjection<FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>> fulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleProjection<FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConstraintRuleProjection<>(this, this);    
    getFields().put("fulfillmentConstraintRule", projection);
    return projection;
  }

  public FulfillmentConstraintRuleCreateUserErrorProjection<FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentConstraintRuleCreateUserErrorProjection<FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleCreateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConstraintRuleCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
