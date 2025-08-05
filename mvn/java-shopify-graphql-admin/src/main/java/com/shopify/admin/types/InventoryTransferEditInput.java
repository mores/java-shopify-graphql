package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to edit an inventory transfer.
 */
public class InventoryTransferEditInput {
  /**
   * The origin location for the inventory transfer. The origin location can only be changed
   * for draft transfers.
   */
  private String originId;

  /**
   * The destination location for the inventory transfer. The destination location can only be
   * changed for draft transfers.
   */
  private String destinationId;

  /**
   * The date the inventory transfer was created.
   */
  private LocalDate dateCreated;

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

  public InventoryTransferEditInput() {
  }

  /**
   * The origin location for the inventory transfer. The origin location can only be changed
   * for draft transfers.
   */
  public String getOriginId() {
    return originId;
  }

  public void setOriginId(String originId) {
    this.originId = originId;
  }

  /**
   * The destination location for the inventory transfer. The destination location can only be
   * changed for draft transfers.
   */
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  /**
   * The date the inventory transfer was created.
   */
  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
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
    return "InventoryTransferEditInput{originId='" + originId + "', destinationId='" + destinationId + "', dateCreated='" + dateCreated + "', note='" + note + "', tags='" + tags + "', referenceName='" + referenceName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferEditInput that = (InventoryTransferEditInput) o;
    return Objects.equals(originId, that.originId) &&
        Objects.equals(destinationId, that.destinationId) &&
        Objects.equals(dateCreated, that.dateCreated) &&
        Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(referenceName, that.referenceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originId, destinationId, dateCreated, note, tags, referenceName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The origin location for the inventory transfer. The origin location can only be changed
     * for draft transfers.
     */
    private String originId;

    /**
     * The destination location for the inventory transfer. The destination location can only be
     * changed for draft transfers.
     */
    private String destinationId;

    /**
     * The date the inventory transfer was created.
     */
    private LocalDate dateCreated;

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

    public InventoryTransferEditInput build() {
      InventoryTransferEditInput result = new InventoryTransferEditInput();
      result.originId = this.originId;
      result.destinationId = this.destinationId;
      result.dateCreated = this.dateCreated;
      result.note = this.note;
      result.tags = this.tags;
      result.referenceName = this.referenceName;
      return result;
    }

    /**
     * The origin location for the inventory transfer. The origin location can only be changed
     * for draft transfers.
     */
    public Builder originId(String originId) {
      this.originId = originId;
      return this;
    }

    /**
     * The destination location for the inventory transfer. The destination location can only be
     * changed for draft transfers.
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * The date the inventory transfer was created.
     */
    public Builder dateCreated(LocalDate dateCreated) {
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
