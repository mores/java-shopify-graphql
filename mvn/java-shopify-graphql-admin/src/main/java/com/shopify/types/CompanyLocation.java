package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocation implements MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private CompanyAddress billingAddress;

  
  private BuyerExperienceConfiguration buyerExperienceConfiguration;

  
  private CatalogConnection catalogs;

  
  private Count catalogsCount;

  
  private Company company;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currency;

  
  private String defaultCursor;

  
  private DraftOrderConnection draftOrders;

  
  private EventConnection events;

  
  private String externalId;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private boolean inCatalog;

  
  private String locale;

  
  private Market market;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private String note;

  
  private int orderCount;

  
  private OrderConnection orders;

  
  private Count ordersCount;

  
  private String phone;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private CompanyContactRoleAssignmentConnection roleAssignments;

  
  private CompanyAddress shippingAddress;

  
  private CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments;

  
  private List<TaxExemption> taxExemptions;

  
  private String taxRegistrationId;

  
  private MoneyV2 totalSpent;

  
  private OffsetDateTime updatedAt;

  public CompanyLocation() {
  }

  
  public CompanyAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CompanyAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public BuyerExperienceConfiguration getBuyerExperienceConfiguration() {
    return buyerExperienceConfiguration;
  }

  public void setBuyerExperienceConfiguration(
      BuyerExperienceConfiguration buyerExperienceConfiguration) {
    this.buyerExperienceConfiguration = buyerExperienceConfiguration;
  }

  
  public CatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(CatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  
  public Count getCatalogsCount() {
    return catalogsCount;
  }

  public void setCatalogsCount(Count catalogsCount) {
    this.catalogsCount = catalogsCount;
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

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
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

  
  public boolean getInCatalog() {
    return inCatalog;
  }

  public void setInCatalog(boolean inCatalog) {
    this.inCatalog = inCatalog;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
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

  
  public int getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(int orderCount) {
    this.orderCount = orderCount;
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

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  
  public CompanyContactRoleAssignmentConnection getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  
  public CompanyAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(CompanyAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public CompanyLocationStaffMemberAssignmentConnection getStaffMemberAssignments() {
    return staffMemberAssignments;
  }

  public void setStaffMemberAssignments(
      CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments) {
    this.staffMemberAssignments = staffMemberAssignments;
  }

  
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  
  public String getTaxRegistrationId() {
    return taxRegistrationId;
  }

  public void setTaxRegistrationId(String taxRegistrationId) {
    this.taxRegistrationId = taxRegistrationId;
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
    return "CompanyLocation{billingAddress='" + billingAddress + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "', catalogs='" + catalogs + "', catalogsCount='" + catalogsCount + "', company='" + company + "', createdAt='" + createdAt + "', currency='" + currency + "', defaultCursor='" + defaultCursor + "', draftOrders='" + draftOrders + "', events='" + events + "', externalId='" + externalId + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', inCatalog='" + inCatalog + "', locale='" + locale + "', market='" + market + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', orderCount='" + orderCount + "', orders='" + orders + "', ordersCount='" + ordersCount + "', phone='" + phone + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', roleAssignments='" + roleAssignments + "', shippingAddress='" + shippingAddress + "', staffMemberAssignments='" + staffMemberAssignments + "', taxExemptions='" + taxExemptions + "', taxRegistrationId='" + taxRegistrationId + "', totalSpent='" + totalSpent + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocation that = (CompanyLocation) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(buyerExperienceConfiguration, that.buyerExperienceConfiguration) &&
        Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(catalogsCount, that.catalogsCount) &&
        Objects.equals(company, that.company) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(events, that.events) &&
        Objects.equals(externalId, that.externalId) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        inCatalog == that.inCatalog &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(market, that.market) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        orderCount == that.orderCount &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(ordersCount, that.ordersCount) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(roleAssignments, that.roleAssignments) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(staffMemberAssignments, that.staffMemberAssignments) &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(taxRegistrationId, that.taxRegistrationId) &&
        Objects.equals(totalSpent, that.totalSpent) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, buyerExperienceConfiguration, catalogs, catalogsCount, company, createdAt, currency, defaultCursor, draftOrders, events, externalId, hasTimelineComment, id, inCatalog, locale, market, metafield, metafieldDefinitions, metafields, name, note, orderCount, orders, ordersCount, phone, privateMetafield, privateMetafields, roleAssignments, shippingAddress, staffMemberAssignments, taxExemptions, taxRegistrationId, totalSpent, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CompanyAddress billingAddress;

    
    private BuyerExperienceConfiguration buyerExperienceConfiguration;

    
    private CatalogConnection catalogs;

    
    private Count catalogsCount;

    
    private Company company;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currency;

    
    private String defaultCursor;

    
    private DraftOrderConnection draftOrders;

    
    private EventConnection events;

    
    private String externalId;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private boolean inCatalog;

    
    private String locale;

    
    private Market market;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private String note;

    
    private int orderCount;

    
    private OrderConnection orders;

    
    private Count ordersCount;

    
    private String phone;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private CompanyContactRoleAssignmentConnection roleAssignments;

    
    private CompanyAddress shippingAddress;

    
    private CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments;

    
    private List<TaxExemption> taxExemptions;

    
    private String taxRegistrationId;

    
    private MoneyV2 totalSpent;

    
    private OffsetDateTime updatedAt;

    public CompanyLocation build() {
      CompanyLocation result = new CompanyLocation();
      result.billingAddress = this.billingAddress;
      result.buyerExperienceConfiguration = this.buyerExperienceConfiguration;
      result.catalogs = this.catalogs;
      result.catalogsCount = this.catalogsCount;
      result.company = this.company;
      result.createdAt = this.createdAt;
      result.currency = this.currency;
      result.defaultCursor = this.defaultCursor;
      result.draftOrders = this.draftOrders;
      result.events = this.events;
      result.externalId = this.externalId;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.inCatalog = this.inCatalog;
      result.locale = this.locale;
      result.market = this.market;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note = this.note;
      result.orderCount = this.orderCount;
      result.orders = this.orders;
      result.ordersCount = this.ordersCount;
      result.phone = this.phone;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.roleAssignments = this.roleAssignments;
      result.shippingAddress = this.shippingAddress;
      result.staffMemberAssignments = this.staffMemberAssignments;
      result.taxExemptions = this.taxExemptions;
      result.taxRegistrationId = this.taxRegistrationId;
      result.totalSpent = this.totalSpent;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder billingAddress(CompanyAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder buyerExperienceConfiguration(
        BuyerExperienceConfiguration buyerExperienceConfiguration) {
      this.buyerExperienceConfiguration = buyerExperienceConfiguration;
      return this;
    }

    
    public Builder catalogs(CatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    
    public Builder catalogsCount(Count catalogsCount) {
      this.catalogsCount = catalogsCount;
      return this;
    }

    
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
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

    
    public Builder inCatalog(boolean inCatalog) {
      this.inCatalog = inCatalog;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder market(Market market) {
      this.market = market;
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

    
    public Builder orderCount(int orderCount) {
      this.orderCount = orderCount;
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

    
    public Builder phone(String phone) {
      this.phone = phone;
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

    
    public Builder roleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
      this.roleAssignments = roleAssignments;
      return this;
    }

    
    public Builder shippingAddress(CompanyAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder staffMemberAssignments(
        CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments) {
      this.staffMemberAssignments = staffMemberAssignments;
      return this;
    }

    
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
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
