package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryPurchaseOrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrderLineItem"));
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryPurchaseOrderProjection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> purchaseOrder(
      ) {
     InventoryPurchaseOrderProjection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderProjection<>(this, getRoot());
     getFields().put("purchaseOrder", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> subtotal(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotal", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> totalCost(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCost", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> unitCost(
      ) {
     MoneyV2Projection<InventoryPurchaseOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitCost", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> supplierSku() {
    getFields().put("supplierSku", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> taxPercent() {
    getFields().put("taxPercent", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public InventoryPurchaseOrderLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }
}
