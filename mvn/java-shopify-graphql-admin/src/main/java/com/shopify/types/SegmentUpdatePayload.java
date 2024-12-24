package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SegmentUpdatePayload {
  
  private Segment segment;

  
  private List<UserError> userErrors;

  public SegmentUpdatePayload() {
  }

  
  public Segment getSegment() {
    return segment;
  }

  public void setSegment(Segment segment) {
    this.segment = segment;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SegmentUpdatePayload{segment='" + segment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentUpdatePayload that = (SegmentUpdatePayload) o;
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
    
    private Segment segment;

    
    private List<UserError> userErrors;

    public SegmentUpdatePayload build() {
      SegmentUpdatePayload result = new SegmentUpdatePayload();
      result.segment = this.segment;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder segment(Segment segment) {
      this.segment = segment;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
