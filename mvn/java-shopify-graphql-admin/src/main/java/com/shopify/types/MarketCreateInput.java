package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketCreateInput {
  
  private String name;

  
  private String handle;

  
  private Boolean enabled;

  
  private List<MarketRegionCreateInput> regions;

  public MarketCreateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  public List<MarketRegionCreateInput> getRegions() {
    return regions;
  }

  public void setRegions(List<MarketRegionCreateInput> regions) {
    this.regions = regions;
  }

  @Override
  public String toString() {
    return "MarketCreateInput{name='" + name + "', handle='" + handle + "', enabled='" + enabled + "', regions='" + regions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCreateInput that = (MarketCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(enabled, that.enabled) &&
        Objects.equals(regions, that.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, enabled, regions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String handle;

    
    private Boolean enabled;

    
    private List<MarketRegionCreateInput> regions;

    public MarketCreateInput build() {
      MarketCreateInput result = new MarketCreateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.enabled = this.enabled;
      result.regions = this.regions;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder regions(List<MarketRegionCreateInput> regions) {
      this.regions = regions;
      return this;
    }
  }
}
