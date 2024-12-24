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
public class SubscriptionBillingCycleSkipUserError implements com.shopify.types.DisplayableError {
  
  private SubscriptionBillingCycleSkipUserErrorCode code;

  
  private List<String> field;

  
  private String message;

  public SubscriptionBillingCycleSkipUserError() {
  }

  
  public SubscriptionBillingCycleSkipUserErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingCycleSkipUserErrorCode code) {
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
    return "SubscriptionBillingCycleSkipUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleSkipUserError that = (SubscriptionBillingCycleSkipUserError) o;
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
    
    private SubscriptionBillingCycleSkipUserErrorCode code;

    
    private List<String> field;

    
    private String message;

    public SubscriptionBillingCycleSkipUserError build() {
      SubscriptionBillingCycleSkipUserError result = new SubscriptionBillingCycleSkipUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    
    public Builder code(SubscriptionBillingCycleSkipUserErrorCode code) {
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
