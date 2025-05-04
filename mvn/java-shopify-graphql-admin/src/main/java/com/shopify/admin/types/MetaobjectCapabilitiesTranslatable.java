package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The translatable capability of a metaobject definition.
 */
public class MetaobjectCapabilitiesTranslatable {
  /**
   * Indicates if the capability is enabled.
   */
  private boolean enabled;

  public MetaobjectCapabilitiesTranslatable() {
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
    return "MetaobjectCapabilitiesTranslatable{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilitiesTranslatable that = (MetaobjectCapabilitiesTranslatable) o;
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
     * Indicates if the capability is enabled.
     */
    private boolean enabled;

    public MetaobjectCapabilitiesTranslatable build() {
      MetaobjectCapabilitiesTranslatable result = new MetaobjectCapabilitiesTranslatable();
      result.enabled = this.enabled;
      return result;
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
