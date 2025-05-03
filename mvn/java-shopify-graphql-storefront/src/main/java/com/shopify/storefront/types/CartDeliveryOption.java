package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about a delivery option.
 */
public class CartDeliveryOption {
  /**
   * The code of the delivery option.
   */
  private String code;

  /**
   * The method for the delivery option.
   */
  private DeliveryMethodType deliveryMethodType;

  /**
   * The description of the delivery option.
   */
  private String description;

  /**
   * The estimated cost for the delivery option.
   */
  private MoneyV2 estimatedCost;

  /**
   * The unique identifier of the delivery option.
   */
  private String handle;

  /**
   * The title of the delivery option.
   */
  private String title;

  public CartDeliveryOption() {
  }

  /**
   * The code of the delivery option.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The method for the delivery option.
   */
  public DeliveryMethodType getDeliveryMethodType() {
    return deliveryMethodType;
  }

  public void setDeliveryMethodType(DeliveryMethodType deliveryMethodType) {
    this.deliveryMethodType = deliveryMethodType;
  }

  /**
   * The description of the delivery option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The estimated cost for the delivery option.
   */
  public MoneyV2 getEstimatedCost() {
    return estimatedCost;
  }

  public void setEstimatedCost(MoneyV2 estimatedCost) {
    this.estimatedCost = estimatedCost;
  }

  /**
   * The unique identifier of the delivery option.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The title of the delivery option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CartDeliveryOption{code='" + code + "', deliveryMethodType='" + deliveryMethodType + "', description='" + description + "', estimatedCost='" + estimatedCost + "', handle='" + handle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryOption that = (CartDeliveryOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(deliveryMethodType, that.deliveryMethodType) &&
        Objects.equals(description, that.description) &&
        Objects.equals(estimatedCost, that.estimatedCost) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, deliveryMethodType, description, estimatedCost, handle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the delivery option.
     */
    private String code;

    /**
     * The method for the delivery option.
     */
    private DeliveryMethodType deliveryMethodType;

    /**
     * The description of the delivery option.
     */
    private String description;

    /**
     * The estimated cost for the delivery option.
     */
    private MoneyV2 estimatedCost;

    /**
     * The unique identifier of the delivery option.
     */
    private String handle;

    /**
     * The title of the delivery option.
     */
    private String title;

    public CartDeliveryOption build() {
      CartDeliveryOption result = new CartDeliveryOption();
      result.code = this.code;
      result.deliveryMethodType = this.deliveryMethodType;
      result.description = this.description;
      result.estimatedCost = this.estimatedCost;
      result.handle = this.handle;
      result.title = this.title;
      return result;
    }

    /**
     * The code of the delivery option.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The method for the delivery option.
     */
    public Builder deliveryMethodType(DeliveryMethodType deliveryMethodType) {
      this.deliveryMethodType = deliveryMethodType;
      return this;
    }

    /**
     * The description of the delivery option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The estimated cost for the delivery option.
     */
    public Builder estimatedCost(MoneyV2 estimatedCost) {
      this.estimatedCost = estimatedCost;
      return this;
    }

    /**
     * The unique identifier of the delivery option.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The title of the delivery option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
