package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyContact implements com.shopify.types.Node {
  
  private Company company;

  
  private OffsetDateTime createdAt;

  
  private Customer customer;

  
  private DraftOrderConnection draftOrders;

  
  private String id;

  
  private boolean isMainContact;

  
  private String lifetimeDuration;

  
  private String locale;

  
  private OrderConnection orders;

  
  private CompanyContactRoleAssignmentConnection roleAssignments;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  public CompanyContact() {
  }

  
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsMainContact() {
    return isMainContact;
  }

  public void setIsMainContact(boolean isMainContact) {
    this.isMainContact = isMainContact;
  }

  
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public CompanyContactRoleAssignmentConnection getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
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
    
    private Company company;

    
    private OffsetDateTime createdAt;

    
    private Customer customer;

    
    private DraftOrderConnection draftOrders;

    
    private String id;

    
    private boolean isMainContact;

    
    private String lifetimeDuration;

    
    private String locale;

    
    private OrderConnection orders;

    
    private CompanyContactRoleAssignmentConnection roleAssignments;

    
    private String title;

    
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

    
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isMainContact(boolean isMainContact) {
      this.isMainContact = isMainContact;
      return this;
    }

    
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder roleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
      this.roleAssignments = roleAssignments;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
