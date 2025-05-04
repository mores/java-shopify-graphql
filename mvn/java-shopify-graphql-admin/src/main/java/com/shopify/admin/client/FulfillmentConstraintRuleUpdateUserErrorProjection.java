package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRuleUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentConstraintRuleUpdateUserError"));
  }

  public FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentConstraintRuleUpdateUserErrorCodeProjection<FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentConstraintRuleUpdateUserErrorCodeProjection<FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConstraintRuleUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentConstraintRuleUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
