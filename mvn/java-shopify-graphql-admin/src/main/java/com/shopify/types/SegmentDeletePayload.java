package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SegmentDeletePayload {
  
  private String deletedSegmentId;

  
  private List<UserError> userErrors;

  public SegmentDeletePayload() {
  }

  
  public String getDeletedSegmentId() {
    return deletedSegmentId;
  }

  public void setDeletedSegmentId(String deletedSegmentId) {
    this.deletedSegmentId = deletedSegmentId;
  }

  
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
    
    private String deletedSegmentId;

    
    private List<UserError> userErrors;

    public SegmentDeletePayload build() {
      SegmentDeletePayload result = new SegmentDeletePayload();
      result.deletedSegmentId = this.deletedSegmentId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedSegmentId(String deletedSegmentId) {
      this.deletedSegmentId = deletedSegmentId;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
