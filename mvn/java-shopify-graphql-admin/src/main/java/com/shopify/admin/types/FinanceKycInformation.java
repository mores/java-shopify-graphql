package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Shopify Payments account information shared with embedded finance applications.
 */
public class FinanceKycInformation {
  /**
   * The legal entity business address.
   */
  private ShopifyPaymentsAddressBasic businessAddress;

  /**
   * The legal entity business type.
   */
  private ShopifyPaymentsBusinessType businessType;

  /**
   * Business industry.
   */
  private ShopifyPaymentsMerchantCategoryCode industry;

  /**
   * Returns the business legal name.
   */
  private String legalName;

  /**
   * The shop owner information for financial KYC purposes.
   */
  private FinancialKycShopOwner shopOwner;

  /**
   * Tax identification information.
   */
  private ShopifyPaymentsTaxIdentification taxIdentification;

  public FinanceKycInformation() {
  }

  /**
   * The legal entity business address.
   */
  public ShopifyPaymentsAddressBasic getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(ShopifyPaymentsAddressBasic businessAddress) {
    this.businessAddress = businessAddress;
  }

  /**
   * The legal entity business type.
   */
  public ShopifyPaymentsBusinessType getBusinessType() {
    return businessType;
  }

  public void setBusinessType(ShopifyPaymentsBusinessType businessType) {
    this.businessType = businessType;
  }

  /**
   * Business industry.
   */
  public ShopifyPaymentsMerchantCategoryCode getIndustry() {
    return industry;
  }

  public void setIndustry(ShopifyPaymentsMerchantCategoryCode industry) {
    this.industry = industry;
  }

  /**
   * Returns the business legal name.
   */
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * The shop owner information for financial KYC purposes.
   */
  public FinancialKycShopOwner getShopOwner() {
    return shopOwner;
  }

  public void setShopOwner(FinancialKycShopOwner shopOwner) {
    this.shopOwner = shopOwner;
  }

  /**
   * Tax identification information.
   */
  public ShopifyPaymentsTaxIdentification getTaxIdentification() {
    return taxIdentification;
  }

  public void setTaxIdentification(ShopifyPaymentsTaxIdentification taxIdentification) {
    this.taxIdentification = taxIdentification;
  }

  @Override
  public String toString() {
    return "FinanceKycInformation{businessAddress='" + businessAddress + "', businessType='" + businessType + "', industry='" + industry + "', legalName='" + legalName + "', shopOwner='" + shopOwner + "', taxIdentification='" + taxIdentification + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinanceKycInformation that = (FinanceKycInformation) o;
    return Objects.equals(businessAddress, that.businessAddress) &&
        Objects.equals(businessType, that.businessType) &&
        Objects.equals(industry, that.industry) &&
        Objects.equals(legalName, that.legalName) &&
        Objects.equals(shopOwner, that.shopOwner) &&
        Objects.equals(taxIdentification, that.taxIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessAddress, businessType, industry, legalName, shopOwner, taxIdentification);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The legal entity business address.
     */
    private ShopifyPaymentsAddressBasic businessAddress;

    /**
     * The legal entity business type.
     */
    private ShopifyPaymentsBusinessType businessType;

    /**
     * Business industry.
     */
    private ShopifyPaymentsMerchantCategoryCode industry;

    /**
     * Returns the business legal name.
     */
    private String legalName;

    /**
     * The shop owner information for financial KYC purposes.
     */
    private FinancialKycShopOwner shopOwner;

    /**
     * Tax identification information.
     */
    private ShopifyPaymentsTaxIdentification taxIdentification;

    public FinanceKycInformation build() {
      FinanceKycInformation result = new FinanceKycInformation();
      result.businessAddress = this.businessAddress;
      result.businessType = this.businessType;
      result.industry = this.industry;
      result.legalName = this.legalName;
      result.shopOwner = this.shopOwner;
      result.taxIdentification = this.taxIdentification;
      return result;
    }

    /**
     * The legal entity business address.
     */
    public Builder businessAddress(ShopifyPaymentsAddressBasic businessAddress) {
      this.businessAddress = businessAddress;
      return this;
    }

    /**
     * The legal entity business type.
     */
    public Builder businessType(ShopifyPaymentsBusinessType businessType) {
      this.businessType = businessType;
      return this;
    }

    /**
     * Business industry.
     */
    public Builder industry(ShopifyPaymentsMerchantCategoryCode industry) {
      this.industry = industry;
      return this;
    }

    /**
     * Returns the business legal name.
     */
    public Builder legalName(String legalName) {
      this.legalName = legalName;
      return this;
    }

    /**
     * The shop owner information for financial KYC purposes.
     */
    public Builder shopOwner(FinancialKycShopOwner shopOwner) {
      this.shopOwner = shopOwner;
      return this;
    }

    /**
     * Tax identification information.
     */
    public Builder taxIdentification(ShopifyPaymentsTaxIdentification taxIdentification) {
      this.taxIdentification = taxIdentification;
      return this;
    }
  }
}
