package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for local delivery method used for contract calculation.
 */
public class SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput {
  /**
   * The address to deliver to.
   */
  private MailingAddressInput address;

  /**
   * The title of the local delivery option.
   */
  private String title;

  /**
   * The presentment title of the local delivery option.
   */
  private String presentmentTitle;

  /**
   * The details displayed to the customer to describe the local delivery option.
   */
  private String description;

  /**
   * A custom reference to the delivery method for use with automations.
   */
  private String code;

  /**
   * The phone number that the customer must provide to the merchant.
   * Formatted using E.164 standard. For example, `+16135551111`.
   */
  private String phone;

  /**
   * The delivery instructions that the customer can provide to the merchant.
   */
  private String instructions;

  /**
   * The price for this delivery method. The amount must be greater than or equal to 0.
   */
  private MoneyInput deliveryPrice;

  public SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput() {
  }

  /**
   * The address to deliver to.
   */
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
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
   * The details displayed to the customer to describe the local delivery option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The phone number that the customer must provide to the merchant.
   * Formatted using E.164 standard. For example, `+16135551111`.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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
   * The price for this delivery method. The amount must be greater than or equal to 0.
   */
  public MoneyInput getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(MoneyInput deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput{address='" + address + "', title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', phone='" + phone + "', instructions='" + instructions + "', deliveryPrice='" + deliveryPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput that = (SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(instructions, that.instructions) &&
        Objects.equals(deliveryPrice, that.deliveryPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, title, presentmentTitle, description, code, phone, instructions, deliveryPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address to deliver to.
     */
    private MailingAddressInput address;

    /**
     * The title of the local delivery option.
     */
    private String title;

    /**
     * The presentment title of the local delivery option.
     */
    private String presentmentTitle;

    /**
     * The details displayed to the customer to describe the local delivery option.
     */
    private String description;

    /**
     * A custom reference to the delivery method for use with automations.
     */
    private String code;

    /**
     * The phone number that the customer must provide to the merchant.
     * Formatted using E.164 standard. For example, `+16135551111`.
     */
    private String phone;

    /**
     * The delivery instructions that the customer can provide to the merchant.
     */
    private String instructions;

    /**
     * The price for this delivery method. The amount must be greater than or equal to 0.
     */
    private MoneyInput deliveryPrice;

    public SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput build() {
      SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput result = new SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput();
      result.address = this.address;
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.phone = this.phone;
      result.instructions = this.instructions;
      result.deliveryPrice = this.deliveryPrice;
      return result;
    }

    /**
     * The address to deliver to.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * The title of the local delivery option.
     */
    public Builder title(String title) {
      this.title = title;
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
     * The details displayed to the customer to describe the local delivery option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A custom reference to the delivery method for use with automations.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The phone number that the customer must provide to the merchant.
     * Formatted using E.164 standard. For example, `+16135551111`.
     */
    public Builder phone(String phone) {
      this.phone = phone;
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
     * The price for this delivery method. The amount must be greater than or equal to 0.
     */
    public Builder deliveryPrice(MoneyInput deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }
  }
}
