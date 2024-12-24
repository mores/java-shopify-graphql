package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SegmentEventFilterParameter {
  
  private boolean acceptsMultipleValues;

  
  private String localizedDescription;

  
  private String localizedName;

  
  private boolean optional;

  
  private String parameterType;

  
  private String queryName;

  public SegmentEventFilterParameter() {
  }

  
  public boolean getAcceptsMultipleValues() {
    return acceptsMultipleValues;
  }

  public void setAcceptsMultipleValues(boolean acceptsMultipleValues) {
    this.acceptsMultipleValues = acceptsMultipleValues;
  }

  
  public String getLocalizedDescription() {
    return localizedDescription;
  }

  public void setLocalizedDescription(String localizedDescription) {
    this.localizedDescription = localizedDescription;
  }

  
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  
  public boolean getOptional() {
    return optional;
  }

  public void setOptional(boolean optional) {
    this.optional = optional;
  }

  
  public String getParameterType() {
    return parameterType;
  }

  public void setParameterType(String parameterType) {
    this.parameterType = parameterType;
  }

  
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  @Override
  public String toString() {
    return "SegmentEventFilterParameter{acceptsMultipleValues='" + acceptsMultipleValues + "', localizedDescription='" + localizedDescription + "', localizedName='" + localizedName + "', optional='" + optional + "', parameterType='" + parameterType + "', queryName='" + queryName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentEventFilterParameter that = (SegmentEventFilterParameter) o;
    return acceptsMultipleValues == that.acceptsMultipleValues &&
        Objects.equals(localizedDescription, that.localizedDescription) &&
        Objects.equals(localizedName, that.localizedName) &&
        optional == that.optional &&
        Objects.equals(parameterType, that.parameterType) &&
        Objects.equals(queryName, that.queryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsMultipleValues, localizedDescription, localizedName, optional, parameterType, queryName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean acceptsMultipleValues;

    
    private String localizedDescription;

    
    private String localizedName;

    
    private boolean optional;

    
    private String parameterType;

    
    private String queryName;

    public SegmentEventFilterParameter build() {
      SegmentEventFilterParameter result = new SegmentEventFilterParameter();
      result.acceptsMultipleValues = this.acceptsMultipleValues;
      result.localizedDescription = this.localizedDescription;
      result.localizedName = this.localizedName;
      result.optional = this.optional;
      result.parameterType = this.parameterType;
      result.queryName = this.queryName;
      return result;
    }

    
    public Builder acceptsMultipleValues(boolean acceptsMultipleValues) {
      this.acceptsMultipleValues = acceptsMultipleValues;
      return this;
    }

    
    public Builder localizedDescription(String localizedDescription) {
      this.localizedDescription = localizedDescription;
      return this;
    }

    
    public Builder localizedName(String localizedName) {
      this.localizedName = localizedName;
      return this;
    }

    
    public Builder optional(boolean optional) {
      this.optional = optional;
      return this;
    }

    
    public Builder parameterType(String parameterType) {
      this.parameterType = parameterType;
      return this;
    }

    
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
