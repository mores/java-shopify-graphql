package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A buyer-initiated request to edit unfulfilled line items on an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RequestedOrderEdit implements com.shopify.admin.types.Node {
  /**
   * The date and time when the requested order edit was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The line item changes included in this requested order edit, grouped by the type of change.
   */
  private RequestedOrderEditLineItems lineItems;

  /**
   * The order associated with this requested order edit.
   */
  private Order order;

  /**
   * The date and time when the requested order edit was declined.
   */
  private OffsetDateTime requestDeclinedAt;

  /**
   * The date and time when the requested order edit was resolved.
   */
  private OffsetDateTime requestResolvedAt;

  /**
   * The date and time when the edit was requested by the buyer.
   */
  private OffsetDateTime requestedAt;

  /**
   * The status of this requested order edit.
   */
  private RequestedOrderEditStatus status;

  /**
   * The date and time when the requested order edit was last updated.
   */
  private OffsetDateTime updatedAt;

  public RequestedOrderEdit() {
  }

  /**
   * The date and time when the requested order edit was created.
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
   * The line item changes included in this requested order edit, grouped by the type of change.
   */
  public RequestedOrderEditLineItems getLineItems() {
    return lineItems;
  }

  public void setLineItems(RequestedOrderEditLineItems lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The order associated with this requested order edit.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The date and time when the requested order edit was declined.
   */
  public OffsetDateTime getRequestDeclinedAt() {
    return requestDeclinedAt;
  }

  public void setRequestDeclinedAt(OffsetDateTime requestDeclinedAt) {
    this.requestDeclinedAt = requestDeclinedAt;
  }

  /**
   * The date and time when the requested order edit was resolved.
   */
  public OffsetDateTime getRequestResolvedAt() {
    return requestResolvedAt;
  }

  public void setRequestResolvedAt(OffsetDateTime requestResolvedAt) {
    this.requestResolvedAt = requestResolvedAt;
  }

  /**
   * The date and time when the edit was requested by the buyer.
   */
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  /**
   * The status of this requested order edit.
   */
  public RequestedOrderEditStatus getStatus() {
    return status;
  }

  public void setStatus(RequestedOrderEditStatus status) {
    this.status = status;
  }

  /**
   * The date and time when the requested order edit was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "RequestedOrderEdit{createdAt='" + createdAt + "', id='" + id + "', lineItems='" + lineItems + "', order='" + order + "', requestDeclinedAt='" + requestDeclinedAt + "', requestResolvedAt='" + requestResolvedAt + "', requestedAt='" + requestedAt + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEdit that = (RequestedOrderEdit) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(order, that.order) &&
        Objects.equals(requestDeclinedAt, that.requestDeclinedAt) &&
        Objects.equals(requestResolvedAt, that.requestResolvedAt) &&
        Objects.equals(requestedAt, that.requestedAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, lineItems, order, requestDeclinedAt, requestResolvedAt, requestedAt, status, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the requested order edit was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The line item changes included in this requested order edit, grouped by the type of change.
     */
    private RequestedOrderEditLineItems lineItems;

    /**
     * The order associated with this requested order edit.
     */
    private Order order;

    /**
     * The date and time when the requested order edit was declined.
     */
    private OffsetDateTime requestDeclinedAt;

    /**
     * The date and time when the requested order edit was resolved.
     */
    private OffsetDateTime requestResolvedAt;

    /**
     * The date and time when the edit was requested by the buyer.
     */
    private OffsetDateTime requestedAt;

    /**
     * The status of this requested order edit.
     */
    private RequestedOrderEditStatus status;

    /**
     * The date and time when the requested order edit was last updated.
     */
    private OffsetDateTime updatedAt;

    public RequestedOrderEdit build() {
      RequestedOrderEdit result = new RequestedOrderEdit();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.order = this.order;
      result.requestDeclinedAt = this.requestDeclinedAt;
      result.requestResolvedAt = this.requestResolvedAt;
      result.requestedAt = this.requestedAt;
      result.status = this.status;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the requested order edit was created.
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
     * The line item changes included in this requested order edit, grouped by the type of change.
     */
    public Builder lineItems(RequestedOrderEditLineItems lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The order associated with this requested order edit.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The date and time when the requested order edit was declined.
     */
    public Builder requestDeclinedAt(OffsetDateTime requestDeclinedAt) {
      this.requestDeclinedAt = requestDeclinedAt;
      return this;
    }

    /**
     * The date and time when the requested order edit was resolved.
     */
    public Builder requestResolvedAt(OffsetDateTime requestResolvedAt) {
      this.requestResolvedAt = requestResolvedAt;
      return this;
    }

    /**
     * The date and time when the edit was requested by the buyer.
     */
    public Builder requestedAt(OffsetDateTime requestedAt) {
      this.requestedAt = requestedAt;
      return this;
    }

    /**
     * The status of this requested order edit.
     */
    public Builder status(RequestedOrderEditStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The date and time when the requested order edit was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
