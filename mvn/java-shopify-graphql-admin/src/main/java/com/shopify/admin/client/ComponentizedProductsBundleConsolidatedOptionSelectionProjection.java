package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ComponentizedProductsBundleConsolidatedOptionSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ComponentizedProductsBundleConsolidatedOptionSelectionProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("ComponentizedProductsBundleConsolidatedOptionSelection"));
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<ComponentizedProductsBundleConsolidatedOptionSelectionProjection<PARENT, ROOT>, ROOT> components(
      ) {
     ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<ComponentizedProductsBundleConsolidatedOptionSelectionProjection<PARENT, ROOT>, ROOT> projection = new ComponentizedProductsBundleConsolidatedOptionSelectionComponentProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
