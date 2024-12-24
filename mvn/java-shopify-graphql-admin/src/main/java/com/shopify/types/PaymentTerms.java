package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentTerms implements com.shopify.types.Node {
  
  private DraftOrder draftOrder;

  
  private Integer dueInDays;

  
  private String id;

  
  private Order order;

  
  private boolean overdue;

  
  private PaymentScheduleConnection paymentSchedules;

  
  private String paymentTermsName;

  
  private PaymentTermsType paymentTermsType;

  
  private String translatedName;

  public PaymentTerms() {
  }

  
  public DraftOrder getDraftOrder() {
    return draftOrder;
  }

  public void setDraftOrder(DraftOrder draftOrder) {
    this.draftOrder = draftOrder;
  }

  
  public Integer getDueInDays() {
    return dueInDays;
  }

  public void setDueInDays(Integer dueInDays) {
    this.dueInDays = dueInDays;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public boolean getOverdue() {
    return overdue;
  }

  public void setOverdue(boolean overdue) {
    this.overdue = overdue;
  }

  
  public PaymentScheduleConnection getPaymentSchedules() {
    return paymentSchedules;
  }

  public void setPaymentSchedules(PaymentScheduleConnection paymentSchedules) {
    this.paymentSchedules = paymentSchedules;
  }

  
  public String getPaymentTermsName() {
    return paymentTermsName;
  }

  public void setPaymentTermsName(String paymentTermsName) {
    this.paymentTermsName = paymentTermsName;
  }

  
  public PaymentTermsType getPaymentTermsType() {
    return paymentTermsType;
  }

  public void setPaymentTermsType(PaymentTermsType paymentTermsType) {
    this.paymentTermsType = paymentTermsType;
  }

  
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "PaymentTerms{draftOrder='" + draftOrder + "', dueInDays='" + dueInDays + "', id='" + id + "', order='" + order + "', overdue='" + overdue + "', paymentSchedules='" + paymentSchedules + "', paymentTermsName='" + paymentTermsName + "', paymentTermsType='" + paymentTermsType + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTerms that = (PaymentTerms) o;
    return Objects.equals(draftOrder, that.draftOrder) &&
        Objects.equals(dueInDays, that.dueInDays) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        overdue == that.overdue &&
        Objects.equals(paymentSchedules, that.paymentSchedules) &&
        Objects.equals(paymentTermsName, that.paymentTermsName) &&
        Objects.equals(paymentTermsType, that.paymentTermsType) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftOrder, dueInDays, id, order, overdue, paymentSchedules, paymentTermsName, paymentTermsType, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DraftOrder draftOrder;

    
    private Integer dueInDays;

    
    private String id;

    
    private Order order;

    
    private boolean overdue;

    
    private PaymentScheduleConnection paymentSchedules;

    
    private String paymentTermsName;

    
    private PaymentTermsType paymentTermsType;

    
    private String translatedName;

    public PaymentTerms build() {
      PaymentTerms result = new PaymentTerms();
      result.draftOrder = this.draftOrder;
      result.dueInDays = this.dueInDays;
      result.id = this.id;
      result.order = this.order;
      result.overdue = this.overdue;
      result.paymentSchedules = this.paymentSchedules;
      result.paymentTermsName = this.paymentTermsName;
      result.paymentTermsType = this.paymentTermsType;
      result.translatedName = this.translatedName;
      return result;
    }

    
    public Builder draftOrder(DraftOrder draftOrder) {
      this.draftOrder = draftOrder;
      return this;
    }

    
    public Builder dueInDays(Integer dueInDays) {
      this.dueInDays = dueInDays;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder overdue(boolean overdue) {
      this.overdue = overdue;
      return this;
    }

    
    public Builder paymentSchedules(PaymentScheduleConnection paymentSchedules) {
      this.paymentSchedules = paymentSchedules;
      return this;
    }

    
    public Builder paymentTermsName(String paymentTermsName) {
      this.paymentTermsName = paymentTermsName;
      return this;
    }

    
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      return this;
    }

    
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
