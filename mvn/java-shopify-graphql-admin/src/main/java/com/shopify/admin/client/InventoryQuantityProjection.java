package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryQuantityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryQuantityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryQuantity"));
  }

  public InventoryQuantityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryQuantityProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryQuantityProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryQuantityProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public InventoryQuantityProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
