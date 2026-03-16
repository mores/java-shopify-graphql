package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransfersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransfersProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferConnection"));
  }

  public InventoryTransfersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferEdgeProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    InventoryTransferEdgeProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public InventoryTransferProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    InventoryTransferProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<InventoryTransfersProjectionRoot<PARENT, ROOT>, InventoryTransfersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
