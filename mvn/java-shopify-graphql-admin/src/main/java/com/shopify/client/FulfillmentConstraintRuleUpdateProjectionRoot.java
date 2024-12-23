package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentConstraintRuleUpdatePayload"));
  }

  public FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleProjection<FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>> fulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleProjection<FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConstraintRuleProjection<>(this, this);    
    getFields().put("fulfillmentConstraintRule", projection);
    return projection;
  }

  public FulfillmentConstraintRuleUpdateUserErrorProjection<FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentConstraintRuleUpdateUserErrorProjection<FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConstraintRuleUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
