package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An alert message that appears in the Shopify admin about a problem with a store
 * setting, with an action to take. For example, you could show an alert to ask the
 * merchant to enter their billing information to activate Shopify Plus.
 */
public class ShopAlert {
  /**
   * The text for the button in the alert that links to related information. For example, _Add credit card_.
   */
  private ShopAlertAction action;

  /**
   * A description of the alert and further information, such as whether the merchant will be charged.
   */
  private String description;

  public ShopAlert() {
  }

  /**
   * The text for the button in the alert that links to related information. For example, _Add credit card_.
   */
  public ShopAlertAction getAction() {
    return action;
  }

  public void setAction(ShopAlertAction action) {
    this.action = action;
  }

  /**
   * A description of the alert and further information, such as whether the merchant will be charged.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "ShopAlert{action='" + action + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopAlert that = (ShopAlert) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text for the button in the alert that links to related information. For example, _Add credit card_.
     */
    private ShopAlertAction action;

    /**
     * A description of the alert and further information, such as whether the merchant will be charged.
     */
    private String description;

    public ShopAlert build() {
      ShopAlert result = new ShopAlert();
      result.action = this.action;
      result.description = this.description;
      return result;
    }

    /**
     * The text for the button in the alert that links to related information. For example, _Add credit card_.
     */
    public Builder action(ShopAlertAction action) {
      this.action = action;
      return this;
    }

    /**
     * A description of the alert and further information, such as whether the merchant will be charged.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
