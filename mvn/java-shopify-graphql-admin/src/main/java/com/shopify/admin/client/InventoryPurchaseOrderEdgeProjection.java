package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrderEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderEdge"));
  }

  public InventoryPurchaseOrderEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryPurchaseOrderProjection<InventoryPurchaseOrderEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     InventoryPurchaseOrderProjection<InventoryPurchaseOrderEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryPurchaseOrderEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
