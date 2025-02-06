package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the change to be made to an inventory item at a location.
 */
public class InventoryChangeInput {
  /**
   * The amount by which the inventory quantity will be changed.
   */
  private int delta;

  /**
   * Specifies the inventory item to which the change will be applied.
   */
  private String inventoryItemId;

  /**
   * Specifies the location at which the change will be applied.
   */
  private String locationId;

  /**
   * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
   * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for all
   * quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an `available`
   * quantity name.
   */
  private String ledgerDocumentUri;

  public InventoryChangeInput() {
  }

  /**
   * The amount by which the inventory quantity will be changed.
   */
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  /**
   * Specifies the inventory item to which the change will be applied.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * Specifies the location at which the change will be applied.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
   * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for all
   * quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an `available`
   * quantity name.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  @Override
  public String toString() {
    return "InventoryChangeInput{delta='" + delta + "', inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryChangeInput that = (InventoryChangeInput) o;
    return delta == that.delta &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, inventoryItemId, locationId, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount by which the inventory quantity will be changed.
     */
    private int delta;

    /**
     * Specifies the inventory item to which the change will be applied.
     */
    private String inventoryItemId;

    /**
     * Specifies the location at which the change will be applied.
     */
    private String locationId;

    /**
     * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
     * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for all
     * quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an `available`
     * quantity name.
     */
    private String ledgerDocumentUri;

    public InventoryChangeInput build() {
      InventoryChangeInput result = new InventoryChangeInput();
      result.delta = this.delta;
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    /**
     * The amount by which the inventory quantity will be changed.
     */
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    /**
     * Specifies the inventory item to which the change will be applied.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * Specifies the location at which the change will be applied.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
     * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for all
     * quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an `available`
     * quantity name.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }
  }
}
