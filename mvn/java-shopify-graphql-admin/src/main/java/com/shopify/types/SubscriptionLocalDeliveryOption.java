package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A local delivery option for a subscription contract.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionLocalDeliveryOption implements SubscriptionDeliveryOption {
  /**
   * The code of the local delivery option.
   */
  private String code;

  /**
   * The description of the local delivery option.
   */
  private String description;

  /**
   * Whether a phone number is required for the local delivery option.
   */
  private boolean phoneRequired;

  /**
   * The presentment title of the local delivery option.
   */
  private String presentmentTitle;

  /**
   * The price of the local delivery option.
   */
  private MoneyV2 price;

  /**
   * The title of the local delivery option.
   */
  private String title;

  public SubscriptionLocalDeliveryOption() {
  }

  /**
   * The code of the local delivery option.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The description of the local delivery option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Whether a phone number is required for the local delivery option.
   */
  public boolean getPhoneRequired() {
    return phoneRequired;
  }

  public void setPhoneRequired(boolean phoneRequired) {
    this.phoneRequired = phoneRequired;
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
   * The price of the local delivery option.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
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
    return "SubscriptionLocalDeliveryOption{code='" + code + "', description='" + description + "', phoneRequired='" + phoneRequired + "', presentmentTitle='" + presentmentTitle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLocalDeliveryOption that = (SubscriptionLocalDeliveryOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        phoneRequired == that.phoneRequired &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, phoneRequired, presentmentTitle, price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the local delivery option.
     */
    private String code;

    /**
     * The description of the local delivery option.
     */
    private String description;

    /**
     * Whether a phone number is required for the local delivery option.
     */
    private boolean phoneRequired;

    /**
     * The presentment title of the local delivery option.
     */
    private String presentmentTitle;

    /**
     * The price of the local delivery option.
     */
    private MoneyV2 price;

    /**
     * The title of the local delivery option.
     */
    private String title;

    public SubscriptionLocalDeliveryOption build() {
      SubscriptionLocalDeliveryOption result = new SubscriptionLocalDeliveryOption();
      result.code = this.code;
      result.description = this.description;
      result.phoneRequired = this.phoneRequired;
      result.presentmentTitle = this.presentmentTitle;
      result.price = this.price;
      result.title = this.title;
      return result;
    }

    /**
     * The code of the local delivery option.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The description of the local delivery option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Whether a phone number is required for the local delivery option.
     */
    public Builder phoneRequired(boolean phoneRequired) {
      this.phoneRequired = phoneRequired;
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
     * The price of the local delivery option.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
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
