package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a market.
 */
public class MarketCreateInput {
  /**
   * The name of the market. Not shown to customers.
   */
  private String name;

  /**
   * A unique identifier for the market. For example `"ca"`.
   * If the handle isn't provided, then the handle is auto-generated based on the country or name.
   */
  private String handle;

  /**
   * The conditions that apply to the market.
   */
  private MarketConditionsInput conditions;

  /**
   * Catalog IDs to include in the market.
   */
  private List<String> catalogs;

  /**
   * Whether to update duplicate region or wildcard markets' status to draft.
   */
  private Boolean makeDuplicateUniqueMarketsDraft;

  /**
   * The status of the market.
   */
  private MarketStatus status;

  /**
   * Web presence IDs to include in the market.
   */
  private List<String> webPresences;

  /**
   * Currency settings for the market.
   */
  private MarketCurrencySettingsUpdateInput currencySettings;

  /**
   * The strategy used to determine how prices are displayed to the customer.
   */
  private MarketPriceInclusionsInput priceInclusions;

  public MarketCreateInput() {
  }

  /**
   * The name of the market. Not shown to customers.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A unique identifier for the market. For example `"ca"`.
   * If the handle isn't provided, then the handle is auto-generated based on the country or name.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The conditions that apply to the market.
   */
  public MarketConditionsInput getConditions() {
    return conditions;
  }

  public void setConditions(MarketConditionsInput conditions) {
    this.conditions = conditions;
  }

  /**
   * Catalog IDs to include in the market.
   */
  public List<String> getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(List<String> catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * Whether to update duplicate region or wildcard markets' status to draft.
   */
  public Boolean getMakeDuplicateUniqueMarketsDraft() {
    return makeDuplicateUniqueMarketsDraft;
  }

  public void setMakeDuplicateUniqueMarketsDraft(Boolean makeDuplicateUniqueMarketsDraft) {
    this.makeDuplicateUniqueMarketsDraft = makeDuplicateUniqueMarketsDraft;
  }

  /**
   * The status of the market.
   */
  public MarketStatus getStatus() {
    return status;
  }

  public void setStatus(MarketStatus status) {
    this.status = status;
  }

  /**
   * Web presence IDs to include in the market.
   */
  public List<String> getWebPresences() {
    return webPresences;
  }

  public void setWebPresences(List<String> webPresences) {
    this.webPresences = webPresences;
  }

  /**
   * Currency settings for the market.
   */
  public MarketCurrencySettingsUpdateInput getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
    this.currencySettings = currencySettings;
  }

  /**
   * The strategy used to determine how prices are displayed to the customer.
   */
  public MarketPriceInclusionsInput getPriceInclusions() {
    return priceInclusions;
  }

  public void setPriceInclusions(MarketPriceInclusionsInput priceInclusions) {
    this.priceInclusions = priceInclusions;
  }

  @Override
  public String toString() {
    return "MarketCreateInput{name='" + name + "', handle='" + handle + "', conditions='" + conditions + "', catalogs='" + catalogs + "', makeDuplicateUniqueMarketsDraft='" + makeDuplicateUniqueMarketsDraft + "', status='" + status + "', webPresences='" + webPresences + "', currencySettings='" + currencySettings + "', priceInclusions='" + priceInclusions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCreateInput that = (MarketCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(makeDuplicateUniqueMarketsDraft, that.makeDuplicateUniqueMarketsDraft) &&
        Objects.equals(status, that.status) &&
        Objects.equals(webPresences, that.webPresences) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        Objects.equals(priceInclusions, that.priceInclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, conditions, catalogs, makeDuplicateUniqueMarketsDraft, status, webPresences, currencySettings, priceInclusions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the market. Not shown to customers.
     */
    private String name;

    /**
     * A unique identifier for the market. For example `"ca"`.
     * If the handle isn't provided, then the handle is auto-generated based on the country or name.
     */
    private String handle;

    /**
     * The conditions that apply to the market.
     */
    private MarketConditionsInput conditions;

    /**
     * Catalog IDs to include in the market.
     */
    private List<String> catalogs;

    /**
     * Whether to update duplicate region or wildcard markets' status to draft.
     */
    private Boolean makeDuplicateUniqueMarketsDraft;

    /**
     * The status of the market.
     */
    private MarketStatus status;

    /**
     * Web presence IDs to include in the market.
     */
    private List<String> webPresences;

    /**
     * Currency settings for the market.
     */
    private MarketCurrencySettingsUpdateInput currencySettings;

    /**
     * The strategy used to determine how prices are displayed to the customer.
     */
    private MarketPriceInclusionsInput priceInclusions;

    public MarketCreateInput build() {
      MarketCreateInput result = new MarketCreateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.conditions = this.conditions;
      result.catalogs = this.catalogs;
      result.makeDuplicateUniqueMarketsDraft = this.makeDuplicateUniqueMarketsDraft;
      result.status = this.status;
      result.webPresences = this.webPresences;
      result.currencySettings = this.currencySettings;
      result.priceInclusions = this.priceInclusions;
      return result;
    }

    /**
     * The name of the market. Not shown to customers.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A unique identifier for the market. For example `"ca"`.
     * If the handle isn't provided, then the handle is auto-generated based on the country or name.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The conditions that apply to the market.
     */
    public Builder conditions(MarketConditionsInput conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Catalog IDs to include in the market.
     */
    public Builder catalogs(List<String> catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Whether to update duplicate region or wildcard markets' status to draft.
     */
    public Builder makeDuplicateUniqueMarketsDraft(Boolean makeDuplicateUniqueMarketsDraft) {
      this.makeDuplicateUniqueMarketsDraft = makeDuplicateUniqueMarketsDraft;
      return this;
    }

    /**
     * The status of the market.
     */
    public Builder status(MarketStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Web presence IDs to include in the market.
     */
    public Builder webPresences(List<String> webPresences) {
      this.webPresences = webPresences;
      return this;
    }

    /**
     * Currency settings for the market.
     */
    public Builder currencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    /**
     * The strategy used to determine how prices are displayed to the customer.
     */
    public Builder priceInclusions(MarketPriceInclusionsInput priceInclusions) {
      this.priceInclusions = priceInclusions;
      return this;
    }
  }
}
