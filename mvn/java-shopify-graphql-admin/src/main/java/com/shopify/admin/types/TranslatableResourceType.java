package com.shopify.admin.types;

/**
 * Specifies the type of resources that are translatable.
 */
public enum TranslatableResourceType {
  /**
   * A blog post. Translatable fields: `title`, `body_html`, `summary_html`, `handle`, `meta_title`, `meta_description`.
   */
  ARTICLE,

  /**
   * An article image. Translatable fields: `alt`.
   */
  ARTICLE_IMAGE,

  /**
   * A blog. Translatable fields: `title`, `handle`, `meta_title`, `meta_description`.
   */
  BLOG,

  /**
   * A product collection. Translatable fields: `title`, `body_html`, `handle`, `meta_title`, `meta_description`.
   */
  COLLECTION,

  /**
   * A collection image. Translatable fields: `alt`.
   */
  COLLECTION_IMAGE,

  /**
   * The delivery method definition. For example, "Standard", or "Expedited". Translatable fields: `name`, `description`.
   */
  DELIVERY_METHOD_DEFINITION,

  /**
   * An email template. Translatable fields: `title`, `body_html`.
   */
  EMAIL_TEMPLATE,

  /**
   * A filter. Translatable fields: `label`.
   */
  FILTER,

  /**
   * A link to direct users. Translatable fields: `title`.
   */
  LINK,

  /**
   * An image. Translatable fields: `alt`.
   */
  MEDIA_IMAGE,

  /**
   * A category of links. Translatable fields: `title`.
   */
  MENU,

  /**
   * A Metafield. Translatable fields: `value`.
   */
  METAFIELD,

  /**
   * A Metaobject. Translatable fields are determined by the Metaobject type.
   */
  METAOBJECT,

  /**
   * An online store theme. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME,

  /**
   * A theme app embed. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_APP_EMBED,

  /**
   * A theme json template. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_JSON_TEMPLATE,

  /**
   * Locale file content of an online store theme. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_LOCALE_CONTENT,

  /**
   * A theme json section group. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_SECTION_GROUP,

  /**
   * A theme setting category. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_SETTINGS_CATEGORY,

  /**
   * Shared static sections of an online store theme. Translatable fields: `dynamic keys based on theme data`.
   */
  ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS,

  /**
   * A packing slip template. Translatable fields: `body`.
   */
  PACKING_SLIP_TEMPLATE,

  /**
   * A page. Translatable fields: `title`, `body_html`, `handle`, `meta_title`, `meta_description`.
   */
  PAGE,

  /**
   * A payment gateway. Translatable fields: `name`, `message`, `before_payment_instructions`.
   */
  PAYMENT_GATEWAY,

  /**
   * An online store product. Translatable fields: `title`, `body_html`, `handle`,
   * `product_type`, `meta_title`, `meta_description`.
   */
  PRODUCT,

  /**
   * An online store custom product property name. For example, "Size", "Color", or "Material".
   *         Translatable fields: `name`.
   */
  PRODUCT_OPTION,

  /**
   * The product option value names. For example, "Red", "Blue", and "Green" for a "Color" option. Translatable fields: `name`.
   */
  PRODUCT_OPTION_VALUE,

  /**
   * A selling plan. Translatable fields:`name`, `option1`, `option2`, `option3`, `description`.
   */
  SELLING_PLAN,

  /**
   * A selling plan group. Translatable fields: `name`, `option1`, `option2`, `option3`.
   */
  SELLING_PLAN_GROUP,

  /**
   * A shop. Translatable fields: `meta_title`, `meta_description`.
   */
  SHOP,

  /**
   * A shop policy. Translatable fields: `body`.
   */
  SHOP_POLICY
}
