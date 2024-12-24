package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryQuantityName {
  
  private List<String> belongsTo;

  
  private List<String> comprises;

  
  private String displayName;

  
  private boolean isInUse;

  
  private String name;

  public InventoryQuantityName() {
  }

  
  public List<String> getBelongsTo() {
    return belongsTo;
  }

  public void setBelongsTo(List<String> belongsTo) {
    this.belongsTo = belongsTo;
  }

  
  public List<String> getComprises() {
    return comprises;
  }

  public void setComprises(List<String> comprises) {
    this.comprises = comprises;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public boolean getIsInUse() {
    return isInUse;
  }

  public void setIsInUse(boolean isInUse) {
    this.isInUse = isInUse;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "InventoryQuantityName{belongsTo='" + belongsTo + "', comprises='" + comprises + "', displayName='" + displayName + "', isInUse='" + isInUse + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantityName that = (InventoryQuantityName) o;
    return Objects.equals(belongsTo, that.belongsTo) &&
        Objects.equals(comprises, that.comprises) &&
        Objects.equals(displayName, that.displayName) &&
        isInUse == that.isInUse &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongsTo, comprises, displayName, isInUse, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> belongsTo;

    
    private List<String> comprises;

    
    private String displayName;

    
    private boolean isInUse;

    
    private String name;

    public InventoryQuantityName build() {
      InventoryQuantityName result = new InventoryQuantityName();
      result.belongsTo = this.belongsTo;
      result.comprises = this.comprises;
      result.displayName = this.displayName;
      result.isInUse = this.isInUse;
      result.name = this.name;
      return result;
    }

    
    public Builder belongsTo(List<String> belongsTo) {
      this.belongsTo = belongsTo;
      return this;
    }

    
    public Builder comprises(List<String> comprises) {
      this.comprises = comprises;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder isInUse(boolean isInUse) {
      this.isInUse = isInUse;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
