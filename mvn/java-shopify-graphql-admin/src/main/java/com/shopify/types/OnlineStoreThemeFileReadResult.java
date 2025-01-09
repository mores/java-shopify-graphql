package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the result of a read operation performed on a theme asset.
 */
public class OnlineStoreThemeFileReadResult {
  /**
   * Type that indicates the result of the operation.
   */
  private OnlineStoreThemeFileResultType code;

  /**
   * Unique identifier associated with the operation and the theme file.
   */
  private String filename;

  public OnlineStoreThemeFileReadResult() {
  }

  /**
   * Type that indicates the result of the operation.
   */
  public OnlineStoreThemeFileResultType getCode() {
    return code;
  }

  public void setCode(OnlineStoreThemeFileResultType code) {
    this.code = code;
  }

  /**
   * Unique identifier associated with the operation and the theme file.
   */
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
    /**
     * Type that indicates the result of the operation.
     */
    private OnlineStoreThemeFileResultType code;

    /**
     * Unique identifier associated with the operation and the theme file.
     */
    private String filename;

    public OnlineStoreThemeFileReadResult build() {
      OnlineStoreThemeFileReadResult result = new OnlineStoreThemeFileReadResult();
      result.code = this.code;
      result.filename = this.filename;
      return result;
    }

    /**
     * Type that indicates the result of the operation.
     */
    public Builder code(OnlineStoreThemeFileResultType code) {
      this.code = code;
      return this;
    }

    /**
     * Unique identifier associated with the operation and the theme file.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }
  }
}
