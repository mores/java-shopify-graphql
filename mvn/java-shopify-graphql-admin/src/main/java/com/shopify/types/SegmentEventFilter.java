package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SegmentEventFilter implements com.shopify.types.SegmentFilter {
  
  private String localizedName;

  
  private boolean multiValue;

  
  private List<SegmentEventFilterParameter> parameters;

  
  private String queryName;

  
  private String returnValueType;

  public SegmentEventFilter() {
  }

  
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  
  public boolean getMultiValue() {
    return multiValue;
  }

  public void setMultiValue(boolean multiValue) {
    this.multiValue = multiValue;
  }

  
  public List<SegmentEventFilterParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<SegmentEventFilterParameter> parameters) {
    this.parameters = parameters;
  }

  
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  
  public String getReturnValueType() {
    return returnValueType;
  }

  public void setReturnValueType(String returnValueType) {
    this.returnValueType = returnValueType;
  }

  @Override
  public String toString() {
    return "SegmentEventFilter{localizedName='" + localizedName + "', multiValue='" + multiValue + "', parameters='" + parameters + "', queryName='" + queryName + "', returnValueType='" + returnValueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentEventFilter that = (SegmentEventFilter) o;
    return Objects.equals(localizedName, that.localizedName) &&
        multiValue == that.multiValue &&
        Objects.equals(parameters, that.parameters) &&
        Objects.equals(queryName, that.queryName) &&
        Objects.equals(returnValueType, that.returnValueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedName, multiValue, parameters, queryName, returnValueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String localizedName;

    
    private boolean multiValue;

    
    private List<SegmentEventFilterParameter> parameters;

    
    private String queryName;

    
    private String returnValueType;

    public SegmentEventFilter build() {
      SegmentEventFilter result = new SegmentEventFilter();
      result.localizedName = this.localizedName;
      result.multiValue = this.multiValue;
      result.parameters = this.parameters;
      result.queryName = this.queryName;
      result.returnValueType = this.returnValueType;
      return result;
    }

    
    public Builder localizedName(String localizedName) {
      this.localizedName = localizedName;
      return this;
    }

    
    public Builder multiValue(boolean multiValue) {
      this.multiValue = multiValue;
      return this;
    }

    
    public Builder parameters(List<SegmentEventFilterParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    
    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }

    
    public Builder returnValueType(String returnValueType) {
      this.returnValueType = returnValueType;
      return this;
    }
  }
}
