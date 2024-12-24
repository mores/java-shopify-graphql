package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDefaultChargeStatementDescriptor implements com.shopify.types.ShopifyPaymentsChargeStatementDescriptor {
  
  private String _default;

  
  private String prefix;

  public ShopifyPaymentsDefaultChargeStatementDescriptor() {
  }

  
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDefaultChargeStatementDescriptor{default='" + _default + "', prefix='" + prefix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDefaultChargeStatementDescriptor that = (ShopifyPaymentsDefaultChargeStatementDescriptor) o;
    return Objects.equals(_default, that._default) &&
        Objects.equals(prefix, that.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, prefix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String _default;

    
    private String prefix;

    public ShopifyPaymentsDefaultChargeStatementDescriptor build() {
      ShopifyPaymentsDefaultChargeStatementDescriptor result = new ShopifyPaymentsDefaultChargeStatementDescriptor();
      result._default = this._default;
      result.prefix = this.prefix;
      return result;
    }

    
    public Builder _default(String _default) {
      this._default = _default;
      return this;
    }

    
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }
}
