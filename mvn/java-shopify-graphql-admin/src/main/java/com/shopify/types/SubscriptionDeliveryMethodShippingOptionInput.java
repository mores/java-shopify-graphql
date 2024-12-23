package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for shipping option.
 */
public class SubscriptionDeliveryMethodShippingOptionInput {
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

  public SubscriptionDeliveryMethodShippingOptionInput() {
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

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShippingOptionInput{title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', carrierServiceId='" + carrierServiceId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShippingOptionInput that = (SubscriptionDeliveryMethodShippingOptionInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(carrierServiceId, that.carrierServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, presentmentTitle, description, code, carrierServiceId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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

    public SubscriptionDeliveryMethodShippingOptionInput build() {
      SubscriptionDeliveryMethodShippingOptionInput result = new SubscriptionDeliveryMethodShippingOptionInput();
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.carrierServiceId = this.carrierServiceId;
      return result;
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
  }
}
