package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRulesAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRulesAddProjectionRoot() {
    super(null, null, java.util.Optional.of("QuantityRulesAddPayload"));
  }

  public QuantityRulesAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleProjection<QuantityRulesAddProjectionRoot<PARENT, ROOT>, QuantityRulesAddProjectionRoot<PARENT, ROOT>> quantityRules(
      ) {
    QuantityRuleProjection<QuantityRulesAddProjectionRoot<PARENT, ROOT>, QuantityRulesAddProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleProjection<>(this, this);    
    getFields().put("quantityRules", projection);
    return projection;
  }

  public QuantityRuleUserErrorProjection<QuantityRulesAddProjectionRoot<PARENT, ROOT>, QuantityRulesAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    QuantityRuleUserErrorProjection<QuantityRulesAddProjectionRoot<PARENT, ROOT>, QuantityRulesAddProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
