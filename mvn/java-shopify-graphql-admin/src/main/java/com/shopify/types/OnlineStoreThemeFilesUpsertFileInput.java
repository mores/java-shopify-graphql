package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OnlineStoreThemeFilesUpsertFileInput {
  
  private String filename;

  
  private OnlineStoreThemeFileBodyInput body;

  public OnlineStoreThemeFilesUpsertFileInput() {
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public OnlineStoreThemeFileBodyInput getBody() {
    return body;
  }

  public void setBody(OnlineStoreThemeFileBodyInput body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFilesUpsertFileInput{filename='" + filename + "', body='" + body + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFilesUpsertFileInput that = (OnlineStoreThemeFilesUpsertFileInput) o;
    return Objects.equals(filename, that.filename) &&
        Objects.equals(body, that.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, body);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String filename;

    
    private OnlineStoreThemeFileBodyInput body;

    public OnlineStoreThemeFilesUpsertFileInput build() {
      OnlineStoreThemeFilesUpsertFileInput result = new OnlineStoreThemeFilesUpsertFileInput();
      result.filename = this.filename;
      result.body = this.body;
      return result;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder body(OnlineStoreThemeFileBodyInput body) {
      this.body = body;
      return this;
    }
  }
}
