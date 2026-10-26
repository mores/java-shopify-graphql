package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to update a market.
 */
public class MarketUpdateInput {
  /**
   * The name of the market. Not shown to customers.
   */
  private String name;

  /**
   * A unique identifier for the market. For example `"ca"`.
   */
  private String handle;

  /**
   * The conditions to update.
   */
  private MarketConditionsUpdateInput conditions;

  /**
   * Catalog IDs to include in the market.
   */
  private List<String> catalogsToAdd;

  /**
   * Catalog IDs to remove from the market.
   */
  private List<String> catalogsToDelete;

  /**
   * The web presences to add to the market.
   */
  private List<String> webPresencesToAdd;

  /**
   * The web presences to remove from the market.
   */
  private List<String> webPresencesToDelete;

  /**
   * The discounts to add to the market.
   */
  private List<String> discountsToAdd;

  /**
   * The discounts to remove from the market.
   */
  private List<String> discountsToDelete;

  /**
   * Whether to update duplicate region or wildcard markets' status to draft.
   */
  private Boolean makeDuplicateUniqueMarketsDraft;

  /**
   * The status of the market.
   */
  private MarketStatus status;

  /**
   * Currency settings for the market.
   */
  private MarketCurrencySettingsUpdateInput currencySettings;

  /**
   * Remove any currency settings that are defined for the market.
   */
  private Boolean removeCurrencySettings;

  /**
   * The price inclusions to remove from the market.
   */
  private Boolean removePriceInclusions;

  /**
   * The strategy used to determine how prices are displayed to the customer.
   */
  private MarketPriceInclusionsInput priceInclusions;

  /**
   * Delivery setting updates. When omitted, delivery settings are not changed.
   */
  private MarketDeliveryConfigurationsUpdateInput delivery;

  /**
   * The unique identifier of the Return Policy Profile to be associated with the market.
   */
  private String returnPolicyProfileId;

  /**
   * Remove the Return Policy Profile that is defined for the market.
   */
  private Boolean removeReturnPolicyProfile;

  public MarketUpdateInput() {
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
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The conditions to update.
   */
  public MarketConditionsUpdateInput getConditions() {
    return conditions;
  }

  public void setConditions(MarketConditionsUpdateInput conditions) {
    this.conditions = conditions;
  }

  /**
   * Catalog IDs to include in the market.
   */
  public List<String> getCatalogsToAdd() {
    return catalogsToAdd;
  }

  public void setCatalogsToAdd(List<String> catalogsToAdd) {
    this.catalogsToAdd = catalogsToAdd;
  }

  /**
   * Catalog IDs to remove from the market.
   */
  public List<String> getCatalogsToDelete() {
    return catalogsToDelete;
  }

  public void setCatalogsToDelete(List<String> catalogsToDelete) {
    this.catalogsToDelete = catalogsToDelete;
  }

  /**
   * The web presences to add to the market.
   */
  public List<String> getWebPresencesToAdd() {
    return webPresencesToAdd;
  }

  public void setWebPresencesToAdd(List<String> webPresencesToAdd) {
    this.webPresencesToAdd = webPresencesToAdd;
  }

  /**
   * The web presences to remove from the market.
   */
  public List<String> getWebPresencesToDelete() {
    return webPresencesToDelete;
  }

  public void setWebPresencesToDelete(List<String> webPresencesToDelete) {
    this.webPresencesToDelete = webPresencesToDelete;
  }

  /**
   * The discounts to add to the market.
   */
  public List<String> getDiscountsToAdd() {
    return discountsToAdd;
  }

  public void setDiscountsToAdd(List<String> discountsToAdd) {
    this.discountsToAdd = discountsToAdd;
  }

  /**
   * The discounts to remove from the market.
   */
  public List<String> getDiscountsToDelete() {
    return discountsToDelete;
  }

  public void setDiscountsToDelete(List<String> discountsToDelete) {
    this.discountsToDelete = discountsToDelete;
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
   * Currency settings for the market.
   */
  public MarketCurrencySettingsUpdateInput getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
    this.currencySettings = currencySettings;
  }

  /**
   * Remove any currency settings that are defined for the market.
   */
  public Boolean getRemoveCurrencySettings() {
    return removeCurrencySettings;
  }

  public void setRemoveCurrencySettings(Boolean removeCurrencySettings) {
    this.removeCurrencySettings = removeCurrencySettings;
  }

  /**
   * The price inclusions to remove from the market.
   */
  public Boolean getRemovePriceInclusions() {
    return removePriceInclusions;
  }

  public void setRemovePriceInclusions(Boolean removePriceInclusions) {
    this.removePriceInclusions = removePriceInclusions;
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

  /**
   * Delivery setting updates. When omitted, delivery settings are not changed.
   */
  public MarketDeliveryConfigurationsUpdateInput getDelivery() {
    return delivery;
  }

  public void setDelivery(MarketDeliveryConfigurationsUpdateInput delivery) {
    this.delivery = delivery;
  }

  /**
   * The unique identifier of the Return Policy Profile to be associated with the market.
   */
  public String getReturnPolicyProfileId() {
    return returnPolicyProfileId;
  }

  public void setReturnPolicyProfileId(String returnPolicyProfileId) {
    this.returnPolicyProfileId = returnPolicyProfileId;
  }

  /**
   * Remove the Return Policy Profile that is defined for the market.
   */
  public Boolean getRemoveReturnPolicyProfile() {
    return removeReturnPolicyProfile;
  }

  public void setRemoveReturnPolicyProfile(Boolean removeReturnPolicyProfile) {
    this.removeReturnPolicyProfile = removeReturnPolicyProfile;
  }

  @Override
  public String toString() {
    return "MarketUpdateInput{name='" + name + "', handle='" + handle + "', conditions='" + conditions + "', catalogsToAdd='" + catalogsToAdd + "', catalogsToDelete='" + catalogsToDelete + "', webPresencesToAdd='" + webPresencesToAdd + "', webPresencesToDelete='" + webPresencesToDelete + "', discountsToAdd='" + discountsToAdd + "', discountsToDelete='" + discountsToDelete + "', makeDuplicateUniqueMarketsDraft='" + makeDuplicateUniqueMarketsDraft + "', status='" + status + "', currencySettings='" + currencySettings + "', removeCurrencySettings='" + removeCurrencySettings + "', removePriceInclusions='" + removePriceInclusions + "', priceInclusions='" + priceInclusions + "', delivery='" + delivery + "', returnPolicyProfileId='" + returnPolicyProfileId + "', removeReturnPolicyProfile='" + removeReturnPolicyProfile + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketUpdateInput that = (MarketUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(catalogsToAdd, that.catalogsToAdd) &&
        Objects.equals(catalogsToDelete, that.catalogsToDelete) &&
        Objects.equals(webPresencesToAdd, that.webPresencesToAdd) &&
        Objects.equals(webPresencesToDelete, that.webPresencesToDelete) &&
        Objects.equals(discountsToAdd, that.discountsToAdd) &&
        Objects.equals(discountsToDelete, that.discountsToDelete) &&
        Objects.equals(makeDuplicateUniqueMarketsDraft, that.makeDuplicateUniqueMarketsDraft) &&
        Objects.equals(status, that.status) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        Objects.equals(removeCurrencySettings, that.removeCurrencySettings) &&
        Objects.equals(removePriceInclusions, that.removePriceInclusions) &&
        Objects.equals(priceInclusions, that.priceInclusions) &&
        Objects.equals(delivery, that.delivery) &&
        Objects.equals(returnPolicyProfileId, that.returnPolicyProfileId) &&
        Objects.equals(removeReturnPolicyProfile, that.removeReturnPolicyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, conditions, catalogsToAdd, catalogsToDelete, webPresencesToAdd, webPresencesToDelete, discountsToAdd, discountsToDelete, makeDuplicateUniqueMarketsDraft, status, currencySettings, removeCurrencySettings, removePriceInclusions, priceInclusions, delivery, returnPolicyProfileId, removeReturnPolicyProfile);
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
     */
    private String handle;

    /**
     * The conditions to update.
     */
    private MarketConditionsUpdateInput conditions;

    /**
     * Catalog IDs to include in the market.
     */
    private List<String> catalogsToAdd;

    /**
     * Catalog IDs to remove from the market.
     */
    private List<String> catalogsToDelete;

    /**
     * The web presences to add to the market.
     */
    private List<String> webPresencesToAdd;

    /**
     * The web presences to remove from the market.
     */
    private List<String> webPresencesToDelete;

    /**
     * The discounts to add to the market.
     */
    private List<String> discountsToAdd;

    /**
     * The discounts to remove from the market.
     */
    private List<String> discountsToDelete;

    /**
     * Whether to update duplicate region or wildcard markets' status to draft.
     */
    private Boolean makeDuplicateUniqueMarketsDraft;

    /**
     * The status of the market.
     */
    private MarketStatus status;

    /**
     * Currency settings for the market.
     */
    private MarketCurrencySettingsUpdateInput currencySettings;

    /**
     * Remove any currency settings that are defined for the market.
     */
    private Boolean removeCurrencySettings;

    /**
     * The price inclusions to remove from the market.
     */
    private Boolean removePriceInclusions;

    /**
     * The strategy used to determine how prices are displayed to the customer.
     */
    private MarketPriceInclusionsInput priceInclusions;

    /**
     * Delivery setting updates. When omitted, delivery settings are not changed.
     */
    private MarketDeliveryConfigurationsUpdateInput delivery;

    /**
     * The unique identifier of the Return Policy Profile to be associated with the market.
     */
    private String returnPolicyProfileId;

    /**
     * Remove the Return Policy Profile that is defined for the market.
     */
    private Boolean removeReturnPolicyProfile;

    public MarketUpdateInput build() {
      MarketUpdateInput result = new MarketUpdateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.conditions = this.conditions;
      result.catalogsToAdd = this.catalogsToAdd;
      result.catalogsToDelete = this.catalogsToDelete;
      result.webPresencesToAdd = this.webPresencesToAdd;
      result.webPresencesToDelete = this.webPresencesToDelete;
      result.discountsToAdd = this.discountsToAdd;
      result.discountsToDelete = this.discountsToDelete;
      result.makeDuplicateUniqueMarketsDraft = this.makeDuplicateUniqueMarketsDraft;
      result.status = this.status;
      result.currencySettings = this.currencySettings;
      result.removeCurrencySettings = this.removeCurrencySettings;
      result.removePriceInclusions = this.removePriceInclusions;
      result.priceInclusions = this.priceInclusions;
      result.delivery = this.delivery;
      result.returnPolicyProfileId = this.returnPolicyProfileId;
      result.removeReturnPolicyProfile = this.removeReturnPolicyProfile;
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
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The conditions to update.
     */
    public Builder conditions(MarketConditionsUpdateInput conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Catalog IDs to include in the market.
     */
    public Builder catalogsToAdd(List<String> catalogsToAdd) {
      this.catalogsToAdd = catalogsToAdd;
      return this;
    }

    /**
     * Catalog IDs to remove from the market.
     */
    public Builder catalogsToDelete(List<String> catalogsToDelete) {
      this.catalogsToDelete = catalogsToDelete;
      return this;
    }

    /**
     * The web presences to add to the market.
     */
    public Builder webPresencesToAdd(List<String> webPresencesToAdd) {
      this.webPresencesToAdd = webPresencesToAdd;
      return this;
    }

    /**
     * The web presences to remove from the market.
     */
    public Builder webPresencesToDelete(List<String> webPresencesToDelete) {
      this.webPresencesToDelete = webPresencesToDelete;
      return this;
    }

    /**
     * The discounts to add to the market.
     */
    public Builder discountsToAdd(List<String> discountsToAdd) {
      this.discountsToAdd = discountsToAdd;
      return this;
    }

    /**
     * The discounts to remove from the market.
     */
    public Builder discountsToDelete(List<String> discountsToDelete) {
      this.discountsToDelete = discountsToDelete;
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
     * Currency settings for the market.
     */
    public Builder currencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    /**
     * Remove any currency settings that are defined for the market.
     */
    public Builder removeCurrencySettings(Boolean removeCurrencySettings) {
      this.removeCurrencySettings = removeCurrencySettings;
      return this;
    }

    /**
     * The price inclusions to remove from the market.
     */
    public Builder removePriceInclusions(Boolean removePriceInclusions) {
      this.removePriceInclusions = removePriceInclusions;
      return this;
    }

    /**
     * The strategy used to determine how prices are displayed to the customer.
     */
    public Builder priceInclusions(MarketPriceInclusionsInput priceInclusions) {
      this.priceInclusions = priceInclusions;
      return this;
    }

    /**
     * Delivery setting updates. When omitted, delivery settings are not changed.
     */
    public Builder delivery(MarketDeliveryConfigurationsUpdateInput delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * The unique identifier of the Return Policy Profile to be associated with the market.
     */
    public Builder returnPolicyProfileId(String returnPolicyProfileId) {
      this.returnPolicyProfileId = returnPolicyProfileId;
      return this;
    }

    /**
     * Remove the Return Policy Profile that is defined for the market.
     */
    public Builder removeReturnPolicyProfile(Boolean removeReturnPolicyProfile) {
      this.removeReturnPolicyProfile = removeReturnPolicyProfile;
      return this;
    }
  }
}
