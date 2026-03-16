package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentLineItemConnection"));
  }

  public InventoryShipmentLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentLineItemEdgeProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryShipmentLineItemEdgeProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryShipmentLineItemProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryShipmentLineItemProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<InventoryShipmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
