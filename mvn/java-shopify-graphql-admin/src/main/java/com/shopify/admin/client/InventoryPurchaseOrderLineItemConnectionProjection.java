package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrderLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderLineItemConnection"));
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemEdgeProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryPurchaseOrderLineItemEdgeProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryPurchaseOrderLineItemProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<InventoryPurchaseOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
