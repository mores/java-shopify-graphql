package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An error that occurs during the execution of a discount mutation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountUserError implements com.shopify.types.DisplayableError {
  /**
   * The error code.
   */
  private DiscountErrorCode code;

  /**
   * Extra information about this error.
   */
  private String extraInfo;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public DiscountUserError() {
  }

  /**
   * The error code.
   */
  public DiscountErrorCode getCode() {
    return code;
  }

  public void setCode(DiscountErrorCode code) {
    this.code = code;
  }

  /**
   * Extra information about this error.
   */
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
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
    return "DiscountUserError{code='" + code + "', extraInfo='" + extraInfo + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountUserError that = (DiscountUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(extraInfo, that.extraInfo) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, extraInfo, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private DiscountErrorCode code;

    /**
     * Extra information about this error.
     */
    private String extraInfo;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public DiscountUserError build() {
      DiscountUserError result = new DiscountUserError();
      result.code = this.code;
      result.extraInfo = this.extraInfo;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(DiscountErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * Extra information about this error.
     */
    public Builder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
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
