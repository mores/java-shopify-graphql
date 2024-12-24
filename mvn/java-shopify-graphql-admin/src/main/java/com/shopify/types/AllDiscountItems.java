package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AllDiscountItems implements DiscountItems {
  
  private boolean allItems;

  public AllDiscountItems() {
  }

  
  public boolean getAllItems() {
    return allItems;
  }

  public void setAllItems(boolean allItems) {
    this.allItems = allItems;
  }

  @Override
  public String toString() {
    return "AllDiscountItems{allItems='" + allItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllDiscountItems that = (AllDiscountItems) o;
    return allItems == that.allItems;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean allItems;

    public AllDiscountItems build() {
      AllDiscountItems result = new AllDiscountItems();
      result.allItems = this.allItems;
      return result;
    }

    
    public Builder allItems(boolean allItems) {
      this.allItems = allItems;
      return this;
    }
  }
}
