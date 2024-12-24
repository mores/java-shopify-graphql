package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryItem implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private CountryCode countryCodeOfOrigin;

  
  private CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes;

  
  private OffsetDateTime createdAt;

  
  private int duplicateSkuCount;

  
  private String harmonizedSystemCode;

  
  private String id;

  
  private String inventoryHistoryUrl;

  
  private InventoryLevel inventoryLevel;

  
  private InventoryLevelConnection inventoryLevels;

  
  private String legacyResourceId;

  
  private Count locationsCount;

  
  private InventoryItemMeasurement measurement;

  
  private String provinceCodeOfOrigin;

  
  private boolean requiresShipping;

  
  private String sku;

  
  private boolean tracked;

  
  private EditableProperty trackedEditable;

  
  private MoneyV2 unitCost;

  
  private OffsetDateTime updatedAt;

  
  private ProductVariant variant;

  public InventoryItem() {
  }

  
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  
  public CountryHarmonizedSystemCodeConnection getCountryHarmonizedSystemCodes() {
    return countryHarmonizedSystemCodes;
  }

  public void setCountryHarmonizedSystemCodes(
      CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes) {
    this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public int getDuplicateSkuCount() {
    return duplicateSkuCount;
  }

  public void setDuplicateSkuCount(int duplicateSkuCount) {
    this.duplicateSkuCount = duplicateSkuCount;
  }

  
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getInventoryHistoryUrl() {
    return inventoryHistoryUrl;
  }

  public void setInventoryHistoryUrl(String inventoryHistoryUrl) {
    this.inventoryHistoryUrl = inventoryHistoryUrl;
  }

  
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  
  public InventoryLevelConnection getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(InventoryLevelConnection inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public Count getLocationsCount() {
    return locationsCount;
  }

  public void setLocationsCount(Count locationsCount) {
    this.locationsCount = locationsCount;
  }

  
  public InventoryItemMeasurement getMeasurement() {
    return measurement;
  }

  public void setMeasurement(InventoryItemMeasurement measurement) {
    this.measurement = measurement;
  }

  
  public String getProvinceCodeOfOrigin() {
    return provinceCodeOfOrigin;
  }

  public void setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
    this.provinceCodeOfOrigin = provinceCodeOfOrigin;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public boolean getTracked() {
    return tracked;
  }

  public void setTracked(boolean tracked) {
    this.tracked = tracked;
  }

  
  public EditableProperty getTrackedEditable() {
    return trackedEditable;
  }

  public void setTrackedEditable(EditableProperty trackedEditable) {
    this.trackedEditable = trackedEditable;
  }

  
  public MoneyV2 getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(MoneyV2 unitCost) {
    this.unitCost = unitCost;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
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
    
    private CountryCode countryCodeOfOrigin;

    
    private CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes;

    
    private OffsetDateTime createdAt;

    
    private int duplicateSkuCount;

    
    private String harmonizedSystemCode;

    
    private String id;

    
    private String inventoryHistoryUrl;

    
    private InventoryLevel inventoryLevel;

    
    private InventoryLevelConnection inventoryLevels;

    
    private String legacyResourceId;

    
    private Count locationsCount;

    
    private InventoryItemMeasurement measurement;

    
    private String provinceCodeOfOrigin;

    
    private boolean requiresShipping;

    
    private String sku;

    
    private boolean tracked;

    
    private EditableProperty trackedEditable;

    
    private MoneyV2 unitCost;

    
    private OffsetDateTime updatedAt;

    
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

    
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    
    public Builder countryHarmonizedSystemCodes(
        CountryHarmonizedSystemCodeConnection countryHarmonizedSystemCodes) {
      this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder duplicateSkuCount(int duplicateSkuCount) {
      this.duplicateSkuCount = duplicateSkuCount;
      return this;
    }

    
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inventoryHistoryUrl(String inventoryHistoryUrl) {
      this.inventoryHistoryUrl = inventoryHistoryUrl;
      return this;
    }

    
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    
    public Builder inventoryLevels(InventoryLevelConnection inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder locationsCount(Count locationsCount) {
      this.locationsCount = locationsCount;
      return this;
    }

    
    public Builder measurement(InventoryItemMeasurement measurement) {
      this.measurement = measurement;
      return this;
    }

    
    public Builder provinceCodeOfOrigin(String provinceCodeOfOrigin) {
      this.provinceCodeOfOrigin = provinceCodeOfOrigin;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder tracked(boolean tracked) {
      this.tracked = tracked;
      return this;
    }

    
    public Builder trackedEditable(EditableProperty trackedEditable) {
      this.trackedEditable = trackedEditable;
      return this;
    }

    
    public Builder unitCost(MoneyV2 unitCost) {
      this.unitCost = unitCost;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
