package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingCustomFontGroupInput {
  
  private CheckoutBrandingCustomFontInput base;

  
  private CheckoutBrandingCustomFontInput bold;

  
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutBrandingCustomFontGroupInput() {
  }

  
  public CheckoutBrandingCustomFontInput getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingCustomFontInput base) {
    this.base = base;
  }

  
  public CheckoutBrandingCustomFontInput getBold() {
    return bold;
  }

  public void setBold(CheckoutBrandingCustomFontInput bold) {
    this.bold = bold;
  }

  
  public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomFontGroupInput{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomFontGroupInput that = (CheckoutBrandingCustomFontGroupInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingCustomFontInput base;

    
    private CheckoutBrandingCustomFontInput bold;

    
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutBrandingCustomFontGroupInput build() {
      CheckoutBrandingCustomFontGroupInput result = new CheckoutBrandingCustomFontGroupInput();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    
    public Builder base(CheckoutBrandingCustomFontInput base) {
      this.base = base;
      return this;
    }

    
    public Builder bold(CheckoutBrandingCustomFontInput bold) {
      this.bold = bold;
      return this;
    }

    
    public Builder loadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}
