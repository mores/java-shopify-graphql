package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a snapshot of the supplier where a purchase order originates from.
 */
public class InventorySupplierSnapshot {
  /**
   * The name of the supplier as it was when the purchase order was created.
   */
  private String supplierName;

  public InventorySupplierSnapshot() {
  }

  /**
   * The name of the supplier as it was when the purchase order was created.
   */
  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  @Override
  public String toString() {
    return "InventorySupplierSnapshot{supplierName='" + supplierName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySupplierSnapshot that = (InventorySupplierSnapshot) o;
    return Objects.equals(supplierName, that.supplierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the supplier as it was when the purchase order was created.
     */
    private String supplierName;

    public InventorySupplierSnapshot build() {
      InventorySupplierSnapshot result = new InventorySupplierSnapshot();
      result.supplierName = this.supplierName;
      return result;
    }

    /**
     * The name of the supplier as it was when the purchase order was created.
     */
    public Builder supplierName(String supplierName) {
      this.supplierName = supplierName;
      return this;
    }
  }
}
