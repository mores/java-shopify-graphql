package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class InventoryShipmentLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryShipmentLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentLineItem"));
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryShipmentLineItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryShipmentLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> acceptedQuantity() {
    getFields().put("acceptedQuantity", null);
    return this;
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> rejectedQuantity() {
    getFields().put("rejectedQuantity", null);
    return this;
  }

  public InventoryShipmentLineItemFragmentProjection<PARENT, ROOT> unreceivedQuantity() {
    getFields().put("unreceivedQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryShipmentLineItem {");
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
