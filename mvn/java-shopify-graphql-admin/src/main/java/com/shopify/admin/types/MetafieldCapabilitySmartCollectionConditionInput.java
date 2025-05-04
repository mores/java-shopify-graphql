package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for enabling and disabling the smart collection condition capability.
 */
public class MetafieldCapabilitySmartCollectionConditionInput {
  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  private boolean enabled;

  public MetafieldCapabilitySmartCollectionConditionInput() {
  }

  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilitySmartCollectionConditionInput{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilitySmartCollectionConditionInput that = (MetafieldCapabilitySmartCollectionConditionInput) o;
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
     * Indicates whether the capability should be enabled or disabled.
     */
    private boolean enabled;

    public MetafieldCapabilitySmartCollectionConditionInput build() {
      MetafieldCapabilitySmartCollectionConditionInput result = new MetafieldCapabilitySmartCollectionConditionInput();
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Indicates whether the capability should be enabled or disabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
