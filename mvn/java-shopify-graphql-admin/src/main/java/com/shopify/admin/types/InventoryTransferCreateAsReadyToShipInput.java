package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create an inventory transfer.
 */
public class InventoryTransferCreateAsReadyToShipInput {
  /**
   * The origin location for the inventory transfer.
   */
  private String originLocationId;

  /**
   * The destination location for the inventory transfer.
   */
  private String destinationLocationId;

  /**
   * The list of line items for the inventory transfer.
   */
  private List<InventoryTransferLineItemInput> lineItems = Collections.emptyList();

  /**
   * The date and time the inventory transfer was created. If left blank, defaults to the current date and time in UTC format.
   */
  private OffsetDateTime dateCreated;

  /**
   * A note to add to the Inventory Transfer.
   */
  private String note;

  /**
   * The tags to add to the inventory transfer.
   */
  private List<String> tags;

  /**
   * The reference name to add to the inventory transfer.
   */
  private String referenceName;

  public InventoryTransferCreateAsReadyToShipInput() {
  }

  /**
   * The origin location for the inventory transfer.
   */
  public String getOriginLocationId() {
    return originLocationId;
  }

  public void setOriginLocationId(String originLocationId) {
    this.originLocationId = originLocationId;
  }

  /**
   * The destination location for the inventory transfer.
   */
  public String getDestinationLocationId() {
    return destinationLocationId;
  }

  public void setDestinationLocationId(String destinationLocationId) {
    this.destinationLocationId = destinationLocationId;
  }

  /**
   * The list of line items for the inventory transfer.
   */
  public List<InventoryTransferLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<InventoryTransferLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The date and time the inventory transfer was created. If left blank, defaults to the current date and time in UTC format.
   */
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * A note to add to the Inventory Transfer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The tags to add to the inventory transfer.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The reference name to add to the inventory transfer.
   */
  public String getReferenceName() {
    return referenceName;
  }

  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }

  @Override
  public String toString() {
    return "InventoryTransferCreateAsReadyToShipInput{originLocationId='" + originLocationId + "', destinationLocationId='" + destinationLocationId + "', lineItems='" + lineItems + "', dateCreated='" + dateCreated + "', note='" + note + "', tags='" + tags + "', referenceName='" + referenceName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferCreateAsReadyToShipInput that = (InventoryTransferCreateAsReadyToShipInput) o;
    return Objects.equals(originLocationId, that.originLocationId) &&
        Objects.equals(destinationLocationId, that.destinationLocationId) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(dateCreated, that.dateCreated) &&
        Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(referenceName, that.referenceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originLocationId, destinationLocationId, lineItems, dateCreated, note, tags, referenceName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The origin location for the inventory transfer.
     */
    private String originLocationId;

    /**
     * The destination location for the inventory transfer.
     */
    private String destinationLocationId;

    /**
     * The list of line items for the inventory transfer.
     */
    private List<InventoryTransferLineItemInput> lineItems = Collections.emptyList();

    /**
     * The date and time the inventory transfer was created. If left blank, defaults to the current date and time in UTC format.
     */
    private OffsetDateTime dateCreated;

    /**
     * A note to add to the Inventory Transfer.
     */
    private String note;

    /**
     * The tags to add to the inventory transfer.
     */
    private List<String> tags;

    /**
     * The reference name to add to the inventory transfer.
     */
    private String referenceName;

    public InventoryTransferCreateAsReadyToShipInput build() {
      InventoryTransferCreateAsReadyToShipInput result = new InventoryTransferCreateAsReadyToShipInput();
      result.originLocationId = this.originLocationId;
      result.destinationLocationId = this.destinationLocationId;
      result.lineItems = this.lineItems;
      result.dateCreated = this.dateCreated;
      result.note = this.note;
      result.tags = this.tags;
      result.referenceName = this.referenceName;
      return result;
    }

    /**
     * The origin location for the inventory transfer.
     */
    public Builder originLocationId(String originLocationId) {
      this.originLocationId = originLocationId;
      return this;
    }

    /**
     * The destination location for the inventory transfer.
     */
    public Builder destinationLocationId(String destinationLocationId) {
      this.destinationLocationId = destinationLocationId;
      return this;
    }

    /**
     * The list of line items for the inventory transfer.
     */
    public Builder lineItems(List<InventoryTransferLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The date and time the inventory transfer was created. If left blank, defaults to the current date and time in UTC format.
     */
    public Builder dateCreated(OffsetDateTime dateCreated) {
      this.dateCreated = dateCreated;
      return this;
    }

    /**
     * A note to add to the Inventory Transfer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The tags to add to the inventory transfer.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The reference name to add to the inventory transfer.
     */
    public Builder referenceName(String referenceName) {
      this.referenceName = referenceName;
      return this;
    }
  }
}
