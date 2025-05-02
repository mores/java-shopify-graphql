package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents information about the buyer that is interacting with the cart.
 */
public class PurchasingCompany {
  /**
   * The company associated to the order or draft order.
   */
  private Company company;

  /**
   * The company contact associated to the order or draft order.
   */
  private CompanyContact contact;

  /**
   * The company location associated to the order or draft order.
   */
  private CompanyLocation location;

  public PurchasingCompany() {
  }

  /**
   * The company associated to the order or draft order.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * The company contact associated to the order or draft order.
   */
  public CompanyContact getContact() {
    return contact;
  }

  public void setContact(CompanyContact contact) {
    this.contact = contact;
  }

  /**
   * The company location associated to the order or draft order.
   */
  public CompanyLocation getLocation() {
    return location;
  }

  public void setLocation(CompanyLocation location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "PurchasingCompany{company='" + company + "', contact='" + contact + "', location='" + location + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchasingCompany that = (PurchasingCompany) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(contact, that.contact) &&
        Objects.equals(location, that.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, contact, location);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company associated to the order or draft order.
     */
    private Company company;

    /**
     * The company contact associated to the order or draft order.
     */
    private CompanyContact contact;

    /**
     * The company location associated to the order or draft order.
     */
    private CompanyLocation location;

    public PurchasingCompany build() {
      PurchasingCompany result = new PurchasingCompany();
      result.company = this.company;
      result.contact = this.contact;
      result.location = this.location;
      return result;
    }

    /**
     * The company associated to the order or draft order.
     */
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    /**
     * The company contact associated to the order or draft order.
     */
    public Builder contact(CompanyContact contact) {
      this.contact = contact;
      return this;
    }

    /**
     * The company location associated to the order or draft order.
     */
    public Builder location(CompanyLocation location) {
      this.location = location;
      return this;
    }
  }
}
