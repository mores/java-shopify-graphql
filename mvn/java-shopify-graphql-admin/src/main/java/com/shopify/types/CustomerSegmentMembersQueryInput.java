package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerSegmentMembersQueryInput {
  
  private String segmentId;

  
  private String query;

  
  private Boolean reverse = false;

  
  private String sortKey;

  public CustomerSegmentMembersQueryInput() {
  }

  
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  
  public Boolean getReverse() {
    return reverse;
  }

  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

  
  public String getSortKey() {
    return sortKey;
  }

  public void setSortKey(String sortKey) {
    this.sortKey = sortKey;
  }

  @Override
  public String toString() {
    return "CustomerSegmentMembersQueryInput{segmentId='" + segmentId + "', query='" + query + "', reverse='" + reverse + "', sortKey='" + sortKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMembersQueryInput that = (CustomerSegmentMembersQueryInput) o;
    return Objects.equals(segmentId, that.segmentId) &&
        Objects.equals(query, that.query) &&
        Objects.equals(reverse, that.reverse) &&
        Objects.equals(sortKey, that.sortKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, query, reverse, sortKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String segmentId;

    
    private String query;

    
    private Boolean reverse = false;

    
    private String sortKey;

    public CustomerSegmentMembersQueryInput build() {
      CustomerSegmentMembersQueryInput result = new CustomerSegmentMembersQueryInput();
      result.segmentId = this.segmentId;
      result.query = this.query;
      result.reverse = this.reverse;
      result.sortKey = this.sortKey;
      return result;
    }

    
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      return this;
    }

    
    public Builder sortKey(String sortKey) {
      this.sortKey = sortKey;
      return this;
    }
  }
}
