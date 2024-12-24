package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SegmentMembership {
  
  private boolean isMember;

  
  private String segmentId;

  public SegmentMembership() {
  }

  
  public boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(boolean isMember) {
    this.isMember = isMember;
  }

  
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
    
    private boolean isMember;

    
    private String segmentId;

    public SegmentMembership build() {
      SegmentMembership result = new SegmentMembership();
      result.isMember = this.isMember;
      result.segmentId = this.segmentId;
      return result;
    }

    
    public Builder isMember(boolean isMember) {
      this.isMember = isMember;
      return this;
    }

    
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }
  }
}
