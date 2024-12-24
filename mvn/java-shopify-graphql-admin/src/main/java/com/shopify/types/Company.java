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
public class Company implements MetafieldReference, MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private int contactCount;

  
  private CompanyContactRoleConnection contactRoles;

  
  private CompanyContactConnection contacts;

  
  private Count contactsCount;

  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime customerSince;

  
  private String defaultCursor;

  
  private CompanyContactRole defaultRole;

  
  private DraftOrderConnection draftOrders;

  
  private EventConnection events;

  
  private String externalId;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private String lifetimeDuration;

  
  private CompanyLocationConnection locations;

  
  private Count locationsCount;

  
  private CompanyContact mainContact;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private String note;

  
  private OrderConnection orders;

  
  private Count ordersCount;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private MoneyV2 totalSpent;

  
  private OffsetDateTime updatedAt;

  public Company() {
  }

  
  public int getContactCount() {
    return contactCount;
  }

  public void setContactCount(int contactCount) {
    this.contactCount = contactCount;
  }

  
  public CompanyContactRoleConnection getContactRoles() {
    return contactRoles;
  }

  public void setContactRoles(CompanyContactRoleConnection contactRoles) {
    this.contactRoles = contactRoles;
  }

  
  public CompanyContactConnection getContacts() {
    return contacts;
  }

  public void setContacts(CompanyContactConnection contacts) {
    this.contacts = contacts;
  }

  
  public Count getContactsCount() {
    return contactsCount;
  }

  public void setContactsCount(Count contactsCount) {
    this.contactsCount = contactsCount;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OffsetDateTime getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(OffsetDateTime customerSince) {
    this.customerSince = customerSince;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public CompanyContactRole getDefaultRole() {
    return defaultRole;
  }

  public void setDefaultRole(CompanyContactRole defaultRole) {
    this.defaultRole = defaultRole;
  }

  
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  
  public CompanyLocationConnection getLocations() {
    return locations;
  }

  public void setLocations(CompanyLocationConnection locations) {
    this.locations = locations;
  }

  
  public Count getLocationsCount() {
    return locationsCount;
  }

  public void setLocationsCount(Count locationsCount) {
    this.locationsCount = locationsCount;
  }

  
  public CompanyContact getMainContact() {
    return mainContact;
  }

  public void setMainContact(CompanyContact mainContact) {
    this.mainContact = mainContact;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public Count getOrdersCount() {
    return ordersCount;
  }

  public void setOrdersCount(Count ordersCount) {
    this.ordersCount = ordersCount;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public MoneyV2 getTotalSpent() {
    return totalSpent;
  }

  public void setTotalSpent(MoneyV2 totalSpent) {
    this.totalSpent = totalSpent;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Company{contactCount='" + contactCount + "', contactRoles='" + contactRoles + "', contacts='" + contacts + "', contactsCount='" + contactsCount + "', createdAt='" + createdAt + "', customerSince='" + customerSince + "', defaultCursor='" + defaultCursor + "', defaultRole='" + defaultRole + "', draftOrders='" + draftOrders + "', events='" + events + "', externalId='" + externalId + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', lifetimeDuration='" + lifetimeDuration + "', locations='" + locations + "', locationsCount='" + locationsCount + "', mainContact='" + mainContact + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', orders='" + orders + "', ordersCount='" + ordersCount + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', totalSpent='" + totalSpent + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Company that = (Company) o;
    return contactCount == that.contactCount &&
        Objects.equals(contactRoles, that.contactRoles) &&
        Objects.equals(contacts, that.contacts) &&
        Objects.equals(contactsCount, that.contactsCount) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerSince, that.customerSince) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(defaultRole, that.defaultRole) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(events, that.events) &&
        Objects.equals(externalId, that.externalId) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(lifetimeDuration, that.lifetimeDuration) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(locationsCount, that.locationsCount) &&
        Objects.equals(mainContact, that.mainContact) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(ordersCount, that.ordersCount) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(totalSpent, that.totalSpent) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCount, contactRoles, contacts, contactsCount, createdAt, customerSince, defaultCursor, defaultRole, draftOrders, events, externalId, hasTimelineComment, id, lifetimeDuration, locations, locationsCount, mainContact, metafield, metafieldDefinitions, metafields, name, note, orders, ordersCount, privateMetafield, privateMetafields, totalSpent, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int contactCount;

    
    private CompanyContactRoleConnection contactRoles;

    
    private CompanyContactConnection contacts;

    
    private Count contactsCount;

    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime customerSince;

    
    private String defaultCursor;

    
    private CompanyContactRole defaultRole;

    
    private DraftOrderConnection draftOrders;

    
    private EventConnection events;

    
    private String externalId;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private String lifetimeDuration;

    
    private CompanyLocationConnection locations;

    
    private Count locationsCount;

    
    private CompanyContact mainContact;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private String note;

    
    private OrderConnection orders;

    
    private Count ordersCount;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private MoneyV2 totalSpent;

    
    private OffsetDateTime updatedAt;

    public Company build() {
      Company result = new Company();
      result.contactCount = this.contactCount;
      result.contactRoles = this.contactRoles;
      result.contacts = this.contacts;
      result.contactsCount = this.contactsCount;
      result.createdAt = this.createdAt;
      result.customerSince = this.customerSince;
      result.defaultCursor = this.defaultCursor;
      result.defaultRole = this.defaultRole;
      result.draftOrders = this.draftOrders;
      result.events = this.events;
      result.externalId = this.externalId;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.lifetimeDuration = this.lifetimeDuration;
      result.locations = this.locations;
      result.locationsCount = this.locationsCount;
      result.mainContact = this.mainContact;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note = this.note;
      result.orders = this.orders;
      result.ordersCount = this.ordersCount;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.totalSpent = this.totalSpent;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder contactCount(int contactCount) {
      this.contactCount = contactCount;
      return this;
    }

    
    public Builder contactRoles(CompanyContactRoleConnection contactRoles) {
      this.contactRoles = contactRoles;
      return this;
    }

    
    public Builder contacts(CompanyContactConnection contacts) {
      this.contacts = contacts;
      return this;
    }

    
    public Builder contactsCount(Count contactsCount) {
      this.contactsCount = contactsCount;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customerSince(OffsetDateTime customerSince) {
      this.customerSince = customerSince;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder defaultRole(CompanyContactRole defaultRole) {
      this.defaultRole = defaultRole;
      return this;
    }

    
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    
    public Builder locations(CompanyLocationConnection locations) {
      this.locations = locations;
      return this;
    }

    
    public Builder locationsCount(Count locationsCount) {
      this.locationsCount = locationsCount;
      return this;
    }

    
    public Builder mainContact(CompanyContact mainContact) {
      this.mainContact = mainContact;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder ordersCount(Count ordersCount) {
      this.ordersCount = ordersCount;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder totalSpent(MoneyV2 totalSpent) {
      this.totalSpent = totalSpent;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
