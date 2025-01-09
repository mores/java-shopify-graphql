package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping option to deliver a subscription contract.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionShippingOption implements SubscriptionDeliveryOption {
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
   * If a phone number is required for the shipping option.
   */
  private Boolean phoneRequired;

  /**
   * The presentment title of the shipping option.
   */
  private String presentmentTitle;

  /**
   * The price of the shipping option.
   */
  private MoneyV2 price;

  /**
   * The title of the shipping option.
   */
  private String title;

  public SubscriptionShippingOption() {
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
   * If a phone number is required for the shipping option.
   */
  public Boolean getPhoneRequired() {
    return phoneRequired;
  }

  public void setPhoneRequired(Boolean phoneRequired) {
    this.phoneRequired = phoneRequired;
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
   * The price of the shipping option.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
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
    return "SubscriptionShippingOption{carrierService='" + carrierService + "', code='" + code + "', description='" + description + "', phoneRequired='" + phoneRequired + "', presentmentTitle='" + presentmentTitle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionShippingOption that = (SubscriptionShippingOption) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(phoneRequired, that.phoneRequired) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, code, description, phoneRequired, presentmentTitle, price, title);
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
     * If a phone number is required for the shipping option.
     */
    private Boolean phoneRequired;

    /**
     * The presentment title of the shipping option.
     */
    private String presentmentTitle;

    /**
     * The price of the shipping option.
     */
    private MoneyV2 price;

    /**
     * The title of the shipping option.
     */
    private String title;

    public SubscriptionShippingOption build() {
      SubscriptionShippingOption result = new SubscriptionShippingOption();
      result.carrierService = this.carrierService;
      result.code = this.code;
      result.description = this.description;
      result.phoneRequired = this.phoneRequired;
      result.presentmentTitle = this.presentmentTitle;
      result.price = this.price;
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
     * If a phone number is required for the shipping option.
     */
    public Builder phoneRequired(Boolean phoneRequired) {
      this.phoneRequired = phoneRequired;
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
     * The price of the shipping option.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
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
