package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The state of the shop's market relationships, which are the parent and child
 * relationships between the shop's markets. The relationships are rebuilt
 * asynchronously after a market, market condition, or market region changes.
 */
public class MarketRelationshipsStatus {
  /**
   * An opaque UUID identifying the build of the market relationships that the API
   * returns at the moment this field is read. The value changes when a rebuild
   * advances the materialized graph version and is stable at all other times, so a
   * client can compare it against a previously read value to tell whether the
   * relationships have changed.
   */
  private String version;

  public MarketRelationshipsStatus() {
  }

  /**
   * An opaque UUID identifying the build of the market relationships that the API
   * returns at the moment this field is read. The value changes when a rebuild
   * advances the materialized graph version and is stable at all other times, so a
   * client can compare it against a previously read value to tell whether the
   * relationships have changed.
   */
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "MarketRelationshipsStatus{version='" + version + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRelationshipsStatus that = (MarketRelationshipsStatus) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An opaque UUID identifying the build of the market relationships that the API
     * returns at the moment this field is read. The value changes when a rebuild
     * advances the materialized graph version and is stable at all other times, so a
     * client can compare it against a previously read value to tell whether the
     * relationships have changed.
     */
    private String version;

    public MarketRelationshipsStatus build() {
      MarketRelationshipsStatus result = new MarketRelationshipsStatus();
      result.version = this.version;
      return result;
    }

    /**
     * An opaque UUID identifying the build of the market relationships that the API
     * returns at the moment this field is read. The value changes when a rebuild
     * advances the materialized graph version and is stable at all other times, so a
     * client can compare it against a previously read value to tell whether the
     * relationships have changed.
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }
}
