package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a change in an inventory quantity of an inventory item at a location.
 */
public class InventoryChange {
  /**
   * The amount by which the inventory quantity was changed.
   */
  private int delta;

  /**
   * The inventory item associated with this inventory change.
   */
  private InventoryItem item;

  /**
   * A URI that represents what the inventory quantity change was applied to.
   */
  private String ledgerDocumentUri;

  /**
   * The location associated with this inventory change.
   */
  private Location location;

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * of the inventory quantity that was changed.
   */
  private String name;

  /**
   * The quantity of named inventory after the change.
   */
  private Integer quantityAfterChange;

  public InventoryChange() {
  }

  /**
   * The amount by which the inventory quantity was changed.
   */
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  /**
   * The inventory item associated with this inventory change.
   */
  public InventoryItem getItem() {
    return item;
  }

  public void setItem(InventoryItem item) {
    this.item = item;
  }

  /**
   * A URI that represents what the inventory quantity change was applied to.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  /**
   * The location associated with this inventory change.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
   * of the inventory quantity that was changed.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The quantity of named inventory after the change.
   */
  public Integer getQuantityAfterChange() {
    return quantityAfterChange;
  }

  public void setQuantityAfterChange(Integer quantityAfterChange) {
    this.quantityAfterChange = quantityAfterChange;
  }

  @Override
  public String toString() {
    return "InventoryChange{delta='" + delta + "', item='" + item + "', ledgerDocumentUri='" + ledgerDocumentUri + "', location='" + location + "', name='" + name + "', quantityAfterChange='" + quantityAfterChange + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryChange that = (InventoryChange) o;
    return delta == that.delta &&
        Objects.equals(item, that.item) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(quantityAfterChange, that.quantityAfterChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, item, ledgerDocumentUri, location, name, quantityAfterChange);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount by which the inventory quantity was changed.
     */
    private int delta;

    /**
     * The inventory item associated with this inventory change.
     */
    private InventoryItem item;

    /**
     * A URI that represents what the inventory quantity change was applied to.
     */
    private String ledgerDocumentUri;

    /**
     * The location associated with this inventory change.
     */
    private Location location;

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * of the inventory quantity that was changed.
     */
    private String name;

    /**
     * The quantity of named inventory after the change.
     */
    private Integer quantityAfterChange;

    public InventoryChange build() {
      InventoryChange result = new InventoryChange();
      result.delta = this.delta;
      result.item = this.item;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.location = this.location;
      result.name = this.name;
      result.quantityAfterChange = this.quantityAfterChange;
      return result;
    }

    /**
     * The amount by which the inventory quantity was changed.
     */
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    /**
     * The inventory item associated with this inventory change.
     */
    public Builder item(InventoryItem item) {
      this.item = item;
      return this;
    }

    /**
     * A URI that represents what the inventory quantity change was applied to.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    /**
     * The location associated with this inventory change.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
     * of the inventory quantity that was changed.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The quantity of named inventory after the change.
     */
    public Builder quantityAfterChange(Integer quantityAfterChange) {
      this.quantityAfterChange = quantityAfterChange;
      return this;
    }
  }
}
