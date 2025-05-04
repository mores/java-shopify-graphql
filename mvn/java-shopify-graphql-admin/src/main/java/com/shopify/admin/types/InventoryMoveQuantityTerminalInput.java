package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields representing the change to be made to an inventory item at a location.
 */
public class InventoryMoveQuantityTerminalInput {
  /**
   * Specifies the location at which the change will be applied.
   */
  private String locationId;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
   * moved.
   */
  private String name;

  /**
   * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
   * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for a move of
   * all quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an
   * `available` quantity name.
   */
  private String ledgerDocumentUri;

  public InventoryMoveQuantityTerminalInput() {
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
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
   * moved.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
   * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for a move of
   * all quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an
   * `available` quantity name.
   */
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantityTerminalInput{locationId='" + locationId + "', name='" + name + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantityTerminalInput that = (InventoryMoveQuantityTerminalInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the location at which the change will be applied.
     */
    private String locationId;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
     * moved.
     */
    private String name;

    /**
     * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
     * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for a move of
     * all quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an
     * `available` quantity name.
     */
    private String ledgerDocumentUri;

    public InventoryMoveQuantityTerminalInput build() {
      InventoryMoveQuantityTerminalInput result = new InventoryMoveQuantityTerminalInput();
      result.locationId = this.locationId;
      result.name = this.name;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    /**
     * Specifies the location at which the change will be applied.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) to be
     * moved.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A freeform URI that represents what changed the inventory quantities. A Shopify global ID isn't an accepted
     * value. For example, specifying "gid://shopify/Order/123" would return an error. This field is required for a move of
     * all quantity names except `available`. The field `ledgerDocumentUri` isn't supported for use with an
     * `available` quantity name.
     */
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }
  }
}
