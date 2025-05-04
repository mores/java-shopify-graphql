package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDiscountCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDiscountCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleDiscountCode"));
  }

  public PriceRuleDiscountCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<PriceRuleDiscountCodeProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PriceRuleDiscountCodeProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public PriceRuleDiscountCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public PriceRuleDiscountCodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceRuleDiscountCodeProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }
}
