package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A location or branch of a [company that's a
 * customer](https://shopify.dev/api/admin-graphql/latest/objects/company) of the
 * shop. Configuration of B2B relationship, for example prices lists and checkout
 * settings, may be done for a location.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocation implements MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Navigable, com.shopify.types.Node {
  /**
   * The address used as billing address for the location.
   */
  private CompanyAddress billingAddress;

  /**
   * The configuration for the buyer's B2B checkout.
   */
  private BuyerExperienceConfiguration buyerExperienceConfiguration;

  /**
   * The list of catalogs associated with the company location.
   */
  private CatalogConnection catalogs;

  /**
   * The number of catalogs associated with the company location. Limited to a maximum of 10000.
   */
  private Count catalogsCount;

  /**
   * The company that the company location belongs to.
   */
  private Company company;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was created in Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * The location's currency based on the shipping address. If the shipping address
   * is empty, then the value is the shop's primary market.
   */
  private CurrencyCode currency;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * The list of draft orders for the company location.
   */
  private DraftOrderConnection draftOrders;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * A unique externally-supplied ID for the company location.
   */
  private String externalId;

  /**
   * Whether the merchant added a timeline comment to the company location.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the company location is assigned a specific catalog.
   */
  private boolean inCatalog;

  /**
   * The preferred locale of the company location.
   */
  private String locale;

  /**
   * The market that includes the location's shipping address. If the shipping
   * address is empty, then the value is the shop's primary market.
   */
  private Market market;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The name of the company location.
   */
  private String name;

  /**
   * A note about the company location.
   */
  private String note;

  /**
   * The total number of orders placed for the location.
   */
  private int orderCount;

  /**
   * The list of orders for the company location.
   */
  private OrderConnection orders;

  /**
   * The total number of orders placed for the location.
   */
  private Count ordersCount;

  /**
   * The phone number of the company location.
   */
  private String phone;

  /**
   * The list of roles assigned to the company location.
   */
  private CompanyContactRoleAssignmentConnection roleAssignments;

  /**
   * The address used as shipping address for the location.
   */
  private CompanyAddress shippingAddress;

  /**
   * The list of staff members assigned to the company location.
   */
  private CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments;

  /**
   * The list of tax exemptions applied to the location.
   */
  private List<TaxExemption> taxExemptions;

  /**
   * The tax registration ID for the company location.
   */
  private String taxRegistrationId;

  /**
   * The tax settings for the company location.
   */
  private CompanyLocationTaxSettings taxSettings;

  /**
   * The total amount spent by the location.
   */
  private MoneyV2 totalSpent;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was last modified.
   */
  private OffsetDateTime updatedAt;

  public CompanyLocation() {
  }

  /**
   * The address used as billing address for the location.
   */
  public CompanyAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CompanyAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The configuration for the buyer's B2B checkout.
   */
  public BuyerExperienceConfiguration getBuyerExperienceConfiguration() {
    return buyerExperienceConfiguration;
  }

  public void setBuyerExperienceConfiguration(
      BuyerExperienceConfiguration buyerExperienceConfiguration) {
    this.buyerExperienceConfiguration = buyerExperienceConfiguration;
  }

  /**
   * The list of catalogs associated with the company location.
   */
  public CatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(CatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * The number of catalogs associated with the company location. Limited to a maximum of 10000.
   */
  public Count getCatalogsCount() {
    return catalogsCount;
  }

  public void setCatalogsCount(Count catalogsCount) {
    this.catalogsCount = catalogsCount;
  }

  /**
   * The company that the company location belongs to.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was created in Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The location's currency based on the shipping address. If the shipping address
   * is empty, then the value is the shop's primary market.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * The list of draft orders for the company location.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * The paginated list of events associated with the host subject.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
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
   * Whether the merchant added a timeline comment to the company location.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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
   * Whether the company location is assigned a specific catalog.
   */
  public boolean getInCatalog() {
    return inCatalog;
  }

  public void setInCatalog(boolean inCatalog) {
    this.inCatalog = inCatalog;
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
   * The market that includes the location's shipping address. If the shipping
   * address is empty, then the value is the shop's primary market.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
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
   * A note about the company location.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total number of orders placed for the location.
   */
  public int getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(int orderCount) {
    this.orderCount = orderCount;
  }

  /**
   * The list of orders for the company location.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The total number of orders placed for the location.
   */
  public Count getOrdersCount() {
    return ordersCount;
  }

  public void setOrdersCount(Count ordersCount) {
    this.ordersCount = ordersCount;
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
   * The list of roles assigned to the company location.
   */
  public CompanyContactRoleAssignmentConnection getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  /**
   * The address used as shipping address for the location.
   */
  public CompanyAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(CompanyAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The list of staff members assigned to the company location.
   */
  public CompanyLocationStaffMemberAssignmentConnection getStaffMemberAssignments() {
    return staffMemberAssignments;
  }

  public void setStaffMemberAssignments(
      CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments) {
    this.staffMemberAssignments = staffMemberAssignments;
  }

  /**
   * The list of tax exemptions applied to the location.
   */
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  /**
   * The tax registration ID for the company location.
   */
  public String getTaxRegistrationId() {
    return taxRegistrationId;
  }

  public void setTaxRegistrationId(String taxRegistrationId) {
    this.taxRegistrationId = taxRegistrationId;
  }

  /**
   * The tax settings for the company location.
   */
  public CompanyLocationTaxSettings getTaxSettings() {
    return taxSettings;
  }

  public void setTaxSettings(CompanyLocationTaxSettings taxSettings) {
    this.taxSettings = taxSettings;
  }

  /**
   * The total amount spent by the location.
   */
  public MoneyV2 getTotalSpent() {
    return totalSpent;
  }

  public void setTotalSpent(MoneyV2 totalSpent) {
    this.totalSpent = totalSpent;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CompanyLocation{billingAddress='" + billingAddress + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "', catalogs='" + catalogs + "', catalogsCount='" + catalogsCount + "', company='" + company + "', createdAt='" + createdAt + "', currency='" + currency + "', defaultCursor='" + defaultCursor + "', draftOrders='" + draftOrders + "', events='" + events + "', externalId='" + externalId + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', inCatalog='" + inCatalog + "', locale='" + locale + "', market='" + market + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', orderCount='" + orderCount + "', orders='" + orders + "', ordersCount='" + ordersCount + "', phone='" + phone + "', roleAssignments='" + roleAssignments + "', shippingAddress='" + shippingAddress + "', staffMemberAssignments='" + staffMemberAssignments + "', taxExemptions='" + taxExemptions + "', taxRegistrationId='" + taxRegistrationId + "', taxSettings='" + taxSettings + "', totalSpent='" + totalSpent + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(roleAssignments, that.roleAssignments) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(staffMemberAssignments, that.staffMemberAssignments) &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(taxRegistrationId, that.taxRegistrationId) &&
        Objects.equals(taxSettings, that.taxSettings) &&
        Objects.equals(totalSpent, that.totalSpent) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, buyerExperienceConfiguration, catalogs, catalogsCount, company, createdAt, currency, defaultCursor, draftOrders, events, externalId, hasTimelineComment, id, inCatalog, locale, market, metafield, metafieldDefinitions, metafields, name, note, orderCount, orders, ordersCount, phone, roleAssignments, shippingAddress, staffMemberAssignments, taxExemptions, taxRegistrationId, taxSettings, totalSpent, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address used as billing address for the location.
     */
    private CompanyAddress billingAddress;

    /**
     * The configuration for the buyer's B2B checkout.
     */
    private BuyerExperienceConfiguration buyerExperienceConfiguration;

    /**
     * The list of catalogs associated with the company location.
     */
    private CatalogConnection catalogs;

    /**
     * The number of catalogs associated with the company location. Limited to a maximum of 10000.
     */
    private Count catalogsCount;

    /**
     * The company that the company location belongs to.
     */
    private Company company;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was created in Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * The location's currency based on the shipping address. If the shipping address
     * is empty, then the value is the shop's primary market.
     */
    private CurrencyCode currency;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * The list of draft orders for the company location.
     */
    private DraftOrderConnection draftOrders;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * A unique externally-supplied ID for the company location.
     */
    private String externalId;

    /**
     * Whether the merchant added a timeline comment to the company location.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the company location is assigned a specific catalog.
     */
    private boolean inCatalog;

    /**
     * The preferred locale of the company location.
     */
    private String locale;

    /**
     * The market that includes the location's shipping address. If the shipping
     * address is empty, then the value is the shop's primary market.
     */
    private Market market;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The name of the company location.
     */
    private String name;

    /**
     * A note about the company location.
     */
    private String note;

    /**
     * The total number of orders placed for the location.
     */
    private int orderCount;

    /**
     * The list of orders for the company location.
     */
    private OrderConnection orders;

    /**
     * The total number of orders placed for the location.
     */
    private Count ordersCount;

    /**
     * The phone number of the company location.
     */
    private String phone;

    /**
     * The list of roles assigned to the company location.
     */
    private CompanyContactRoleAssignmentConnection roleAssignments;

    /**
     * The address used as shipping address for the location.
     */
    private CompanyAddress shippingAddress;

    /**
     * The list of staff members assigned to the company location.
     */
    private CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments;

    /**
     * The list of tax exemptions applied to the location.
     */
    private List<TaxExemption> taxExemptions;

    /**
     * The tax registration ID for the company location.
     */
    private String taxRegistrationId;

    /**
     * The tax settings for the company location.
     */
    private CompanyLocationTaxSettings taxSettings;

    /**
     * The total amount spent by the location.
     */
    private MoneyV2 totalSpent;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was last modified.
     */
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
      result.roleAssignments = this.roleAssignments;
      result.shippingAddress = this.shippingAddress;
      result.staffMemberAssignments = this.staffMemberAssignments;
      result.taxExemptions = this.taxExemptions;
      result.taxRegistrationId = this.taxRegistrationId;
      result.taxSettings = this.taxSettings;
      result.totalSpent = this.totalSpent;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The address used as billing address for the location.
     */
    public Builder billingAddress(CompanyAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The configuration for the buyer's B2B checkout.
     */
    public Builder buyerExperienceConfiguration(
        BuyerExperienceConfiguration buyerExperienceConfiguration) {
      this.buyerExperienceConfiguration = buyerExperienceConfiguration;
      return this;
    }

    /**
     * The list of catalogs associated with the company location.
     */
    public Builder catalogs(CatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * The number of catalogs associated with the company location. Limited to a maximum of 10000.
     */
    public Builder catalogsCount(Count catalogsCount) {
      this.catalogsCount = catalogsCount;
      return this;
    }

    /**
     * The company that the company location belongs to.
     */
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was created in Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The location's currency based on the shipping address. If the shipping address
     * is empty, then the value is the shop's primary market.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * The list of draft orders for the company location.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * The paginated list of events associated with the host subject.
     */
    public Builder events(EventConnection events) {
      this.events = events;
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
     * Whether the merchant added a timeline comment to the company location.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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
     * Whether the company location is assigned a specific catalog.
     */
    public Builder inCatalog(boolean inCatalog) {
      this.inCatalog = inCatalog;
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
     * The market that includes the location's shipping address. If the shipping
     * address is empty, then the value is the shop's primary market.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the company location.
     */
    public Builder name(String name) {
      this.name = name;
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
     * The total number of orders placed for the location.
     */
    public Builder orderCount(int orderCount) {
      this.orderCount = orderCount;
      return this;
    }

    /**
     * The list of orders for the company location.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The total number of orders placed for the location.
     */
    public Builder ordersCount(Count ordersCount) {
      this.ordersCount = ordersCount;
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
     * The list of roles assigned to the company location.
     */
    public Builder roleAssignments(CompanyContactRoleAssignmentConnection roleAssignments) {
      this.roleAssignments = roleAssignments;
      return this;
    }

    /**
     * The address used as shipping address for the location.
     */
    public Builder shippingAddress(CompanyAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The list of staff members assigned to the company location.
     */
    public Builder staffMemberAssignments(
        CompanyLocationStaffMemberAssignmentConnection staffMemberAssignments) {
      this.staffMemberAssignments = staffMemberAssignments;
      return this;
    }

    /**
     * The list of tax exemptions applied to the location.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    /**
     * The tax registration ID for the company location.
     */
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
      return this;
    }

    /**
     * The tax settings for the company location.
     */
    public Builder taxSettings(CompanyLocationTaxSettings taxSettings) {
      this.taxSettings = taxSettings;
      return this;
    }

    /**
     * The total amount spent by the location.
     */
    public Builder totalSpent(MoneyV2 totalSpent) {
      this.totalSpent = totalSpent;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
