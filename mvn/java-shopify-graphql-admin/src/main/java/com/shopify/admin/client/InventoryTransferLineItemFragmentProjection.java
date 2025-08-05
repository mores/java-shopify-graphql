package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class InventoryTransferLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryTransferLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferLineItem"));
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryTransferLineItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryTransferLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> pickedForShipmentQuantity() {
    getFields().put("pickedForShipmentQuantity", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> processableQuantity() {
    getFields().put("processableQuantity", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> shippableQuantity() {
    getFields().put("shippableQuantity", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> shippedQuantity() {
    getFields().put("shippedQuantity", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public InventoryTransferLineItemFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryTransferLineItem {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
