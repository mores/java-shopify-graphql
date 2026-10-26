package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MarketUserError`.
 */
public enum MarketUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The market wasn't found.
   */
  MARKET_NOT_FOUND,

  /**
   * The market region wasn't found.
   */
  REGION_NOT_FOUND,

  /**
   * The province doesn't exist.
   */
  PROVINCE_DOES_NOT_EXIST,

  /**
   * The subdivision doesn't exist.
   */
  SUBDIVISION_DOES_NOT_EXIST,

  /**
   * The market web presence wasn't found.
   */
  WEB_PRESENCE_NOT_FOUND,

  /**
   * Can't add regions to the primary market.
   */
  CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET,

  /**
   * Can't delete the only region in a market.
   */
  CANNOT_DELETE_ONLY_REGION,

  /**
   * Exactly one input option is required.
   */
  REQUIRES_EXACTLY_ONE_OPTION,

  /**
   * Can't delete the primary market.
   */
  CANNOT_DELETE_PRIMARY_MARKET,

  /**
   * Can't delete the last subdivision-driven market.
   */
  CANNOT_DELETE_SUBDIVISION_MARKET,

  /**
   * Exceeds max multi-context markets.
   */
  EXCEEDS_MAX_MULTI_CONTEXT_MARKETS,

  /**
   * Domain was not found.
   */
  DOMAIN_NOT_FOUND,

  /**
   * The subfolder suffix must contain only letters.
   */
  SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS,

  /**
   * The subfolder suffix must be at least 2 letters.
   */
  SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS,

  /**
   * The subfolder suffix is invalid, please provide a different value.
   */
  SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE,

  /**
   * No languages selected.
   */
  NO_LANGUAGES,

  /**
   * Can't enable or disable local currencies on a single country market.
   */
  NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET,

  /**
   * Rounding is not supported if unified markets are not enabled.
   */
  NO_ROUNDING_ON_LEGACY_MARKET,

  /**
   * Duplicates found in languages.
   */
  DUPLICATE_LANGUAGES,

  /**
   * Duplicate region market.
   */
  DUPLICATE_REGION_MARKET,

  /**
   * Duplicate unique market.
   */
  DUPLICATE_UNIQUE_MARKET,

  /**
   * Cannot add region-specific language.
   */
  REGION_SPECIFIC_LANGUAGE,

  /**
   * Can't pass both `subfolderSuffix` and `domainId`.
   */
  CANNOT_HAVE_SUBFOLDER_AND_DOMAIN,

  /**
   * Can't add the web presence to the primary market.
   */
  CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET,

  /**
   * Can't add another web presence to the market.
   */
  MARKET_REACHED_WEB_PRESENCE_LIMIT,

  /**
   * Market and condition types are not compatible with each other.
   */
  MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * The country code is missing.
   */
  MISSING_COUNTRY_CODE,

  /**
   * The province code is missing.
   */
  MISSING_PROVINCE_CODE,

  /**
   * The subdivision code is missing.
   */
  MISSING_SUBDIVISION_CODE,

  /**
   * Can't have multiple subfolder web presences per market.
   */
  CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET,

  /**
   * Can't have both subfolder and domain web presences.
   */
  CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES,

  /**
   * One of `subfolderSuffix` or `domainId` is required.
   */
  REQUIRES_DOMAIN_OR_SUBFOLDER,

  /**
   * The primary market must use the primary domain.
   */
  PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN,

  /**
   * Can't delete the primary market's web presence.
   */
  CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE,

  /**
   * Can't have more than 50 markets.
   */
  SHOP_REACHED_MARKETS_LIMIT,

  /**
   * Can't disable the primary market.
   */
  CANNOT_DISABLE_PRIMARY_MARKET,

  /**
   * The language isn't published to the store.
   */
  UNPUBLISHED_LANGUAGE,

  /**
   * The language isn't enabled on the store.
   */
  DISABLED_LANGUAGE,

  /**
   * Can't set default locale to null.
   */
  CANNOT_SET_DEFAULT_LOCALE_TO_NULL,

  /**
   * Can't add unsupported country or region.
   */
  UNSUPPORTED_COUNTRY_REGION,

  /**
   * Can't add customer account domain to a market.
   */
  CANNOT_ADD_CUSTOMER_DOMAIN,

  /**
   * Market managers and condition types are not compatible with each other.
   */
  MARKET_MANAGER_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * An error occurred. See the message for details.
   */
  GENERIC_ERROR,

  /**
   * Another modification to this market is in progress.
   */
  MARKET_UPDATE_CONCURRENT_MODIFICATION,

  /**
   * Invalid combination of status and enabled.
   */
  INVALID_STATUS_AND_ENABLED_COMBINATION,

  /**
   * The province format is invalid.
   */
  INVALID_PROVINCE_FORMAT,

  /**
   * The subdivision format is invalid.
   */
  INVALID_SUBDIVISION_FORMAT,

  /**
   * One or more condition IDs were not found.
   */
  CONDITIONS_NOT_FOUND,

  /**
   * Specified conditions cannot be empty.
   */
  SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY,

  /**
   * One or more customizations were not found.
   */
  CUSTOMIZATIONS_NOT_FOUND,

  /**
   * One or more discounts do not have market eligibility.
   */
  DISCOUNT_NOT_MARKET_CONTEXTUAL,

  /**
   * One or more discounts exceed the maximum number of markets allowed.
   */
  DISCOUNT_EXCEEDS_MARKET_LIMIT,

  /**
   * The shop does not have discounts enabled for B2B markets.
   */
  DISCOUNT_NOT_COMPATIBLE_WITH_B2B_MARKET,

  /**
   * Matching ALL or NONE isn't supported for this driver type.
   */
  WILDCARD_NOT_SUPPORTED,

  /**
   * With an ID list in input, SPECIFIED is not needed.
   */
  SPECIFIED_NOT_VALID_FOR_INPUT,

  /**
   * Web presences and condition types are not compatible with each other.
   */
  WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * Catalogs and condition types are not compatible with each other.
   */
  CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * A market can only have market catalogs.
   */
  CATALOG_TYPE_NOT_SUPPORTED,

  /**
   * Inclusive pricing cannot be added to a market with the specified condition types.
   */
  INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * The specified conditions are not compatible with each other.
   */
  INCOMPATIBLE_CONDITIONS,

  /**
   * Shipping and condition types are not compatible with each other.
   */
  SHIPPING_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * The currency settings of the given market cannot be changed because the market manager has exclusive control of pricing.
   */
  MANAGED_MARKET,

  /**
   * The shop's payment gateway does not support enabling more than one currency.
   */
  MULTIPLE_CURRENCIES_NOT_SUPPORTED,

  /**
   * The specified currency is not supported.
   */
  UNSUPPORTED_CURRENCY,

  /**
   * Local currencies must be enabled when adaptive pricing is active.
   */
  ADAPTIVE_PRICING_REQUIRES_LOCAL_CURRENCIES,

  /**
   * The shop must have a web presence that uses the primary domain.
   */
  SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE,

  /**
   * Can’t delete, disable, or change the type of the last region market.
   */
  MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET,

  /**
   * The user doesn't have permission access to create or edit markets.
   */
  USER_LACKS_PERMISSION,

  /**
   * Contains regions that cannot be managed.
   */
  CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED,

  /**
   * Unified markets are not enabled.
   */
  UNIFIED_MARKETS_NOT_ENABLED,

  /**
   * Can't add web presence to the another market.
   */
  WEB_PRESENCE_REACHED_MARKETS_LIMIT,

  /**
   * A web presence cannot be added to a market with type retail location.
   */
  WEB_PRESENCE_RETAIL_LOCATION,

  /**
   * Catalog condition types must be the same for all conditions on a catalog.
   */
  CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME,

  /**
   * A direct connection catalog can't be attached to a market.
   */
  MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG,

  /**
   * Your shop is not entitled to activate markets of this type.
   */
  NOT_ENTITLED_TO_ACTIVATE_MARKET,

  /**
   * B2B markets must be merchant managed.
   */
  B2B_MARKET_MUST_BE_MERCHANT_MANAGED,

  /**
   * POS location markets must be merchant managed.
   */
  POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED,

  /**
   * Catalogs created by Managed Markets cannot be added to a market.
   */
  MANAGED_MARKETS_CATALOG_NOT_ALLOWED,

  /**
   * Resources created by Managed Markets cannot be added to a market.
   */
  MANAGED_MARKETS_RESOURCE_NOT_ALLOWED,

  /**
   * Retail location currency must be local.
   */
  RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL,

  /**
   * A Managed Market must use currencies that correspond to all of its countries.
   */
  MANAGED_MARKET_CURRENCY_MUST_MATCH_COUNTRY,

  /**
   * Catalogs with volume pricing or quantity rules are not supported for the specified condition types.
   */
  CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED,

  /**
   * All retail locations in a market must be in the same country.
   */
  MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED,

  /**
   * All regions in a market that includes a subdivision must be in the same country.
   */
  MIXED_COUNTRY_SUBDIVISIONS_NOT_ALLOWED,

  /**
   * A market that includes a subdivision requires another market that includes the
   * whole country. If the subdivision market is active, the country market must
   * also be active.
   */
  SUBDIVISION_MARKET_REQUIRES_COUNTRY_COVERAGE,

  /**
   * Location match all is only valid with one non-match all region.
   */
  LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION,

  /**
   * A location's country does not match the region's country.
   */
  LOCATION_REGION_COUNTRY_MISMATCH,

  /**
   * Managing this catalog is not supported by your plan.
   */
  UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS,

  /**
   * Can't activate this market because the B2B catalog limit has been reached.
   */
  CANNOT_ACTIVATE_MARKET_B2B_CATALOG_LIMIT_REACHED,

  /**
   * The maximum number of active B2B catalogs allowed by your plan has been reached.
   */
  B2B_CATALOG_LIMIT_REACHED,

  /**
   * Channel ids are invalid.
   */
  INVALID_CHANNEL_IDS,

  /**
   * A country condition and a subdivision condition belonging to the same country cannot be added to the same market.
   */
  INVALID_COUNTRY_AND_SUBDIVISION_CONDITIONS,

  /**
   * The selected subdivision does not belong to the selected country.
   */
  SUBDIVISION_MUST_BELONG_TO_COUNTRY,

  /**
   * Can't add all subdivisions for a country to a market.
   */
  CANNOT_ADD_ALL_SUBDIVISIONS_FOR_A_COUNTRY_TO_A_MARKET,

  /**
   * Can't add selected responders to a province driven market.
   */
  INVALID_RESPONDER_FOR_PROVINCE_DRIVEN_MARKET,

  /**
   * Can't add selected customizations to a market with a subdivision condition.
   */
  INVALID_CUSTOMIZATION_FOR_SUBDIVISION_CONDITION,

  /**
   * The selected customization can't be applied to this configuration.
   */
  INCOMPATIBLE_CONFIGURATION,

  /**
   * A channel market must have a single channel driver.
   */
  CHANNEL_MARKET_MUST_HAVE_SINGLE_CHANNEL_DRIVER,

  /**
   * The selected channel is not valid for a channel market.
   */
  CHANNEL_NOT_VALID_FOR_CHANNEL_MARKET,

  /**
   * A channel driver must have a channel specification.
   */
  CHANNEL_DRIVER_MUST_HAVE_CHANNEL_SPECIFICATION,

  /**
   * The selected region is not supported for the selected channel.
   */
  REGION_NOT_SUPPORTED_FOR_CHANNEL,

  /**
   * Adaptive pricing can only be enabled for Markets with Managed Markets enabled.
   */
  ADAPTIVE_PRICING_REQUIRES_MANAGED_MARKETS,

  /**
   * The given priceInclusions setup is not compatible with adaptive pricing.
   */
  ADAPTIVE_PRICING_REQUIRED_SETUP_ERROR,

  /**
   * Global-e pricing configurations can only be edited by Global-e.
   */
  GLOBAL_E_PRICING_STRATEGY_NOT_PERMITTED
}
