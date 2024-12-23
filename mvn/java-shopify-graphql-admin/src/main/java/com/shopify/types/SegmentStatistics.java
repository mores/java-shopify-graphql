package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The statistics of a given segment.
 */
public class SegmentStatistics {
  /**
   * The statistics of a given attribute.
   */
  private SegmentAttributeStatistics attributeStatistics;

  public SegmentStatistics() {
  }

  /**
   * The statistics of a given attribute.
   */
  public SegmentAttributeStatistics getAttributeStatistics() {
    return attributeStatistics;
  }

  public void setAttributeStatistics(SegmentAttributeStatistics attributeStatistics) {
    this.attributeStatistics = attributeStatistics;
  }

  @Override
  public String toString() {
    return "SegmentStatistics{attributeStatistics='" + attributeStatistics + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentStatistics that = (SegmentStatistics) o;
    return Objects.equals(attributeStatistics, that.attributeStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeStatistics);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The statistics of a given attribute.
     */
    private SegmentAttributeStatistics attributeStatistics;

    public SegmentStatistics build() {
      SegmentStatistics result = new SegmentStatistics();
      result.attributeStatistics = this.attributeStatistics;
      return result;
    }

    /**
     * The statistics of a given attribute.
     */
    public Builder attributeStatistics(SegmentAttributeStatistics attributeStatistics) {
      this.attributeStatistics = attributeStatistics;
      return this;
    }
  }
}
