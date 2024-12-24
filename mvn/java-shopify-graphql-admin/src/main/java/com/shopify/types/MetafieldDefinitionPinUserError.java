package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDefinitionPinUserError implements com.shopify.types.DisplayableError {
  
  private MetafieldDefinitionPinUserErrorCode code;

  
  private List<String> field;

  
  private String message;

  public MetafieldDefinitionPinUserError() {
  }

  
  public MetafieldDefinitionPinUserErrorCode getCode() {
    return code;
  }

  public void setCode(MetafieldDefinitionPinUserErrorCode code) {
    this.code = code;
  }

  
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionPinUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionPinUserError that = (MetafieldDefinitionPinUserError) o;
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
    
    private MetafieldDefinitionPinUserErrorCode code;

    
    private List<String> field;

    
    private String message;

    public MetafieldDefinitionPinUserError build() {
      MetafieldDefinitionPinUserError result = new MetafieldDefinitionPinUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    
    public Builder code(MetafieldDefinitionPinUserErrorCode code) {
      this.code = code;
      return this;
    }

    
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
