package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryItemEdge"));
  }

  public InventoryItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     InventoryItemProjection<InventoryItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public InventoryItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
