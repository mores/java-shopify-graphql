package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the selected shipping option on a subscription contract.
 */
public class SubscriptionDeliveryMethodShippingOption {
  /**
   * The carrier service that's providing this shipping option.
   * This field isn't currently supported and returns null.
   */
  private DeliveryCarrierService carrierService;

  /**
   * The code of the shipping option.
   */
  private String code;

  /**
   * The description of the shipping option.
   */
  private String description;

  /**
   * The presentment title of the shipping option.
   */
  private String presentmentTitle;

  /**
   * The title of the shipping option.
   */
  private String title;

  public SubscriptionDeliveryMethodShippingOption() {
  }

  /**
   * The carrier service that's providing this shipping option.
   * This field isn't currently supported and returns null.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
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
   * The description of the shipping option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The title of the shipping option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShippingOption{carrierService='" + carrierService + "', code='" + code + "', description='" + description + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShippingOption that = (SubscriptionDeliveryMethodShippingOption) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, code, description, presentmentTitle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The carrier service that's providing this shipping option.
     * This field isn't currently supported and returns null.
     */
    private DeliveryCarrierService carrierService;

    /**
     * The code of the shipping option.
     */
    private String code;

    /**
     * The description of the shipping option.
     */
    private String description;

    /**
     * The presentment title of the shipping option.
     */
    private String presentmentTitle;

    /**
     * The title of the shipping option.
     */
    private String title;

    public SubscriptionDeliveryMethodShippingOption build() {
      SubscriptionDeliveryMethodShippingOption result = new SubscriptionDeliveryMethodShippingOption();
      result.carrierService = this.carrierService;
      result.code = this.code;
      result.description = this.description;
      result.presentmentTitle = this.presentmentTitle;
      result.title = this.title;
      return result;
    }

    /**
     * The carrier service that's providing this shipping option.
     * This field isn't currently supported and returns null.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
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
     * The description of the shipping option.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The title of the shipping option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
