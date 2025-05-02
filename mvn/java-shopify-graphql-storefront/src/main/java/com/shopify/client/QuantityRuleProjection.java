package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRuleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRuleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityRule"));
  }

  public QuantityRuleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> increment() {
    getFields().put("increment", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> maximum() {
    getFields().put("maximum", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> minimum() {
    getFields().put("minimum", null);
    return this;
  }
}
