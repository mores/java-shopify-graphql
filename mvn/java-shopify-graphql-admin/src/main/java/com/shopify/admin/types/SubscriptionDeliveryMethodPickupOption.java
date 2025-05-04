package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the selected pickup option on a subscription contract.
 */
public class SubscriptionDeliveryMethodPickupOption {
  /**
   * A custom reference to the delivery method for use with automations.
   */
  private String code;

  /**
   * The details displayed to the customer to describe the pickup option.
   */
  private String description;

  /**
   * The location where the customer will pick up the merchandise.
   */
  private Location location;

  /**
   * The presentment title of the pickup option.
   */
  private String presentmentTitle;

  /**
   * The title of the pickup option.
   */
  private String title;

  public SubscriptionDeliveryMethodPickupOption() {
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
   * The details displayed to the customer to describe the pickup option.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The location where the customer will pick up the merchandise.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
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
   * The title of the pickup option.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodPickupOption{code='" + code + "', description='" + description + "', location='" + location + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodPickupOption that = (SubscriptionDeliveryMethodPickupOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(location, that.location) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, location, presentmentTitle, title);
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
     * The details displayed to the customer to describe the pickup option.
     */
    private String description;

    /**
     * The location where the customer will pick up the merchandise.
     */
    private Location location;

    /**
     * The presentment title of the pickup option.
     */
    private String presentmentTitle;

    /**
     * The title of the pickup option.
     */
    private String title;

    public SubscriptionDeliveryMethodPickupOption build() {
      SubscriptionDeliveryMethodPickupOption result = new SubscriptionDeliveryMethodPickupOption();
      result.code = this.code;
      result.description = this.description;
      result.location = this.location;
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
     * The details displayed to the customer to describe the pickup option.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The location where the customer will pick up the merchandise.
     */
    public Builder location(Location location) {
      this.location = location;
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
     * The title of the pickup option.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
