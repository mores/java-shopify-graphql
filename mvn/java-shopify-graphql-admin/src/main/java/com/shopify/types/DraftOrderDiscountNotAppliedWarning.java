package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrderDiscountNotAppliedWarning implements com.shopify.types.DraftOrderWarning {
  
  private String discountCode;

  
  private String discountTitle;

  
  private String errorCode;

  
  private String field;

  
  private String message;

  
  private PriceRule priceRule;

  public DraftOrderDiscountNotAppliedWarning() {
  }

  
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  
  public String getDiscountTitle() {
    return discountTitle;
  }

  public void setDiscountTitle(String discountTitle) {
    this.discountTitle = discountTitle;
  }

  
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public PriceRule getPriceRule() {
    return priceRule;
  }

  public void setPriceRule(PriceRule priceRule) {
    this.priceRule = priceRule;
  }

  @Override
  public String toString() {
    return "DraftOrderDiscountNotAppliedWarning{discountCode='" + discountCode + "', discountTitle='" + discountTitle + "', errorCode='" + errorCode + "', field='" + field + "', message='" + message + "', priceRule='" + priceRule + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderDiscountNotAppliedWarning that = (DraftOrderDiscountNotAppliedWarning) o;
    return Objects.equals(discountCode, that.discountCode) &&
        Objects.equals(discountTitle, that.discountTitle) &&
        Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message) &&
        Objects.equals(priceRule, that.priceRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCode, discountTitle, errorCode, field, message, priceRule);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String discountCode;

    
    private String discountTitle;

    
    private String errorCode;

    
    private String field;

    
    private String message;

    
    private PriceRule priceRule;

    public DraftOrderDiscountNotAppliedWarning build() {
      DraftOrderDiscountNotAppliedWarning result = new DraftOrderDiscountNotAppliedWarning();
      result.discountCode = this.discountCode;
      result.discountTitle = this.discountTitle;
      result.errorCode = this.errorCode;
      result.field = this.field;
      result.message = this.message;
      result.priceRule = this.priceRule;
      return result;
    }

    
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    
    public Builder discountTitle(String discountTitle) {
      this.discountTitle = discountTitle;
      return this;
    }

    
    public Builder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder priceRule(PriceRule priceRule) {
      this.priceRule = priceRule;
      return this;
    }
  }
}
