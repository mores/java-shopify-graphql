package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentEdge"));
  }

  public InventoryShipmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentEdgeProjection<PARENT, ROOT>, ROOT> node() {
     InventoryShipmentProjection<InventoryShipmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryShipmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
