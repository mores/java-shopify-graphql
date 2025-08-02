package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferLineItemEdge"));
  }

  public InventoryTransferLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferLineItemProjection<InventoryTransferLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     InventoryTransferLineItemProjection<InventoryTransferLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryTransferLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
