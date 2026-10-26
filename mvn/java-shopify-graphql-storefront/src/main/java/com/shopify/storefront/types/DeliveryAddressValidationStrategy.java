package com.shopify.storefront.types;

/**
 * Controls how delivery addresses are validated during cart operations. The
 * default validation checks only the country code, while strict validation
 * verifies all address fields against Shopify's checkout rules and rejects invalid addresses.
 *
 * Used by [`DeliveryAddressInput`](https://shopify.dev/docs/api/storefront/current/input-objects/DeliveryAddressInput) when setting buyer identity preferences, and by [`CartSelectableAddressInput`](https://shopify.dev/docs/api/storefront/current/input-objects/CartSelectableAddressInput) and [`CartSelectableAddressUpdateInput`](https://shopify.dev/docs/api/storefront/current/input-objects/CartSelectableAddressUpdateInput)
 * when managing cart delivery addresses.
 */
public enum DeliveryAddressValidationStrategy {
  /**
   * Only the country code is validated.
   */
  COUNTRY_CODE_ONLY,

  /**
   * Strict validation is performed, i.e. all fields in the address are validated
   * according to Shopify's checkout rules. If the address fails validation, the cart will not be updated.
   * Doesn't apply to addresses copied with `copyFromCustomerAddressId`, which are copied as-is.
   * Validation can be requested on later delivery address updates and always occurs in checkout.
   */
  STRICT
}
