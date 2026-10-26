package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class InventoryPurchaseOrderLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryPurchaseOrderLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderLineItem"));
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryPurchaseOrderProjection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> purchaseOrder(
      ) {
     InventoryPurchaseOrderProjection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderProjection<>(this, getRoot());
     getFields().put("purchaseOrder", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> subtotal(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotal", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> totalCost(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCost", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> unitCost(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitCost", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> supplierSku() {
    getFields().put("supplierSku", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> taxPercent() {
    getFields().put("taxPercent", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryPurchaseOrderLineItem {");
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
