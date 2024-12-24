package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StagedMediaUploadTarget {
  
  private List<StagedUploadParameter> parameters;

  
  private String resourceUrl;

  
  private String url;

  public StagedMediaUploadTarget() {
  }

  
  public List<StagedUploadParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<StagedUploadParameter> parameters) {
    this.parameters = parameters;
  }

  
  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "StagedMediaUploadTarget{parameters='" + parameters + "', resourceUrl='" + resourceUrl + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedMediaUploadTarget that = (StagedMediaUploadTarget) o;
    return Objects.equals(parameters, that.parameters) &&
        Objects.equals(resourceUrl, that.resourceUrl) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, resourceUrl, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<StagedUploadParameter> parameters;

    
    private String resourceUrl;

    
    private String url;

    public StagedMediaUploadTarget build() {
      StagedMediaUploadTarget result = new StagedMediaUploadTarget();
      result.parameters = this.parameters;
      result.resourceUrl = this.resourceUrl;
      result.url = this.url;
      return result;
    }

    
    public Builder parameters(List<StagedUploadParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    
    public Builder resourceUrl(String resourceUrl) {
      this.resourceUrl = resourceUrl;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
