package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The selected delivery option on a subscription contract.
 */
public class SubscriptionDeliveryMethodLocalDeliveryOption {
  /**
   * A custom reference to the delivery method for use with automations.
   */
  private String code;

  /**
   * The details displayed to the customer to describe the local delivery option.
   */
  private String description;

  /**
   * The delivery instructions that the customer can provide to the merchant.
   */
  private String instructions;

  /**
   * The phone number that the customer provided to the merchant.
   * Formatted using E.164 standard. For example, `+16135551111`.
   */
  private String phone;

  /**
   * The presentment title of the local delivery option.
   */
  private String presentmentTitle;

  /**
   * The title of the local delivery option.
   */
  private String title;

  public SubscriptionDeliveryMethodLocalDeliveryOption() {
  }

  /**
   * A custom reference to the delivery method for use with automations.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The details displayed to the customer to describe the local delivery option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The delivery instructions that the customer can provide to the merchant.
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The phone number that the customer provided to the merchant.
   * Formatted using E.164 standard. For example, `+16135551111`.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The presentment title of the local delivery option.
   */
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  /**
   * The title of the local delivery option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodLocalDeliveryOption{code='" + code + "', description='" + description + "', instructions='" + instructions + "', phone='" + phone + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodLocalDeliveryOption that = (SubscriptionDeliveryMethodLocalDeliveryOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(instructions, that.instructions) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, instructions, phone, presentmentTitle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A custom reference to the delivery method for use with automations.
     */
    private String code;

    /**
     * The details displayed to the customer to describe the local delivery option.
     */
    private String description;

    /**
     * The delivery instructions that the customer can provide to the merchant.
     */
    private String instructions;

    /**
     * The phone number that the customer provided to the merchant.
     * Formatted using E.164 standard. For example, `+16135551111`.
     */
    private String phone;

    /**
     * The presentment title of the local delivery option.
     */
    private String presentmentTitle;

    /**
     * The title of the local delivery option.
     */
    private String title;

    public SubscriptionDeliveryMethodLocalDeliveryOption build() {
      SubscriptionDeliveryMethodLocalDeliveryOption result = new SubscriptionDeliveryMethodLocalDeliveryOption();
      result.code = this.code;
      result.description = this.description;
      result.instructions = this.instructions;
      result.phone = this.phone;
      result.presentmentTitle = this.presentmentTitle;
      result.title = this.title;
      return result;
    }

    /**
     * A custom reference to the delivery method for use with automations.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The details displayed to the customer to describe the local delivery option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The delivery instructions that the customer can provide to the merchant.
     */
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    /**
     * The phone number that the customer provided to the merchant.
     * Formatted using E.164 standard. For example, `+16135551111`.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The presentment title of the local delivery option.
     */
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    /**
     * The title of the local delivery option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
