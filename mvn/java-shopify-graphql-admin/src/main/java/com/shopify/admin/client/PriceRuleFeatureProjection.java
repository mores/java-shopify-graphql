package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleFeatureProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleFeatureProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleFeature"));
  }

  public PriceRuleFeatureProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
