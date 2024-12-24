package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingHeadingLevelInput {
  
  private CheckoutBrandingTypographyStyleInput typography;

  public CheckoutBrandingHeadingLevelInput() {
  }

  
  public CheckoutBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeadingLevelInput{typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeadingLevelInput that = (CheckoutBrandingHeadingLevelInput) o;
    return Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingTypographyStyleInput typography;

    public CheckoutBrandingHeadingLevelInput build() {
      CheckoutBrandingHeadingLevelInput result = new CheckoutBrandingHeadingLevelInput();
      result.typography = this.typography;
      return result;
    }

    
    public Builder typography(CheckoutBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
