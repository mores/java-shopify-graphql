package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRuleUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRuleUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityRuleUserError"));
  }

  public QuantityRuleUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleUserErrorCodeProjection<QuantityRuleUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     QuantityRuleUserErrorCodeProjection<QuantityRuleUserErrorProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public QuantityRuleUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public QuantityRuleUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
