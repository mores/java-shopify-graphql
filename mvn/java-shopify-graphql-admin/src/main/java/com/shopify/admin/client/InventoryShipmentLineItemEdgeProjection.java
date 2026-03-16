package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentLineItemEdge"));
  }

  public InventoryShipmentLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<InventoryShipmentLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     InventoryShipmentLineItemProjection<InventoryShipmentLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryShipmentLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
