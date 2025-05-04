package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents an issued gift card.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GiftCard implements com.shopify.admin.types.Node {
  /**
   * The gift card's remaining balance.
   */
  private MoneyV2 balance;

  /**
   * The date and time at which the gift card was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The customer who will receive the gift card.
   */
  private Customer customer;

  /**
   * The date and time at which the gift card was deactivated.
   */
  private OffsetDateTime deactivatedAt;

  /**
   * Whether the gift card is enabled.
   */
  private boolean enabled;

  /**
   * The date at which the gift card will expire.
   */
  private LocalDate expiresOn;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The initial value of the gift card.
   */
  private MoneyV2 initialValue;

  /**
   * The final four characters of the gift card code.
   */
  private String lastCharacters;

  /**
   * The gift card code. Everything but the final four characters is masked.
   */
  private String maskedCode;

  /**
   * The note associated with the gift card, which isn't visible to the customer.
   */
  private String note;

  /**
   * The order associated with the gift card. This value is `null` if the gift card was issued manually.
   */
  private Order order;

  /**
   * The recipient who will receive the gift card.
   */
  private GiftCardRecipient recipientAttributes;

  /**
   * The theme template used to render the gift card online.
   */
  private String templateSuffix;

  /**
   * The transaction history of the gift card.
   */
  private GiftCardTransactionConnection transactions;

  /**
   * The date and time at which the gift card was updated.
   */
  private OffsetDateTime updatedAt;

  public GiftCard() {
  }

  /**
   * The gift card's remaining balance.
   */
  public MoneyV2 getBalance() {
    return balance;
  }

  public void setBalance(MoneyV2 balance) {
    this.balance = balance;
  }

  /**
   * The date and time at which the gift card was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The customer who will receive the gift card.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The date and time at which the gift card was deactivated.
   */
  public OffsetDateTime getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(OffsetDateTime deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }

  /**
   * Whether the gift card is enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The date at which the gift card will expire.
   */
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
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
   * The initial value of the gift card.
   */
  public MoneyV2 getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(MoneyV2 initialValue) {
    this.initialValue = initialValue;
  }

  /**
   * The final four characters of the gift card code.
   */
  public String getLastCharacters() {
    return lastCharacters;
  }

  public void setLastCharacters(String lastCharacters) {
    this.lastCharacters = lastCharacters;
  }

  /**
   * The gift card code. Everything but the final four characters is masked.
   */
  public String getMaskedCode() {
    return maskedCode;
  }

  public void setMaskedCode(String maskedCode) {
    this.maskedCode = maskedCode;
  }

  /**
   * The note associated with the gift card, which isn't visible to the customer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The order associated with the gift card. This value is `null` if the gift card was issued manually.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The recipient who will receive the gift card.
   */
  public GiftCardRecipient getRecipientAttributes() {
    return recipientAttributes;
  }

  public void setRecipientAttributes(GiftCardRecipient recipientAttributes) {
    this.recipientAttributes = recipientAttributes;
  }

  /**
   * The theme template used to render the gift card online.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  /**
   * The transaction history of the gift card.
   */
  public GiftCardTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(GiftCardTransactionConnection transactions) {
    this.transactions = transactions;
  }

  /**
   * The date and time at which the gift card was updated.
   */
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
    /**
     * The gift card's remaining balance.
     */
    private MoneyV2 balance;

    /**
     * The date and time at which the gift card was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The customer who will receive the gift card.
     */
    private Customer customer;

    /**
     * The date and time at which the gift card was deactivated.
     */
    private OffsetDateTime deactivatedAt;

    /**
     * Whether the gift card is enabled.
     */
    private boolean enabled;

    /**
     * The date at which the gift card will expire.
     */
    private LocalDate expiresOn;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The initial value of the gift card.
     */
    private MoneyV2 initialValue;

    /**
     * The final four characters of the gift card code.
     */
    private String lastCharacters;

    /**
     * The gift card code. Everything but the final four characters is masked.
     */
    private String maskedCode;

    /**
     * The note associated with the gift card, which isn't visible to the customer.
     */
    private String note;

    /**
     * The order associated with the gift card. This value is `null` if the gift card was issued manually.
     */
    private Order order;

    /**
     * The recipient who will receive the gift card.
     */
    private GiftCardRecipient recipientAttributes;

    /**
     * The theme template used to render the gift card online.
     */
    private String templateSuffix;

    /**
     * The transaction history of the gift card.
     */
    private GiftCardTransactionConnection transactions;

    /**
     * The date and time at which the gift card was updated.
     */
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

    /**
     * The gift card's remaining balance.
     */
    public Builder balance(MoneyV2 balance) {
      this.balance = balance;
      return this;
    }

    /**
     * The date and time at which the gift card was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The customer who will receive the gift card.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The date and time at which the gift card was deactivated.
     */
    public Builder deactivatedAt(OffsetDateTime deactivatedAt) {
      this.deactivatedAt = deactivatedAt;
      return this;
    }

    /**
     * Whether the gift card is enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The date at which the gift card will expire.
     */
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
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
     * The initial value of the gift card.
     */
    public Builder initialValue(MoneyV2 initialValue) {
      this.initialValue = initialValue;
      return this;
    }

    /**
     * The final four characters of the gift card code.
     */
    public Builder lastCharacters(String lastCharacters) {
      this.lastCharacters = lastCharacters;
      return this;
    }

    /**
     * The gift card code. Everything but the final four characters is masked.
     */
    public Builder maskedCode(String maskedCode) {
      this.maskedCode = maskedCode;
      return this;
    }

    /**
     * The note associated with the gift card, which isn't visible to the customer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The order associated with the gift card. This value is `null` if the gift card was issued manually.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The recipient who will receive the gift card.
     */
    public Builder recipientAttributes(GiftCardRecipient recipientAttributes) {
      this.recipientAttributes = recipientAttributes;
      return this;
    }

    /**
     * The theme template used to render the gift card online.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    /**
     * The transaction history of the gift card.
     */
    public Builder transactions(GiftCardTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * The date and time at which the gift card was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
