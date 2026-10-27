package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a line item belonging to an inventory purchase order.
 * This is a simplified view of the purchase order line item for inventory management purposes.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryPurchaseOrderLineItem implements com.shopify.admin.types.Node {
  /**
   * A globally unique identifier.
   */
  private String id;

  /**
   * The inventory item associated with this line item.
   */
  private InventoryItem inventoryItem;

  /**
   * The purchase order this line item belongs to.
   */
  private InventoryPurchaseOrder purchaseOrder;

  /**
   * The unit cost multiplied by the total quantity for the line item.
   */
  private MoneyV2 subtotal;

  /**
   * The SKU for the item.
   */
  private String supplierSku;

  /**
   * The tax rate percentage for the line item.
   */
  private String taxPercent;

  /**
   * The title of the product associated with this line item.
   */
  private String title;

  /**
   * The total cost of the line item, including taxes.
   */
  private MoneyV2 totalCost;

  /**
   * The total number of units ordered for the line item.
   */
  private int totalQuantity;

  /**
   * The unit cost of the item paid to the supplier.
   */
  private MoneyV2 unitCost;

  /**
   * The title of the variant associated with this line item.
   */
  private String variantTitle;

  public InventoryPurchaseOrderLineItem() {
  }

  /**
   * A globally unique identifier.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The inventory item associated with this line item.
   */
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * The purchase order this line item belongs to.
   */
  public InventoryPurchaseOrder getPurchaseOrder() {
    return purchaseOrder;
  }

  public void setPurchaseOrder(InventoryPurchaseOrder purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }

  /**
   * The unit cost multiplied by the total quantity for the line item.
   */
  public MoneyV2 getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyV2 subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The SKU for the item.
   */
  public String getSupplierSku() {
    return supplierSku;
  }

  public void setSupplierSku(String supplierSku) {
    this.supplierSku = supplierSku;
  }

  /**
   * The tax rate percentage for the line item.
   */
  public String getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(String taxPercent) {
    this.taxPercent = taxPercent;
  }

  /**
   * The title of the product associated with this line item.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total cost of the line item, including taxes.
   */
  public MoneyV2 getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(MoneyV2 totalCost) {
    this.totalCost = totalCost;
  }

  /**
   * The total number of units ordered for the line item.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  /**
   * The unit cost of the item paid to the supplier.
   */
  public MoneyV2 getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(MoneyV2 unitCost) {
    this.unitCost = unitCost;
  }

  /**
   * The title of the variant associated with this line item.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  @Override
  public String toString() {
    return "InventoryPurchaseOrderLineItem{id='" + id + "', inventoryItem='" + inventoryItem + "', purchaseOrder='" + purchaseOrder + "', subtotal='" + subtotal + "', supplierSku='" + supplierSku + "', taxPercent='" + taxPercent + "', title='" + title + "', totalCost='" + totalCost + "', totalQuantity='" + totalQuantity + "', unitCost='" + unitCost + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryPurchaseOrderLineItem that = (InventoryPurchaseOrderLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(purchaseOrder, that.purchaseOrder) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(supplierSku, that.supplierSku) &&
        Objects.equals(taxPercent, that.taxPercent) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalCost, that.totalCost) &&
        totalQuantity == that.totalQuantity &&
        Objects.equals(unitCost, that.unitCost) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inventoryItem, purchaseOrder, subtotal, supplierSku, taxPercent, title, totalCost, totalQuantity, unitCost, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally unique identifier.
     */
    private String id;

    /**
     * The inventory item associated with this line item.
     */
    private InventoryItem inventoryItem;

    /**
     * The purchase order this line item belongs to.
     */
    private InventoryPurchaseOrder purchaseOrder;

    /**
     * The unit cost multiplied by the total quantity for the line item.
     */
    private MoneyV2 subtotal;

    /**
     * The SKU for the item.
     */
    private String supplierSku;

    /**
     * The tax rate percentage for the line item.
     */
    private String taxPercent;

    /**
     * The title of the product associated with this line item.
     */
    private String title;

    /**
     * The total cost of the line item, including taxes.
     */
    private MoneyV2 totalCost;

    /**
     * The total number of units ordered for the line item.
     */
    private int totalQuantity;

    /**
     * The unit cost of the item paid to the supplier.
     */
    private MoneyV2 unitCost;

    /**
     * The title of the variant associated with this line item.
     */
    private String variantTitle;

    public InventoryPurchaseOrderLineItem build() {
      InventoryPurchaseOrderLineItem result = new InventoryPurchaseOrderLineItem();
      result.id = this.id;
      result.inventoryItem = this.inventoryItem;
      result.purchaseOrder = this.purchaseOrder;
      result.subtotal = this.subtotal;
      result.supplierSku = this.supplierSku;
      result.taxPercent = this.taxPercent;
      result.title = this.title;
      result.totalCost = this.totalCost;
      result.totalQuantity = this.totalQuantity;
      result.unitCost = this.unitCost;
      result.variantTitle = this.variantTitle;
      return result;
    }

    /**
     * A globally unique identifier.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The inventory item associated with this line item.
     */
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * The purchase order this line item belongs to.
     */
    public Builder purchaseOrder(InventoryPurchaseOrder purchaseOrder) {
      this.purchaseOrder = purchaseOrder;
      return this;
    }

    /**
     * The unit cost multiplied by the total quantity for the line item.
     */
    public Builder subtotal(MoneyV2 subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The SKU for the item.
     */
    public Builder supplierSku(String supplierSku) {
      this.supplierSku = supplierSku;
      return this;
    }

    /**
     * The tax rate percentage for the line item.
     */
    public Builder taxPercent(String taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * The title of the product associated with this line item.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total cost of the line item, including taxes.
     */
    public Builder totalCost(MoneyV2 totalCost) {
      this.totalCost = totalCost;
      return this;
    }

    /**
     * The total number of units ordered for the line item.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }

    /**
     * The unit cost of the item paid to the supplier.
     */
    public Builder unitCost(MoneyV2 unitCost) {
      this.unitCost = unitCost;
      return this;
    }

    /**
     * The title of the variant associated with this line item.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
