package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TransactionFee implements com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private MoneyV2 flatFee;

  
  private String flatFeeName;

  
  private String id;

  
  private String rate;

  
  private String rateName;

  
  private MoneyV2 taxAmount;

  
  private String type;

  public TransactionFee() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public MoneyV2 getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(MoneyV2 flatFee) {
    this.flatFee = flatFee;
  }

  
  public String getFlatFeeName() {
    return flatFeeName;
  }

  public void setFlatFeeName(String flatFeeName) {
    this.flatFeeName = flatFeeName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  
  public String getRateName() {
    return rateName;
  }

  public void setRateName(String rateName) {
    this.rateName = rateName;
  }

  
  public MoneyV2 getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(MoneyV2 taxAmount) {
    this.taxAmount = taxAmount;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "TransactionFee{amount='" + amount + "', flatFee='" + flatFee + "', flatFeeName='" + flatFeeName + "', id='" + id + "', rate='" + rate + "', rateName='" + rateName + "', taxAmount='" + taxAmount + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransactionFee that = (TransactionFee) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(flatFee, that.flatFee) &&
        Objects.equals(flatFeeName, that.flatFeeName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(rateName, that.rateName) &&
        Objects.equals(taxAmount, that.taxAmount) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, flatFee, flatFeeName, id, rate, rateName, taxAmount, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private MoneyV2 flatFee;

    
    private String flatFeeName;

    
    private String id;

    
    private String rate;

    
    private String rateName;

    
    private MoneyV2 taxAmount;

    
    private String type;

    public TransactionFee build() {
      TransactionFee result = new TransactionFee();
      result.amount = this.amount;
      result.flatFee = this.flatFee;
      result.flatFeeName = this.flatFeeName;
      result.id = this.id;
      result.rate = this.rate;
      result.rateName = this.rateName;
      result.taxAmount = this.taxAmount;
      result.type = this.type;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder flatFee(MoneyV2 flatFee) {
      this.flatFee = flatFee;
      return this;
    }

    
    public Builder flatFeeName(String flatFeeName) {
      this.flatFeeName = flatFeeName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder rate(String rate) {
      this.rate = rate;
      return this;
    }

    
    public Builder rateName(String rateName) {
      this.rateName = rateName;
      return this;
    }

    
    public Builder taxAmount(MoneyV2 taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
