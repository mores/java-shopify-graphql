package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping option with rates calculated by a carrier service.
 *
 * Carrier-calculated options fetch real-time rates from carriers(e.g., UPS, FedEx) at checkout
 * instead of using merchant-defined fixed prices.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCarrierCalculatedOptionDefinition implements com.shopify.admin.types.DeliveryOptionDefinition {
  /**
   * The currency used for all money values in this shipping option.
   */
  private CurrencyCode currency;

  /**
   * Optional description shown to buyers.
   */
  private String description;

  /**
   * The cart subtotal required for free shipping. Null if no threshold is set.
   */
  private MoneyV2 freeDeliveryMinimumValue;

  /**
   * A globally unique ID for this shipping option.
   */
  private String id;

  /**
   * Collections that any rate group in this shipping option applies to.
   */
  private CollectionConnection includedCollections;

  /**
   * Origin locations that any rate group in this shipping option applies to.
   */
  private LocationConnection includedLocations;

  /**
   * Whether this shipping option is active and shown to buyers.
   */
  private boolean isActive;

  /**
   * The rate groups for this carrier-calculated shipping option.
   */
  private DeliveryCarrierCalculatedRateGroupConnection rateGroups;

  public DeliveryCarrierCalculatedOptionDefinition() {
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
   * Optional description shown to buyers.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The cart subtotal required for free shipping. Null if no threshold is set.
   */
  public MoneyV2 getFreeDeliveryMinimumValue() {
    return freeDeliveryMinimumValue;
  }

  public void setFreeDeliveryMinimumValue(MoneyV2 freeDeliveryMinimumValue) {
    this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
  }

  /**
   * A globally unique ID for this shipping option.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Collections that any rate group in this shipping option applies to.
   */
  public CollectionConnection getIncludedCollections() {
    return includedCollections;
  }

  public void setIncludedCollections(CollectionConnection includedCollections) {
    this.includedCollections = includedCollections;
  }

  /**
   * Origin locations that any rate group in this shipping option applies to.
   */
  public LocationConnection getIncludedLocations() {
    return includedLocations;
  }

  public void setIncludedLocations(LocationConnection includedLocations) {
    this.includedLocations = includedLocations;
  }

  /**
   * Whether this shipping option is active and shown to buyers.
   */
  public boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * The rate groups for this carrier-calculated shipping option.
   */
  public DeliveryCarrierCalculatedRateGroupConnection getRateGroups() {
    return rateGroups;
  }

  public void setRateGroups(DeliveryCarrierCalculatedRateGroupConnection rateGroups) {
    this.rateGroups = rateGroups;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedOptionDefinition{currency='" + currency + "', description='" + description + "', freeDeliveryMinimumValue='" + freeDeliveryMinimumValue + "', id='" + id + "', includedCollections='" + includedCollections + "', includedLocations='" + includedLocations + "', isActive='" + isActive + "', rateGroups='" + rateGroups + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedOptionDefinition that = (DeliveryCarrierCalculatedOptionDefinition) o;
    return Objects.equals(currency, that.currency) &&
        Objects.equals(description, that.description) &&
        Objects.equals(freeDeliveryMinimumValue, that.freeDeliveryMinimumValue) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includedCollections, that.includedCollections) &&
        Objects.equals(includedLocations, that.includedLocations) &&
        isActive == that.isActive &&
        Objects.equals(rateGroups, that.rateGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, description, freeDeliveryMinimumValue, id, includedCollections, includedLocations, isActive, rateGroups);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currency used for all money values in this shipping option.
     */
    private CurrencyCode currency;

    /**
     * Optional description shown to buyers.
     */
    private String description;

    /**
     * The cart subtotal required for free shipping. Null if no threshold is set.
     */
    private MoneyV2 freeDeliveryMinimumValue;

    /**
     * A globally unique ID for this shipping option.
     */
    private String id;

    /**
     * Collections that any rate group in this shipping option applies to.
     */
    private CollectionConnection includedCollections;

    /**
     * Origin locations that any rate group in this shipping option applies to.
     */
    private LocationConnection includedLocations;

    /**
     * Whether this shipping option is active and shown to buyers.
     */
    private boolean isActive;

    /**
     * The rate groups for this carrier-calculated shipping option.
     */
    private DeliveryCarrierCalculatedRateGroupConnection rateGroups;

    public DeliveryCarrierCalculatedOptionDefinition build() {
      DeliveryCarrierCalculatedOptionDefinition result = new DeliveryCarrierCalculatedOptionDefinition();
      result.currency = this.currency;
      result.description = this.description;
      result.freeDeliveryMinimumValue = this.freeDeliveryMinimumValue;
      result.id = this.id;
      result.includedCollections = this.includedCollections;
      result.includedLocations = this.includedLocations;
      result.isActive = this.isActive;
      result.rateGroups = this.rateGroups;
      return result;
    }

    /**
     * The currency used for all money values in this shipping option.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
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
     * The cart subtotal required for free shipping. Null if no threshold is set.
     */
    public Builder freeDeliveryMinimumValue(MoneyV2 freeDeliveryMinimumValue) {
      this.freeDeliveryMinimumValue = freeDeliveryMinimumValue;
      return this;
    }

    /**
     * A globally unique ID for this shipping option.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Collections that any rate group in this shipping option applies to.
     */
    public Builder includedCollections(CollectionConnection includedCollections) {
      this.includedCollections = includedCollections;
      return this;
    }

    /**
     * Origin locations that any rate group in this shipping option applies to.
     */
    public Builder includedLocations(LocationConnection includedLocations) {
      this.includedLocations = includedLocations;
      return this;
    }

    /**
     * Whether this shipping option is active and shown to buyers.
     */
    public Builder isActive(boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    /**
     * The rate groups for this carrier-calculated shipping option.
     */
    public Builder rateGroups(DeliveryCarrierCalculatedRateGroupConnection rateGroups) {
      this.rateGroups = rateGroups;
      return this;
    }
  }
}
