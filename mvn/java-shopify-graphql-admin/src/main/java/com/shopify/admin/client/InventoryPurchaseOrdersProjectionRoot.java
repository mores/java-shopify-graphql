package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryPurchaseOrderConnection"));
  }

  public InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryPurchaseOrderEdgeProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    InventoryPurchaseOrderEdgeProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> projection = new InventoryPurchaseOrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public InventoryPurchaseOrderProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    InventoryPurchaseOrderProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> projection = new InventoryPurchaseOrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>, InventoryPurchaseOrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
