package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for company location when creating or updating a company location.
 */
public class CompanyLocationInput {
  /**
   * The name of the company location.
   */
  private String name;

  /**
   * The phone number of the company location.
   */
  private String phone;

  /**
   * The preferred locale of the company location.
   */
  private String locale;

  /**
   * A unique externally-supplied ID for the company location.
   */
  private String externalId;

  /**
   * A note about the company location.
   */
  private String note;

  /**
   * The configuration for the buyer's checkout at the company location.
   */
  private BuyerExperienceConfigurationInput buyerExperienceConfiguration;

  /**
   * The input fields to create or update the billing address for a company location.
   */
  private CompanyAddressInput billingAddress;

  /**
   * The input fields to create or update the shipping address for a company location.
   */
  private CompanyAddressInput shippingAddress;

  /**
   * Whether the billing address is the same as the shipping address. If the value
   * is true, then the input for `billingAddress` is ignored.
   */
  private Boolean billingSameAsShipping;

  /**
   * The tax registration ID of the company location.
   */
  private String taxRegistrationId;

  /**
   * The list of tax exemptions to apply to the company location.
   */
  private List<TaxExemption> taxExemptions;

  /**
   * Whether the location is exempt from taxes.
   */
  private Boolean taxExempt;

  public CompanyLocationInput() {
  }

  /**
   * The name of the company location.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The phone number of the company location.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The preferred locale of the company location.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * A unique externally-supplied ID for the company location.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * A note about the company location.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The configuration for the buyer's checkout at the company location.
   */
  public BuyerExperienceConfigurationInput getBuyerExperienceConfiguration() {
    return buyerExperienceConfiguration;
  }

  public void setBuyerExperienceConfiguration(
      BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
    this.buyerExperienceConfiguration = buyerExperienceConfiguration;
  }

  /**
   * The input fields to create or update the billing address for a company location.
   */
  public CompanyAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CompanyAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The input fields to create or update the shipping address for a company location.
   */
  public CompanyAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(CompanyAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * Whether the billing address is the same as the shipping address. If the value
   * is true, then the input for `billingAddress` is ignored.
   */
  public Boolean getBillingSameAsShipping() {
    return billingSameAsShipping;
  }

  public void setBillingSameAsShipping(Boolean billingSameAsShipping) {
    this.billingSameAsShipping = billingSameAsShipping;
  }

  /**
   * The tax registration ID of the company location.
   */
  public String getTaxRegistrationId() {
    return taxRegistrationId;
  }

  public void setTaxRegistrationId(String taxRegistrationId) {
    this.taxRegistrationId = taxRegistrationId;
  }

  /**
   * The list of tax exemptions to apply to the company location.
   */
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  /**
   * Whether the location is exempt from taxes.
   */
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  @Override
  public String toString() {
    return "CompanyLocationInput{name='" + name + "', phone='" + phone + "', locale='" + locale + "', externalId='" + externalId + "', note='" + note + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "', billingAddress='" + billingAddress + "', shippingAddress='" + shippingAddress + "', billingSameAsShipping='" + billingSameAsShipping + "', taxRegistrationId='" + taxRegistrationId + "', taxExemptions='" + taxExemptions + "', taxExempt='" + taxExempt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationInput that = (CompanyLocationInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(buyerExperienceConfiguration, that.buyerExperienceConfiguration) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(billingSameAsShipping, that.billingSameAsShipping) &&
        Objects.equals(taxRegistrationId, that.taxRegistrationId) &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(taxExempt, that.taxExempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, locale, externalId, note, buyerExperienceConfiguration, billingAddress, shippingAddress, billingSameAsShipping, taxRegistrationId, taxExemptions, taxExempt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the company location.
     */
    private String name;

    /**
     * The phone number of the company location.
     */
    private String phone;

    /**
     * The preferred locale of the company location.
     */
    private String locale;

    /**
     * A unique externally-supplied ID for the company location.
     */
    private String externalId;

    /**
     * A note about the company location.
     */
    private String note;

    /**
     * The configuration for the buyer's checkout at the company location.
     */
    private BuyerExperienceConfigurationInput buyerExperienceConfiguration;

    /**
     * The input fields to create or update the billing address for a company location.
     */
    private CompanyAddressInput billingAddress;

    /**
     * The input fields to create or update the shipping address for a company location.
     */
    private CompanyAddressInput shippingAddress;

    /**
     * Whether the billing address is the same as the shipping address. If the value
     * is true, then the input for `billingAddress` is ignored.
     */
    private Boolean billingSameAsShipping;

    /**
     * The tax registration ID of the company location.
     */
    private String taxRegistrationId;

    /**
     * The list of tax exemptions to apply to the company location.
     */
    private List<TaxExemption> taxExemptions;

    /**
     * Whether the location is exempt from taxes.
     */
    private Boolean taxExempt;

    public CompanyLocationInput build() {
      CompanyLocationInput result = new CompanyLocationInput();
      result.name = this.name;
      result.phone = this.phone;
      result.locale = this.locale;
      result.externalId = this.externalId;
      result.note = this.note;
      result.buyerExperienceConfiguration = this.buyerExperienceConfiguration;
      result.billingAddress = this.billingAddress;
      result.shippingAddress = this.shippingAddress;
      result.billingSameAsShipping = this.billingSameAsShipping;
      result.taxRegistrationId = this.taxRegistrationId;
      result.taxExemptions = this.taxExemptions;
      result.taxExempt = this.taxExempt;
      return result;
    }

    /**
     * The name of the company location.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The phone number of the company location.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The preferred locale of the company location.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * A unique externally-supplied ID for the company location.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * A note about the company location.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The configuration for the buyer's checkout at the company location.
     */
    public Builder buyerExperienceConfiguration(
        BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
      this.buyerExperienceConfiguration = buyerExperienceConfiguration;
      return this;
    }

    /**
     * The input fields to create or update the billing address for a company location.
     */
    public Builder billingAddress(CompanyAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The input fields to create or update the shipping address for a company location.
     */
    public Builder shippingAddress(CompanyAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * Whether the billing address is the same as the shipping address. If the value
     * is true, then the input for `billingAddress` is ignored.
     */
    public Builder billingSameAsShipping(Boolean billingSameAsShipping) {
      this.billingSameAsShipping = billingSameAsShipping;
      return this;
    }

    /**
     * The tax registration ID of the company location.
     */
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
      return this;
    }

    /**
     * The list of tax exemptions to apply to the company location.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    /**
     * Whether the location is exempt from taxes.
     */
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }
  }
}
