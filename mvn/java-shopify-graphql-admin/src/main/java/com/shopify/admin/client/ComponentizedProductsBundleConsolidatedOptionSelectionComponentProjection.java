package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("ComponentizedProductsBundleConsolidatedOptionSelectionComponent"));
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<PARENT, ROOT> optionId(
      ) {
    getFields().put("optionId", null);
    return this;
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<PARENT, ROOT> value(
      ) {
    getFields().put("value", null);
    return this;
  }
}
