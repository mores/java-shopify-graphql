package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryLevelEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryLevelEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryLevelEdge"));
  }

  public InventoryLevelEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelProjection<InventoryLevelEdgeProjection<PARENT, ROOT>, ROOT> node() {
     InventoryLevelProjection<InventoryLevelEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryLevelEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
