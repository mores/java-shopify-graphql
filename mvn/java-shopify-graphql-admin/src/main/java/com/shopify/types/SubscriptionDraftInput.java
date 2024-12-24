package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class SubscriptionDraftInput {
  
  private SubscriptionContractSubscriptionStatus status;

  
  private String paymentMethodId;

  
  private OffsetDateTime nextBillingDate;

  
  private SubscriptionBillingPolicyInput billingPolicy;

  
  private SubscriptionDeliveryPolicyInput deliveryPolicy;

  
  private String deliveryPrice;

  
  private SubscriptionDeliveryMethodInput deliveryMethod;

  
  private String note;

  
  private List<AttributeInput> customAttributes;

  public SubscriptionDraftInput() {
  }

  
  public SubscriptionContractSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionContractSubscriptionStatus status) {
    this.status = status;
  }

  
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  
  public SubscriptionBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  
  public SubscriptionDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  
  public String getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(String deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  
  public SubscriptionDeliveryMethodInput getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionDeliveryMethodInput deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftInput{status='" + status + "', paymentMethodId='" + paymentMethodId + "', nextBillingDate='" + nextBillingDate + "', billingPolicy='" + billingPolicy + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', deliveryMethod='" + deliveryMethod + "', note='" + note + "', customAttributes='" + customAttributes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftInput that = (SubscriptionDraftInput) o;
    return Objects.equals(status, that.status) &&
        Objects.equals(paymentMethodId, that.paymentMethodId) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(note, that.note) &&
        Objects.equals(customAttributes, that.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, paymentMethodId, nextBillingDate, billingPolicy, deliveryPolicy, deliveryPrice, deliveryMethod, note, customAttributes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionContractSubscriptionStatus status;

    
    private String paymentMethodId;

    
    private OffsetDateTime nextBillingDate;

    
    private SubscriptionBillingPolicyInput billingPolicy;

    
    private SubscriptionDeliveryPolicyInput deliveryPolicy;

    
    private String deliveryPrice;

    
    private SubscriptionDeliveryMethodInput deliveryMethod;

    
    private String note;

    
    private List<AttributeInput> customAttributes;

    public SubscriptionDraftInput build() {
      SubscriptionDraftInput result = new SubscriptionDraftInput();
      result.status = this.status;
      result.paymentMethodId = this.paymentMethodId;
      result.nextBillingDate = this.nextBillingDate;
      result.billingPolicy = this.billingPolicy;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.deliveryMethod = this.deliveryMethod;
      result.note = this.note;
      result.customAttributes = this.customAttributes;
      return result;
    }

    
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }

    
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    
    public Builder billingPolicy(SubscriptionBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    
    public Builder deliveryPolicy(SubscriptionDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    
    public Builder deliveryPrice(String deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    
    public Builder deliveryMethod(SubscriptionDeliveryMethodInput deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }
  }
}
