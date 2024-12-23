package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the file to create or update.
 */
public class OnlineStoreThemeFilesUpsertFileInput {
  /**
   * The filename of the theme file.
   */
  private String filename;

  /**
   * The body of the theme file.
   */
  private OnlineStoreThemeFileBodyInput body;

  public OnlineStoreThemeFilesUpsertFileInput() {
  }

  /**
   * The filename of the theme file.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The body of the theme file.
   */
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
    /**
     * The filename of the theme file.
     */
    private String filename;

    /**
     * The body of the theme file.
     */
    private OnlineStoreThemeFileBodyInput body;

    public OnlineStoreThemeFilesUpsertFileInput build() {
      OnlineStoreThemeFilesUpsertFileInput result = new OnlineStoreThemeFilesUpsertFileInput();
      result.filename = this.filename;
      result.body = this.body;
      return result;
    }

    /**
     * The filename of the theme file.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The body of the theme file.
     */
    public Builder body(OnlineStoreThemeFileBodyInput body) {
      this.body = body;
      return this;
    }
  }
}
