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
public class InventoryAdjustQuantitiesUserError implements com.shopify.types.DisplayableError {
  
  private InventoryAdjustQuantitiesUserErrorCode code;

  
  private List<String> field;

  
  private String message;

  public InventoryAdjustQuantitiesUserError() {
  }

  
  public InventoryAdjustQuantitiesUserErrorCode getCode() {
    return code;
  }

  public void setCode(InventoryAdjustQuantitiesUserErrorCode code) {
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
    return "InventoryAdjustQuantitiesUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustQuantitiesUserError that = (InventoryAdjustQuantitiesUserError) o;
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
    
    private InventoryAdjustQuantitiesUserErrorCode code;

    
    private List<String> field;

    
    private String message;

    public InventoryAdjustQuantitiesUserError build() {
      InventoryAdjustQuantitiesUserError result = new InventoryAdjustQuantitiesUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    
    public Builder code(InventoryAdjustQuantitiesUserErrorCode code) {
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
