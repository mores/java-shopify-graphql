package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorGlobal {
  
  private String accent;

  
  private String brand;

  
  private String critical;

  
  private String decorative;

  
  private String info;

  
  private String success;

  
  private String warning;

  public CheckoutBrandingColorGlobal() {
  }

  
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
  }

  
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
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

  @Override
  public String toString() {
    return "CheckoutBrandingColorGlobal{accent='" + accent + "', brand='" + brand + "', critical='" + critical + "', decorative='" + decorative + "', info='" + info + "', success='" + success + "', warning='" + warning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorGlobal that = (CheckoutBrandingColorGlobal) o;
    return Objects.equals(accent, that.accent) &&
        Objects.equals(brand, that.brand) &&
        Objects.equals(critical, that.critical) &&
        Objects.equals(decorative, that.decorative) &&
        Objects.equals(info, that.info) &&
        Objects.equals(success, that.success) &&
        Objects.equals(warning, that.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent, brand, critical, decorative, info, success, warning);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String accent;

    
    private String brand;

    
    private String critical;

    
    private String decorative;

    
    private String info;

    
    private String success;

    
    private String warning;

    public CheckoutBrandingColorGlobal build() {
      CheckoutBrandingColorGlobal result = new CheckoutBrandingColorGlobal();
      result.accent = this.accent;
      result.brand = this.brand;
      result.critical = this.critical;
      result.decorative = this.decorative;
      result.info = this.info;
      result.success = this.success;
      result.warning = this.warning;
      return result;
    }

    
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    
    public Builder critical(String critical) {
      this.critical = critical;
      return this;
    }

    
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
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
  }
}
