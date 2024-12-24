package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BundlesDraftOrderBundleLineItemComponentInput {
  
  private String variantId;

  
  private int quantity;

  
  private String uuid;

  public BundlesDraftOrderBundleLineItemComponentInput() {
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public String toString() {
    return "BundlesDraftOrderBundleLineItemComponentInput{variantId='" + variantId + "', quantity='" + quantity + "', uuid='" + uuid + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BundlesDraftOrderBundleLineItemComponentInput that = (BundlesDraftOrderBundleLineItemComponentInput) o;
    return Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(uuid, that.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, quantity, uuid);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String variantId;

    
    private int quantity;

    
    private String uuid;

    public BundlesDraftOrderBundleLineItemComponentInput build() {
      BundlesDraftOrderBundleLineItemComponentInput result = new BundlesDraftOrderBundleLineItemComponentInput();
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.uuid = this.uuid;
      return result;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }
  }
}
