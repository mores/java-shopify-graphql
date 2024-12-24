package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountCountriesInput {
  
  private List<CountryCode> add;

  
  private List<CountryCode> remove;

  
  private Boolean includeRestOfWorld = false;

  public DiscountCountriesInput() {
  }

  
  public List<CountryCode> getAdd() {
    return add;
  }

  public void setAdd(List<CountryCode> add) {
    this.add = add;
  }

  
  public List<CountryCode> getRemove() {
    return remove;
  }

  public void setRemove(List<CountryCode> remove) {
    this.remove = remove;
  }

  
  public Boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(Boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  @Override
  public String toString() {
    return "DiscountCountriesInput{add='" + add + "', remove='" + remove + "', includeRestOfWorld='" + includeRestOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCountriesInput that = (DiscountCountriesInput) o;
    return Objects.equals(add, that.add) &&
        Objects.equals(remove, that.remove) &&
        Objects.equals(includeRestOfWorld, that.includeRestOfWorld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove, includeRestOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CountryCode> add;

    
    private List<CountryCode> remove;

    
    private Boolean includeRestOfWorld = false;

    public DiscountCountriesInput build() {
      DiscountCountriesInput result = new DiscountCountriesInput();
      result.add = this.add;
      result.remove = this.remove;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    
    public Builder add(List<CountryCode> add) {
      this.add = add;
      return this;
    }

    
    public Builder remove(List<CountryCode> remove) {
      this.remove = remove;
      return this;
    }

    
    public Builder includeRestOfWorld(Boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}
