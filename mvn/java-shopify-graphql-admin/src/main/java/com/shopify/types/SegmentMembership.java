package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The response type for the `segmentMembership` object.
 */
public class SegmentMembership {
  /**
   * A Boolean that indicates whether or not the customer in the query is a member
   * of the segment, which is identified using the `segmentId`.
   */
  private boolean isMember;

  /**
   * A `segmentId` that's used for testing membership.
   */
  private String segmentId;

  public SegmentMembership() {
  }

  /**
   * A Boolean that indicates whether or not the customer in the query is a member
   * of the segment, which is identified using the `segmentId`.
   */
  public boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(boolean isMember) {
    this.isMember = isMember;
  }

  /**
   * A `segmentId` that's used for testing membership.
   */
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  @Override
  public String toString() {
    return "SegmentMembership{isMember='" + isMember + "', segmentId='" + segmentId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentMembership that = (SegmentMembership) o;
    return isMember == that.isMember &&
        Objects.equals(segmentId, that.segmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMember, segmentId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A Boolean that indicates whether or not the customer in the query is a member
     * of the segment, which is identified using the `segmentId`.
     */
    private boolean isMember;

    /**
     * A `segmentId` that's used for testing membership.
     */
    private String segmentId;

    public SegmentMembership build() {
      SegmentMembership result = new SegmentMembership();
      result.isMember = this.isMember;
      result.segmentId = this.segmentId;
      return result;
    }

    /**
     * A Boolean that indicates whether or not the customer in the query is a member
     * of the segment, which is identified using the `segmentId`.
     */
    public Builder isMember(boolean isMember) {
      this.isMember = isMember;
      return this;
    }

    /**
     * A `segmentId` that's used for testing membership.
     */
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }
  }
}
