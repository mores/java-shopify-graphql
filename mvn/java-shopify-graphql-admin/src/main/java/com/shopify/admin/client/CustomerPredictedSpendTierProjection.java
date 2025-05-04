package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPredictedSpendTierProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPredictedSpendTierProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPredictedSpendTier"));
  }

  public CustomerPredictedSpendTierProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
