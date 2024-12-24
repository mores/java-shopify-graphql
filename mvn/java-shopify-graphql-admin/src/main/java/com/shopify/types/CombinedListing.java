package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CombinedListing {
  
  private CombinedListingChildConnection combinedListingChildren;

  
  private Product parentProduct;

  public CombinedListing() {
  }

  
  public CombinedListingChildConnection getCombinedListingChildren() {
    return combinedListingChildren;
  }

  public void setCombinedListingChildren(CombinedListingChildConnection combinedListingChildren) {
    this.combinedListingChildren = combinedListingChildren;
  }

  
  public Product getParentProduct() {
    return parentProduct;
  }

  public void setParentProduct(Product parentProduct) {
    this.parentProduct = parentProduct;
  }

  @Override
  public String toString() {
    return "CombinedListing{combinedListingChildren='" + combinedListingChildren + "', parentProduct='" + parentProduct + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CombinedListing that = (CombinedListing) o;
    return Objects.equals(combinedListingChildren, that.combinedListingChildren) &&
        Objects.equals(parentProduct, that.parentProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinedListingChildren, parentProduct);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CombinedListingChildConnection combinedListingChildren;

    
    private Product parentProduct;

    public CombinedListing build() {
      CombinedListing result = new CombinedListing();
      result.combinedListingChildren = this.combinedListingChildren;
      result.parentProduct = this.parentProduct;
      return result;
    }

    
    public Builder combinedListingChildren(CombinedListingChildConnection combinedListingChildren) {
      this.combinedListingChildren = combinedListingChildren;
      return this;
    }

    
    public Builder parentProduct(Product parentProduct) {
      this.parentProduct = parentProduct;
      return this;
    }
  }
}
