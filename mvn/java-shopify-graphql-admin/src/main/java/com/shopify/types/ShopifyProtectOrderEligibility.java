package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyProtectOrderEligibility {
  
  private ShopifyProtectEligibilityStatus status;

  public ShopifyProtectOrderEligibility() {
  }

  
  public ShopifyProtectEligibilityStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyProtectEligibilityStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShopifyProtectOrderEligibility{status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyProtectOrderEligibility that = (ShopifyProtectOrderEligibility) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopifyProtectEligibilityStatus status;

    public ShopifyProtectOrderEligibility build() {
      ShopifyProtectOrderEligibility result = new ShopifyProtectOrderEligibility();
      result.status = this.status;
      return result;
    }

    
    public Builder status(ShopifyProtectEligibilityStatus status) {
      this.status = status;
      return this;
    }
  }
}
