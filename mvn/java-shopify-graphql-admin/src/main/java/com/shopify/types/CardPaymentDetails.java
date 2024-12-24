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
public class CardPaymentDetails implements PaymentDetails, com.shopify.types.BasePaymentDetails {
  
  private String avsResultCode;

  
  private String bin;

  
  private String company;

  
  private String cvvResultCode;

  
  private Integer expirationMonth;

  
  private Integer expirationYear;

  
  private String name;

  
  private String number;

  
  private String paymentMethodName;

  
  private DigitalWallet wallet;

  public CardPaymentDetails() {
  }

  
  public String getAvsResultCode() {
    return avsResultCode;
  }

  public void setAvsResultCode(String avsResultCode) {
    this.avsResultCode = avsResultCode;
  }

  
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  
  public String getCvvResultCode() {
    return cvvResultCode;
  }

  public void setCvvResultCode(String cvvResultCode) {
    this.cvvResultCode = cvvResultCode;
  }

  
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  
  public DigitalWallet getWallet() {
    return wallet;
  }

  public void setWallet(DigitalWallet wallet) {
    this.wallet = wallet;
  }

  @Override
  public String toString() {
    return "CardPaymentDetails{avsResultCode='" + avsResultCode + "', bin='" + bin + "', company='" + company + "', cvvResultCode='" + cvvResultCode + "', expirationMonth='" + expirationMonth + "', expirationYear='" + expirationYear + "', name='" + name + "', number='" + number + "', paymentMethodName='" + paymentMethodName + "', wallet='" + wallet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CardPaymentDetails that = (CardPaymentDetails) o;
    return Objects.equals(avsResultCode, that.avsResultCode) &&
        Objects.equals(bin, that.bin) &&
        Objects.equals(company, that.company) &&
        Objects.equals(cvvResultCode, that.cvvResultCode) &&
        Objects.equals(expirationMonth, that.expirationMonth) &&
        Objects.equals(expirationYear, that.expirationYear) &&
        Objects.equals(name, that.name) &&
        Objects.equals(number, that.number) &&
        Objects.equals(paymentMethodName, that.paymentMethodName) &&
        Objects.equals(wallet, that.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avsResultCode, bin, company, cvvResultCode, expirationMonth, expirationYear, name, number, paymentMethodName, wallet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String avsResultCode;

    
    private String bin;

    
    private String company;

    
    private String cvvResultCode;

    
    private Integer expirationMonth;

    
    private Integer expirationYear;

    
    private String name;

    
    private String number;

    
    private String paymentMethodName;

    
    private DigitalWallet wallet;

    public CardPaymentDetails build() {
      CardPaymentDetails result = new CardPaymentDetails();
      result.avsResultCode = this.avsResultCode;
      result.bin = this.bin;
      result.company = this.company;
      result.cvvResultCode = this.cvvResultCode;
      result.expirationMonth = this.expirationMonth;
      result.expirationYear = this.expirationYear;
      result.name = this.name;
      result.number = this.number;
      result.paymentMethodName = this.paymentMethodName;
      result.wallet = this.wallet;
      return result;
    }

    
    public Builder avsResultCode(String avsResultCode) {
      this.avsResultCode = avsResultCode;
      return this;
    }

    
    public Builder bin(String bin) {
      this.bin = bin;
      return this;
    }

    
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    
    public Builder cvvResultCode(String cvvResultCode) {
      this.cvvResultCode = cvvResultCode;
      return this;
    }

    
    public Builder expirationMonth(Integer expirationMonth) {
      this.expirationMonth = expirationMonth;
      return this;
    }

    
    public Builder expirationYear(Integer expirationYear) {
      this.expirationYear = expirationYear;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }

    
    public Builder wallet(DigitalWallet wallet) {
      this.wallet = wallet;
      return this;
    }
  }
}
