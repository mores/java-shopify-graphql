package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a weight-based shipping option.
 */
public class DeliveryWeightBasedOptionDefinitionCreateInput {
  /**
   * The name shown to buyers for this shipping option.
   */
  private String name;

  /**
   * Optional description shown to buyers.
   */
  private String description;

  /**
   * Whether this shipping option is active and shown to buyers. Defaults to true.
   */
  private Boolean isActive = true;

  /**
   * The currency used for all money values in this shipping option.
   */
  private CurrencyCode currency;

  /**
   * The weight-based rate groups for this shipping option. At this time, only a
   * single rate group is supported for weight-based shipping options.
   */
  private List<DeliveryWeightBasedRateGroupCreateInput> rateGroups;

  /**
   * The cart subtotal required for free shipping. Currency must match the shipping option's currency.
   */
  private MoneyInput freeDeliveryMinimumValue;

  public DeliveryWeightBasedOptionDefinitionCreateInput() {
  }

  /**
   * The name shown to buyers for this shipping option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Optional description shown to buyers.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Whether this shipping option is active and shown to buyers. Defaults to true.
   */
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * The currency used for all money values in this shipping option.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * The weight-based rate groups for this shipping option. At this time, only a
   * single rate group is supported for weight-based shipping options.
   */
  public List<DeliveryWeightBasedRateGroupCreateInput> getRateGroups() {
    return rateGroups;
  }

  public void setRateGroups(List<DeliveryWeightBasedRateGroupCreateInput> rateGroups) {
    this.rateGroups = rateGroups;
  }

  /**
   * The cart subtotal required for free shipping. Currency must match the shipping option's currency.
   */
  public MoneyInput getFreeDeliveryMinimumValue() {
    return freeDeliveryMinimumValue;
  }

  public void setFreeDeliveryMinimumValue(MoneyInput freeDeliveryMinimumValue) {
    this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
  }

  @Override
  public String toString() {
    return "DeliveryWeightBasedOptionDefinitionCreateInput{name='" + name + "', description='" + description + "', isActive='" + isActive + "', currency='" + currency + "', rateGroups='" + rateGroups + "', freeDeliveryMinimumValue='" + freeDeliveryMinimumValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightBasedOptionDefinitionCreateInput that = (DeliveryWeightBasedOptionDefinitionCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(isActive, that.isActive) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(rateGroups, that.rateGroups) &&
        Objects.equals(freeDeliveryMinimumValue, that.freeDeliveryMinimumValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isActive, currency, rateGroups, freeDeliveryMinimumValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name shown to buyers for this shipping option.
     */
    private String name;

    /**
     * Optional description shown to buyers.
     */
    private String description;

    /**
     * Whether this shipping option is active and shown to buyers. Defaults to true.
     */
    private Boolean isActive = true;

    /**
     * The currency used for all money values in this shipping option.
     */
    private CurrencyCode currency;

    /**
     * The weight-based rate groups for this shipping option. At this time, only a
     * single rate group is supported for weight-based shipping options.
     */
    private List<DeliveryWeightBasedRateGroupCreateInput> rateGroups;

    /**
     * The cart subtotal required for free shipping. Currency must match the shipping option's currency.
     */
    private MoneyInput freeDeliveryMinimumValue;

    public DeliveryWeightBasedOptionDefinitionCreateInput build() {
      DeliveryWeightBasedOptionDefinitionCreateInput result = new DeliveryWeightBasedOptionDefinitionCreateInput();
      result.name = this.name;
      result.description = this.description;
      result.isActive = this.isActive;
      result.currency = this.currency;
      result.rateGroups = this.rateGroups;
      result.freeDeliveryMinimumValue = this.freeDeliveryMinimumValue;
      return result;
    }

    /**
     * The name shown to buyers for this shipping option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Optional description shown to buyers.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Whether this shipping option is active and shown to buyers. Defaults to true.
     */
    public Builder isActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    /**
     * The currency used for all money values in this shipping option.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The weight-based rate groups for this shipping option. At this time, only a
     * single rate group is supported for weight-based shipping options.
     */
    public Builder rateGroups(List<DeliveryWeightBasedRateGroupCreateInput> rateGroups) {
      this.rateGroups = rateGroups;
      return this;
    }

    /**
     * The cart subtotal required for free shipping. Currency must match the shipping option's currency.
     */
    public Builder freeDeliveryMinimumValue(MoneyInput freeDeliveryMinimumValue) {
      this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
      return this;
    }
  }
}
