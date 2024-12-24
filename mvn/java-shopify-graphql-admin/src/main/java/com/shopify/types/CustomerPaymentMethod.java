package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerPaymentMethod implements com.shopify.types.Node {
  
  private Customer customer;

  
  private String id;

  
  private CustomerPaymentInstrument instrument;

  
  private OffsetDateTime revokedAt;

  
  private CustomerPaymentMethodRevocationReason revokedReason;

  
  private SubscriptionContractConnection subscriptionContracts;

  public CustomerPaymentMethod() {
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public CustomerPaymentInstrument getInstrument() {
    return instrument;
  }

  public void setInstrument(CustomerPaymentInstrument instrument) {
    this.instrument = instrument;
  }

  
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }

  
  public CustomerPaymentMethodRevocationReason getRevokedReason() {
    return revokedReason;
  }

  public void setRevokedReason(CustomerPaymentMethodRevocationReason revokedReason) {
    this.revokedReason = revokedReason;
  }

  
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
    
    private Customer customer;

    
    private String id;

    
    private CustomerPaymentInstrument instrument;

    
    private OffsetDateTime revokedAt;

    
    private CustomerPaymentMethodRevocationReason revokedReason;

    
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

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder instrument(CustomerPaymentInstrument instrument) {
      this.instrument = instrument;
      return this;
    }

    
    public Builder revokedAt(OffsetDateTime revokedAt) {
      this.revokedAt = revokedAt;
      return this;
    }

    
    public Builder revokedReason(CustomerPaymentMethodRevocationReason revokedReason) {
      this.revokedReason = revokedReason;
      return this;
    }

    
    public Builder subscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
      this.subscriptionContracts = subscriptionContracts;
      return this;
    }
  }
}
