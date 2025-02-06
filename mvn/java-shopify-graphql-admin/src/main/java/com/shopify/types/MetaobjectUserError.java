package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines errors encountered while managing metaobject resources.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetaobjectUserError implements com.shopify.types.DisplayableError {
  /**
   * The error code.
   */
  private MetaobjectUserErrorCode code;

  /**
   * The index of the failing list element in an array.
   */
  private Integer elementIndex;

  /**
   * The key of the failing object element.
   */
  private String elementKey;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public MetaobjectUserError() {
  }

  /**
   * The error code.
   */
  public MetaobjectUserErrorCode getCode() {
    return code;
  }

  public void setCode(MetaobjectUserErrorCode code) {
    this.code = code;
  }

  /**
   * The index of the failing list element in an array.
   */
  public Integer getElementIndex() {
    return elementIndex;
  }

  public void setElementIndex(Integer elementIndex) {
    this.elementIndex = elementIndex;
  }

  /**
   * The key of the failing object element.
   */
  public String getElementKey() {
    return elementKey;
  }

  public void setElementKey(String elementKey) {
    this.elementKey = elementKey;
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
    return "MetaobjectUserError{code='" + code + "', elementIndex='" + elementIndex + "', elementKey='" + elementKey + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUserError that = (MetaobjectUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(elementIndex, that.elementIndex) &&
        Objects.equals(elementKey, that.elementKey) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, elementIndex, elementKey, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private MetaobjectUserErrorCode code;

    /**
     * The index of the failing list element in an array.
     */
    private Integer elementIndex;

    /**
     * The key of the failing object element.
     */
    private String elementKey;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public MetaobjectUserError build() {
      MetaobjectUserError result = new MetaobjectUserError();
      result.code = this.code;
      result.elementIndex = this.elementIndex;
      result.elementKey = this.elementKey;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(MetaobjectUserErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The index of the failing list element in an array.
     */
    public Builder elementIndex(Integer elementIndex) {
      this.elementIndex = elementIndex;
      return this;
    }

    /**
     * The key of the failing object element.
     */
    public Builder elementKey(String elementKey) {
      this.elementKey = elementKey;
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
