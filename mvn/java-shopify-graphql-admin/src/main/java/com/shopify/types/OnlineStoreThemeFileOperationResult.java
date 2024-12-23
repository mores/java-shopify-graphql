package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the result of a copy, delete, or write operation performed on a theme file.
 */
public class OnlineStoreThemeFileOperationResult {
  /**
   * Unique identifier of the theme file.
   */
  private String filename;

  public OnlineStoreThemeFileOperationResult() {
  }

  /**
   * Unique identifier of the theme file.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileOperationResult{filename='" + filename + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileOperationResult that = (OnlineStoreThemeFileOperationResult) o;
    return Objects.equals(filename, that.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Unique identifier of the theme file.
     */
    private String filename;

    public OnlineStoreThemeFileOperationResult build() {
      OnlineStoreThemeFileOperationResult result = new OnlineStoreThemeFileOperationResult();
      result.filename = this.filename;
      return result;
    }

    /**
     * Unique identifier of the theme file.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }
  }
}
