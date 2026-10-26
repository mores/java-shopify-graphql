package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrderLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderLineItemEdge"));
  }

  public InventoryPurchaseOrderLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<InventoryPurchaseOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     InventoryPurchaseOrderLineItemProjection<InventoryPurchaseOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
