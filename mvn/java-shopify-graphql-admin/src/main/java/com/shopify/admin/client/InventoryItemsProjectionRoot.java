package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryItemsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryItemConnection"));
  }

  public InventoryItemsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemEdgeProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    InventoryItemEdgeProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryItemEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public InventoryItemProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    InventoryItemProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<InventoryItemsProjectionRoot<PARENT, ROOT>, InventoryItemsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
