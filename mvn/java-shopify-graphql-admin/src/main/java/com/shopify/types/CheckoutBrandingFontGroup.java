package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingFontGroup {
  
  private CheckoutBrandingFont base;

  
  private CheckoutBrandingFont bold;

  
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  
  private String name;

  public CheckoutBrandingFontGroup() {
  }

  
  public CheckoutBrandingFont getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingFont base) {
    this.base = base;
  }

  
  public CheckoutBrandingFont getBold() {
    return bold;
  }

  public void setBold(CheckoutBrandingFont bold) {
    this.bold = bold;
  }

  
  public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontGroup{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontGroup that = (CheckoutBrandingFontGroup) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingFont base;

    
    private CheckoutBrandingFont bold;

    
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    
    private String name;

    public CheckoutBrandingFontGroup build() {
      CheckoutBrandingFontGroup result = new CheckoutBrandingFontGroup();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      result.name = this.name;
      return result;
    }

    
    public Builder base(CheckoutBrandingFont base) {
      this.base = base;
      return this;
    }

    
    public Builder bold(CheckoutBrandingFont bold) {
      this.bold = bold;
      return this;
    }

    
    public Builder loadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
