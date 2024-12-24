package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StageImageInput {
  
  private StagedUploadTargetGenerateUploadResource resource;

  
  private String filename;

  
  private String mimeType;

  
  private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

  public StageImageInput() {
  }

  
  public StagedUploadTargetGenerateUploadResource getResource() {
    return resource;
  }

  public void setResource(StagedUploadTargetGenerateUploadResource resource) {
    this.resource = resource;
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  public StagedUploadHttpMethodType getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(StagedUploadHttpMethodType httpMethod) {
    this.httpMethod = httpMethod;
  }

  @Override
  public String toString() {
    return "StageImageInput{resource='" + resource + "', filename='" + filename + "', mimeType='" + mimeType + "', httpMethod='" + httpMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StageImageInput that = (StageImageInput) o;
    return Objects.equals(resource, that.resource) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(httpMethod, that.httpMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, filename, mimeType, httpMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private StagedUploadTargetGenerateUploadResource resource;

    
    private String filename;

    
    private String mimeType;

    
    private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

    public StageImageInput build() {
      StageImageInput result = new StageImageInput();
      result.resource = this.resource;
      result.filename = this.filename;
      result.mimeType = this.mimeType;
      result.httpMethod = this.httpMethod;
      return result;
    }

    
    public Builder resource(StagedUploadTargetGenerateUploadResource resource) {
      this.resource = resource;
      return this;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    
    public Builder httpMethod(StagedUploadHttpMethodType httpMethod) {
      this.httpMethod = httpMethod;
      return this;
    }
  }
}
