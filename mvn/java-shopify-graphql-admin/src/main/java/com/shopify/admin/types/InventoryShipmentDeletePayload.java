package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentDelete` mutation.
 */
public class InventoryShipmentDeletePayload {
  /**
   * The ID of the inventory shipment that was deleted.
   */
  private String id;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentDeleteUserError> userErrors;

  public InventoryShipmentDeletePayload() {
  }

  /**
   * The ID of the inventory shipment that was deleted.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryShipmentDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentDeletePayload{id='" + id + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentDeletePayload that = (InventoryShipmentDeletePayload) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the inventory shipment that was deleted.
     */
    private String id;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentDeleteUserError> userErrors;

    public InventoryShipmentDeletePayload build() {
      InventoryShipmentDeletePayload result = new InventoryShipmentDeletePayload();
      result.id = this.id;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the inventory shipment that was deleted.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
