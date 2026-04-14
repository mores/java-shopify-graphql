package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The store credit configuration for a shop.
 */
public class StoreCreditConfiguration {
  /**
   * Whether store credit is enabled for customers on checkout.
   */
  private boolean storeCreditEnabled;

  public StoreCreditConfiguration() {
  }

  /**
   * Whether store credit is enabled for customers on checkout.
   */
  public boolean getStoreCreditEnabled() {
    return storeCreditEnabled;
  }

  public void setStoreCreditEnabled(boolean storeCreditEnabled) {
    this.storeCreditEnabled = storeCreditEnabled;
  }

  @Override
  public String toString() {
    return "StoreCreditConfiguration{storeCreditEnabled='" + storeCreditEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditConfiguration that = (StoreCreditConfiguration) o;
    return storeCreditEnabled == that.storeCreditEnabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeCreditEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether store credit is enabled for customers on checkout.
     */
    private boolean storeCreditEnabled;

    public StoreCreditConfiguration build() {
      StoreCreditConfiguration result = new StoreCreditConfiguration();
      result.storeCreditEnabled = this.storeCreditEnabled;
      return result;
    }

    /**
     * Whether store credit is enabled for customers on checkout.
     */
    public Builder storeCreditEnabled(boolean storeCreditEnabled) {
      this.storeCreditEnabled = storeCreditEnabled;
      return this;
    }
  }
}
