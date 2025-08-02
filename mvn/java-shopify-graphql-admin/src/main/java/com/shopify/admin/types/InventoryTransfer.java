package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents the intention to move inventory between locations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryTransfer implements com.shopify.admin.types.CommentEventSubject, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.Node {
  /**
   * The date and time the inventory transfer was created in UTC format.
   */
  private OffsetDateTime dateCreated;

  /**
   * Snapshot of the destination location (name, address, when snapped) with an
   * optional link to the live Location object. If the original location is
   * deleted, the snapshot data will still be available but the location link will be nil.
   */
  private LocationSnapshot destination;

  /**
   * The list of events associated with the inventory transfer.
   */
  private EventConnection events;

  /**
   * Whether the merchant has added timeline comments to the inventory transfer.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The line items associated with the inventory transfer.
   */
  private InventoryTransferLineItemConnection lineItems;

  /**
   * The number of line items associated with the inventory transfer. Limited to a maximum of 10000 by default.
   */
  private Count lineItemsCount;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The name of the inventory transfer.
   */
  private String name;

  /**
   * Additional note attached to the inventory transfer.
   */
  private String note;

  /**
   * Snapshot of the origin location (name, address, when snapped) with an optional
   * link to the live Location object. If the original location is deleted, the
   * snapshot data will still be available but the location link will be nil.
   */
  private LocationSnapshot origin;

  /**
   * The total quantity of items received in the transfer.
   */
  private int receivedQuantity;

  /**
   * The reference name of the inventory transfer.
   */
  private String referenceName;

  /**
   * The shipments associated with the inventory transfer.
   */
  private InventoryShipmentConnection shipments;

  /**
   * The current status of the transfer.
   */
  private InventoryTransferStatus status;

  /**
   * A list of tags that have been added to the inventory transfer.
   */
  private List<String> tags;

  /**
   * The total quantity of items being transferred.
   */
  private int totalQuantity;

  public InventoryTransfer() {
  }

  /**
   * The date and time the inventory transfer was created in UTC format.
   */
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Snapshot of the destination location (name, address, when snapped) with an
   * optional link to the live Location object. If the original location is
   * deleted, the snapshot data will still be available but the location link will be nil.
   */
  public LocationSnapshot getDestination() {
    return destination;
  }

  public void setDestination(LocationSnapshot destination) {
    this.destination = destination;
  }

  /**
   * The list of events associated with the inventory transfer.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * Whether the merchant has added timeline comments to the inventory transfer.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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
   * The line items associated with the inventory transfer.
   */
  public InventoryTransferLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(InventoryTransferLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The number of line items associated with the inventory transfer. Limited to a maximum of 10000 by default.
   */
  public Count getLineItemsCount() {
    return lineItemsCount;
  }

  public void setLineItemsCount(Count lineItemsCount) {
    this.lineItemsCount = lineItemsCount;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the inventory transfer.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Additional note attached to the inventory transfer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Snapshot of the origin location (name, address, when snapped) with an optional
   * link to the live Location object. If the original location is deleted, the
   * snapshot data will still be available but the location link will be nil.
   */
  public LocationSnapshot getOrigin() {
    return origin;
  }

  public void setOrigin(LocationSnapshot origin) {
    this.origin = origin;
  }

  /**
   * The total quantity of items received in the transfer.
   */
  public int getReceivedQuantity() {
    return receivedQuantity;
  }

  public void setReceivedQuantity(int receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
  }

  /**
   * The reference name of the inventory transfer.
   */
  public String getReferenceName() {
    return referenceName;
  }

  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }

  /**
   * The shipments associated with the inventory transfer.
   */
  public InventoryShipmentConnection getShipments() {
    return shipments;
  }

  public void setShipments(InventoryShipmentConnection shipments) {
    this.shipments = shipments;
  }

  /**
   * The current status of the transfer.
   */
  public InventoryTransferStatus getStatus() {
    return status;
  }

  public void setStatus(InventoryTransferStatus status) {
    this.status = status;
  }

  /**
   * A list of tags that have been added to the inventory transfer.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The total quantity of items being transferred.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "InventoryTransfer{dateCreated='" + dateCreated + "', destination='" + destination + "', events='" + events + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', lineItems='" + lineItems + "', lineItemsCount='" + lineItemsCount + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', origin='" + origin + "', receivedQuantity='" + receivedQuantity + "', referenceName='" + referenceName + "', shipments='" + shipments + "', status='" + status + "', tags='" + tags + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransfer that = (InventoryTransfer) o;
    return Objects.equals(dateCreated, that.dateCreated) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(events, that.events) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(lineItemsCount, that.lineItemsCount) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(origin, that.origin) &&
        receivedQuantity == that.receivedQuantity &&
        Objects.equals(referenceName, that.referenceName) &&
        Objects.equals(shipments, that.shipments) &&
        Objects.equals(status, that.status) &&
        Objects.equals(tags, that.tags) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, destination, events, hasTimelineComment, id, lineItems, lineItemsCount, metafield, metafieldDefinitions, metafields, name, note, origin, receivedQuantity, referenceName, shipments, status, tags, totalQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time the inventory transfer was created in UTC format.
     */
    private OffsetDateTime dateCreated;

    /**
     * Snapshot of the destination location (name, address, when snapped) with an
     * optional link to the live Location object. If the original location is
     * deleted, the snapshot data will still be available but the location link will be nil.
     */
    private LocationSnapshot destination;

    /**
     * The list of events associated with the inventory transfer.
     */
    private EventConnection events;

    /**
     * Whether the merchant has added timeline comments to the inventory transfer.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The line items associated with the inventory transfer.
     */
    private InventoryTransferLineItemConnection lineItems;

    /**
     * The number of line items associated with the inventory transfer. Limited to a maximum of 10000 by default.
     */
    private Count lineItemsCount;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The name of the inventory transfer.
     */
    private String name;

    /**
     * Additional note attached to the inventory transfer.
     */
    private String note;

    /**
     * Snapshot of the origin location (name, address, when snapped) with an optional
     * link to the live Location object. If the original location is deleted, the
     * snapshot data will still be available but the location link will be nil.
     */
    private LocationSnapshot origin;

    /**
     * The total quantity of items received in the transfer.
     */
    private int receivedQuantity;

    /**
     * The reference name of the inventory transfer.
     */
    private String referenceName;

    /**
     * The shipments associated with the inventory transfer.
     */
    private InventoryShipmentConnection shipments;

    /**
     * The current status of the transfer.
     */
    private InventoryTransferStatus status;

    /**
     * A list of tags that have been added to the inventory transfer.
     */
    private List<String> tags;

    /**
     * The total quantity of items being transferred.
     */
    private int totalQuantity;

    public InventoryTransfer build() {
      InventoryTransfer result = new InventoryTransfer();
      result.dateCreated = this.dateCreated;
      result.destination = this.destination;
      result.events = this.events;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.lineItemsCount = this.lineItemsCount;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note = this.note;
      result.origin = this.origin;
      result.receivedQuantity = this.receivedQuantity;
      result.referenceName = this.referenceName;
      result.shipments = this.shipments;
      result.status = this.status;
      result.tags = this.tags;
      result.totalQuantity = this.totalQuantity;
      return result;
    }

    /**
     * The date and time the inventory transfer was created in UTC format.
     */
    public Builder dateCreated(OffsetDateTime dateCreated) {
      this.dateCreated = dateCreated;
      return this;
    }

    /**
     * Snapshot of the destination location (name, address, when snapped) with an
     * optional link to the live Location object. If the original location is
     * deleted, the snapshot data will still be available but the location link will be nil.
     */
    public Builder destination(LocationSnapshot destination) {
      this.destination = destination;
      return this;
    }

    /**
     * The list of events associated with the inventory transfer.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * Whether the merchant has added timeline comments to the inventory transfer.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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
     * The line items associated with the inventory transfer.
     */
    public Builder lineItems(InventoryTransferLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The number of line items associated with the inventory transfer. Limited to a maximum of 10000 by default.
     */
    public Builder lineItemsCount(Count lineItemsCount) {
      this.lineItemsCount = lineItemsCount;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the inventory transfer.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Additional note attached to the inventory transfer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * Snapshot of the origin location (name, address, when snapped) with an optional
     * link to the live Location object. If the original location is deleted, the
     * snapshot data will still be available but the location link will be nil.
     */
    public Builder origin(LocationSnapshot origin) {
      this.origin = origin;
      return this;
    }

    /**
     * The total quantity of items received in the transfer.
     */
    public Builder receivedQuantity(int receivedQuantity) {
      this.receivedQuantity = receivedQuantity;
      return this;
    }

    /**
     * The reference name of the inventory transfer.
     */
    public Builder referenceName(String referenceName) {
      this.referenceName = referenceName;
      return this;
    }

    /**
     * The shipments associated with the inventory transfer.
     */
    public Builder shipments(InventoryShipmentConnection shipments) {
      this.shipments = shipments;
      return this;
    }

    /**
     * The current status of the transfer.
     */
    public Builder status(InventoryTransferStatus status) {
      this.status = status;
      return this;
    }

    /**
     * A list of tags that have been added to the inventory transfer.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The total quantity of items being transferred.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
