package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a group of adjustments made as part of the same operation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryAdjustmentGroup implements com.shopify.types.Node {
  /**
   * The app that triggered the inventory event, if one exists.
   */
  private App app;

  /**
   * The set of inventory quantity changes that occurred in the inventory event.
   */
  private List<InventoryChange> changes;

  /**
   * The date and time the inventory adjustment group was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The reason for the group of adjustments.
   */
  private String reason;

  /**
   * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
   * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
   * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
   * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
   */
  private String referenceDocumentUri;

  /**
   * The staff member associated with the inventory event.
   */
  private StaffMember staffMember;

  public InventoryAdjustmentGroup() {
  }

  /**
   * The app that triggered the inventory event, if one exists.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The set of inventory quantity changes that occurred in the inventory event.
   */
  public List<InventoryChange> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryChange> changes) {
    this.changes = changes;
  }

  /**
   * The date and time the inventory adjustment group was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * The reason for the group of adjustments.
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
   * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
   * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
   * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
   */
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  /**
   * The staff member associated with the inventory event.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  @Override
  public String toString() {
    return "InventoryAdjustmentGroup{app='" + app + "', changes='" + changes + "', createdAt='" + createdAt + "', id='" + id + "', reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', staffMember='" + staffMember + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustmentGroup that = (InventoryAdjustmentGroup) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(changes, that.changes) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(staffMember, that.staffMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, changes, createdAt, id, reason, referenceDocumentUri, staffMember);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app that triggered the inventory event, if one exists.
     */
    private App app;

    /**
     * The set of inventory quantity changes that occurred in the inventory event.
     */
    private List<InventoryChange> changes;

    /**
     * The date and time the inventory adjustment group was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The reason for the group of adjustments.
     */
    private String reason;

    /**
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
     */
    private String referenceDocumentUri;

    /**
     * The staff member associated with the inventory event.
     */
    private StaffMember staffMember;

    public InventoryAdjustmentGroup build() {
      InventoryAdjustmentGroup result = new InventoryAdjustmentGroup();
      result.app = this.app;
      result.changes = this.changes;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.reason = this.reason;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.staffMember = this.staffMember;
      return result;
    }

    /**
     * The app that triggered the inventory event, if one exists.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The set of inventory quantity changes that occurred in the inventory event.
     */
    public Builder changes(List<InventoryChange> changes) {
      this.changes = changes;
      return this;
    }

    /**
     * The date and time the inventory adjustment group was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * The reason for the group of adjustments.
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * A freeform URI that represents why the inventory change happened. This can be the entity adjusting inventory
     * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a unit in a
     * draft order might have been previously reserved, and a merchant later creates an order from the draft order.
     * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order ID.
     */
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }

    /**
     * The staff member associated with the inventory event.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }
  }
}
