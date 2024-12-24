package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingChoiceListInput {
  
  private CheckoutBrandingChoiceListGroupInput group;

  public CheckoutBrandingChoiceListInput() {
  }

  
  public CheckoutBrandingChoiceListGroupInput getGroup() {
    return group;
  }

  public void setGroup(CheckoutBrandingChoiceListGroupInput group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingChoiceListInput{group='" + group + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingChoiceListInput that = (CheckoutBrandingChoiceListInput) o;
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
    
    private CheckoutBrandingChoiceListGroupInput group;

    public CheckoutBrandingChoiceListInput build() {
      CheckoutBrandingChoiceListInput result = new CheckoutBrandingChoiceListInput();
      result.group = this.group;
      return result;
    }

    
    public Builder group(CheckoutBrandingChoiceListGroupInput group) {
      this.group = group;
      return this;
    }
  }
}
