package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPropertiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPropertiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryProperties"));
  }

  public InventoryPropertiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryQuantityNameProjection<InventoryPropertiesProjectionRoot<PARENT, ROOT>, InventoryPropertiesProjectionRoot<PARENT, ROOT>> quantityNames(
      ) {
    InventoryQuantityNameProjection<InventoryPropertiesProjectionRoot<PARENT, ROOT>, InventoryPropertiesProjectionRoot<PARENT, ROOT>> projection = new InventoryQuantityNameProjection<>(this, this);    
    getFields().put("quantityNames", projection);
    return projection;
  }
}
