package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryQuantityNameProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryQuantityNameProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryQuantityName"));
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> belongsTo() {
    getFields().put("belongsTo", null);
    return this;
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> comprises() {
    getFields().put("comprises", null);
    return this;
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> isInUse() {
    getFields().put("isInUse", null);
    return this;
  }

  public InventoryQuantityNameProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
