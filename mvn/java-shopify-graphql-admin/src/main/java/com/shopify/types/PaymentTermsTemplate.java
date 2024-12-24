package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentTermsTemplate implements com.shopify.types.Node {
  
  private String description;

  
  private Integer dueInDays;

  
  private String id;

  
  private String name;

  
  private PaymentTermsType paymentTermsType;

  
  private String translatedName;

  public PaymentTermsTemplate() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public Integer getDueInDays() {
    return dueInDays;
  }

  public void setDueInDays(Integer dueInDays) {
    this.dueInDays = dueInDays;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PaymentTermsType getPaymentTermsType() {
    return paymentTermsType;
  }

  public void setPaymentTermsType(PaymentTermsType paymentTermsType) {
    this.paymentTermsType = paymentTermsType;
  }

  
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "PaymentTermsTemplate{description='" + description + "', dueInDays='" + dueInDays + "', id='" + id + "', name='" + name + "', paymentTermsType='" + paymentTermsType + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsTemplate that = (PaymentTermsTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(dueInDays, that.dueInDays) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(paymentTermsType, that.paymentTermsType) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueInDays, id, name, paymentTermsType, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private Integer dueInDays;

    
    private String id;

    
    private String name;

    
    private PaymentTermsType paymentTermsType;

    
    private String translatedName;

    public PaymentTermsTemplate build() {
      PaymentTermsTemplate result = new PaymentTermsTemplate();
      result.description = this.description;
      result.dueInDays = this.dueInDays;
      result.id = this.id;
      result.name = this.name;
      result.paymentTermsType = this.paymentTermsType;
      result.translatedName = this.translatedName;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder dueInDays(Integer dueInDays) {
      this.dueInDays = dueInDays;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      return this;
    }

    
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
