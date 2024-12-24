package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorGlobalInput {
  
  private String info;

  
  private String success;

  
  private String warning;

  
  private String critical;

  
  private String brand;

  
  private String accent;

  
  private String decorative;

  public CheckoutBrandingColorGlobalInput() {
  }

  
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  
  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
  }

  
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorGlobalInput{info='" + info + "', success='" + success + "', warning='" + warning + "', critical='" + critical + "', brand='" + brand + "', accent='" + accent + "', decorative='" + decorative + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorGlobalInput that = (CheckoutBrandingColorGlobalInput) o;
    return Objects.equals(info, that.info) &&
        Objects.equals(success, that.success) &&
        Objects.equals(warning, that.warning) &&
        Objects.equals(critical, that.critical) &&
        Objects.equals(brand, that.brand) &&
        Objects.equals(accent, that.accent) &&
        Objects.equals(decorative, that.decorative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, success, warning, critical, brand, accent, decorative);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String info;

    
    private String success;

    
    private String warning;

    
    private String critical;

    
    private String brand;

    
    private String accent;

    
    private String decorative;

    public CheckoutBrandingColorGlobalInput build() {
      CheckoutBrandingColorGlobalInput result = new CheckoutBrandingColorGlobalInput();
      result.info = this.info;
      result.success = this.success;
      result.warning = this.warning;
      result.critical = this.critical;
      result.brand = this.brand;
      result.accent = this.accent;
      result.decorative = this.decorative;
      return result;
    }

    
    public Builder info(String info) {
      this.info = info;
      return this;
    }

    
    public Builder success(String success) {
      this.success = success;
      return this;
    }

    
    public Builder warning(String warning) {
      this.warning = warning;
      return this;
    }

    
    public Builder critical(String critical) {
      this.critical = critical;
      return this;
    }

    
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }
  }
}
