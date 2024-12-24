package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FileUpdateInput {
  
  private String id;

  
  private String alt;

  
  private String originalSource;

  
  private String previewImageSource;

  
  private String filename;

  
  private List<String> referencesToAdd;

  
  private List<String> referencesToRemove;

  public FileUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  
  public String getPreviewImageSource() {
    return previewImageSource;
  }

  public void setPreviewImageSource(String previewImageSource) {
    this.previewImageSource = previewImageSource;
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public List<String> getReferencesToAdd() {
    return referencesToAdd;
  }

  public void setReferencesToAdd(List<String> referencesToAdd) {
    this.referencesToAdd = referencesToAdd;
  }

  
  public List<String> getReferencesToRemove() {
    return referencesToRemove;
  }

  public void setReferencesToRemove(List<String> referencesToRemove) {
    this.referencesToRemove = referencesToRemove;
  }

  @Override
  public String toString() {
    return "FileUpdateInput{id='" + id + "', alt='" + alt + "', originalSource='" + originalSource + "', previewImageSource='" + previewImageSource + "', filename='" + filename + "', referencesToAdd='" + referencesToAdd + "', referencesToRemove='" + referencesToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileUpdateInput that = (FileUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(previewImageSource, that.previewImageSource) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(referencesToAdd, that.referencesToAdd) &&
        Objects.equals(referencesToRemove, that.referencesToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alt, originalSource, previewImageSource, filename, referencesToAdd, referencesToRemove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String alt;

    
    private String originalSource;

    
    private String previewImageSource;

    
    private String filename;

    
    private List<String> referencesToAdd;

    
    private List<String> referencesToRemove;

    public FileUpdateInput build() {
      FileUpdateInput result = new FileUpdateInput();
      result.id = this.id;
      result.alt = this.alt;
      result.originalSource = this.originalSource;
      result.previewImageSource = this.previewImageSource;
      result.filename = this.filename;
      result.referencesToAdd = this.referencesToAdd;
      result.referencesToRemove = this.referencesToRemove;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    
    public Builder previewImageSource(String previewImageSource) {
      this.previewImageSource = previewImageSource;
      return this;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder referencesToAdd(List<String> referencesToAdd) {
      this.referencesToAdd = referencesToAdd;
      return this;
    }

    
    public Builder referencesToRemove(List<String> referencesToRemove) {
      this.referencesToRemove = referencesToRemove;
      return this;
    }
  }
}
