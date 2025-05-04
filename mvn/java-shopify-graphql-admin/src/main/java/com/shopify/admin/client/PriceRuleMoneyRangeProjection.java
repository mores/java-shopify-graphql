package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleMoneyRangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleMoneyRangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleMoneyRange"));
  }

  public PriceRuleMoneyRangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleMoneyRangeProjection<PARENT, ROOT> greaterThan() {
    getFields().put("greaterThan", null);
    return this;
  }

  public PriceRuleMoneyRangeProjection<PARENT, ROOT> greaterThanOrEqualTo() {
    getFields().put("greaterThanOrEqualTo", null);
    return this;
  }

  public PriceRuleMoneyRangeProjection<PARENT, ROOT> lessThan() {
    getFields().put("lessThan", null);
    return this;
  }

  public PriceRuleMoneyRangeProjection<PARENT, ROOT> lessThanOrEqualTo() {
    getFields().put("lessThanOrEqualTo", null);
    return this;
  }
}
