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
public class CustomerSetInput {
  /**
   * The addresses for a customer.
   */
  private List<MailingAddressInput> addresses;

  /**
   * The unique email address of the customer.
   */
  private String email;

  /**
   * The customer's first name.
   */
  private String firstName;

  /**
   * The customer's last name.
   */
  private String lastName;

  /**
   * The customer's locale.
   */
  private String locale;

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
   * Whether the customer is exempt from paying taxes on their order.
   */
  private Boolean taxExempt;

  /**
   * The list of tax exemptions to apply to the customer.
   */
  private List<TaxExemption> taxExemptions;

  public CustomerSetInput() {
  }

  /**
   * The addresses for a customer.
   */
  public List<MailingAddressInput> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<MailingAddressInput> addresses) {
    this.addresses = addresses;
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

  @Override
  public String toString() {
    return "CustomerSetInput{addresses='" + addresses + "', email='" + email + "', firstName='" + firstName + "', lastName='" + lastName + "', locale='" + locale + "', note='" + note + "', phone='" + phone + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSetInput that = (CustomerSetInput) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(note, that.note) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(taxExempt, that.taxExempt) &&
        Objects.equals(taxExemptions, that.taxExemptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, email, firstName, lastName, locale, note, phone, tags, taxExempt, taxExemptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The addresses for a customer.
     */
    private List<MailingAddressInput> addresses;

    /**
     * The unique email address of the customer.
     */
    private String email;

    /**
     * The customer's first name.
     */
    private String firstName;

    /**
     * The customer's last name.
     */
    private String lastName;

    /**
     * The customer's locale.
     */
    private String locale;

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
     * Whether the customer is exempt from paying taxes on their order.
     */
    private Boolean taxExempt;

    /**
     * The list of tax exemptions to apply to the customer.
     */
    private List<TaxExemption> taxExemptions;

    public CustomerSetInput build() {
      CustomerSetInput result = new CustomerSetInput();
      result.addresses = this.addresses;
      result.email = this.email;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.locale = this.locale;
      result.note = this.note;
      result.phone = this.phone;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      result.taxExemptions = this.taxExemptions;
      return result;
    }

    /**
     * The addresses for a customer.
     */
    public Builder addresses(List<MailingAddressInput> addresses) {
      this.addresses = addresses;
      return this;
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
  }
}
