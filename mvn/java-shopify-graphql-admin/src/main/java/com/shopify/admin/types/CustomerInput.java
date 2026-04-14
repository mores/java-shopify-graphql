package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields and values to use when creating or updating a customer.
 */
public class CustomerInput {
  /**
   * The unique email address of the customer.
   */
  private String email;

  /**
   * The customer's first name.
   */
  private String firstName;

  /**
   * The ID of the customer to update.
   */
  private String id;

  /**
   * The customer's last name.
   */
  private String lastName;

  /**
   * The customer's locale.
   */
  private String locale;

  /**
   * Additional metafields to associate to the customer.
   */
  private List<MetafieldInput> metafields;

  /**
   * A note about the customer.
   */
  private String note;

  /**
   * The unique phone number for the customer.
   */
  private String phone;

  /**
   * A list of tags to associate with the customer. Can be an array or a
   * comma-separated list. Example values: `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`
   *   
   * Updating `tags` overwrites any existing tags that were previously added to the
   * customer. To add new tags without overwriting
   * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  private List<String> tags;

  /**
   * Information that describes when the customer consented to receiving marketing
   *         material by email. The `email` field is required when creating a customer with email marketing
   *         consent information.
   */
  private CustomerEmailMarketingConsentInput emailMarketingConsent;

  /**
   * The marketing consent information when the customer consented to receiving marketing
   *         material by SMS. The `phone` field is required when creating a customer with SMS
   *         marketing consent information.
   */
  private CustomerSmsMarketingConsentInput smsMarketingConsent;

  /**
   * Whether the customer is exempt from paying taxes on their order.
   */
  private Boolean taxExempt;

  /**
   * The list of tax exemptions to apply to the customer.
   */
  private List<TaxExemption> taxExemptions;

  /**
   * A unique identifier for the customer that's used with Multipass login.
   */
  private String multipassIdentifier;

  public CustomerInput() {
  }

  /**
   * The unique email address of the customer.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The customer's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The ID of the customer to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The customer's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The customer's locale.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Additional metafields to associate to the customer.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * A note about the customer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The unique phone number for the customer.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * A list of tags to associate with the customer. Can be an array or a
   * comma-separated list. Example values: `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`
   *   
   * Updating `tags` overwrites any existing tags that were previously added to the
   * customer. To add new tags without overwriting
   * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Information that describes when the customer consented to receiving marketing
   *         material by email. The `email` field is required when creating a customer with email marketing
   *         consent information.
   */
  public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  /**
   * The marketing consent information when the customer consented to receiving marketing
   *         material by SMS. The `phone` field is required when creating a customer with SMS
   *         marketing consent information.
   */
  public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  /**
   * Whether the customer is exempt from paying taxes on their order.
   */
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * The list of tax exemptions to apply to the customer.
   */
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  /**
   * A unique identifier for the customer that's used with Multipass login.
   */
  public String getMultipassIdentifier() {
    return multipassIdentifier;
  }

  public void setMultipassIdentifier(String multipassIdentifier) {
    this.multipassIdentifier = multipassIdentifier;
  }

  @Override
  public String toString() {
    return "CustomerInput{email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', locale='" + locale + "', metafields='" + metafields + "', note='" + note + "', phone='" + phone + "', tags='" + tags + "', emailMarketingConsent='" + emailMarketingConsent + "', smsMarketingConsent='" + smsMarketingConsent + "', taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "', multipassIdentifier='" + multipassIdentifier + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerInput that = (CustomerInput) o;
    return Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(note, that.note) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(emailMarketingConsent, that.emailMarketingConsent) &&
        Objects.equals(smsMarketingConsent, that.smsMarketingConsent) &&
        Objects.equals(taxExempt, that.taxExempt) &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(multipassIdentifier, that.multipassIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, locale, metafields, note, phone, tags, emailMarketingConsent, smsMarketingConsent, taxExempt, taxExemptions, multipassIdentifier);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique email address of the customer.
     */
    private String email;

    /**
     * The customer's first name.
     */
    private String firstName;

    /**
     * The ID of the customer to update.
     */
    private String id;

    /**
     * The customer's last name.
     */
    private String lastName;

    /**
     * The customer's locale.
     */
    private String locale;

    /**
     * Additional metafields to associate to the customer.
     */
    private List<MetafieldInput> metafields;

    /**
     * A note about the customer.
     */
    private String note;

    /**
     * The unique phone number for the customer.
     */
    private String phone;

    /**
     * A list of tags to associate with the customer. Can be an array or a
     * comma-separated list. Example values: `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`
     *   
     * Updating `tags` overwrites any existing tags that were previously added to the
     * customer. To add new tags without overwriting
     * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    private List<String> tags;

    /**
     * Information that describes when the customer consented to receiving marketing
     *         material by email. The `email` field is required when creating a customer with email marketing
     *         consent information.
     */
    private CustomerEmailMarketingConsentInput emailMarketingConsent;

    /**
     * The marketing consent information when the customer consented to receiving marketing
     *         material by SMS. The `phone` field is required when creating a customer with SMS
     *         marketing consent information.
     */
    private CustomerSmsMarketingConsentInput smsMarketingConsent;

    /**
     * Whether the customer is exempt from paying taxes on their order.
     */
    private Boolean taxExempt;

    /**
     * The list of tax exemptions to apply to the customer.
     */
    private List<TaxExemption> taxExemptions;

    /**
     * A unique identifier for the customer that's used with Multipass login.
     */
    private String multipassIdentifier;

    public CustomerInput build() {
      CustomerInput result = new CustomerInput();
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.locale = this.locale;
      result.metafields = this.metafields;
      result.note = this.note;
      result.phone = this.phone;
      result.tags = this.tags;
      result.emailMarketingConsent = this.emailMarketingConsent;
      result.smsMarketingConsent = this.smsMarketingConsent;
      result.taxExempt = this.taxExempt;
      result.taxExemptions = this.taxExemptions;
      result.multipassIdentifier = this.multipassIdentifier;
      return result;
    }

    /**
     * The unique email address of the customer.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The customer's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The ID of the customer to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The customer's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The customer's locale.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Additional metafields to associate to the customer.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A note about the customer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The unique phone number for the customer.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * A list of tags to associate with the customer. Can be an array or a
     * comma-separated list. Example values: `["tag1", "tag2", "tag3"]`, `"tag1, tag2, tag3"`
     *   
     * Updating `tags` overwrites any existing tags that were previously added to the
     * customer. To add new tags without overwriting
     * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Information that describes when the customer consented to receiving marketing
     *         material by email. The `email` field is required when creating a customer with email marketing
     *         consent information.
     */
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }

    /**
     * The marketing consent information when the customer consented to receiving marketing
     *         material by SMS. The `phone` field is required when creating a customer with SMS
     *         marketing consent information.
     */
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }

    /**
     * Whether the customer is exempt from paying taxes on their order.
     */
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * The list of tax exemptions to apply to the customer.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    /**
     * A unique identifier for the customer that's used with Multipass login.
     */
    public Builder multipassIdentifier(String multipassIdentifier) {
      this.multipassIdentifier = multipassIdentifier;
      return this;
    }
  }
}
