package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents the location where the physical good resides. You can stock inventory at active locations. Active
 * locations that have `fulfills_online_orders: true` and are configured with a shipping rate, pickup enabled or
 * local delivery will be able to sell from their storefront.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Location implements MetafieldReferencer, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * Whether the location can be reactivated. If `false`, then trying to activate the location with the
   * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
   * mutation will return an error that describes why the location can't be activated.
   */
  private boolean activatable;

  /**
   * The address of this location.
   */
  private LocationAddress address;

  /**
   * Whether the location address has been verified.
   */
  private boolean addressVerified;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was added to a shop.
   */
  private OffsetDateTime createdAt;

  /**
   * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling the
   * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivate)
   * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes why the
   * location can't be deactivated.
   */
  private boolean deactivatable;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * that the location was deactivated at. For example, 3:30 pm on September 7,
   * 2019 in the time zone of UTC (Universal Time Coordinated) is represented as
   * `"2019-09-07T15:50:00Z`".
   */
  private String deactivatedAt;

  /**
   * Whether this location can be deleted.
   */
  private boolean deletable;

  /**
   * Name of the service provider that fulfills from this location.
   */
  private FulfillmentService fulfillmentService;

  /**
   * Whether this location can fulfill online orders.
   */
  private boolean fulfillsOnlineOrders;

  /**
   * Whether this location has active inventory.
   */
  private boolean hasActiveInventory;

  /**
   * Whether this location has orders that need to be fulfilled.
   */
  private boolean hasUnfulfilledOrders;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The quantities of an inventory item at this location.
   */
  private InventoryLevel inventoryLevel;

  /**
   * A list of the quantities of the inventory items that can be stocked at this location.
   */
  private InventoryLevelConnection inventoryLevels;

  /**
   * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if it has
   * `activatable` set to `true` by calling the
   * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
   * mutation.
   */
  private boolean isActive;

  /**
   * Whether this location is a fulfillment service.
   */
  private boolean isFulfillmentService;

  /**
   * Whether the location is your primary location for shipping inventory.
   */
  private boolean isPrimary;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * Local pickup settings for the location.
   */
  private DeliveryLocalPickupSettings localPickupSettingsV2;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The name of the location.
   */
  private String name;

  /**
   * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this flag is ignored.
   */
  private boolean shipsInventory;

  /**
   * List of suggested addresses for this location (empty if none).
   */
  private List<LocationSuggestedAddress> suggestedAddresses;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was last updated.
   */
  private OffsetDateTime updatedAt;

  public Location() {
  }

  /**
   * Whether the location can be reactivated. If `false`, then trying to activate the location with the
   * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
   * mutation will return an error that describes why the location can't be activated.
   */
  public boolean getActivatable() {
    return activatable;
  }

  public void setActivatable(boolean activatable) {
    this.activatable = activatable;
  }

  /**
   * The address of this location.
   */
  public LocationAddress getAddress() {
    return address;
  }

  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  /**
   * Whether the location address has been verified.
   */
  public boolean getAddressVerified() {
    return addressVerified;
  }

  public void setAddressVerified(boolean addressVerified) {
    this.addressVerified = addressVerified;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was added to a shop.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling the
   * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivate)
   * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes why the
   * location can't be deactivated.
   */
  public boolean getDeactivatable() {
    return deactivatable;
  }

  public void setDeactivatable(boolean deactivatable) {
    this.deactivatable = deactivatable;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * that the location was deactivated at. For example, 3:30 pm on September 7,
   * 2019 in the time zone of UTC (Universal Time Coordinated) is represented as
   * `"2019-09-07T15:50:00Z`".
   */
  public String getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(String deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }

  /**
   * Whether this location can be deleted.
   */
  public boolean getDeletable() {
    return deletable;
  }

  public void setDeletable(boolean deletable) {
    this.deletable = deletable;
  }

  /**
   * Name of the service provider that fulfills from this location.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * Whether this location can fulfill online orders.
   */
  public boolean getFulfillsOnlineOrders() {
    return fulfillsOnlineOrders;
  }

  public void setFulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
    this.fulfillsOnlineOrders = fulfillsOnlineOrders;
  }

  /**
   * Whether this location has active inventory.
   */
  public boolean getHasActiveInventory() {
    return hasActiveInventory;
  }

  public void setHasActiveInventory(boolean hasActiveInventory) {
    this.hasActiveInventory = hasActiveInventory;
  }

  /**
   * Whether this location has orders that need to be fulfilled.
   */
  public boolean getHasUnfulfilledOrders() {
    return hasUnfulfilledOrders;
  }

  public void setHasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
    this.hasUnfulfilledOrders = hasUnfulfilledOrders;
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
   * The quantities of an inventory item at this location.
   */
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  /**
   * A list of the quantities of the inventory items that can be stocked at this location.
   */
  public InventoryLevelConnection getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(InventoryLevelConnection inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
  }

  /**
   * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if it has
   * `activatable` set to `true` by calling the
   * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
   * mutation.
   */
  public boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Whether this location is a fulfillment service.
   */
  public boolean getIsFulfillmentService() {
    return isFulfillmentService;
  }

  public void setIsFulfillmentService(boolean isFulfillmentService) {
    this.isFulfillmentService = isFulfillmentService;
  }

  /**
   * Whether the location is your primary location for shipping inventory.
   */
  public boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(boolean isPrimary) {
    this.isPrimary = isPrimary;
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
   * Local pickup settings for the location.
   */
  public DeliveryLocalPickupSettings getLocalPickupSettingsV2() {
    return localPickupSettingsV2;
  }

  public void setLocalPickupSettingsV2(DeliveryLocalPickupSettings localPickupSettingsV2) {
    this.localPickupSettingsV2 = localPickupSettingsV2;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the location.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this flag is ignored.
   */
  public boolean getShipsInventory() {
    return shipsInventory;
  }

  public void setShipsInventory(boolean shipsInventory) {
    this.shipsInventory = shipsInventory;
  }

  /**
   * List of suggested addresses for this location (empty if none).
   */
  public List<LocationSuggestedAddress> getSuggestedAddresses() {
    return suggestedAddresses;
  }

  public void setSuggestedAddresses(List<LocationSuggestedAddress> suggestedAddresses) {
    this.suggestedAddresses = suggestedAddresses;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Location{activatable='" + activatable + "', address='" + address + "', addressVerified='" + addressVerified + "', createdAt='" + createdAt + "', deactivatable='" + deactivatable + "', deactivatedAt='" + deactivatedAt + "', deletable='" + deletable + "', fulfillmentService='" + fulfillmentService + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', hasActiveInventory='" + hasActiveInventory + "', hasUnfulfilledOrders='" + hasUnfulfilledOrders + "', id='" + id + "', inventoryLevel='" + inventoryLevel + "', inventoryLevels='" + inventoryLevels + "', isActive='" + isActive + "', isFulfillmentService='" + isFulfillmentService + "', isPrimary='" + isPrimary + "', legacyResourceId='" + legacyResourceId + "', localPickupSettingsV2='" + localPickupSettingsV2 + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', shipsInventory='" + shipsInventory + "', suggestedAddresses='" + suggestedAddresses + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Location that = (Location) o;
    return activatable == that.activatable &&
        Objects.equals(address, that.address) &&
        addressVerified == that.addressVerified &&
        Objects.equals(createdAt, that.createdAt) &&
        deactivatable == that.deactivatable &&
        Objects.equals(deactivatedAt, that.deactivatedAt) &&
        deletable == that.deletable &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        fulfillsOnlineOrders == that.fulfillsOnlineOrders &&
        hasActiveInventory == that.hasActiveInventory &&
        hasUnfulfilledOrders == that.hasUnfulfilledOrders &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(inventoryLevels, that.inventoryLevels) &&
        isActive == that.isActive &&
        isFulfillmentService == that.isFulfillmentService &&
        isPrimary == that.isPrimary &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(localPickupSettingsV2, that.localPickupSettingsV2) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        shipsInventory == that.shipsInventory &&
        Objects.equals(suggestedAddresses, that.suggestedAddresses) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatable, address, addressVerified, createdAt, deactivatable, deactivatedAt, deletable, fulfillmentService, fulfillsOnlineOrders, hasActiveInventory, hasUnfulfilledOrders, id, inventoryLevel, inventoryLevels, isActive, isFulfillmentService, isPrimary, legacyResourceId, localPickupSettingsV2, metafield, metafieldDefinitions, metafields, name, shipsInventory, suggestedAddresses, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the location can be reactivated. If `false`, then trying to activate the location with the
     * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
     * mutation will return an error that describes why the location can't be activated.
     */
    private boolean activatable;

    /**
     * The address of this location.
     */
    private LocationAddress address;

    /**
     * Whether the location address has been verified.
     */
    private boolean addressVerified;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was added to a shop.
     */
    private OffsetDateTime createdAt;

    /**
     * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling the
     * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivate)
     * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes why the
     * location can't be deactivated.
     */
    private boolean deactivatable;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * that the location was deactivated at. For example, 3:30 pm on September 7,
     * 2019 in the time zone of UTC (Universal Time Coordinated) is represented as
     * `"2019-09-07T15:50:00Z`".
     */
    private String deactivatedAt;

    /**
     * Whether this location can be deleted.
     */
    private boolean deletable;

    /**
     * Name of the service provider that fulfills from this location.
     */
    private FulfillmentService fulfillmentService;

    /**
     * Whether this location can fulfill online orders.
     */
    private boolean fulfillsOnlineOrders;

    /**
     * Whether this location has active inventory.
     */
    private boolean hasActiveInventory;

    /**
     * Whether this location has orders that need to be fulfilled.
     */
    private boolean hasUnfulfilledOrders;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The quantities of an inventory item at this location.
     */
    private InventoryLevel inventoryLevel;

    /**
     * A list of the quantities of the inventory items that can be stocked at this location.
     */
    private InventoryLevelConnection inventoryLevels;

    /**
     * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if it has
     * `activatable` set to `true` by calling the
     * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
     * mutation.
     */
    private boolean isActive;

    /**
     * Whether this location is a fulfillment service.
     */
    private boolean isFulfillmentService;

    /**
     * Whether the location is your primary location for shipping inventory.
     */
    private boolean isPrimary;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * Local pickup settings for the location.
     */
    private DeliveryLocalPickupSettings localPickupSettingsV2;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The name of the location.
     */
    private String name;

    /**
     * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this flag is ignored.
     */
    private boolean shipsInventory;

    /**
     * List of suggested addresses for this location (empty if none).
     */
    private List<LocationSuggestedAddress> suggestedAddresses;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was last updated.
     */
    private OffsetDateTime updatedAt;

    public Location build() {
      Location result = new Location();
      result.activatable = this.activatable;
      result.address = this.address;
      result.addressVerified = this.addressVerified;
      result.createdAt = this.createdAt;
      result.deactivatable = this.deactivatable;
      result.deactivatedAt = this.deactivatedAt;
      result.deletable = this.deletable;
      result.fulfillmentService = this.fulfillmentService;
      result.fulfillsOnlineOrders = this.fulfillsOnlineOrders;
      result.hasActiveInventory = this.hasActiveInventory;
      result.hasUnfulfilledOrders = this.hasUnfulfilledOrders;
      result.id = this.id;
      result.inventoryLevel = this.inventoryLevel;
      result.inventoryLevels = this.inventoryLevels;
      result.isActive = this.isActive;
      result.isFulfillmentService = this.isFulfillmentService;
      result.isPrimary = this.isPrimary;
      result.legacyResourceId = this.legacyResourceId;
      result.localPickupSettingsV2 = this.localPickupSettingsV2;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.shipsInventory = this.shipsInventory;
      result.suggestedAddresses = this.suggestedAddresses;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Whether the location can be reactivated. If `false`, then trying to activate the location with the
     * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
     * mutation will return an error that describes why the location can't be activated.
     */
    public Builder activatable(boolean activatable) {
      this.activatable = activatable;
      return this;
    }

    /**
     * The address of this location.
     */
    public Builder address(LocationAddress address) {
      this.address = address;
      return this;
    }

    /**
     * Whether the location address has been verified.
     */
    public Builder addressVerified(boolean addressVerified) {
      this.addressVerified = addressVerified;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was added to a shop.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling the
     * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivate)
     * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes why the
     * location can't be deactivated.
     */
    public Builder deactivatable(boolean deactivatable) {
      this.deactivatable = deactivatable;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * that the location was deactivated at. For example, 3:30 pm on September 7,
     * 2019 in the time zone of UTC (Universal Time Coordinated) is represented as
     * `"2019-09-07T15:50:00Z`".
     */
    public Builder deactivatedAt(String deactivatedAt) {
      this.deactivatedAt = deactivatedAt;
      return this;
    }

    /**
     * Whether this location can be deleted.
     */
    public Builder deletable(boolean deletable) {
      this.deletable = deletable;
      return this;
    }

    /**
     * Name of the service provider that fulfills from this location.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * Whether this location can fulfill online orders.
     */
    public Builder fulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
      this.fulfillsOnlineOrders = fulfillsOnlineOrders;
      return this;
    }

    /**
     * Whether this location has active inventory.
     */
    public Builder hasActiveInventory(boolean hasActiveInventory) {
      this.hasActiveInventory = hasActiveInventory;
      return this;
    }

    /**
     * Whether this location has orders that need to be fulfilled.
     */
    public Builder hasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
      this.hasUnfulfilledOrders = hasUnfulfilledOrders;
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
     * The quantities of an inventory item at this location.
     */
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    /**
     * A list of the quantities of the inventory items that can be stocked at this location.
     */
    public Builder inventoryLevels(InventoryLevelConnection inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
      return this;
    }

    /**
     * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if it has
     * `activatable` set to `true` by calling the
     * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
     * mutation.
     */
    public Builder isActive(boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    /**
     * Whether this location is a fulfillment service.
     */
    public Builder isFulfillmentService(boolean isFulfillmentService) {
      this.isFulfillmentService = isFulfillmentService;
      return this;
    }

    /**
     * Whether the location is your primary location for shipping inventory.
     */
    public Builder isPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
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
     * Local pickup settings for the location.
     */
    public Builder localPickupSettingsV2(DeliveryLocalPickupSettings localPickupSettingsV2) {
      this.localPickupSettingsV2 = localPickupSettingsV2;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the location.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this flag is ignored.
     */
    public Builder shipsInventory(boolean shipsInventory) {
      this.shipsInventory = shipsInventory;
      return this;
    }

    /**
     * List of suggested addresses for this location (empty if none).
     */
    public Builder suggestedAddresses(List<LocationSuggestedAddress> suggestedAddresses) {
      this.suggestedAddresses = suggestedAddresses;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
