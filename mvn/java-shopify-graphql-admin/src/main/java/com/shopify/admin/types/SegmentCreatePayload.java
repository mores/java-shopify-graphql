package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `segmentCreate` mutation.
 */
public class SegmentCreatePayload {
  /**
   * The newly created segment.
   */
  private Segment segment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public SegmentCreatePayload() {
  }

  /**
   * The newly created segment.
   */
  public Segment getSegment() {
    return segment;
  }

  public void setSegment(Segment segment) {
    this.segment = segment;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SegmentCreatePayload{segment='" + segment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentCreatePayload that = (SegmentCreatePayload) o;
    return Objects.equals(segment, that.segment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created segment.
     */
    private Segment segment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public SegmentCreatePayload build() {
      SegmentCreatePayload result = new SegmentCreatePayload();
      result.segment = this.segment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created segment.
     */
    public Builder segment(Segment segment) {
      this.segment = segment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
