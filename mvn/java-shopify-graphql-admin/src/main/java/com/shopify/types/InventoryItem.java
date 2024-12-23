package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the goods available to be shipped to a customer.
 * It holds essential information about the goods, including SKU and whether it is tracked.
 * Learn [more about the relationships between inventory objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#inventory-object-relationships).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryItem implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The ISO 3166-1 alpha-2 country code of where the item originated from.
   */
  private CountryCode countryCodeOfOrigin;

  /**
   * A list of country specific harmonized system codes.
   */
  private CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes;

  /**
   * The date and time when the inventory item was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The number of inventory items that share the same SKU with this item.
   */
  private int duplicateSkuCount;

  /**
   * The harmonized system code of the item.
   */
  private String harmonizedSystemCode;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The URL that points to the inventory history for the item.
   */
  private String inventoryHistoryUrl;

  /**
   * The inventory item's quantities at the specified location.
   */
  private InventoryLevel inventoryLevel;

  /**
   * A list of the inventory item's quantities for each location that the inventory item can be stocked at.
   */
  private InventoryLevelConnection inventoryLevels;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The number of locations where this inventory item is stocked.
   */
  private Count locationsCount;

  /**
   * The packaging dimensions of the inventory item.
   */
  private InventoryItemMeasurement measurement;

  /**
   * The ISO 3166-2 alpha-2 province code of where the item originated from.
   */
  private String provinceCodeOfOrigin;

  /**
   * Whether the inventory item requires shipping.
   */
  private boolean requiresShipping;

  /**
   * Inventory item SKU. Case-sensitive string.
   */
  private String sku;

  /**
   * Whether inventory levels are tracked for the item.
   */
  private boolean tracked;

  /**
   * Whether the value of the `tracked` field for the inventory item can be changed.
   */
  private EditableProperty trackedEditable;

  /**
   * Unit cost associated with the inventory item. Note: the user must have "View
   * product costs" permission granted in order to access this field once product
   * granular permissions are enabled.
   */
  private MoneyV2 unitCost;

  /**
   * The date and time when the inventory item was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The variant that owns this inventory item.
   */
  private ProductVariant variant;

  public InventoryItem() {
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
   * A list of country specific harmonized system codes.
   */
  public CountryHarmonizedSystemCodeConnection getCountryHarmonizedSystemCodes() {
    return countryHarmonizedSystemCodes;
  }

  public void setCountryHarmonizedSystemCodes(
      CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes) {
    this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
  }

  /**
   * The date and time when the inventory item was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The number of inventory items that share the same SKU with this item.
   */
  public int getDuplicateSkuCount() {
    return duplicateSkuCount;
  }

  public void setDuplicateSkuCount(int duplicateSkuCount) {
    this.duplicateSkuCount = duplicateSkuCount;
  }

  /**
   * The harmonized system code of the item.
   */
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URL that points to the inventory history for the item.
   */
  public String getInventoryHistoryUrl() {
    return inventoryHistoryUrl;
  }

  public void setInventoryHistoryUrl(String inventoryHistoryUrl) {
    this.inventoryHistoryUrl = inventoryHistoryUrl;
  }

  /**
   * The inventory item's quantities at the specified location.
   */
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  /**
   * A list of the inventory item's quantities for each location that the inventory item can be stocked at.
   */
  public InventoryLevelConnection getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(InventoryLevelConnection inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The number of locations where this inventory item is stocked.
   */
  public Count getLocationsCount() {
    return locationsCount;
  }

  public void setLocationsCount(Count locationsCount) {
    this.locationsCount = locationsCount;
  }

  /**
   * The packaging dimensions of the inventory item.
   */
  public InventoryItemMeasurement getMeasurement() {
    return measurement;
  }

  public void setMeasurement(InventoryItemMeasurement measurement) {
    this.measurement = measurement;
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
   * Whether the inventory item requires shipping.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Inventory item SKU. Case-sensitive string.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Whether inventory levels are tracked for the item.
   */
  public boolean getTracked() {
    return tracked;
  }

  public void setTracked(boolean tracked) {
    this.tracked = tracked;
  }

  /**
   * Whether the value of the `tracked` field for the inventory item can be changed.
   */
  public EditableProperty getTrackedEditable() {
    return trackedEditable;
  }

  public void setTrackedEditable(EditableProperty trackedEditable) {
    this.trackedEditable = trackedEditable;
  }

  /**
   * Unit cost associated with the inventory item. Note: the user must have "View
   * product costs" permission granted in order to access this field once product
   * granular permissions are enabled.
   */
  public MoneyV2 getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(MoneyV2 unitCost) {
    this.unitCost = unitCost;
  }

  /**
   * The date and time when the inventory item was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The variant that owns this inventory item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "InventoryItem{countryCodeOfOrigin='" + countryCodeOfOrigin + "', countryHarmonizedSystemCodes='" + countryHarmonizedSystemCodes + "', createdAt='" + createdAt + "', duplicateSkuCount='" + duplicateSkuCount + "', harmonizedSystemCode='" + harmonizedSystemCode + "', id='" + id + "', inventoryHistoryUrl='" + inventoryHistoryUrl + "', inventoryLevel='" + inventoryLevel + "', inventoryLevels='" + inventoryLevels + "', legacyResourceId='" + legacyResourceId + "', locationsCount='" + locationsCount + "', measurement='" + measurement + "', provinceCodeOfOrigin='" + provinceCodeOfOrigin + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', tracked='" + tracked + "', trackedEditable='" + trackedEditable + "', unitCost='" + unitCost + "', updatedAt='" + updatedAt + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItem that = (InventoryItem) o;
    return Objects.equals(countryCodeOfOrigin, that.countryCodeOfOrigin) &&
        Objects.equals(countryHarmonizedSystemCodes, that.countryHarmonizedSystemCodes) &&
        Objects.equals(createdAt, that.createdAt) &&
        duplicateSkuCount == that.duplicateSkuCount &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryHistoryUrl, that.inventoryHistoryUrl) &&
        Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(inventoryLevels, that.inventoryLevels) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(locationsCount, that.locationsCount) &&
        Objects.equals(measurement, that.measurement) &&
        Objects.equals(provinceCodeOfOrigin, that.provinceCodeOfOrigin) &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        tracked == that.tracked &&
        Objects.equals(trackedEditable, that.trackedEditable) &&
        Objects.equals(unitCost, that.unitCost) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodeOfOrigin, countryHarmonizedSystemCodes, createdAt, duplicateSkuCount, harmonizedSystemCode, id, inventoryHistoryUrl, inventoryLevel, inventoryLevels, legacyResourceId, locationsCount, measurement, provinceCodeOfOrigin, requiresShipping, sku, tracked, trackedEditable, unitCost, updatedAt, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    private CountryCode countryCodeOfOrigin;

    /**
     * A list of country specific harmonized system codes.
     */
    private CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes;

    /**
     * The date and time when the inventory item was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The number of inventory items that share the same SKU with this item.
     */
    private int duplicateSkuCount;

    /**
     * The harmonized system code of the item.
     */
    private String harmonizedSystemCode;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The URL that points to the inventory history for the item.
     */
    private String inventoryHistoryUrl;

    /**
     * The inventory item's quantities at the specified location.
     */
    private InventoryLevel inventoryLevel;

    /**
     * A list of the inventory item's quantities for each location that the inventory item can be stocked at.
     */
    private InventoryLevelConnection inventoryLevels;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The number of locations where this inventory item is stocked.
     */
    private Count locationsCount;

    /**
     * The packaging dimensions of the inventory item.
     */
    private InventoryItemMeasurement measurement;

    /**
     * The ISO 3166-2 alpha-2 province code of where the item originated from.
     */
    private String provinceCodeOfOrigin;

    /**
     * Whether the inventory item requires shipping.
     */
    private boolean requiresShipping;

    /**
     * Inventory item SKU. Case-sensitive string.
     */
    private String sku;

    /**
     * Whether inventory levels are tracked for the item.
     */
    private boolean tracked;

    /**
     * Whether the value of the `tracked` field for the inventory item can be changed.
     */
    private EditableProperty trackedEditable;

    /**
     * Unit cost associated with the inventory item. Note: the user must have "View
     * product costs" permission granted in order to access this field once product
     * granular permissions are enabled.
     */
    private MoneyV2 unitCost;

    /**
     * The date and time when the inventory item was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The variant that owns this inventory item.
     */
    private ProductVariant variant;

    public InventoryItem build() {
      InventoryItem result = new InventoryItem();
      result.countryCodeOfOrigin = this.countryCodeOfOrigin;
      result.countryHarmonizedSystemCodes = this.countryHarmonizedSystemCodes;
      result.createdAt = this.createdAt;
      result.duplicateSkuCount = this.duplicateSkuCount;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.id = this.id;
      result.inventoryHistoryUrl = this.inventoryHistoryUrl;
      result.inventoryLevel = this.inventoryLevel;
      result.inventoryLevels = this.inventoryLevels;
      result.legacyResourceId = this.legacyResourceId;
      result.locationsCount = this.locationsCount;
      result.measurement = this.measurement;
      result.provinceCodeOfOrigin = this.provinceCodeOfOrigin;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.tracked = this.tracked;
      result.trackedEditable = this.trackedEditable;
      result.unitCost = this.unitCost;
      result.updatedAt = this.updatedAt;
      result.variant = this.variant;
      return result;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    /**
     * A list of country specific harmonized system codes.
     */
    public Builder countryHarmonizedSystemCodes(
        CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes) {
      this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
      return this;
    }

    /**
     * The date and time when the inventory item was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The number of inventory items that share the same SKU with this item.
     */
    public Builder duplicateSkuCount(int duplicateSkuCount) {
      this.duplicateSkuCount = duplicateSkuCount;
      return this;
    }

    /**
     * The harmonized system code of the item.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The URL that points to the inventory history for the item.
     */
    public Builder inventoryHistoryUrl(String inventoryHistoryUrl) {
      this.inventoryHistoryUrl = inventoryHistoryUrl;
      return this;
    }

    /**
     * The inventory item's quantities at the specified location.
     */
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    /**
     * A list of the inventory item's quantities for each location that the inventory item can be stocked at.
     */
    public Builder inventoryLevels(InventoryLevelConnection inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The number of locations where this inventory item is stocked.
     */
    public Builder locationsCount(Count locationsCount) {
      this.locationsCount = locationsCount;
      return this;
    }

    /**
     * The packaging dimensions of the inventory item.
     */
    public Builder measurement(InventoryItemMeasurement measurement) {
      this.measurement = measurement;
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
     * Whether the inventory item requires shipping.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Inventory item SKU. Case-sensitive string.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Whether inventory levels are tracked for the item.
     */
    public Builder tracked(boolean tracked) {
      this.tracked = tracked;
      return this;
    }

    /**
     * Whether the value of the `tracked` field for the inventory item can be changed.
     */
    public Builder trackedEditable(EditableProperty trackedEditable) {
      this.trackedEditable = trackedEditable;
      return this;
    }

    /**
     * Unit cost associated with the inventory item. Note: the user must have "View
     * product costs" permission granted in order to access this field once product
     * granular permissions are enabled.
     */
    public Builder unitCost(MoneyV2 unitCost) {
      this.unitCost = unitCost;
      return this;
    }

    /**
     * The date and time when the inventory item was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The variant that owns this inventory item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
