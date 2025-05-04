package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A customer's payment method.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerPaymentMethod implements com.shopify.admin.types.Node {
  /**
   * The customer to whom the payment method belongs.
   */
  private Customer customer;

  /**
   * The ID of this payment method.
   */
  private String id;

  /**
   * The instrument for this payment method.
   */
  private CustomerPaymentInstrument instrument;

  /**
   * The time that the payment method was revoked.
   */
  private OffsetDateTime revokedAt;

  /**
   * The revocation reason for this payment method.
   */
  private CustomerPaymentMethodRevocationReason revokedReason;

  /**
   * List Subscription Contracts.
   */
  private SubscriptionContractConnection subscriptionContracts;

  public CustomerPaymentMethod() {
  }

  /**
   * The customer to whom the payment method belongs.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The ID of this payment method.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The instrument for this payment method.
   */
  public CustomerPaymentInstrument getInstrument() {
    return instrument;
  }

  public void setInstrument(CustomerPaymentInstrument instrument) {
    this.instrument = instrument;
  }

  /**
   * The time that the payment method was revoked.
   */
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }

  /**
   * The revocation reason for this payment method.
   */
  public CustomerPaymentMethodRevocationReason getRevokedReason() {
    return revokedReason;
  }

  public void setRevokedReason(CustomerPaymentMethodRevocationReason revokedReason) {
    this.revokedReason = revokedReason;
  }

  /**
   * List Subscription Contracts.
   */
  public SubscriptionContractConnection getSubscriptionContracts() {
    return subscriptionContracts;
  }

  public void setSubscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
    this.subscriptionContracts = subscriptionContracts;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethod{customer='" + customer + "', id='" + id + "', instrument='" + instrument + "', revokedAt='" + revokedAt + "', revokedReason='" + revokedReason + "', subscriptionContracts='" + subscriptionContracts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethod that = (CustomerPaymentMethod) o;
    return Objects.equals(customer, that.customer) &&
        Objects.equals(id, that.id) &&
        Objects.equals(instrument, that.instrument) &&
        Objects.equals(revokedAt, that.revokedAt) &&
        Objects.equals(revokedReason, that.revokedReason) &&
        Objects.equals(subscriptionContracts, that.subscriptionContracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, id, instrument, revokedAt, revokedReason, subscriptionContracts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer to whom the payment method belongs.
     */
    private Customer customer;

    /**
     * The ID of this payment method.
     */
    private String id;

    /**
     * The instrument for this payment method.
     */
    private CustomerPaymentInstrument instrument;

    /**
     * The time that the payment method was revoked.
     */
    private OffsetDateTime revokedAt;

    /**
     * The revocation reason for this payment method.
     */
    private CustomerPaymentMethodRevocationReason revokedReason;

    /**
     * List Subscription Contracts.
     */
    private SubscriptionContractConnection subscriptionContracts;

    public CustomerPaymentMethod build() {
      CustomerPaymentMethod result = new CustomerPaymentMethod();
      result.customer = this.customer;
      result.id = this.id;
      result.instrument = this.instrument;
      result.revokedAt = this.revokedAt;
      result.revokedReason = this.revokedReason;
      result.subscriptionContracts = this.subscriptionContracts;
      return result;
    }

    /**
     * The customer to whom the payment method belongs.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The ID of this payment method.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The instrument for this payment method.
     */
    public Builder instrument(CustomerPaymentInstrument instrument) {
      this.instrument = instrument;
      return this;
    }

    /**
     * The time that the payment method was revoked.
     */
    public Builder revokedAt(OffsetDateTime revokedAt) {
      this.revokedAt = revokedAt;
      return this;
    }

    /**
     * The revocation reason for this payment method.
     */
    public Builder revokedReason(CustomerPaymentMethodRevocationReason revokedReason) {
      this.revokedReason = revokedReason;
      return this;
    }

    /**
     * List Subscription Contracts.
     */
    public Builder subscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
      this.subscriptionContracts = subscriptionContracts;
      return this;
    }
  }
}
