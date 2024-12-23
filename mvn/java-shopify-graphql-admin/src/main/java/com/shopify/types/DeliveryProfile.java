package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A shipping profile. In Shopify, a shipping profile is a set of shipping rates
 * scoped to a set of products or variants that can be shipped from selected
 * locations to zones. Learn more about [building with delivery profiles](https://shopify.dev/apps/build/purchase-options/deferred/delivery-and-deferment/build-delivery-profiles).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryProfile implements com.shopify.types.Node {
  /**
   * The number of active shipping rates for the profile.
   */
  private int activeMethodDefinitionsCount;

  /**
   * Whether this is the default profile.
   */
  private boolean _default;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether this shop has enabled legacy compatibility mode for delivery profiles.
   */
  private boolean legacyMode;

  /**
   * The number of locations without rates defined.
   */
  private int locationsWithoutRatesCount;

  /**
   * The name of the delivery profile.
   */
  private String name;

  /**
   * The number of active origin locations for the profile.
   */
  private int originLocationCount;

  /**
   * How many product variants are in this profile.
   */
  private Count productVariantsCount;

  /**
   * How many product variants are in this profile.
   */
  private DeliveryProductVariantsCount productVariantsCountV2;

  /**
   * The products and variants associated with this profile.
   */
  private DeliveryProfileItemConnection profileItems;

  /**
   * The location groups and associated zones using this profile.
   */
  private List<DeliveryProfileLocationGroup> profileLocationGroups;

  /**
   * Selling plan groups associated with the specified delivery profile.
   */
  private SellingPlanGroupConnection sellingPlanGroups;

  /**
   * List of locations that haven't been assigned to a location group for this profile.
   */
  private List<Location> unassignedLocations;

  /**
   * List of locations that have not been assigned to a location group for this profile.
   */
  private LocationConnection unassignedLocationsPaginated;

  /**
   * The number of countries with active rates to deliver to.
   */
  private int zoneCountryCount;

  public DeliveryProfile() {
  }

  /**
   * The number of active shipping rates for the profile.
   */
  public int getActiveMethodDefinitionsCount() {
    return activeMethodDefinitionsCount;
  }

  public void setActiveMethodDefinitionsCount(int activeMethodDefinitionsCount) {
    this.activeMethodDefinitionsCount = activeMethodDefinitionsCount;
  }

  /**
   * Whether this is the default profile.
   */
  public boolean getDefault() {
    return _default;
  }

  public void setDefault(boolean _default) {
    this._default = _default;
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
   * Whether this shop has enabled legacy compatibility mode for delivery profiles.
   */
  public boolean getLegacyMode() {
    return legacyMode;
  }

  public void setLegacyMode(boolean legacyMode) {
    this.legacyMode = legacyMode;
  }

  /**
   * The number of locations without rates defined.
   */
  public int getLocationsWithoutRatesCount() {
    return locationsWithoutRatesCount;
  }

  public void setLocationsWithoutRatesCount(int locationsWithoutRatesCount) {
    this.locationsWithoutRatesCount = locationsWithoutRatesCount;
  }

  /**
   * The name of the delivery profile.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of active origin locations for the profile.
   */
  public int getOriginLocationCount() {
    return originLocationCount;
  }

  public void setOriginLocationCount(int originLocationCount) {
    this.originLocationCount = originLocationCount;
  }

  /**
   * How many product variants are in this profile.
   */
  public Count getProductVariantsCount() {
    return productVariantsCount;
  }

  public void setProductVariantsCount(Count productVariantsCount) {
    this.productVariantsCount = productVariantsCount;
  }

  /**
   * How many product variants are in this profile.
   */
  public DeliveryProductVariantsCount getProductVariantsCountV2() {
    return productVariantsCountV2;
  }

  public void setProductVariantsCountV2(DeliveryProductVariantsCount productVariantsCountV2) {
    this.productVariantsCountV2 = productVariantsCountV2;
  }

  /**
   * The products and variants associated with this profile.
   */
  public DeliveryProfileItemConnection getProfileItems() {
    return profileItems;
  }

  public void setProfileItems(DeliveryProfileItemConnection profileItems) {
    this.profileItems = profileItems;
  }

  /**
   * The location groups and associated zones using this profile.
   */
  public List<DeliveryProfileLocationGroup> getProfileLocationGroups() {
    return profileLocationGroups;
  }

  public void setProfileLocationGroups(List<DeliveryProfileLocationGroup> profileLocationGroups) {
    this.profileLocationGroups = profileLocationGroups;
  }

  /**
   * Selling plan groups associated with the specified delivery profile.
   */
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  /**
   * List of locations that haven't been assigned to a location group for this profile.
   */
  public List<Location> getUnassignedLocations() {
    return unassignedLocations;
  }

  public void setUnassignedLocations(List<Location> unassignedLocations) {
    this.unassignedLocations = unassignedLocations;
  }

  /**
   * List of locations that have not been assigned to a location group for this profile.
   */
  public LocationConnection getUnassignedLocationsPaginated() {
    return unassignedLocationsPaginated;
  }

  public void setUnassignedLocationsPaginated(LocationConnection unassignedLocationsPaginated) {
    this.unassignedLocationsPaginated = unassignedLocationsPaginated;
  }

  /**
   * The number of countries with active rates to deliver to.
   */
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
    /**
     * The number of active shipping rates for the profile.
     */
    private int activeMethodDefinitionsCount;

    /**
     * Whether this is the default profile.
     */
    private boolean _default;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether this shop has enabled legacy compatibility mode for delivery profiles.
     */
    private boolean legacyMode;

    /**
     * The number of locations without rates defined.
     */
    private int locationsWithoutRatesCount;

    /**
     * The name of the delivery profile.
     */
    private String name;

    /**
     * The number of active origin locations for the profile.
     */
    private int originLocationCount;

    /**
     * How many product variants are in this profile.
     */
    private Count productVariantsCount;

    /**
     * How many product variants are in this profile.
     */
    private DeliveryProductVariantsCount productVariantsCountV2;

    /**
     * The products and variants associated with this profile.
     */
    private DeliveryProfileItemConnection profileItems;

    /**
     * The location groups and associated zones using this profile.
     */
    private List<DeliveryProfileLocationGroup> profileLocationGroups;

    /**
     * Selling plan groups associated with the specified delivery profile.
     */
    private SellingPlanGroupConnection sellingPlanGroups;

    /**
     * List of locations that haven't been assigned to a location group for this profile.
     */
    private List<Location> unassignedLocations;

    /**
     * List of locations that have not been assigned to a location group for this profile.
     */
    private LocationConnection unassignedLocationsPaginated;

    /**
     * The number of countries with active rates to deliver to.
     */
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

    /**
     * The number of active shipping rates for the profile.
     */
    public Builder activeMethodDefinitionsCount(int activeMethodDefinitionsCount) {
      this.activeMethodDefinitionsCount = activeMethodDefinitionsCount;
      return this;
    }

    /**
     * Whether this is the default profile.
     */
    public Builder _default(boolean _default) {
      this._default = _default;
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
     * Whether this shop has enabled legacy compatibility mode for delivery profiles.
     */
    public Builder legacyMode(boolean legacyMode) {
      this.legacyMode = legacyMode;
      return this;
    }

    /**
     * The number of locations without rates defined.
     */
    public Builder locationsWithoutRatesCount(int locationsWithoutRatesCount) {
      this.locationsWithoutRatesCount = locationsWithoutRatesCount;
      return this;
    }

    /**
     * The name of the delivery profile.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The number of active origin locations for the profile.
     */
    public Builder originLocationCount(int originLocationCount) {
      this.originLocationCount = originLocationCount;
      return this;
    }

    /**
     * How many product variants are in this profile.
     */
    public Builder productVariantsCount(Count productVariantsCount) {
      this.productVariantsCount = productVariantsCount;
      return this;
    }

    /**
     * How many product variants are in this profile.
     */
    public Builder productVariantsCountV2(DeliveryProductVariantsCount productVariantsCountV2) {
      this.productVariantsCountV2 = productVariantsCountV2;
      return this;
    }

    /**
     * The products and variants associated with this profile.
     */
    public Builder profileItems(DeliveryProfileItemConnection profileItems) {
      this.profileItems = profileItems;
      return this;
    }

    /**
     * The location groups and associated zones using this profile.
     */
    public Builder profileLocationGroups(List<DeliveryProfileLocationGroup> profileLocationGroups) {
      this.profileLocationGroups = profileLocationGroups;
      return this;
    }

    /**
     * Selling plan groups associated with the specified delivery profile.
     */
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    /**
     * List of locations that haven't been assigned to a location group for this profile.
     */
    public Builder unassignedLocations(List<Location> unassignedLocations) {
      this.unassignedLocations = unassignedLocations;
      return this;
    }

    /**
     * List of locations that have not been assigned to a location group for this profile.
     */
    public Builder unassignedLocationsPaginated(LocationConnection unassignedLocationsPaginated) {
      this.unassignedLocationsPaginated = unassignedLocationsPaginated;
      return this;
    }

    /**
     * The number of countries with active rates to deliver to.
     */
    public Builder zoneCountryCount(int zoneCountryCount) {
      this.zoneCountryCount = zoneCountryCount;
      return this;
    }
  }
}
