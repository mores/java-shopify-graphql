package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ComponentizedProductsBundleConsolidatedOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ComponentizedProductsBundleConsolidatedOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ComponentizedProductsBundleConsolidatedOption"));
  }

  public ComponentizedProductsBundleConsolidatedOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ComponentizedProductsBundleConsolidatedOptionSelectionProjection<ComponentizedProductsBundleConsolidatedOptionProjection<PARENT, ROOT>, ROOT> selections(
      ) {
     ComponentizedProductsBundleConsolidatedOptionSelectionProjection<ComponentizedProductsBundleConsolidatedOptionProjection<PARENT, ROOT>, ROOT> projection = new ComponentizedProductsBundleConsolidatedOptionSelectionProjection<>(this, getRoot());
     getFields().put("selections", projection);
     return projection;
  }

  public ComponentizedProductsBundleConsolidatedOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
