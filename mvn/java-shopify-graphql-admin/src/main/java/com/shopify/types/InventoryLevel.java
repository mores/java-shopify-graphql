package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The quantities of an inventory item that are related to a specific location.
 * Learn [more about the relationships between inventory objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#inventory-object-relationships).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryLevel implements com.shopify.types.Node {
  /**
   * Whether the inventory items associated with the inventory level can be deactivated.
   */
  private boolean canDeactivate;

  /**
   * The date and time when the inventory level was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Describes either the impact of deactivating the inventory level, or why the inventory level can't be deactivated.
   */
  private String deactivationAlert;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Inventory item associated with the inventory level.
   */
  private InventoryItem item;

  /**
   * The location associated with the inventory level.
   */
  private Location location;

  /**
   * Quantities for the requested names.
   */
  private List<InventoryQuantity> quantities;

  /**
   * Scheduled changes for the requested quantity names.
   */
  private InventoryScheduledChangeConnection scheduledChanges;

  /**
   * The date and time when the inventory level was updated.
   */
  private OffsetDateTime updatedAt;

  public InventoryLevel() {
  }

  /**
   * Whether the inventory items associated with the inventory level can be deactivated.
   */
  public boolean getCanDeactivate() {
    return canDeactivate;
  }

  public void setCanDeactivate(boolean canDeactivate) {
    this.canDeactivate = canDeactivate;
  }

  /**
   * The date and time when the inventory level was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Describes either the impact of deactivating the inventory level, or why the inventory level can't be deactivated.
   */
  public String getDeactivationAlert() {
    return deactivationAlert;
  }

  public void setDeactivationAlert(String deactivationAlert) {
    this.deactivationAlert = deactivationAlert;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Inventory item associated with the inventory level.
   */
  public InventoryItem getItem() {
    return item;
  }

  public void setItem(InventoryItem item) {
    this.item = item;
  }

  /**
   * The location associated with the inventory level.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Quantities for the requested names.
   */
  public List<InventoryQuantity> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<InventoryQuantity> quantities) {
    this.quantities = quantities;
  }

  /**
   * Scheduled changes for the requested quantity names.
   */
  public InventoryScheduledChangeConnection getScheduledChanges() {
    return scheduledChanges;
  }

  public void setScheduledChanges(InventoryScheduledChangeConnection scheduledChanges) {
    this.scheduledChanges = scheduledChanges;
  }

  /**
   * The date and time when the inventory level was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "InventoryLevel{canDeactivate='" + canDeactivate + "', createdAt='" + createdAt + "', deactivationAlert='" + deactivationAlert + "', id='" + id + "', item='" + item + "', location='" + location + "', quantities='" + quantities + "', scheduledChanges='" + scheduledChanges + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryLevel that = (InventoryLevel) o;
    return canDeactivate == that.canDeactivate &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deactivationAlert, that.deactivationAlert) &&
        Objects.equals(id, that.id) &&
        Objects.equals(item, that.item) &&
        Objects.equals(location, that.location) &&
        Objects.equals(quantities, that.quantities) &&
        Objects.equals(scheduledChanges, that.scheduledChanges) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDeactivate, createdAt, deactivationAlert, id, item, location, quantities, scheduledChanges, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the inventory items associated with the inventory level can be deactivated.
     */
    private boolean canDeactivate;

    /**
     * The date and time when the inventory level was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Describes either the impact of deactivating the inventory level, or why the inventory level can't be deactivated.
     */
    private String deactivationAlert;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Inventory item associated with the inventory level.
     */
    private InventoryItem item;

    /**
     * The location associated with the inventory level.
     */
    private Location location;

    /**
     * Quantities for the requested names.
     */
    private List<InventoryQuantity> quantities;

    /**
     * Scheduled changes for the requested quantity names.
     */
    private InventoryScheduledChangeConnection scheduledChanges;

    /**
     * The date and time when the inventory level was updated.
     */
    private OffsetDateTime updatedAt;

    public InventoryLevel build() {
      InventoryLevel result = new InventoryLevel();
      result.canDeactivate = this.canDeactivate;
      result.createdAt = this.createdAt;
      result.deactivationAlert = this.deactivationAlert;
      result.id = this.id;
      result.item = this.item;
      result.location = this.location;
      result.quantities = this.quantities;
      result.scheduledChanges = this.scheduledChanges;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Whether the inventory items associated with the inventory level can be deactivated.
     */
    public Builder canDeactivate(boolean canDeactivate) {
      this.canDeactivate = canDeactivate;
      return this;
    }

    /**
     * The date and time when the inventory level was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Describes either the impact of deactivating the inventory level, or why the inventory level can't be deactivated.
     */
    public Builder deactivationAlert(String deactivationAlert) {
      this.deactivationAlert = deactivationAlert;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Inventory item associated with the inventory level.
     */
    public Builder item(InventoryItem item) {
      this.item = item;
      return this;
    }

    /**
     * The location associated with the inventory level.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Quantities for the requested names.
     */
    public Builder quantities(List<InventoryQuantity> quantities) {
      this.quantities = quantities;
      return this;
    }

    /**
     * Scheduled changes for the requested quantity names.
     */
    public Builder scheduledChanges(InventoryScheduledChangeConnection scheduledChanges) {
      this.scheduledChanges = scheduledChanges;
      return this;
    }

    /**
     * The date and time when the inventory level was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
