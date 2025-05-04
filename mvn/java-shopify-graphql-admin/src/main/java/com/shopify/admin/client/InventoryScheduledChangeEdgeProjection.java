package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryScheduledChangeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryScheduledChangeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryScheduledChangeEdge"));
  }

  public InventoryScheduledChangeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryScheduledChangeProjection<InventoryScheduledChangeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     InventoryScheduledChangeProjection<InventoryScheduledChangeEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryScheduledChangeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
