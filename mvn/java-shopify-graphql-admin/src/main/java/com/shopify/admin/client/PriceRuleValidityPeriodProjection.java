package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleValidityPeriodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleValidityPeriodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleValidityPeriod"));
  }

  public PriceRuleValidityPeriodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleValidityPeriodProjection<PARENT, ROOT> end() {
    getFields().put("end", null);
    return this;
  }

  public PriceRuleValidityPeriodProjection<PARENT, ROOT> start() {
    getFields().put("start", null);
    return this;
  }
}
