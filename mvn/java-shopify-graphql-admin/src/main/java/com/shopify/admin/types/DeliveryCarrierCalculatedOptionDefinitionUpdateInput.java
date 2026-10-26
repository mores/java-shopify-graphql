package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a carrier-calculated shipping option.
 */
public class DeliveryCarrierCalculatedOptionDefinitionUpdateInput {
  /**
   * The ID of the carrier-calculated shipping option to update.
   */
  private String id;

  /**
   * Description shown to buyers.
   */
  private String description;

  /**
   * Whether this shipping option is active and shown to buyers.
   */
  private Boolean isActive;

  /**
   * The currency used for all money values in this shipping option.
   */
  private CurrencyCode currency;

  /**
   * Rate groups to create for this shipping option. At this time, only a single
   * rate group is supported for carrier calculated shipping options.
   */
  private List<DeliveryCarrierCalculatedRateGroupCreateInput> rateGroupsToCreate;

  /**
   * Rate groups to update for this shipping option. Only the existing single rate group is supported.
   */
  private List<DeliveryCarrierCalculatedRateGroupUpdateInput> rateGroupsToUpdate;

  /**
   * The IDs of rate groups to delete from this shipping option.
   */
  private List<String> rateGroupsToDelete;

  /**
   * The cart subtotal required for free shipping. Null clears the existing
   * threshold. Currency must match the shipping option's currency.
   */
  private MoneyInput freeDeliveryMinimumValue;

  public DeliveryCarrierCalculatedOptionDefinitionUpdateInput() {
  }

  /**
   * The ID of the carrier-calculated shipping option to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Description shown to buyers.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Whether this shipping option is active and shown to buyers.
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
   * Rate groups to create for this shipping option. At this time, only a single
   * rate group is supported for carrier calculated shipping options.
   */
  public List<DeliveryCarrierCalculatedRateGroupCreateInput> getRateGroupsToCreate() {
    return rateGroupsToCreate;
  }

  public void setRateGroupsToCreate(
      List<DeliveryCarrierCalculatedRateGroupCreateInput> rateGroupsToCreate) {
    this.rateGroupsToCreate = rateGroupsToCreate;
  }

  /**
   * Rate groups to update for this shipping option. Only the existing single rate group is supported.
   */
  public List<DeliveryCarrierCalculatedRateGroupUpdateInput> getRateGroupsToUpdate() {
    return rateGroupsToUpdate;
  }

  public void setRateGroupsToUpdate(
      List<DeliveryCarrierCalculatedRateGroupUpdateInput> rateGroupsToUpdate) {
    this.rateGroupsToUpdate = rateGroupsToUpdate;
  }

  /**
   * The IDs of rate groups to delete from this shipping option.
   */
  public List<String> getRateGroupsToDelete() {
    return rateGroupsToDelete;
  }

  public void setRateGroupsToDelete(List<String> rateGroupsToDelete) {
    this.rateGroupsToDelete = rateGroupsToDelete;
  }

  /**
   * The cart subtotal required for free shipping. Null clears the existing
   * threshold. Currency must match the shipping option's currency.
   */
  public MoneyInput getFreeDeliveryMinimumValue() {
    return freeDeliveryMinimumValue;
  }

  public void setFreeDeliveryMinimumValue(MoneyInput freeDeliveryMinimumValue) {
    this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedOptionDefinitionUpdateInput{id='" + id + "', description='" + description + "', isActive='" + isActive + "', currency='" + currency + "', rateGroupsToCreate='" + rateGroupsToCreate + "', rateGroupsToUpdate='" + rateGroupsToUpdate + "', rateGroupsToDelete='" + rateGroupsToDelete + "', freeDeliveryMinimumValue='" + freeDeliveryMinimumValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedOptionDefinitionUpdateInput that = (DeliveryCarrierCalculatedOptionDefinitionUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(description, that.description) &&
        Objects.equals(isActive, that.isActive) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(rateGroupsToCreate, that.rateGroupsToCreate) &&
        Objects.equals(rateGroupsToUpdate, that.rateGroupsToUpdate) &&
        Objects.equals(rateGroupsToDelete, that.rateGroupsToDelete) &&
        Objects.equals(freeDeliveryMinimumValue, that.freeDeliveryMinimumValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, isActive, currency, rateGroupsToCreate, rateGroupsToUpdate, rateGroupsToDelete, freeDeliveryMinimumValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the carrier-calculated shipping option to update.
     */
    private String id;

    /**
     * Description shown to buyers.
     */
    private String description;

    /**
     * Whether this shipping option is active and shown to buyers.
     */
    private Boolean isActive;

    /**
     * The currency used for all money values in this shipping option.
     */
    private CurrencyCode currency;

    /**
     * Rate groups to create for this shipping option. At this time, only a single
     * rate group is supported for carrier calculated shipping options.
     */
    private List<DeliveryCarrierCalculatedRateGroupCreateInput> rateGroupsToCreate;

    /**
     * Rate groups to update for this shipping option. Only the existing single rate group is supported.
     */
    private List<DeliveryCarrierCalculatedRateGroupUpdateInput> rateGroupsToUpdate;

    /**
     * The IDs of rate groups to delete from this shipping option.
     */
    private List<String> rateGroupsToDelete;

    /**
     * The cart subtotal required for free shipping. Null clears the existing
     * threshold. Currency must match the shipping option's currency.
     */
    private MoneyInput freeDeliveryMinimumValue;

    public DeliveryCarrierCalculatedOptionDefinitionUpdateInput build() {
      DeliveryCarrierCalculatedOptionDefinitionUpdateInput result = new DeliveryCarrierCalculatedOptionDefinitionUpdateInput();
      result.id = this.id;
      result.description = this.description;
      result.isActive = this.isActive;
      result.currency = this.currency;
      result.rateGroupsToCreate = this.rateGroupsToCreate;
      result.rateGroupsToUpdate = this.rateGroupsToUpdate;
      result.rateGroupsToDelete = this.rateGroupsToDelete;
      result.freeDeliveryMinimumValue = this.freeDeliveryMinimumValue;
      return result;
    }

    /**
     * The ID of the carrier-calculated shipping option to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Description shown to buyers.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Whether this shipping option is active and shown to buyers.
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
     * Rate groups to create for this shipping option. At this time, only a single
     * rate group is supported for carrier calculated shipping options.
     */
    public Builder rateGroupsToCreate(
        List<DeliveryCarrierCalculatedRateGroupCreateInput> rateGroupsToCreate) {
      this.rateGroupsToCreate = rateGroupsToCreate;
      return this;
    }

    /**
     * Rate groups to update for this shipping option. Only the existing single rate group is supported.
     */
    public Builder rateGroupsToUpdate(
        List<DeliveryCarrierCalculatedRateGroupUpdateInput> rateGroupsToUpdate) {
      this.rateGroupsToUpdate = rateGroupsToUpdate;
      return this;
    }

    /**
     * The IDs of rate groups to delete from this shipping option.
     */
    public Builder rateGroupsToDelete(List<String> rateGroupsToDelete) {
      this.rateGroupsToDelete = rateGroupsToDelete;
      return this;
    }

    /**
     * The cart subtotal required for free shipping. Null clears the existing
     * threshold. Currency must match the shipping option's currency.
     */
    public Builder freeDeliveryMinimumValue(MoneyInput freeDeliveryMinimumValue) {
      this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
      return this;
    }
  }
}
