package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryLevelConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryLevelConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryLevelConnection"));
  }

  public InventoryLevelConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelEdgeProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryLevelEdgeProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryLevelProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     InventoryLevelProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<InventoryLevelConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
