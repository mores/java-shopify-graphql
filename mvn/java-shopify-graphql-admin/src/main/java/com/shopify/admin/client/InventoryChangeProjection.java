package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryChangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryChangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryChange"));
  }

  public InventoryChangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryChangeProjection<PARENT, ROOT>, ROOT> item() {
     InventoryItemProjection<InventoryChangeProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("item", projection);
     return projection;
  }

  public LocationProjection<InventoryChangeProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<InventoryChangeProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public InventoryChangeProjection<PARENT, ROOT> delta() {
    getFields().put("delta", null);
    return this;
  }

  public InventoryChangeProjection<PARENT, ROOT> ledgerDocumentUri() {
    getFields().put("ledgerDocumentUri", null);
    return this;
  }

  public InventoryChangeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryChangeProjection<PARENT, ROOT> quantityAfterChange() {
    getFields().put("quantityAfterChange", null);
    return this;
  }
}
