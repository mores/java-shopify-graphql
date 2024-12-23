package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryScheduledChangeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryScheduledChangeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryScheduledChangeConnection"));
  }

  public InventoryScheduledChangeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryScheduledChangeEdgeProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     InventoryScheduledChangeEdgeProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public InventoryScheduledChangeProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     InventoryScheduledChangeProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<InventoryScheduledChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
