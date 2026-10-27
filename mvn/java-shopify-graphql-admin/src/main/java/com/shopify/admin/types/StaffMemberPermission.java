package com.shopify.admin.types;

/**
 * Represents access permissions for a staff member.
 */
public enum StaffMemberPermission {
  /**
   * The staff member can manage and install apps and channels.
   */
  APPLICATIONS,

  /**
   * The staff member can manage and install sales channels.
   */
  CHANNELS,

  /**
   * The staff member can create and edit customers.
   */
  CREATE_AND_EDIT_CUSTOMERS,

  /**
   * The staff member can create and edit gift cards.
   */
  CREATE_AND_EDIT_GIFT_CARDS,

  /**
   * The staff member can view customers.
   */
  CUSTOMERS,

  /**
   * The staff member can view the Shopify Home page, which includes sales information and other shop data.
   */
  DASHBOARD,

  /**
   * The staff member can deactivate gift cards.
   */
  DEACTIVATE_GIFT_CARDS,

  /**
   * The staff member can delete customers.
   */
  DELETE_CUSTOMERS,

  /**
   * The staff member can view, buy, and manage domains.
   */
  DOMAINS,

  /**
   * The staff member can create, update, and delete draft orders.
   */
  DRAFT_ORDERS,

  /**
   * The staff member can update orders.
   */
  EDIT_ORDERS,

  /**
   * The staff member can erase customer private data.
   */
  ERASE_CUSTOMER_DATA,

  /**
   * The staff member can export customers.
   */
  EXPORT_CUSTOMERS,

  /**
   * The staff member can export gift cards.
   */
  EXPORT_GIFT_CARDS,

  /**
   * The staff has the same permissions as the [store owner](https://shopify.dev/en/manual/your-account/staff-accounts/staff-permissions#store-owner-permissions)
   * with some exceptions, such as modifying the account billing or deleting staff accounts.
   */
  FULL,

  /**
   * The staff member can view, create, issue, and export gift cards to a CSV file.
   */
  GIFT_CARDS,

  /**
   * The staff member can view and modify links and navigation menus.
   */
  LINKS,

  /**
   * The staff member can create, update, and delete locations where inventory is stocked or managed.
   */
  LOCATIONS,

  /**
   * The staff member can view markets.
   */
  VIEW_MARKETS,

  /**
   * The staff member can create and edit markets.
   */
  CREATE_AND_EDIT_MARKETS,

  /**
   * The staff member can delete markets.
   */
  DELETE_MARKETS,

  /**
   * The staff member can view and create discount codes and automatic discounts, and export discounts to a CSV file.
   */
  MARKETING,

  /**
   * The staff member can view, create, and automate marketing campaigns.
   */
  MARKETING_SECTION,

  /**
   * The staff member can merge customers.
   */
  MERGE_CUSTOMERS,

  /**
   * The staff member can view, create, update, delete, and cancel orders, and
   * receive order notifications. The staff member can still create draft orders
   * without this permission.
   */
  ORDERS,

  /**
   * The staff member can view the Overview and Live view pages, which include
   * sales information, and other shop and sales channels data.
   */
  OVERVIEWS,

  /**
   * The staff member can view, create, update, publish, and delete blog posts and pages.
   */
  PAGES,

  /**
   * The staff member can pay for an order by using a vaulted card.
   */
  PAY_ORDERS_BY_VAULTED_CARD,

  /**
   * The staff member can view the preferences and configuration of a shop.
   */
  PREFERENCES,

  /**
   * The staff member can view, create, import, and update products, collections, and inventory.
   */
  PRODUCTS,

  /**
   * The staff member can view and create all reports, which includes sales information and other shop data.
   */
  REPORTS,

  /**
   * The staff member can request customer private data.
   */
  REQUEST_CUSTOMER_DATA,

  /**
   * The staff member can view, update, and publish themes.
   */
  THEMES,

  /**
   * The staff member can view and create translations.
   */
  TRANSLATIONS
}
