package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An error that occurs during the execution of cart metafield deletion.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDeleteUserError implements com.shopify.storefront.types.DisplayableError {
  /**
   * The error code.
   */
  private MetafieldDeleteErrorCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public MetafieldDeleteUserError() {
  }

  /**
   * The error code.
   */
  public MetafieldDeleteErrorCode getCode() {
    return code;
  }

  public void setCode(MetafieldDeleteErrorCode code) {
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
    return "MetafieldDeleteUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDeleteUserError that = (MetafieldDeleteUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private MetafieldDeleteErrorCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public MetafieldDeleteUserError build() {
      MetafieldDeleteUserError result = new MetafieldDeleteUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(MetafieldDeleteErrorCode code) {
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
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
