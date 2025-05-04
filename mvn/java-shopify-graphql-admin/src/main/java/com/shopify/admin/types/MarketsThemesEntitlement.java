package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for themes.
 */
public class MarketsThemesEntitlement {
  /**
   * Whether themes are enabled.
   */
  private boolean enabled;

  public MarketsThemesEntitlement() {
  }

  /**
   * Whether themes are enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketsThemesEntitlement{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsThemesEntitlement that = (MarketsThemesEntitlement) o;
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
     * Whether themes are enabled.
     */
    private boolean enabled;

    public MarketsThemesEntitlement build() {
      MarketsThemesEntitlement result = new MarketsThemesEntitlement();
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Whether themes are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
