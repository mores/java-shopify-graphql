package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a Subscription Draft.
 */
public class SubscriptionDraftInput {
  /**
   * The current status of the subscription contract.
   */
  private SubscriptionContractSubscriptionStatus status;

  /**
   * The ID of the payment method to be used for the subscription contract.
   */
  private String paymentMethodId;

  /**
   * The next billing date for the subscription contract.
   */
  private OffsetDateTime nextBillingDate;

  /**
   * The billing policy for the subscription contract.
   */
  private SubscriptionBillingPolicyInput billingPolicy;

  /**
   * The delivery policy for the subscription contract.
   */
  private SubscriptionDeliveryPolicyInput deliveryPolicy;

  /**
   * The shipping price for each renewal the subscription contract.
   */
  private String deliveryPrice;

  /**
   * The delivery method for the subscription contract.
   */
  private SubscriptionDeliveryMethodInput deliveryMethod;

  /**
   * The note field that will be applied to the generated orders.
   */
  private String note;

  /**
   * A list of the custom attributes added to the subscription contract.
   */
  private List<AttributeInput> customAttributes;

  public SubscriptionDraftInput() {
  }

  /**
   * The current status of the subscription contract.
   */
  public SubscriptionContractSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionContractSubscriptionStatus status) {
    this.status = status;
  }

  /**
   * The ID of the payment method to be used for the subscription contract.
   */
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  /**
   * The next billing date for the subscription contract.
   */
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  /**
   * The billing policy for the subscription contract.
   */
  public SubscriptionBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The delivery policy for the subscription contract.
   */
  public SubscriptionDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The shipping price for each renewal the subscription contract.
   */
  public String getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(String deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  /**
   * The delivery method for the subscription contract.
   */
  public SubscriptionDeliveryMethodInput getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionDeliveryMethodInput deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The note field that will be applied to the generated orders.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * A list of the custom attributes added to the subscription contract.
   */
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
    /**
     * The current status of the subscription contract.
     */
    private SubscriptionContractSubscriptionStatus status;

    /**
     * The ID of the payment method to be used for the subscription contract.
     */
    private String paymentMethodId;

    /**
     * The next billing date for the subscription contract.
     */
    private OffsetDateTime nextBillingDate;

    /**
     * The billing policy for the subscription contract.
     */
    private SubscriptionBillingPolicyInput billingPolicy;

    /**
     * The delivery policy for the subscription contract.
     */
    private SubscriptionDeliveryPolicyInput deliveryPolicy;

    /**
     * The shipping price for each renewal the subscription contract.
     */
    private String deliveryPrice;

    /**
     * The delivery method for the subscription contract.
     */
    private SubscriptionDeliveryMethodInput deliveryMethod;

    /**
     * The note field that will be applied to the generated orders.
     */
    private String note;

    /**
     * A list of the custom attributes added to the subscription contract.
     */
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

    /**
     * The current status of the subscription contract.
     */
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The ID of the payment method to be used for the subscription contract.
     */
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }

    /**
     * The next billing date for the subscription contract.
     */
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    /**
     * The billing policy for the subscription contract.
     */
    public Builder billingPolicy(SubscriptionBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The delivery policy for the subscription contract.
     */
    public Builder deliveryPolicy(SubscriptionDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The shipping price for each renewal the subscription contract.
     */
    public Builder deliveryPrice(String deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    /**
     * The delivery method for the subscription contract.
     */
    public Builder deliveryMethod(SubscriptionDeliveryMethodInput deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The note field that will be applied to the generated orders.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * A list of the custom attributes added to the subscription contract.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }
  }
}
