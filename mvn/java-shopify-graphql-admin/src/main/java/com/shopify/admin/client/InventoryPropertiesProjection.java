package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPropertiesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPropertiesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryProperties"));
  }

  public InventoryPropertiesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryQuantityNameProjection<InventoryPropertiesProjection<PARENT, ROOT>, ROOT> quantityNames(
      ) {
     InventoryQuantityNameProjection<InventoryPropertiesProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityNameProjection<>(this, getRoot());
     getFields().put("quantityNames", projection);
     return projection;
  }
}
