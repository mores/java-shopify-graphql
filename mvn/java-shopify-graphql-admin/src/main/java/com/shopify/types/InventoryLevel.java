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
public class InventoryLevel implements com.shopify.types.Node {
  
  private boolean canDeactivate;

  
  private OffsetDateTime createdAt;

  
  private String deactivationAlert;

  
  private String id;

  
  private InventoryItem item;

  
  private Location location;

  
  private List<InventoryQuantity> quantities;

  
  private InventoryScheduledChangeConnection scheduledChanges;

  
  private OffsetDateTime updatedAt;

  public InventoryLevel() {
  }

  
  public boolean getCanDeactivate() {
    return canDeactivate;
  }

  public void setCanDeactivate(boolean canDeactivate) {
    this.canDeactivate = canDeactivate;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getDeactivationAlert() {
    return deactivationAlert;
  }

  public void setDeactivationAlert(String deactivationAlert) {
    this.deactivationAlert = deactivationAlert;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public InventoryItem getItem() {
    return item;
  }

  public void setItem(InventoryItem item) {
    this.item = item;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public List<InventoryQuantity> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<InventoryQuantity> quantities) {
    this.quantities = quantities;
  }

  
  public InventoryScheduledChangeConnection getScheduledChanges() {
    return scheduledChanges;
  }

  public void setScheduledChanges(InventoryScheduledChangeConnection scheduledChanges) {
    this.scheduledChanges = scheduledChanges;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "InventoryLevel{canDeactivate='" + canDeactivate + "', createdAt='" + createdAt + "', deactivationAlert='" + deactivationAlert + "', id='" + id + "', item='" + item + "', location='" + location + "', quantities='" + quantities + "', scheduledChanges='" + scheduledChanges + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryLevel that = (InventoryLevel) o;
    return canDeactivate == that.canDeactivate &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deactivationAlert, that.deactivationAlert) &&
        Objects.equals(id, that.id) &&
        Objects.equals(item, that.item) &&
        Objects.equals(location, that.location) &&
        Objects.equals(quantities, that.quantities) &&
        Objects.equals(scheduledChanges, that.scheduledChanges) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDeactivate, createdAt, deactivationAlert, id, item, location, quantities, scheduledChanges, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean canDeactivate;

    
    private OffsetDateTime createdAt;

    
    private String deactivationAlert;

    
    private String id;

    
    private InventoryItem item;

    
    private Location location;

    
    private List<InventoryQuantity> quantities;

    
    private InventoryScheduledChangeConnection scheduledChanges;

    
    private OffsetDateTime updatedAt;

    public InventoryLevel build() {
      InventoryLevel result = new InventoryLevel();
      result.canDeactivate = this.canDeactivate;
      result.createdAt = this.createdAt;
      result.deactivationAlert = this.deactivationAlert;
      result.id = this.id;
      result.item = this.item;
      result.location = this.location;
      result.quantities = this.quantities;
      result.scheduledChanges = this.scheduledChanges;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder canDeactivate(boolean canDeactivate) {
      this.canDeactivate = canDeactivate;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder deactivationAlert(String deactivationAlert) {
      this.deactivationAlert = deactivationAlert;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder item(InventoryItem item) {
      this.item = item;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder quantities(List<InventoryQuantity> quantities) {
      this.quantities = quantities;
      return this;
    }

    
    public Builder scheduledChanges(InventoryScheduledChangeConnection scheduledChanges) {
      this.scheduledChanges = scheduledChanges;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
