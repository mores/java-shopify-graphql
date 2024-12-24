package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountCustomersInput {
  
  private List<String> add;

  
  private List<String> remove;

  public DiscountCustomersInput() {
  }

  
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountCustomersInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomersInput that = (DiscountCustomersInput) o;
    return Objects.equals(add, that.add) &&
        Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> add;

    
    private List<String> remove;

    public DiscountCustomersInput build() {
      DiscountCustomersInput result = new DiscountCustomersInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
