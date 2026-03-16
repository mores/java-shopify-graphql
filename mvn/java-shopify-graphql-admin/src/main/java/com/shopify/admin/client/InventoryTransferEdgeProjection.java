package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferEdge"));
  }

  public InventoryTransferEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferEdgeProjection<PARENT, ROOT>, ROOT> node() {
     InventoryTransferProjection<InventoryTransferEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryTransferEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
