package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetScheduledChangesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetScheduledChangesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventorySetScheduledChangesPayload"));
  }

  public InventorySetScheduledChangesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryScheduledChangeProjection<InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>, InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>> scheduledChanges(
      ) {
    InventoryScheduledChangeProjection<InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>, InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>> projection = new InventoryScheduledChangeProjection<>(this, this);    
    getFields().put("scheduledChanges", projection);
    return projection;
  }

  public InventorySetScheduledChangesUserErrorProjection<InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>, InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventorySetScheduledChangesUserErrorProjection<InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>, InventorySetScheduledChangesProjectionRoot<PARENT, ROOT>> projection = new InventorySetScheduledChangesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
