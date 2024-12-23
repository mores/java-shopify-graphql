package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleQuantityRangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleQuantityRangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleQuantityRange"));
  }

  public PriceRuleQuantityRangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleQuantityRangeProjection<PARENT, ROOT> greaterThan() {
    getFields().put("greaterThan", null);
    return this;
  }

  public PriceRuleQuantityRangeProjection<PARENT, ROOT> greaterThanOrEqualTo() {
    getFields().put("greaterThanOrEqualTo", null);
    return this;
  }

  public PriceRuleQuantityRangeProjection<PARENT, ROOT> lessThan() {
    getFields().put("lessThan", null);
    return this;
  }

  public PriceRuleQuantityRangeProjection<PARENT, ROOT> lessThanOrEqualTo() {
    getFields().put("lessThanOrEqualTo", null);
    return this;
  }
}
