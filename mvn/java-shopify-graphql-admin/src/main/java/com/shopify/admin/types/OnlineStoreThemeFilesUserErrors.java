package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * User errors for theme file operations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFilesUserErrors implements com.shopify.admin.types.DisplayableError {
  /**
   * The error code.
   */
  private OnlineStoreThemeFilesUserErrorsCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The filename of the theme file.
   */
  private String filename;

  /**
   * The error message.
   */
  private String message;

  public OnlineStoreThemeFilesUserErrors() {
  }

  /**
   * The error code.
   */
  public OnlineStoreThemeFilesUserErrorsCode getCode() {
    return code;
  }

  public void setCode(OnlineStoreThemeFilesUserErrorsCode code) {
    this.code = code;
  }

  /**
   * The path to the input field that caused the error.
   */
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
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
   * The error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFilesUserErrors{code='" + code + "', field='" + field + "', filename='" + filename + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFilesUserErrors that = (OnlineStoreThemeFilesUserErrors) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, filename, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private OnlineStoreThemeFilesUserErrorsCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The filename of the theme file.
     */
    private String filename;

    /**
     * The error message.
     */
    private String message;

    public OnlineStoreThemeFilesUserErrors build() {
      OnlineStoreThemeFilesUserErrors result = new OnlineStoreThemeFilesUserErrors();
      result.code = this.code;
      result.field = this.field;
      result.filename = this.filename;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(OnlineStoreThemeFilesUserErrorsCode code) {
      this.code = code;
      return this;
    }

    /**
     * The path to the input field that caused the error.
     */
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    /**
     * The filename of the theme file.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
