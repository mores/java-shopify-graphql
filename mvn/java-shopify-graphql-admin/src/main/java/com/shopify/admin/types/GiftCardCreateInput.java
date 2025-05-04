package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * The input fields to issue a gift card.
 */
public class GiftCardCreateInput {
  /**
   * The initial value of the gift card.
   */
  private String initialValue;

  /**
   * The gift card's code. It must be 8-20 characters long and contain only letters(a-z) and numbers(0-9).
   * It isn't case sensitive. If not provided, then a random code will be generated.
   */
  private String code;

  /**
   * The ID of the customer who will receive the gift card. Requires `write_customers` access_scope.
   */
  private String customerId;

  /**
   * The date at which the gift card will expire. If not provided, then the gift card will never expire.
   */
  private LocalDate expiresOn;

  /**
   * The note associated with the gift card, which isn't visible to the customer.
   */
  private String note;

  /**
   * The recipient attributes of the gift card.
   */
  private GiftCardRecipientInput recipientAttributes;

  /**
   * The suffix of the Liquid template that's used to render the gift card online.
   * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
   * If not provided, then the default `gift_card.liquid` template is used.
   */
  private String templateSuffix;

  public GiftCardCreateInput() {
  }

  /**
   * The initial value of the gift card.
   */
  public String getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }

  /**
   * The gift card's code. It must be 8-20 characters long and contain only letters(a-z) and numbers(0-9).
   * It isn't case sensitive. If not provided, then a random code will be generated.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The ID of the customer who will receive the gift card. Requires `write_customers` access_scope.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The date at which the gift card will expire. If not provided, then the gift card will never expire.
   */
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
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
   * The recipient attributes of the gift card.
   */
  public GiftCardRecipientInput getRecipientAttributes() {
    return recipientAttributes;
  }

  public void setRecipientAttributes(GiftCardRecipientInput recipientAttributes) {
    this.recipientAttributes = recipientAttributes;
  }

  /**
   * The suffix of the Liquid template that's used to render the gift card online.
   * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
   * If not provided, then the default `gift_card.liquid` template is used.
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public String toString() {
    return "GiftCardCreateInput{initialValue='" + initialValue + "', code='" + code + "', customerId='" + customerId + "', expiresOn='" + expiresOn + "', note='" + note + "', recipientAttributes='" + recipientAttributes + "', templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardCreateInput that = (GiftCardCreateInput) o;
    return Objects.equals(initialValue, that.initialValue) &&
        Objects.equals(code, that.code) &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(expiresOn, that.expiresOn) &&
        Objects.equals(note, that.note) &&
        Objects.equals(recipientAttributes, that.recipientAttributes) &&
        Objects.equals(templateSuffix, that.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialValue, code, customerId, expiresOn, note, recipientAttributes, templateSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The initial value of the gift card.
     */
    private String initialValue;

    /**
     * The gift card's code. It must be 8-20 characters long and contain only letters(a-z) and numbers(0-9).
     * It isn't case sensitive. If not provided, then a random code will be generated.
     */
    private String code;

    /**
     * The ID of the customer who will receive the gift card. Requires `write_customers` access_scope.
     */
    private String customerId;

    /**
     * The date at which the gift card will expire. If not provided, then the gift card will never expire.
     */
    private LocalDate expiresOn;

    /**
     * The note associated with the gift card, which isn't visible to the customer.
     */
    private String note;

    /**
     * The recipient attributes of the gift card.
     */
    private GiftCardRecipientInput recipientAttributes;

    /**
     * The suffix of the Liquid template that's used to render the gift card online.
     * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
     * If not provided, then the default `gift_card.liquid` template is used.
     */
    private String templateSuffix;

    public GiftCardCreateInput build() {
      GiftCardCreateInput result = new GiftCardCreateInput();
      result.initialValue = this.initialValue;
      result.code = this.code;
      result.customerId = this.customerId;
      result.expiresOn = this.expiresOn;
      result.note = this.note;
      result.recipientAttributes = this.recipientAttributes;
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    /**
     * The initial value of the gift card.
     */
    public Builder initialValue(String initialValue) {
      this.initialValue = initialValue;
      return this;
    }

    /**
     * The gift card's code. It must be 8-20 characters long and contain only letters(a-z) and numbers(0-9).
     * It isn't case sensitive. If not provided, then a random code will be generated.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The ID of the customer who will receive the gift card. Requires `write_customers` access_scope.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The date at which the gift card will expire. If not provided, then the gift card will never expire.
     */
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
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
     * The recipient attributes of the gift card.
     */
    public Builder recipientAttributes(GiftCardRecipientInput recipientAttributes) {
      this.recipientAttributes = recipientAttributes;
      return this;
    }

    /**
     * The suffix of the Liquid template that's used to render the gift card online.
     * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
     * If not provided, then the default `gift_card.liquid` template is used.
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }
  }
}
