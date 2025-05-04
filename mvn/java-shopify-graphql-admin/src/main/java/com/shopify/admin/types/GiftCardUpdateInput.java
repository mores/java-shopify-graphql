package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * The input fields to update a gift card.
 */
public class GiftCardUpdateInput {
  /**
   * The note associated with the gift card, which isn't visible to the customer.
   */
  private String note;

  /**
   * The date at which the gift card will expire. If set to `null`, then the gift card will never expire.
   */
  private LocalDate expiresOn;

  /**
   * The ID of the customer who will receive the gift card. The ID can't be changed
   * if the gift card already has an assigned customer ID.
   */
  private String customerId;

  /**
   * The recipient attributes of the gift card.
   */
  private GiftCardRecipientInput recipientAttributes;

  /**
   * The suffix of the Liquid template that's used to render the gift card online.
   * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
   */
  private String templateSuffix;

  public GiftCardUpdateInput() {
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
   * The date at which the gift card will expire. If set to `null`, then the gift card will never expire.
   */
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
  }

  /**
   * The ID of the customer who will receive the gift card. The ID can't be changed
   * if the gift card already has an assigned customer ID.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
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
   */
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public String toString() {
    return "GiftCardUpdateInput{note='" + note + "', expiresOn='" + expiresOn + "', customerId='" + customerId + "', recipientAttributes='" + recipientAttributes + "', templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardUpdateInput that = (GiftCardUpdateInput) o;
    return Objects.equals(note, that.note) &&
        Objects.equals(expiresOn, that.expiresOn) &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(recipientAttributes, that.recipientAttributes) &&
        Objects.equals(templateSuffix, that.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, expiresOn, customerId, recipientAttributes, templateSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The note associated with the gift card, which isn't visible to the customer.
     */
    private String note;

    /**
     * The date at which the gift card will expire. If set to `null`, then the gift card will never expire.
     */
    private LocalDate expiresOn;

    /**
     * The ID of the customer who will receive the gift card. The ID can't be changed
     * if the gift card already has an assigned customer ID.
     */
    private String customerId;

    /**
     * The recipient attributes of the gift card.
     */
    private GiftCardRecipientInput recipientAttributes;

    /**
     * The suffix of the Liquid template that's used to render the gift card online.
     * For example, if the value is `birthday`, then the gift card is rendered using the template `gift_card.birthday.liquid`.
     */
    private String templateSuffix;

    public GiftCardUpdateInput build() {
      GiftCardUpdateInput result = new GiftCardUpdateInput();
      result.note = this.note;
      result.expiresOn = this.expiresOn;
      result.customerId = this.customerId;
      result.recipientAttributes = this.recipientAttributes;
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    /**
     * The note associated with the gift card, which isn't visible to the customer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The date at which the gift card will expire. If set to `null`, then the gift card will never expire.
     */
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
      return this;
    }

    /**
     * The ID of the customer who will receive the gift card. The ID can't be changed
     * if the gift card already has an assigned customer ID.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
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
     */
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }
  }
}
