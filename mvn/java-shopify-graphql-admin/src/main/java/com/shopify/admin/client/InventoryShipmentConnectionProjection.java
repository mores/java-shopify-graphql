package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentConnection"));
  }

  public InventoryShipmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentEdgeProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryShipmentEdgeProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryShipmentProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryShipmentProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<InventoryShipmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
