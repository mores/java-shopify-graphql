package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferConnection"));
  }

  public InventoryTransferConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferEdgeProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryTransferEdgeProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryTransferProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryTransferProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<InventoryTransferConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
