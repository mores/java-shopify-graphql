package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for B2B.
 */
public class B2BType {
  /**
   * Whether B2B is enabled.
   */
  private boolean enabled;

  public B2BType() {
  }

  /**
   * Whether B2B is enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "B2BType{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    B2BType that = (B2BType) o;
    return enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether B2B is enabled.
     */
    private boolean enabled;

    public B2BType build() {
      B2BType result = new B2BType();
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Whether B2B is enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
