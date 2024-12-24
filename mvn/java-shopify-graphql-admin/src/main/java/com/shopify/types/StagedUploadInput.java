package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StagedUploadInput {
  
  private StagedUploadTargetGenerateUploadResource resource;

  
  private String filename;

  
  private String mimeType;

  
  private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

  
  private String fileSize;

  public StagedUploadInput() {
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

  
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "StagedUploadInput{resource='" + resource + "', filename='" + filename + "', mimeType='" + mimeType + "', httpMethod='" + httpMethod + "', fileSize='" + fileSize + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadInput that = (StagedUploadInput) o;
    return Objects.equals(resource, that.resource) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(httpMethod, that.httpMethod) &&
        Objects.equals(fileSize, that.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, filename, mimeType, httpMethod, fileSize);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private StagedUploadTargetGenerateUploadResource resource;

    
    private String filename;

    
    private String mimeType;

    
    private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

    
    private String fileSize;

    public StagedUploadInput build() {
      StagedUploadInput result = new StagedUploadInput();
      result.resource = this.resource;
      result.filename = this.filename;
      result.mimeType = this.mimeType;
      result.httpMethod = this.httpMethod;
      result.fileSize = this.fileSize;
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

    
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
      return this;
    }
  }
}
