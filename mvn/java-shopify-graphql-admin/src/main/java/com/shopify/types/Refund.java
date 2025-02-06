package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The record of the line items and transactions that were refunded to a customer,
 * along with restocking instructions for refunded line items.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Refund implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The date and time when the refund was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A list of the refunded duties as part of this refund.
   */
  private List<RefundDuty> duties;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The optional note associated with the refund.
   */
  private String note;

  /**
   * The order associated with the refund.
   */
  private Order order;

  /**
   * The order adjustments that are attached with the refund.
   */
  private OrderAdjustmentConnection orderAdjustments;

  /**
   * The `RefundLineItem` resources attached to the refund.
   */
  private RefundLineItemConnection refundLineItems;

  /**
   * The `RefundShippingLine` resources attached to the refund.
   */
  private RefundShippingLineConnection refundShippingLines;

  /**
   * The return associated with the refund.
   */
  private Return _return;

  /**
   * The staff member who created the refund.
   */
  private StaffMember staffMember;

  /**
   * The total amount across all transactions for the refund.
   */
  private MoneyV2 totalRefunded;

  /**
   * The total amount across all transactions for the refund, in shop and presentment currencies.
   */
  private MoneyBag totalRefundedSet;

  /**
   * The transactions associated with the refund.
   */
  private OrderTransactionConnection transactions;

  /**
   * The date and time when the refund was updated.
   */
  private OffsetDateTime updatedAt;

  public Refund() {
  }

  /**
   * The date and time when the refund was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A list of the refunded duties as part of this refund.
   */
  public List<RefundDuty> getDuties() {
    return duties;
  }

  public void setDuties(List<RefundDuty> duties) {
    this.duties = duties;
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
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The optional note associated with the refund.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The order associated with the refund.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The order adjustments that are attached with the refund.
   */
  public OrderAdjustmentConnection getOrderAdjustments() {
    return orderAdjustments;
  }

  public void setOrderAdjustments(OrderAdjustmentConnection orderAdjustments) {
    this.orderAdjustments = orderAdjustments;
  }

  /**
   * The `RefundLineItem` resources attached to the refund.
   */
  public RefundLineItemConnection getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(RefundLineItemConnection refundLineItems) {
    this.refundLineItems = refundLineItems;
  }

  /**
   * The `RefundShippingLine` resources attached to the refund.
   */
  public RefundShippingLineConnection getRefundShippingLines() {
    return refundShippingLines;
  }

  public void setRefundShippingLines(RefundShippingLineConnection refundShippingLines) {
    this.refundShippingLines = refundShippingLines;
  }

  /**
   * The return associated with the refund.
   */
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
  }

  /**
   * The staff member who created the refund.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The total amount across all transactions for the refund.
   */
  public MoneyV2 getTotalRefunded() {
    return totalRefunded;
  }

  public void setTotalRefunded(MoneyV2 totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  /**
   * The total amount across all transactions for the refund, in shop and presentment currencies.
   */
  public MoneyBag getTotalRefundedSet() {
    return totalRefundedSet;
  }

  public void setTotalRefundedSet(MoneyBag totalRefundedSet) {
    this.totalRefundedSet = totalRefundedSet;
  }

  /**
   * The transactions associated with the refund.
   */
  public OrderTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(OrderTransactionConnection transactions) {
    this.transactions = transactions;
  }

  /**
   * The date and time when the refund was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Refund{createdAt='" + createdAt + "', duties='" + duties + "', id='" + id + "', legacyResourceId='" + legacyResourceId + "', note='" + note + "', order='" + order + "', orderAdjustments='" + orderAdjustments + "', refundLineItems='" + refundLineItems + "', refundShippingLines='" + refundShippingLines + "', return='" + _return + "', staffMember='" + staffMember + "', totalRefunded='" + totalRefunded + "', totalRefundedSet='" + totalRefundedSet + "', transactions='" + transactions + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Refund that = (Refund) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(duties, that.duties) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(order, that.order) &&
        Objects.equals(orderAdjustments, that.orderAdjustments) &&
        Objects.equals(refundLineItems, that.refundLineItems) &&
        Objects.equals(refundShippingLines, that.refundShippingLines) &&
        Objects.equals(_return, that._return) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(totalRefunded, that.totalRefunded) &&
        Objects.equals(totalRefundedSet, that.totalRefundedSet) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, duties, id, legacyResourceId, note, order, orderAdjustments, refundLineItems, refundShippingLines, _return, staffMember, totalRefunded, totalRefundedSet, transactions, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the refund was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A list of the refunded duties as part of this refund.
     */
    private List<RefundDuty> duties;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The optional note associated with the refund.
     */
    private String note;

    /**
     * The order associated with the refund.
     */
    private Order order;

    /**
     * The order adjustments that are attached with the refund.
     */
    private OrderAdjustmentConnection orderAdjustments;

    /**
     * The `RefundLineItem` resources attached to the refund.
     */
    private RefundLineItemConnection refundLineItems;

    /**
     * The `RefundShippingLine` resources attached to the refund.
     */
    private RefundShippingLineConnection refundShippingLines;

    /**
     * The return associated with the refund.
     */
    private Return _return;

    /**
     * The staff member who created the refund.
     */
    private StaffMember staffMember;

    /**
     * The total amount across all transactions for the refund.
     */
    private MoneyV2 totalRefunded;

    /**
     * The total amount across all transactions for the refund, in shop and presentment currencies.
     */
    private MoneyBag totalRefundedSet;

    /**
     * The transactions associated with the refund.
     */
    private OrderTransactionConnection transactions;

    /**
     * The date and time when the refund was updated.
     */
    private OffsetDateTime updatedAt;

    public Refund build() {
      Refund result = new Refund();
      result.createdAt = this.createdAt;
      result.duties = this.duties;
      result.id = this.id;
      result.legacyResourceId = this.legacyResourceId;
      result.note = this.note;
      result.order = this.order;
      result.orderAdjustments = this.orderAdjustments;
      result.refundLineItems = this.refundLineItems;
      result.refundShippingLines = this.refundShippingLines;
      result._return = this._return;
      result.staffMember = this.staffMember;
      result.totalRefunded = this.totalRefunded;
      result.totalRefundedSet = this.totalRefundedSet;
      result.transactions = this.transactions;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the refund was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A list of the refunded duties as part of this refund.
     */
    public Builder duties(List<RefundDuty> duties) {
      this.duties = duties;
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
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The optional note associated with the refund.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The order associated with the refund.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The order adjustments that are attached with the refund.
     */
    public Builder orderAdjustments(OrderAdjustmentConnection orderAdjustments) {
      this.orderAdjustments = orderAdjustments;
      return this;
    }

    /**
     * The `RefundLineItem` resources attached to the refund.
     */
    public Builder refundLineItems(RefundLineItemConnection refundLineItems) {
      this.refundLineItems = refundLineItems;
      return this;
    }

    /**
     * The `RefundShippingLine` resources attached to the refund.
     */
    public Builder refundShippingLines(RefundShippingLineConnection refundShippingLines) {
      this.refundShippingLines = refundShippingLines;
      return this;
    }

    /**
     * The return associated with the refund.
     */
    public Builder _return(Return _return) {
      this._return = _return;
      return this;
    }

    /**
     * The staff member who created the refund.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The total amount across all transactions for the refund.
     */
    public Builder totalRefunded(MoneyV2 totalRefunded) {
      this.totalRefunded = totalRefunded;
      return this;
    }

    /**
     * The total amount across all transactions for the refund, in shop and presentment currencies.
     */
    public Builder totalRefundedSet(MoneyBag totalRefundedSet) {
      this.totalRefundedSet = totalRefundedSet;
      return this;
    }

    /**
     * The transactions associated with the refund.
     */
    public Builder transactions(OrderTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * The date and time when the refund was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
