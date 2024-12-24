package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GiftCard implements com.shopify.types.Node {
  
  private MoneyV2 balance;

  
  private OffsetDateTime createdAt;

  
  private Customer customer;

  
  private OffsetDateTime deactivatedAt;

  
  private boolean enabled;

  
  private LocalDate expiresOn;

  
  private String id;

  
  private MoneyV2 initialValue;

  
  private String lastCharacters;

  
  private String maskedCode;

  
  private String note;

  
  private Order order;

  
  private GiftCardRecipient recipientAttributes;

  
  private String templateSuffix;

  
  private GiftCardTransactionConnection transactions;

  
  private OffsetDateTime updatedAt;

  public GiftCard() {
  }

  
  public MoneyV2 getBalance() {
    return balance;
  }

  public void setBalance(MoneyV2 balance) {
    this.balance = balance;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public OffsetDateTime getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(OffsetDateTime deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyV2 getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(MoneyV2 initialValue) {
    this.initialValue = initialValue;
  }

  
  public String getLastCharacters() {
    return lastCharacters;
  }

  public void setLastCharacters(String lastCharacters) {
    this.lastCharacters = lastCharacters;
  }

  
  public String getMaskedCode() {
    return maskedCode;
  }

  public void setMaskedCode(String maskedCode) {
    this.maskedCode = maskedCode;
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

  
  public GiftCardRecipient getRecipientAttributes() {
    return recipientAttributes;
  }

  public void setRecipientAttributes(GiftCardRecipient recipientAttributes) {
    this.recipientAttributes = recipientAttributes;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public GiftCardTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(GiftCardTransactionConnection transactions) {
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
    return "GiftCard{balance='" + balance + "', createdAt='" + createdAt + "', customer='" + customer + "', deactivatedAt='" + deactivatedAt + "', enabled='" + enabled + "', expiresOn='" + expiresOn + "', id='" + id + "', initialValue='" + initialValue + "', lastCharacters='" + lastCharacters + "', maskedCode='" + maskedCode + "', note='" + note + "', order='" + order + "', recipientAttributes='" + recipientAttributes + "', templateSuffix='" + templateSuffix + "', transactions='" + transactions + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCard that = (GiftCard) o;
    return Objects.equals(balance, that.balance) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(deactivatedAt, that.deactivatedAt) &&
        enabled == that.enabled &&
        Objects.equals(expiresOn, that.expiresOn) &&
        Objects.equals(id, that.id) &&
        Objects.equals(initialValue, that.initialValue) &&
        Objects.equals(lastCharacters, that.lastCharacters) &&
        Objects.equals(maskedCode, that.maskedCode) &&
        Objects.equals(note, that.note) &&
        Objects.equals(order, that.order) &&
        Objects.equals(recipientAttributes, that.recipientAttributes) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, createdAt, customer, deactivatedAt, enabled, expiresOn, id, initialValue, lastCharacters, maskedCode, note, order, recipientAttributes, templateSuffix, transactions, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 balance;

    
    private OffsetDateTime createdAt;

    
    private Customer customer;

    
    private OffsetDateTime deactivatedAt;

    
    private boolean enabled;

    
    private LocalDate expiresOn;

    
    private String id;

    
    private MoneyV2 initialValue;

    
    private String lastCharacters;

    
    private String maskedCode;

    
    private String note;

    
    private Order order;

    
    private GiftCardRecipient recipientAttributes;

    
    private String templateSuffix;

    
    private GiftCardTransactionConnection transactions;

    
    private OffsetDateTime updatedAt;

    public GiftCard build() {
      GiftCard result = new GiftCard();
      result.balance = this.balance;
      result.createdAt = this.createdAt;
      result.customer = this.customer;
      result.deactivatedAt = this.deactivatedAt;
      result.enabled = this.enabled;
      result.expiresOn = this.expiresOn;
      result.id = this.id;
      result.initialValue = this.initialValue;
      result.lastCharacters = this.lastCharacters;
      result.maskedCode = this.maskedCode;
      result.note = this.note;
      result.order = this.order;
      result.recipientAttributes = this.recipientAttributes;
      result.templateSuffix = this.templateSuffix;
      result.transactions = this.transactions;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder balance(MoneyV2 balance) {
      this.balance = balance;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder deactivatedAt(OffsetDateTime deactivatedAt) {
      this.deactivatedAt = deactivatedAt;
      return this;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder initialValue(MoneyV2 initialValue) {
      this.initialValue = initialValue;
      return this;
    }

    
    public Builder lastCharacters(String lastCharacters) {
      this.lastCharacters = lastCharacters;
      return this;
    }

    
    public Builder maskedCode(String maskedCode) {
      this.maskedCode = maskedCode;
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

    
    public Builder recipientAttributes(GiftCardRecipient recipientAttributes) {
      this.recipientAttributes = recipientAttributes;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder transactions(GiftCardTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
