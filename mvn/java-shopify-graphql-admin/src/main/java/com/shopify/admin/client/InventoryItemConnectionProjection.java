package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryItemConnection"));
  }

  public InventoryItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemEdgeProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryItemEdgeProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryItemProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     InventoryItemProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<InventoryItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
