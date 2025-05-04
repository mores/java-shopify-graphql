package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for company location when creating or updating a company location.
 */
public class CompanyLocationUpdateInput {
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

  public CompanyLocationUpdateInput() {
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

  @Override
  public String toString() {
    return "CompanyLocationUpdateInput{name='" + name + "', phone='" + phone + "', locale='" + locale + "', externalId='" + externalId + "', note='" + note + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationUpdateInput that = (CompanyLocationUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(buyerExperienceConfiguration, that.buyerExperienceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, locale, externalId, note, buyerExperienceConfiguration);
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

    public CompanyLocationUpdateInput build() {
      CompanyLocationUpdateInput result = new CompanyLocationUpdateInput();
      result.name = this.name;
      result.phone = this.phone;
      result.locale = this.locale;
      result.externalId = this.externalId;
      result.note = this.note;
      result.buyerExperienceConfiguration = this.buyerExperienceConfiguration;
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
  }
}
