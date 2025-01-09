package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `segmentDelete` mutation.
 */
public class SegmentDeletePayload {
  /**
   * ID of the deleted segment.
   */
  private String deletedSegmentId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public SegmentDeletePayload() {
  }

  /**
   * ID of the deleted segment.
   */
  public String getDeletedSegmentId() {
    return deletedSegmentId;
  }

  public void setDeletedSegmentId(String deletedSegmentId) {
    this.deletedSegmentId = deletedSegmentId;
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
    return "SegmentDeletePayload{deletedSegmentId='" + deletedSegmentId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentDeletePayload that = (SegmentDeletePayload) o;
    return Objects.equals(deletedSegmentId, that.deletedSegmentId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedSegmentId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the deleted segment.
     */
    private String deletedSegmentId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public SegmentDeletePayload build() {
      SegmentDeletePayload result = new SegmentDeletePayload();
      result.deletedSegmentId = this.deletedSegmentId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * ID of the deleted segment.
     */
    public Builder deletedSegmentId(String deletedSegmentId) {
      this.deletedSegmentId = deletedSegmentId;
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
