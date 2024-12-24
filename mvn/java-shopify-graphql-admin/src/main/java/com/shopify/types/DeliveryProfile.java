package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryProfile implements com.shopify.types.Node {
  
  private int activeMethodDefinitionsCount;

  
  private boolean _default;

  
  private String id;

  
  private boolean legacyMode;

  
  private int locationsWithoutRatesCount;

  
  private String name;

  
  private int originLocationCount;

  
  private Count productVariantsCount;

  
  private DeliveryProductVariantsCount productVariantsCountV2;

  
  private DeliveryProfileItemConnection profileItems;

  
  private List<DeliveryProfileLocationGroup> profileLocationGroups;

  
  private SellingPlanGroupConnection sellingPlanGroups;

  
  private List<Location> unassignedLocations;

  
  private LocationConnection unassignedLocationsPaginated;

  
  private int zoneCountryCount;

  public DeliveryProfile() {
  }

  
  public int getActiveMethodDefinitionsCount() {
    return activeMethodDefinitionsCount;
  }

  public void setActiveMethodDefinitionsCount(int activeMethodDefinitionsCount) {
    this.activeMethodDefinitionsCount = activeMethodDefinitionsCount;
  }

  
  public boolean getDefault() {
    return _default;
  }

  public void setDefault(boolean _default) {
    this._default = _default;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getLegacyMode() {
    return legacyMode;
  }

  public void setLegacyMode(boolean legacyMode) {
    this.legacyMode = legacyMode;
  }

  
  public int getLocationsWithoutRatesCount() {
    return locationsWithoutRatesCount;
  }

  public void setLocationsWithoutRatesCount(int locationsWithoutRatesCount) {
    this.locationsWithoutRatesCount = locationsWithoutRatesCount;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getOriginLocationCount() {
    return originLocationCount;
  }

  public void setOriginLocationCount(int originLocationCount) {
    this.originLocationCount = originLocationCount;
  }

  
  public Count getProductVariantsCount() {
    return productVariantsCount;
  }

  public void setProductVariantsCount(Count productVariantsCount) {
    this.productVariantsCount = productVariantsCount;
  }

  
  public DeliveryProductVariantsCount getProductVariantsCountV2() {
    return productVariantsCountV2;
  }

  public void setProductVariantsCountV2(DeliveryProductVariantsCount productVariantsCountV2) {
    this.productVariantsCountV2 = productVariantsCountV2;
  }

  
  public DeliveryProfileItemConnection getProfileItems() {
    return profileItems;
  }

  public void setProfileItems(DeliveryProfileItemConnection profileItems) {
    this.profileItems = profileItems;
  }

  
  public List<DeliveryProfileLocationGroup> getProfileLocationGroups() {
    return profileLocationGroups;
  }

  public void setProfileLocationGroups(List<DeliveryProfileLocationGroup> profileLocationGroups) {
    this.profileLocationGroups = profileLocationGroups;
  }

  
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  
  public List<Location> getUnassignedLocations() {
    return unassignedLocations;
  }

  public void setUnassignedLocations(List<Location> unassignedLocations) {
    this.unassignedLocations = unassignedLocations;
  }

  
  public LocationConnection getUnassignedLocationsPaginated() {
    return unassignedLocationsPaginated;
  }

  public void setUnassignedLocationsPaginated(LocationConnection unassignedLocationsPaginated) {
    this.unassignedLocationsPaginated = unassignedLocationsPaginated;
  }

  
  public int getZoneCountryCount() {
    return zoneCountryCount;
  }

  public void setZoneCountryCount(int zoneCountryCount) {
    this.zoneCountryCount = zoneCountryCount;
  }

  @Override
  public String toString() {
    return "DeliveryProfile{activeMethodDefinitionsCount='" + activeMethodDefinitionsCount + "', default='" + _default + "', id='" + id + "', legacyMode='" + legacyMode + "', locationsWithoutRatesCount='" + locationsWithoutRatesCount + "', name='" + name + "', originLocationCount='" + originLocationCount + "', productVariantsCount='" + productVariantsCount + "', productVariantsCountV2='" + productVariantsCountV2 + "', profileItems='" + profileItems + "', profileLocationGroups='" + profileLocationGroups + "', sellingPlanGroups='" + sellingPlanGroups + "', unassignedLocations='" + unassignedLocations + "', unassignedLocationsPaginated='" + unassignedLocationsPaginated + "', zoneCountryCount='" + zoneCountryCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfile that = (DeliveryProfile) o;
    return activeMethodDefinitionsCount == that.activeMethodDefinitionsCount &&
        _default == that._default &&
        Objects.equals(id, that.id) &&
        legacyMode == that.legacyMode &&
        locationsWithoutRatesCount == that.locationsWithoutRatesCount &&
        Objects.equals(name, that.name) &&
        originLocationCount == that.originLocationCount &&
        Objects.equals(productVariantsCount, that.productVariantsCount) &&
        Objects.equals(productVariantsCountV2, that.productVariantsCountV2) &&
        Objects.equals(profileItems, that.profileItems) &&
        Objects.equals(profileLocationGroups, that.profileLocationGroups) &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(unassignedLocations, that.unassignedLocations) &&
        Objects.equals(unassignedLocationsPaginated, that.unassignedLocationsPaginated) &&
        zoneCountryCount == that.zoneCountryCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMethodDefinitionsCount, _default, id, legacyMode, locationsWithoutRatesCount, name, originLocationCount, productVariantsCount, productVariantsCountV2, profileItems, profileLocationGroups, sellingPlanGroups, unassignedLocations, unassignedLocationsPaginated, zoneCountryCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int activeMethodDefinitionsCount;

    
    private boolean _default;

    
    private String id;

    
    private boolean legacyMode;

    
    private int locationsWithoutRatesCount;

    
    private String name;

    
    private int originLocationCount;

    
    private Count productVariantsCount;

    
    private DeliveryProductVariantsCount productVariantsCountV2;

    
    private DeliveryProfileItemConnection profileItems;

    
    private List<DeliveryProfileLocationGroup> profileLocationGroups;

    
    private SellingPlanGroupConnection sellingPlanGroups;

    
    private List<Location> unassignedLocations;

    
    private LocationConnection unassignedLocationsPaginated;

    
    private int zoneCountryCount;

    public DeliveryProfile build() {
      DeliveryProfile result = new DeliveryProfile();
      result.activeMethodDefinitionsCount = this.activeMethodDefinitionsCount;
      result._default = this._default;
      result.id = this.id;
      result.legacyMode = this.legacyMode;
      result.locationsWithoutRatesCount = this.locationsWithoutRatesCount;
      result.name = this.name;
      result.originLocationCount = this.originLocationCount;
      result.productVariantsCount = this.productVariantsCount;
      result.productVariantsCountV2 = this.productVariantsCountV2;
      result.profileItems = this.profileItems;
      result.profileLocationGroups = this.profileLocationGroups;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.unassignedLocations = this.unassignedLocations;
      result.unassignedLocationsPaginated = this.unassignedLocationsPaginated;
      result.zoneCountryCount = this.zoneCountryCount;
      return result;
    }

    
    public Builder activeMethodDefinitionsCount(int activeMethodDefinitionsCount) {
      this.activeMethodDefinitionsCount = activeMethodDefinitionsCount;
      return this;
    }

    
    public Builder _default(boolean _default) {
      this._default = _default;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder legacyMode(boolean legacyMode) {
      this.legacyMode = legacyMode;
      return this;
    }

    
    public Builder locationsWithoutRatesCount(int locationsWithoutRatesCount) {
      this.locationsWithoutRatesCount = locationsWithoutRatesCount;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder originLocationCount(int originLocationCount) {
      this.originLocationCount = originLocationCount;
      return this;
    }

    
    public Builder productVariantsCount(Count productVariantsCount) {
      this.productVariantsCount = productVariantsCount;
      return this;
    }

    
    public Builder productVariantsCountV2(DeliveryProductVariantsCount productVariantsCountV2) {
      this.productVariantsCountV2 = productVariantsCountV2;
      return this;
    }

    
    public Builder profileItems(DeliveryProfileItemConnection profileItems) {
      this.profileItems = profileItems;
      return this;
    }

    
    public Builder profileLocationGroups(List<DeliveryProfileLocationGroup> profileLocationGroups) {
      this.profileLocationGroups = profileLocationGroups;
      return this;
    }

    
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    
    public Builder unassignedLocations(List<Location> unassignedLocations) {
      this.unassignedLocations = unassignedLocations;
      return this;
    }

    
    public Builder unassignedLocationsPaginated(LocationConnection unassignedLocationsPaginated) {
      this.unassignedLocationsPaginated = unassignedLocationsPaginated;
      return this;
    }

    
    public Builder zoneCountryCount(int zoneCountryCount) {
      this.zoneCountryCount = zoneCountryCount;
      return this;
    }
  }
}
