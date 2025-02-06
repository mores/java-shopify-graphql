package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a new customer object or identifying an existing
 * customer to update &amp; associate with the order.
 */
public class OrderCreateUpsertCustomerAttributesInput {
  /**
   * A list of addresses to associate with the customer.
   */
  private List<OrderCreateCustomerAddressInput> addresses;

  /**
   * The email address to update the customer with. If no `id` is provided, this is used to uniquely identify the customer.
   */
  private String email;

  /**
   * The first name of the customer.
   */
  private String firstName;

  /**
   * The id of the customer to associate to the order.
   */
  private String id;

  /**
   * The last name of the customer.
   */
  private String lastName;

  /**
   * A unique identifier for the customer that's used with [Multipass login](https://shopify.dev/api/multipass).
   */
  private String multipassIdentifier;

  /**
   * A note about the customer.
   */
  private String note;

  /**
   * The unique phone number ([E.164 format](https://en.wikipedia.org/wiki/E.164)) for this customer.
   *                  Attempting to assign the same phone number to multiple customers returns an error. The property can be
   *                  set using different formats, but each format must represent a number that can be dialed from anywhere
   *                  in the world. The following formats are all valid:
   *                   - 6135551212
   *                   - +16135551212
   *                   - (613)555-1212
   *                   - +1 613-555-1212
   */
  private String phone;

  /**
   * Tags that the shop owner has attached to the customer. A customer can have up
   * to 250 tags. Each tag can have up to 255 characters.
   */
  private List<String> tags;

  /**
   * Whether the customer is exempt from paying taxes on their order. If `true`,
   * then taxes won't be applied to an order at checkout. If `false`, then taxes
   * will be applied at checkout.
   */
  private Boolean taxExempt;

  public OrderCreateUpsertCustomerAttributesInput() {
  }

  /**
   * A list of addresses to associate with the customer.
   */
  public List<OrderCreateCustomerAddressInput> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<OrderCreateCustomerAddressInput> addresses) {
    this.addresses = addresses;
  }

  /**
   * The email address to update the customer with. If no `id` is provided, this is used to uniquely identify the customer.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The first name of the customer.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The id of the customer to associate to the order.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The last name of the customer.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A unique identifier for the customer that's used with [Multipass login](https://shopify.dev/api/multipass).
   */
  public String getMultipassIdentifier() {
    return multipassIdentifier;
  }

  public void setMultipassIdentifier(String multipassIdentifier) {
    this.multipassIdentifier = multipassIdentifier;
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
   * The unique phone number ([E.164 format](https://en.wikipedia.org/wiki/E.164)) for this customer.
   *                  Attempting to assign the same phone number to multiple customers returns an error. The property can be
   *                  set using different formats, but each format must represent a number that can be dialed from anywhere
   *                  in the world. The following formats are all valid:
   *                   - 6135551212
   *                   - +16135551212
   *                   - (613)555-1212
   *                   - +1 613-555-1212
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Tags that the shop owner has attached to the customer. A customer can have up
   * to 250 tags. Each tag can have up to 255 characters.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Whether the customer is exempt from paying taxes on their order. If `true`,
   * then taxes won't be applied to an order at checkout. If `false`, then taxes
   * will be applied at checkout.
   */
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  @Override
  public String toString() {
    return "OrderCreateUpsertCustomerAttributesInput{addresses='" + addresses + "', email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', multipassIdentifier='" + multipassIdentifier + "', note='" + note + "', phone='" + phone + "', tags='" + tags + "', taxExempt='" + taxExempt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateUpsertCustomerAttributesInput that = (OrderCreateUpsertCustomerAttributesInput) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(multipassIdentifier, that.multipassIdentifier) &&
        Objects.equals(note, that.note) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(taxExempt, that.taxExempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, email, firstName, id, lastName, multipassIdentifier, note, phone, tags, taxExempt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of addresses to associate with the customer.
     */
    private List<OrderCreateCustomerAddressInput> addresses;

    /**
     * The email address to update the customer with. If no `id` is provided, this is used to uniquely identify the customer.
     */
    private String email;

    /**
     * The first name of the customer.
     */
    private String firstName;

    /**
     * The id of the customer to associate to the order.
     */
    private String id;

    /**
     * The last name of the customer.
     */
    private String lastName;

    /**
     * A unique identifier for the customer that's used with [Multipass login](https://shopify.dev/api/multipass).
     */
    private String multipassIdentifier;

    /**
     * A note about the customer.
     */
    private String note;

    /**
     * The unique phone number ([E.164 format](https://en.wikipedia.org/wiki/E.164)) for this customer.
     *                  Attempting to assign the same phone number to multiple customers returns an error. The property can be
     *                  set using different formats, but each format must represent a number that can be dialed from anywhere
     *                  in the world. The following formats are all valid:
     *                   - 6135551212
     *                   - +16135551212
     *                   - (613)555-1212
     *                   - +1 613-555-1212
     */
    private String phone;

    /**
     * Tags that the shop owner has attached to the customer. A customer can have up
     * to 250 tags. Each tag can have up to 255 characters.
     */
    private List<String> tags;

    /**
     * Whether the customer is exempt from paying taxes on their order. If `true`,
     * then taxes won't be applied to an order at checkout. If `false`, then taxes
     * will be applied at checkout.
     */
    private Boolean taxExempt;

    public OrderCreateUpsertCustomerAttributesInput build() {
      OrderCreateUpsertCustomerAttributesInput result = new OrderCreateUpsertCustomerAttributesInput();
      result.addresses = this.addresses;
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.multipassIdentifier = this.multipassIdentifier;
      result.note = this.note;
      result.phone = this.phone;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      return result;
    }

    /**
     * A list of addresses to associate with the customer.
     */
    public Builder addresses(List<OrderCreateCustomerAddressInput> addresses) {
      this.addresses = addresses;
      return this;
    }

    /**
     * The email address to update the customer with. If no `id` is provided, this is used to uniquely identify the customer.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The first name of the customer.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The id of the customer to associate to the order.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The last name of the customer.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * A unique identifier for the customer that's used with [Multipass login](https://shopify.dev/api/multipass).
     */
    public Builder multipassIdentifier(String multipassIdentifier) {
      this.multipassIdentifier = multipassIdentifier;
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
     * The unique phone number ([E.164 format](https://en.wikipedia.org/wiki/E.164)) for this customer.
     *                  Attempting to assign the same phone number to multiple customers returns an error. The property can be
     *                  set using different formats, but each format must represent a number that can be dialed from anywhere
     *                  in the world. The following formats are all valid:
     *                   - 6135551212
     *                   - +16135551212
     *                   - (613)555-1212
     *                   - +1 613-555-1212
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Tags that the shop owner has attached to the customer. A customer can have up
     * to 250 tags. Each tag can have up to 255 characters.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Whether the customer is exempt from paying taxes on their order. If `true`,
     * then taxes won't be applied to an order at checkout. If `false`, then taxes
     * will be applied at checkout.
     */
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }
  }
}
