package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StagedUploadTarget {
  
  private List<ImageUploadParameter> parameters;

  
  private String url;

  public StagedUploadTarget() {
  }

  
  public List<ImageUploadParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ImageUploadParameter> parameters) {
    this.parameters = parameters;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "StagedUploadTarget{parameters='" + parameters + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadTarget that = (StagedUploadTarget) o;
    return Objects.equals(parameters, that.parameters) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ImageUploadParameter> parameters;

    
    private String url;

    public StagedUploadTarget build() {
      StagedUploadTarget result = new StagedUploadTarget();
      result.parameters = this.parameters;
      result.url = this.url;
      return result;
    }

    
    public Builder parameters(List<ImageUploadParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
