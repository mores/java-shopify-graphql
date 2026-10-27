package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for pickup delivery method used for contract calculation.
 */
public class SubscriptionContractCalculationDeliveryMethodPickupInput {
  /**
   * The title of the pickup option.
   */
  private String title;

  /**
   * The presentment title of the pickup option.
   */
  private String presentmentTitle;

  /**
   * The details displayed to the customer to describe the pickup option.
   */
  private String description;

  /**
   * A custom reference to the delivery method for use with automations.
   */
  private String code;

  /**
   * The ID of the pickup location.
   */
  private String locationId;

  /**
   * The price for this delivery method. The amount must be greater than or equal to 0.
   */
  private MoneyInput deliveryPrice;

  public SubscriptionContractCalculationDeliveryMethodPickupInput() {
  }

  /**
   * The title of the pickup option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The presentment title of the pickup option.
   */
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  /**
   * The details displayed to the customer to describe the pickup option.
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
   * The ID of the pickup location.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
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
    return "SubscriptionContractCalculationDeliveryMethodPickupInput{title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', locationId='" + locationId + "', deliveryPrice='" + deliveryPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDeliveryMethodPickupInput that = (SubscriptionContractCalculationDeliveryMethodPickupInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(deliveryPrice, that.deliveryPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, presentmentTitle, description, code, locationId, deliveryPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the pickup option.
     */
    private String title;

    /**
     * The presentment title of the pickup option.
     */
    private String presentmentTitle;

    /**
     * The details displayed to the customer to describe the pickup option.
     */
    private String description;

    /**
     * A custom reference to the delivery method for use with automations.
     */
    private String code;

    /**
     * The ID of the pickup location.
     */
    private String locationId;

    /**
     * The price for this delivery method. The amount must be greater than or equal to 0.
     */
    private MoneyInput deliveryPrice;

    public SubscriptionContractCalculationDeliveryMethodPickupInput build() {
      SubscriptionContractCalculationDeliveryMethodPickupInput result = new SubscriptionContractCalculationDeliveryMethodPickupInput();
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.locationId = this.locationId;
      result.deliveryPrice = this.deliveryPrice;
      return result;
    }

    /**
     * The title of the pickup option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The presentment title of the pickup option.
     */
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    /**
     * The details displayed to the customer to describe the pickup option.
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
     * The ID of the pickup location.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
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
