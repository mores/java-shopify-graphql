package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for shipping delivery method used for contract calculation.
 */
public class SubscriptionContractCalculationDeliveryMethodShippingInput {
  /**
   * The address to ship to.
   */
  private MailingAddressInput address;

  /**
   * The title of the shipping option.
   */
  private String title;

  /**
   * The presentment title of the shipping option.
   */
  private String presentmentTitle;

  /**
   * The description of the shipping option.
   */
  private String description;

  /**
   * The code of the shipping option.
   */
  private String code;

  /**
   * The carrier service ID of the shipping option.
   */
  private String carrierServiceId;

  /**
   * The price for this delivery method. The amount must be greater than or equal to 0.
   */
  private MoneyInput deliveryPrice;

  public SubscriptionContractCalculationDeliveryMethodShippingInput() {
  }

  /**
   * The address to ship to.
   */
  public MailingAddressInput getAddress() {
    return address;
  }

  public void setAddress(MailingAddressInput address) {
    this.address = address;
  }

  /**
   * The title of the shipping option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The presentment title of the shipping option.
   */
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  /**
   * The description of the shipping option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The code of the shipping option.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The carrier service ID of the shipping option.
   */
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
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
    return "SubscriptionContractCalculationDeliveryMethodShippingInput{address='" + address + "', title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', carrierServiceId='" + carrierServiceId + "', deliveryPrice='" + deliveryPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDeliveryMethodShippingInput that = (SubscriptionContractCalculationDeliveryMethodShippingInput) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(carrierServiceId, that.carrierServiceId) &&
        Objects.equals(deliveryPrice, that.deliveryPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, title, presentmentTitle, description, code, carrierServiceId, deliveryPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address to ship to.
     */
    private MailingAddressInput address;

    /**
     * The title of the shipping option.
     */
    private String title;

    /**
     * The presentment title of the shipping option.
     */
    private String presentmentTitle;

    /**
     * The description of the shipping option.
     */
    private String description;

    /**
     * The code of the shipping option.
     */
    private String code;

    /**
     * The carrier service ID of the shipping option.
     */
    private String carrierServiceId;

    /**
     * The price for this delivery method. The amount must be greater than or equal to 0.
     */
    private MoneyInput deliveryPrice;

    public SubscriptionContractCalculationDeliveryMethodShippingInput build() {
      SubscriptionContractCalculationDeliveryMethodShippingInput result = new SubscriptionContractCalculationDeliveryMethodShippingInput();
      result.address = this.address;
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.carrierServiceId = this.carrierServiceId;
      result.deliveryPrice = this.deliveryPrice;
      return result;
    }

    /**
     * The address to ship to.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      return this;
    }

    /**
     * The title of the shipping option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The presentment title of the shipping option.
     */
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    /**
     * The description of the shipping option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The code of the shipping option.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The carrier service ID of the shipping option.
     */
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
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
