package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A person that acts on behalf of company associated to [a
 * customer](https://shopify.dev/api/admin-graphql/latest/objects/customer).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyContact implements com.shopify.admin.types.Node {
  /**
   * The company to which the contact belongs.
   */
  private Company company;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company contact was created at Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * The customer associated to this contact.
   */
  private Customer customer;

  /**
   * The list of draft orders for the company contact.
   */
  private DraftOrderConnection draftOrders;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the contact is the main contact of the company.
   */
  private boolean isMainContact;

  /**
   * The lifetime duration of the company contact, since its creation date on
   * Shopify. Examples: `1 year`, `2 months`, `3 days`.
   */
  private String lifetimeDuration;

  /**
   * The company contact's locale (language).
   */
  private String locale;

  /**
   * The list of orders for the company contact.
   */
  private OrderConnection orders;

  /**
   * The list of roles assigned to this company contact.
   */
  private CompanyContactRoleAssignmentConnection roleAssignments;

  /**
   * The company contact's job title.
   */
  private String title;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company contact was last updated.
   */
  private OffsetDateTime updatedAt;

  public CompanyContact() {
  }

  /**
   * The company to which the contact belongs.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company contact was created at Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The customer associated to this contact.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The list of draft orders for the company contact.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the contact is the main contact of the company.
   */
  public boolean getIsMainContact() {
    return isMainContact;
  }

  public void setIsMainContact(boolean isMainContact) {
    this.isMainContact = isMainContact;
  }

  /**
   * The lifetime duration of the company contact, since its creation date on
   * Shopify. Examples: `1 year`, `2 months`, `3 days`.
   */
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  /**
   * The company contact's locale (language).
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The list of orders for the company contact.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The list of roles assigned to this company contact.
   */
  public CompanyContactRoleAssignmentConnection getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  /**
   * The company contact's job title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company contact was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CompanyContact{company='" + company + "', createdAt='" + createdAt + "', customer='" + customer + "', draftOrders='" + draftOrders + "', id='" + id + "', isMainContact='" + isMainContact + "', lifetimeDuration='" + lifetimeDuration + "', locale='" + locale + "', orders='" + orders + "', roleAssignments='" + roleAssignments + "', title='" + title + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContact that = (CompanyContact) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(id, that.id) &&
        isMainContact == that.isMainContact &&
        Objects.equals(lifetimeDuration, that.lifetimeDuration) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(roleAssignments, that.roleAssignments) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, createdAt, customer, draftOrders, id, isMainContact, lifetimeDuration, locale, orders, roleAssignments, title, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company to which the contact belongs.
     */
    private Company company;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company contact was created at Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * The customer associated to this contact.
     */
    private Customer customer;

    /**
     * The list of draft orders for the company contact.
     */
    private DraftOrderConnection draftOrders;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the contact is the main contact of the company.
     */
    private boolean isMainContact;

    /**
     * The lifetime duration of the company contact, since its creation date on
     * Shopify. Examples: `1 year`, `2 months`, `3 days`.
     */
    private String lifetimeDuration;

    /**
     * The company contact's locale (language).
     */
    private String locale;

    /**
     * The list of orders for the company contact.
     */
    private OrderConnection orders;

    /**
     * The list of roles assigned to this company contact.
     */
    private CompanyContactRoleAssignmentConnection roleAssignments;

    /**
     * The company contact's job title.
     */
    private String title;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company contact was last updated.
     */
    private OffsetDateTime updatedAt;

    public CompanyContact build() {
      CompanyContact result = new CompanyContact();
      result.company = this.company;
      result.createdAt = this.createdAt;
      result.customer = this.customer;
      result.draftOrders = this.draftOrders;
      result.id = this.id;
      result.isMainContact = this.isMainContact;
      result.lifetimeDuration = this.lifetimeDuration;
      result.locale = this.locale;
      result.orders = this.orders;
      result.roleAssignments = this.roleAssignments;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The company to which the contact belongs.
     */
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company contact was created at Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The customer associated to this contact.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The list of draft orders for the company contact.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the contact is the main contact of the company.
     */
    public Builder isMainContact(boolean isMainContact) {
      this.isMainContact = isMainContact;
      return this;
    }

    /**
     * The lifetime duration of the company contact, since its creation date on
     * Shopify. Examples: `1 year`, `2 months`, `3 days`.
     */
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    /**
     * The company contact's locale (language).
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The list of orders for the company contact.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The list of roles assigned to this company contact.
     */
    public Builder roleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
      this.roleAssignments = roleAssignments;
      return this;
    }

    /**
     * The company contact's job title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company contact was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
