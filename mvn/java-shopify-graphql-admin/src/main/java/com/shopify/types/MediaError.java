package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a media error. This typically occurs when there is an issue with the media itself causing it to fail validation.
 * Check the media before attempting to upload again.
 */
public class MediaError {
  /**
   * Code representing the type of error.
   */
  private MediaErrorCode code;

  /**
   * Additional details regarding the error.
   */
  private String details;

  /**
   * Translated error message.
   */
  private String message;

  public MediaError() {
  }

  /**
   * Code representing the type of error.
   */
  public MediaErrorCode getCode() {
    return code;
  }

  public void setCode(MediaErrorCode code) {
    this.code = code;
  }

  /**
   * Additional details regarding the error.
   */
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * Translated error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "MediaError{code='" + code + "', details='" + details + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaError that = (MediaError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(details, that.details) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Code representing the type of error.
     */
    private MediaErrorCode code;

    /**
     * Additional details regarding the error.
     */
    private String details;

    /**
     * Translated error message.
     */
    private String message;

    public MediaError build() {
      MediaError result = new MediaError();
      result.code = this.code;
      result.details = this.details;
      result.message = this.message;
      return result;
    }

    /**
     * Code representing the type of error.
     */
    public Builder code(MediaErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * Additional details regarding the error.
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    /**
     * Translated error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
