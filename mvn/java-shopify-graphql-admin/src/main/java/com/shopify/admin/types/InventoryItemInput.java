package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an inventory item.
 */
public class InventoryItemInput {
  /**
   * The SKU (stock keeping unit) of the inventory item.
   */
  private String sku;

  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  private String cost;

  /**
   * Whether the inventory item is tracked.
   */
  private Boolean tracked;

  /**
   * The ISO 3166-1 alpha-2 country code of where the item originated from.
   */
  private CountryCode countryCodeOfOrigin;

  /**
   * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
   */
  private String harmonizedSystemCode;

  /**
   * List of country-specific harmonized system codes.
   */
  private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

  /**
   * The ISO 3166-2 alpha-2 province code of where the item originated from.
   */
  private String provinceCodeOfOrigin;

  /**
   * The measurements of an inventory item.
   */
  private InventoryItemMeasurementInput measurement;

  private Boolean requiresShipping;

  public InventoryItemInput() {
  }

  /**
   * The SKU (stock keeping unit) of the inventory item.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  /**
   * Whether the inventory item is tracked.
   */
  public Boolean getTracked() {
    return tracked;
  }

  public void setTracked(Boolean tracked) {
    this.tracked = tracked;
  }

  /**
   * The ISO 3166-1 alpha-2 country code of where the item originated from.
   */
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  /**
   * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
   */
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * List of country-specific harmonized system codes.
   */
  public List<CountryHarmonizedSystemCodeInput> getCountryHarmonizedSystemCodes() {
    return countryHarmonizedSystemCodes;
  }

  public void setCountryHarmonizedSystemCodes(
      List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
    this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
  }

  /**
   * The ISO 3166-2 alpha-2 province code of where the item originated from.
   */
  public String getProvinceCodeOfOrigin() {
    return provinceCodeOfOrigin;
  }

  public void setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
    this.provinceCodeOfOrigin = provinceCodeOfOrigin;
  }

  /**
   * The measurements of an inventory item.
   */
  public InventoryItemMeasurementInput getMeasurement() {
    return measurement;
  }

  public void setMeasurement(InventoryItemMeasurementInput measurement) {
    this.measurement = measurement;
  }

  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  @Override
  public String toString() {
    return "InventoryItemInput{sku='" + sku + "', cost='" + cost + "', tracked='" + tracked + "', countryCodeOfOrigin='" + countryCodeOfOrigin + "', harmonizedSystemCode='" + harmonizedSystemCode + "', countryHarmonizedSystemCodes='" + countryHarmonizedSystemCodes + "', provinceCodeOfOrigin='" + provinceCodeOfOrigin + "', measurement='" + measurement + "', requiresShipping='" + requiresShipping + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemInput that = (InventoryItemInput) o;
    return Objects.equals(sku, that.sku) &&
        Objects.equals(cost, that.cost) &&
        Objects.equals(tracked, that.tracked) &&
        Objects.equals(countryCodeOfOrigin, that.countryCodeOfOrigin) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(countryHarmonizedSystemCodes, that.countryHarmonizedSystemCodes) &&
        Objects.equals(provinceCodeOfOrigin, that.provinceCodeOfOrigin) &&
        Objects.equals(measurement, that.measurement) &&
        Objects.equals(requiresShipping, that.requiresShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, cost, tracked, countryCodeOfOrigin, harmonizedSystemCode, countryHarmonizedSystemCodes, provinceCodeOfOrigin, measurement, requiresShipping);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The SKU (stock keeping unit) of the inventory item.
     */
    private String sku;

    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    private String cost;

    /**
     * Whether the inventory item is tracked.
     */
    private Boolean tracked;

    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    private CountryCode countryCodeOfOrigin;

    /**
     * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
     */
    private String harmonizedSystemCode;

    /**
     * List of country-specific harmonized system codes.
     */
    private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

    /**
     * The ISO 3166-2 alpha-2 province code of where the item originated from.
     */
    private String provinceCodeOfOrigin;

    /**
     * The measurements of an inventory item.
     */
    private InventoryItemMeasurementInput measurement;

    private Boolean requiresShipping;

    public InventoryItemInput build() {
      InventoryItemInput result = new InventoryItemInput();
      result.sku = this.sku;
      result.cost = this.cost;
      result.tracked = this.tracked;
      result.countryCodeOfOrigin = this.countryCodeOfOrigin;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.countryHarmonizedSystemCodes = this.countryHarmonizedSystemCodes;
      result.provinceCodeOfOrigin = this.provinceCodeOfOrigin;
      result.measurement = this.measurement;
      result.requiresShipping = this.requiresShipping;
      return result;
    }

    /**
     * The SKU (stock keeping unit) of the inventory item.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    public Builder cost(String cost) {
      this.cost = cost;
      return this;
    }

    /**
     * Whether the inventory item is tracked.
     */
    public Builder tracked(Boolean tracked) {
      this.tracked = tracked;
      return this;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    /**
     * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    /**
     * List of country-specific harmonized system codes.
     */
    public Builder countryHarmonizedSystemCodes(
        List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
      this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
      return this;
    }

    /**
     * The ISO 3166-2 alpha-2 province code of where the item originated from.
     */
    public Builder provinceCodeOfOrigin(String provinceCodeOfOrigin) {
      this.provinceCodeOfOrigin = provinceCodeOfOrigin;
      return this;
    }

    /**
     * The measurements of an inventory item.
     */
    public Builder measurement(InventoryItemMeasurementInput measurement) {
      this.measurement = measurement;
      return this;
    }

    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }
  }
}
