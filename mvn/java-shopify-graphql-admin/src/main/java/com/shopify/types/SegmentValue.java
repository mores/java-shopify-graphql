package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SegmentValue {
  
  private String localizedValue;

  
  private String queryName;

  public SegmentValue() {
  }

  
  public String getLocalizedValue() {
    return localizedValue;
  }

  public void setLocalizedValue(String localizedValue) {
    this.localizedValue = localizedValue;
  }

  
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  @Override
  public String toString() {
    return "SegmentValue{localizedValue='" + localizedValue + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentValue that = (SegmentValue) o;
    return Objects.equals(localizedValue, that.localizedValue) &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedValue, queryName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String localizedValue;

    
    private String queryName;

    public SegmentValue build() {
      SegmentValue result = new SegmentValue();
      result.localizedValue = this.localizedValue;
      result.queryName = this.queryName;
      return result;
    }

    
    public Builder localizedValue(String localizedValue) {
      this.localizedValue = localizedValue;
      return this;
    }

    
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
