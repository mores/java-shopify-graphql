package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrderConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderConnection"));
  }

  public InventoryPurchaseOrderConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryPurchaseOrderEdgeProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryPurchaseOrderEdgeProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryPurchaseOrderProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryPurchaseOrderProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<InventoryPurchaseOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
