package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WeightUnitProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WeightUnitProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WeightUnit"));
  }

  public WeightUnitProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
