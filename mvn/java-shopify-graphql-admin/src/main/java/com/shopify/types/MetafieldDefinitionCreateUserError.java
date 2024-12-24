package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDefinitionCreateUserError implements com.shopify.types.DisplayableError {
  
  private MetafieldDefinitionCreateUserErrorCode code;

  
  private Integer elementIndex;

  
  private List<String> field;

  
  private String message;

  public MetafieldDefinitionCreateUserError() {
  }

  
  public MetafieldDefinitionCreateUserErrorCode getCode() {
    return code;
  }

  public void setCode(MetafieldDefinitionCreateUserErrorCode code) {
    this.code = code;
  }

  
  public Integer getElementIndex() {
    return elementIndex;
  }

  public void setElementIndex(Integer elementIndex) {
    this.elementIndex = elementIndex;
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
    return "MetafieldDefinitionCreateUserError{code='" + code + "', elementIndex='" + elementIndex + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionCreateUserError that = (MetafieldDefinitionCreateUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(elementIndex, that.elementIndex) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, elementIndex, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldDefinitionCreateUserErrorCode code;

    
    private Integer elementIndex;

    
    private List<String> field;

    
    private String message;

    public MetafieldDefinitionCreateUserError build() {
      MetafieldDefinitionCreateUserError result = new MetafieldDefinitionCreateUserError();
      result.code = this.code;
      result.elementIndex = this.elementIndex;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    
    public Builder code(MetafieldDefinitionCreateUserErrorCode code) {
      this.code = code;
      return this;
    }

    
    public Builder elementIndex(Integer elementIndex) {
      this.elementIndex = elementIndex;
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
