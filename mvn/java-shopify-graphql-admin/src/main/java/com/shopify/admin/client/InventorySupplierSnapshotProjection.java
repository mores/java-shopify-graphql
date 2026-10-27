package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySupplierSnapshotProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySupplierSnapshotProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventorySupplierSnapshot"));
  }

  public InventorySupplierSnapshotProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventorySupplierSnapshotProjection<PARENT, ROOT> supplierName() {
    getFields().put("supplierName", null);
    return this;
  }
}
