package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A list of customer segments who are eligible for the discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCustomerSegments implements DiscountCustomerSelection {
  /**
   * The list of customer segments who are eligible for the discount.
   */
  private List<Segment> segments;

  public DiscountCustomerSegments() {
  }

  /**
   * The list of customer segments who are eligible for the discount.
   */
  public List<Segment> getSegments() {
    return segments;
  }

  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  @Override
  public String toString() {
    return "DiscountCustomerSegments{segments='" + segments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerSegments that = (DiscountCustomerSegments) o;
    return Objects.equals(segments, that.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of customer segments who are eligible for the discount.
     */
    private List<Segment> segments;

    public DiscountCustomerSegments build() {
      DiscountCustomerSegments result = new DiscountCustomerSegments();
      result.segments = this.segments;
      return result;
    }

    /**
     * The list of customer segments who are eligible for the discount.
     */
    public Builder segments(List<Segment> segments) {
      this.segments = segments;
      return this;
    }
  }
}
