package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about the admin filterable capability on a metafield definition.
 */
public class MetafieldCapabilityAdminFilterable {
  /**
   * Indicates if the definition is eligible to have the capability.
   */
  private boolean eligible;

  /**
   * Indicates if the capability is enabled.
   */
  private boolean enabled;

  /**
   * Determines the metafield definition's filter status for use in admin filtering.
   */
  private MetafieldDefinitionAdminFilterStatus status;

  public MetafieldCapabilityAdminFilterable() {
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

  /**
   * Determines the metafield definition's filter status for use in admin filtering.
   */
  public MetafieldDefinitionAdminFilterStatus getStatus() {
    return status;
  }

  public void setStatus(MetafieldDefinitionAdminFilterStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityAdminFilterable{eligible='" + eligible + "', enabled='" + enabled + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityAdminFilterable that = (MetafieldCapabilityAdminFilterable) o;
    return eligible == that.eligible &&
        enabled == that.enabled &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, enabled, status);
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

    /**
     * Determines the metafield definition's filter status for use in admin filtering.
     */
    private MetafieldDefinitionAdminFilterStatus status;

    public MetafieldCapabilityAdminFilterable build() {
      MetafieldCapabilityAdminFilterable result = new MetafieldCapabilityAdminFilterable();
      result.eligible = this.eligible;
      result.enabled = this.enabled;
      result.status = this.status;
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

    /**
     * Determines the metafield definition's filter status for use in admin filtering.
     */
    public Builder status(MetafieldDefinitionAdminFilterStatus status) {
      this.status = status;
      return this;
    }
  }
}
