package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FileCreateInput {
  
  private String filename;

  
  private FileContentType contentType;

  
  private String alt;

  
  private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

  
  private String originalSource;

  public FileCreateInput() {
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public FileContentType getContentType() {
    return contentType;
  }

  public void setContentType(FileContentType contentType) {
    this.contentType = contentType;
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  public FileCreateInputDuplicateResolutionMode getDuplicateResolutionMode() {
    return duplicateResolutionMode;
  }

  public void setDuplicateResolutionMode(
      FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
    this.duplicateResolutionMode = duplicateResolutionMode;
  }

  
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  @Override
  public String toString() {
    return "FileCreateInput{filename='" + filename + "', contentType='" + contentType + "', alt='" + alt + "', duplicateResolutionMode='" + duplicateResolutionMode + "', originalSource='" + originalSource + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileCreateInput that = (FileCreateInput) o;
    return Objects.equals(filename, that.filename) &&
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(duplicateResolutionMode, that.duplicateResolutionMode) &&
        Objects.equals(originalSource, that.originalSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, contentType, alt, duplicateResolutionMode, originalSource);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String filename;

    
    private FileContentType contentType;

    
    private String alt;

    
    private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

    
    private String originalSource;

    public FileCreateInput build() {
      FileCreateInput result = new FileCreateInput();
      result.filename = this.filename;
      result.contentType = this.contentType;
      result.alt = this.alt;
      result.duplicateResolutionMode = this.duplicateResolutionMode;
      result.originalSource = this.originalSource;
      return result;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder contentType(FileContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    
    public Builder duplicateResolutionMode(
        FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
      this.duplicateResolutionMode = duplicateResolutionMode;
      return this;
    }

    
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }
  }
}
