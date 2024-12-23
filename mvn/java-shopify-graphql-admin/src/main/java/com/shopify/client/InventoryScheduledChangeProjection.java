package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryScheduledChangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryScheduledChangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryScheduledChange"));
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelProjection<InventoryScheduledChangeProjection<PARENT, ROOT>, ROOT> inventoryLevel(
      ) {
     InventoryLevelProjection<InventoryScheduledChangeProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("inventoryLevel", projection);
     return projection;
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> expectedAt() {
    getFields().put("expectedAt", null);
    return this;
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> fromName() {
    getFields().put("fromName", null);
    return this;
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> ledgerDocumentUri() {
    getFields().put("ledgerDocumentUri", null);
    return this;
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public InventoryScheduledChangeProjection<PARENT, ROOT> toName() {
    getFields().put("toName", null);
    return this;
  }
}
