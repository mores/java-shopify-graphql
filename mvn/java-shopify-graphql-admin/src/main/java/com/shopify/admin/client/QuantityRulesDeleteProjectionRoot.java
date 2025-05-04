package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRulesDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRulesDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("QuantityRulesDeletePayload"));
  }

  public QuantityRulesDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleUserErrorProjection<QuantityRulesDeleteProjectionRoot<PARENT, ROOT>, QuantityRulesDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    QuantityRuleUserErrorProjection<QuantityRulesDeleteProjectionRoot<PARENT, ROOT>, QuantityRulesDeleteProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public QuantityRulesDeleteProjectionRoot<PARENT, ROOT> deletedQuantityRulesVariantIds() {
    getFields().put("deletedQuantityRulesVariantIds", null);
    return this;
  }
}
