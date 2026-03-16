package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferLineItemConnection"));
  }

  public InventoryTransferLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferLineItemEdgeProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryTransferLineItemEdgeProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryTransferLineItemProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryTransferLineItemProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<InventoryTransferLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
