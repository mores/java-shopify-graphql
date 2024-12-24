package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Location implements MetafieldReferencer, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private boolean activatable;

  
  private LocationAddress address;

  
  private boolean addressVerified;

  
  private OffsetDateTime createdAt;

  
  private boolean deactivatable;

  
  private String deactivatedAt;

  
  private boolean deletable;

  
  private FulfillmentService fulfillmentService;

  
  private boolean fulfillsOnlineOrders;

  
  private boolean hasActiveInventory;

  
  private boolean hasUnfulfilledOrders;

  
  private String id;

  
  private InventoryLevel inventoryLevel;

  
  private InventoryLevelConnection inventoryLevels;

  
  private boolean isActive;

  
  private boolean isFulfillmentService;

  
  private boolean isPrimary;

  
  private String legacyResourceId;

  
  private DeliveryLocalPickupSettings localPickupSettingsV2;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private boolean shipsInventory;

  
  private List<LocationSuggestedAddress> suggestedAddresses;

  
  private OffsetDateTime updatedAt;

  public Location() {
  }

  
  public boolean getActivatable() {
    return activatable;
  }

  public void setActivatable(boolean activatable) {
    this.activatable = activatable;
  }

  
  public LocationAddress getAddress() {
    return address;
  }

  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  
  public boolean getAddressVerified() {
    return addressVerified;
  }

  public void setAddressVerified(boolean addressVerified) {
    this.addressVerified = addressVerified;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public boolean getDeactivatable() {
    return deactivatable;
  }

  public void setDeactivatable(boolean deactivatable) {
    this.deactivatable = deactivatable;
  }

  
  public String getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(String deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }

  
  public boolean getDeletable() {
    return deletable;
  }

  public void setDeletable(boolean deletable) {
    this.deletable = deletable;
  }

  
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  
  public boolean getFulfillsOnlineOrders() {
    return fulfillsOnlineOrders;
  }

  public void setFulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
    this.fulfillsOnlineOrders = fulfillsOnlineOrders;
  }

  
  public boolean getHasActiveInventory() {
    return hasActiveInventory;
  }

  public void setHasActiveInventory(boolean hasActiveInventory) {
    this.hasActiveInventory = hasActiveInventory;
  }

  
  public boolean getHasUnfulfilledOrders() {
    return hasUnfulfilledOrders;
  }

  public void setHasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
    this.hasUnfulfilledOrders = hasUnfulfilledOrders;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  
  public boolean getIsFulfillmentService() {
    return isFulfillmentService;
  }

  public void setIsFulfillmentService(boolean isFulfillmentService) {
    this.isFulfillmentService = isFulfillmentService;
  }

  
  public boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public DeliveryLocalPickupSettings getLocalPickupSettingsV2() {
    return localPickupSettingsV2;
  }

  public void setLocalPickupSettingsV2(DeliveryLocalPickupSettings localPickupSettingsV2) {
    this.localPickupSettingsV2 = localPickupSettingsV2;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public boolean getShipsInventory() {
    return shipsInventory;
  }

  public void setShipsInventory(boolean shipsInventory) {
    this.shipsInventory = shipsInventory;
  }

  
  public List<LocationSuggestedAddress> getSuggestedAddresses() {
    return suggestedAddresses;
  }

  public void setSuggestedAddresses(List<LocationSuggestedAddress> suggestedAddresses) {
    this.suggestedAddresses = suggestedAddresses;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Location{activatable='" + activatable + "', address='" + address + "', addressVerified='" + addressVerified + "', createdAt='" + createdAt + "', deactivatable='" + deactivatable + "', deactivatedAt='" + deactivatedAt + "', deletable='" + deletable + "', fulfillmentService='" + fulfillmentService + "', fulfillsOnlineOrders='" + fulfillsOnlineOrders + "', hasActiveInventory='" + hasActiveInventory + "', hasUnfulfilledOrders='" + hasUnfulfilledOrders + "', id='" + id + "', inventoryLevel='" + inventoryLevel + "', inventoryLevels='" + inventoryLevels + "', isActive='" + isActive + "', isFulfillmentService='" + isFulfillmentService + "', isPrimary='" + isPrimary + "', legacyResourceId='" + legacyResourceId + "', localPickupSettingsV2='" + localPickupSettingsV2 + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', shipsInventory='" + shipsInventory + "', suggestedAddresses='" + suggestedAddresses + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        shipsInventory == that.shipsInventory &&
        Objects.equals(suggestedAddresses, that.suggestedAddresses) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatable, address, addressVerified, createdAt, deactivatable, deactivatedAt, deletable, fulfillmentService, fulfillsOnlineOrders, hasActiveInventory, hasUnfulfilledOrders, id, inventoryLevel, inventoryLevels, isActive, isFulfillmentService, isPrimary, legacyResourceId, localPickupSettingsV2, metafield, metafieldDefinitions, metafields, name, privateMetafield, privateMetafields, shipsInventory, suggestedAddresses, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean activatable;

    
    private LocationAddress address;

    
    private boolean addressVerified;

    
    private OffsetDateTime createdAt;

    
    private boolean deactivatable;

    
    private String deactivatedAt;

    
    private boolean deletable;

    
    private FulfillmentService fulfillmentService;

    
    private boolean fulfillsOnlineOrders;

    
    private boolean hasActiveInventory;

    
    private boolean hasUnfulfilledOrders;

    
    private String id;

    
    private InventoryLevel inventoryLevel;

    
    private InventoryLevelConnection inventoryLevels;

    
    private boolean isActive;

    
    private boolean isFulfillmentService;

    
    private boolean isPrimary;

    
    private String legacyResourceId;

    
    private DeliveryLocalPickupSettings localPickupSettingsV2;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private boolean shipsInventory;

    
    private List<LocationSuggestedAddress> suggestedAddresses;

    
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.shipsInventory = this.shipsInventory;
      result.suggestedAddresses = this.suggestedAddresses;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder activatable(boolean activatable) {
      this.activatable = activatable;
      return this;
    }

    
    public Builder address(LocationAddress address) {
      this.address = address;
      return this;
    }

    
    public Builder addressVerified(boolean addressVerified) {
      this.addressVerified = addressVerified;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder deactivatable(boolean deactivatable) {
      this.deactivatable = deactivatable;
      return this;
    }

    
    public Builder deactivatedAt(String deactivatedAt) {
      this.deactivatedAt = deactivatedAt;
      return this;
    }

    
    public Builder deletable(boolean deletable) {
      this.deletable = deletable;
      return this;
    }

    
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    
    public Builder fulfillsOnlineOrders(boolean fulfillsOnlineOrders) {
      this.fulfillsOnlineOrders = fulfillsOnlineOrders;
      return this;
    }

    
    public Builder hasActiveInventory(boolean hasActiveInventory) {
      this.hasActiveInventory = hasActiveInventory;
      return this;
    }

    
    public Builder hasUnfulfilledOrders(boolean hasUnfulfilledOrders) {
      this.hasUnfulfilledOrders = hasUnfulfilledOrders;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder isActive(boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    
    public Builder isFulfillmentService(boolean isFulfillmentService) {
      this.isFulfillmentService = isFulfillmentService;
      return this;
    }

    
    public Builder isPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder localPickupSettingsV2(DeliveryLocalPickupSettings localPickupSettingsV2) {
      this.localPickupSettingsV2 = localPickupSettingsV2;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder shipsInventory(boolean shipsInventory) {
      this.shipsInventory = shipsInventory;
      return this;
    }

    
    public Builder suggestedAddresses(List<LocationSuggestedAddress> suggestedAddresses) {
      this.suggestedAddresses = suggestedAddresses;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
