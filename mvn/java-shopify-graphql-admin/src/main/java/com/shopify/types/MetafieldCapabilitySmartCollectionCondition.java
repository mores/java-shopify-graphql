package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about the smart collection condition capability on a metafield definition.
 */
public class MetafieldCapabilitySmartCollectionCondition {
  /**
   * Indicates if the definition is eligible to have the capability.
   */
  private boolean eligible;

  /**
   * Indicates if the capability is enabled.
   */
  private boolean enabled;

  public MetafieldCapabilitySmartCollectionCondition() {
  }

  /**
   * Indicates if the definition is eligible to have the capability.
   */
  public boolean getEligible() {
    return eligible;
  }

  public void setEligible(boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Indicates if the capability is enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilitySmartCollectionCondition{eligible='" + eligible + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilitySmartCollectionCondition that = (MetafieldCapabilitySmartCollectionCondition) o;
    return eligible == that.eligible &&
        enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates if the definition is eligible to have the capability.
     */
    private boolean eligible;

    /**
     * Indicates if the capability is enabled.
     */
    private boolean enabled;

    public MetafieldCapabilitySmartCollectionCondition build() {
      MetafieldCapabilitySmartCollectionCondition result = new MetafieldCapabilitySmartCollectionCondition();
      result.eligible = this.eligible;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Indicates if the definition is eligible to have the capability.
     */
    public Builder eligible(boolean eligible) {
      this.eligible = eligible;
      return this;
    }

    /**
     * Indicates if the capability is enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
