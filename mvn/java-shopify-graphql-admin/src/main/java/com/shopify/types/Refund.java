package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Refund implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private List<RefundDuty> duties;

  
  private String id;

  
  private String legacyResourceId;

  
  private String note;

  
  private Order order;

  
  private OrderAdjustmentConnection orderAdjustments;

  
  private RefundLineItemConnection refundLineItems;

  
  private RefundShippingLineConnection refundShippingLines;

  
  private Return _return;

  
  private StaffMember staffMember;

  
  private MoneyV2 totalRefunded;

  
  private MoneyBag totalRefundedSet;

  
  private OrderTransactionConnection transactions;

  
  private OffsetDateTime updatedAt;

  public Refund() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public List<RefundDuty> getDuties() {
    return duties;
  }

  public void setDuties(List<RefundDuty> duties) {
    this.duties = duties;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public OrderAdjustmentConnection getOrderAdjustments() {
    return orderAdjustments;
  }

  public void setOrderAdjustments(OrderAdjustmentConnection orderAdjustments) {
    this.orderAdjustments = orderAdjustments;
  }

  
  public RefundLineItemConnection getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(RefundLineItemConnection refundLineItems) {
    this.refundLineItems = refundLineItems;
  }

  
  public RefundShippingLineConnection getRefundShippingLines() {
    return refundShippingLines;
  }

  public void setRefundShippingLines(RefundShippingLineConnection refundShippingLines) {
    this.refundShippingLines = refundShippingLines;
  }

  
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  
  public MoneyV2 getTotalRefunded() {
    return totalRefunded;
  }

  public void setTotalRefunded(MoneyV2 totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  
  public MoneyBag getTotalRefundedSet() {
    return totalRefundedSet;
  }

  public void setTotalRefundedSet(MoneyBag totalRefundedSet) {
    this.totalRefundedSet = totalRefundedSet;
  }

  
  public OrderTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(OrderTransactionConnection transactions) {
    this.transactions = transactions;
  }

  
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
    
    private OffsetDateTime createdAt;

    
    private List<RefundDuty> duties;

    
    private String id;

    
    private String legacyResourceId;

    
    private String note;

    
    private Order order;

    
    private OrderAdjustmentConnection orderAdjustments;

    
    private RefundLineItemConnection refundLineItems;

    
    private RefundShippingLineConnection refundShippingLines;

    
    private Return _return;

    
    private StaffMember staffMember;

    
    private MoneyV2 totalRefunded;

    
    private MoneyBag totalRefundedSet;

    
    private OrderTransactionConnection transactions;

    
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

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder duties(List<RefundDuty> duties) {
      this.duties = duties;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder orderAdjustments(OrderAdjustmentConnection orderAdjustments) {
      this.orderAdjustments = orderAdjustments;
      return this;
    }

    
    public Builder refundLineItems(RefundLineItemConnection refundLineItems) {
      this.refundLineItems = refundLineItems;
      return this;
    }

    
    public Builder refundShippingLines(RefundShippingLineConnection refundShippingLines) {
      this.refundShippingLines = refundShippingLines;
      return this;
    }

    
    public Builder _return(Return _return) {
      this._return = _return;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    
    public Builder totalRefunded(MoneyV2 totalRefunded) {
      this.totalRefunded = totalRefunded;
      return this;
    }

    
    public Builder totalRefundedSet(MoneyBag totalRefundedSet) {
      this.totalRefundedSet = totalRefundedSet;
      return this;
    }

    
    public Builder transactions(OrderTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
