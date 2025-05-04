package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleTargetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleTargetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleTarget"));
  }

  public PriceRuleTargetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
