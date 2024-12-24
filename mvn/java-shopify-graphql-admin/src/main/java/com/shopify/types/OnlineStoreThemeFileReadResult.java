package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OnlineStoreThemeFileReadResult {
  
  private OnlineStoreThemeFileResultType code;

  
  private String filename;

  public OnlineStoreThemeFileReadResult() {
  }

  
  public OnlineStoreThemeFileResultType getCode() {
    return code;
  }

  public void setCode(OnlineStoreThemeFileResultType code) {
    this.code = code;
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileReadResult{code='" + code + "', filename='" + filename + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileReadResult that = (OnlineStoreThemeFileReadResult) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(filename, that.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, filename);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OnlineStoreThemeFileResultType code;

    
    private String filename;

    public OnlineStoreThemeFileReadResult build() {
      OnlineStoreThemeFileReadResult result = new OnlineStoreThemeFileReadResult();
      result.code = this.code;
      result.filename = this.filename;
      return result;
    }

    
    public Builder code(OnlineStoreThemeFileResultType code) {
      this.code = code;
      return this;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }
  }
}
