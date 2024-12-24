package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingChoiceList {
  
  private CheckoutBrandingChoiceListGroup group;

  public CheckoutBrandingChoiceList() {
  }

  
  public CheckoutBrandingChoiceListGroup getGroup() {
    return group;
  }

  public void setGroup(CheckoutBrandingChoiceListGroup group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingChoiceList{group='" + group + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingChoiceList that = (CheckoutBrandingChoiceList) o;
    return Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingChoiceListGroup group;

    public CheckoutBrandingChoiceList build() {
      CheckoutBrandingChoiceList result = new CheckoutBrandingChoiceList();
      result.group = this.group;
      return result;
    }

    
    public Builder group(CheckoutBrandingChoiceListGroup group) {
      this.group = group;
      return this;
    }
  }
}
