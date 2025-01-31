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
public class CollectionAddProductsV2UserError implements com.shopify.types.DisplayableError {
  
  private CollectionAddProductsV2UserErrorCode code;

  
  private List<String> field;

  
  private String message;

  public CollectionAddProductsV2UserError() {
  }

  
  public CollectionAddProductsV2UserErrorCode getCode() {
    return code;
  }

  public void setCode(CollectionAddProductsV2UserErrorCode code) {
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
    return "CollectionAddProductsV2UserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionAddProductsV2UserError that = (CollectionAddProductsV2UserError) o;
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
    
    private CollectionAddProductsV2UserErrorCode code;

    
    private List<String> field;

    
    private String message;

    public CollectionAddProductsV2UserError build() {
      CollectionAddProductsV2UserError result = new CollectionAddProductsV2UserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    
    public Builder code(CollectionAddProductsV2UserErrorCode code) {
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
