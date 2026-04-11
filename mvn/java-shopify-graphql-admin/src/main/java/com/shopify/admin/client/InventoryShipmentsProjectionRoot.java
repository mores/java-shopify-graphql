package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentConnection"));
  }

  public InventoryShipmentsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentEdgeProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    InventoryShipmentEdgeProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public InventoryShipmentProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    InventoryShipmentProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<InventoryShipmentsProjectionRoot<PARENT, ROOT>, InventoryShipmentsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
