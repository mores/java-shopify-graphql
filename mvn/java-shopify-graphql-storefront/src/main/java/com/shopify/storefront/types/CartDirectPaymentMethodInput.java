package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting direct payment method information for checkout.
 */
public class CartDirectPaymentMethodInput {
  /**
   * Indicates if the customer has accepted the subscription terms. Defaults to false.
   */
  private Boolean acceptedSubscriptionTerms = false;

  /**
   * The customer's billing address.
   */
  private MailingAddressInput billingAddress;

  /**
   * The source of the credit card payment.
   */
  private CartCardSource cardSource;

  /**
   * The session ID for the direct payment method used to create the payment.
   */
  private String sessionId;

  public CartDirectPaymentMethodInput() {
  }

  /**
   * Indicates if the customer has accepted the subscription terms. Defaults to false.
   */
  public Boolean getAcceptedSubscriptionTerms() {
    return acceptedSubscriptionTerms;
  }

  public void setAcceptedSubscriptionTerms(Boolean acceptedSubscriptionTerms) {
    this.acceptedSubscriptionTerms = acceptedSubscriptionTerms;
  }

  /**
   * The customer's billing address.
   */
  public MailingAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The source of the credit card payment.
   */
  public CartCardSource getCardSource() {
    return cardSource;
  }

  public void setCardSource(CartCardSource cardSource) {
    this.cardSource = cardSource;
  }

  /**
   * The session ID for the direct payment method used to create the payment.
   */
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  @Override
  public String toString() {
    return "CartDirectPaymentMethodInput{acceptedSubscriptionTerms='" + acceptedSubscriptionTerms + "', billingAddress='" + billingAddress + "', cardSource='" + cardSource + "', sessionId='" + sessionId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDirectPaymentMethodInput that = (CartDirectPaymentMethodInput) o;
    return Objects.equals(acceptedSubscriptionTerms, that.acceptedSubscriptionTerms) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(cardSource, that.cardSource) &&
        Objects.equals(sessionId, that.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedSubscriptionTerms, billingAddress, cardSource, sessionId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates if the customer has accepted the subscription terms. Defaults to false.
     */
    private Boolean acceptedSubscriptionTerms = false;

    /**
     * The customer's billing address.
     */
    private MailingAddressInput billingAddress;

    /**
     * The source of the credit card payment.
     */
    private CartCardSource cardSource;

    /**
     * The session ID for the direct payment method used to create the payment.
     */
    private String sessionId;

    public CartDirectPaymentMethodInput build() {
      CartDirectPaymentMethodInput result = new CartDirectPaymentMethodInput();
      result.acceptedSubscriptionTerms = this.acceptedSubscriptionTerms;
      result.billingAddress = this.billingAddress;
      result.cardSource = this.cardSource;
      result.sessionId = this.sessionId;
      return result;
    }

    /**
     * Indicates if the customer has accepted the subscription terms. Defaults to false.
     */
    public Builder acceptedSubscriptionTerms(Boolean acceptedSubscriptionTerms) {
      this.acceptedSubscriptionTerms = acceptedSubscriptionTerms;
      return this;
    }

    /**
     * The customer's billing address.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The source of the credit card payment.
     */
    public Builder cardSource(CartCardSource cardSource) {
      this.cardSource = cardSource;
      return this;
    }

    /**
     * The session ID for the direct payment method used to create the payment.
     */
    public Builder sessionId(String sessionId) {
      this.sessionId = sessionId;
      return this;
    }
  }
}
