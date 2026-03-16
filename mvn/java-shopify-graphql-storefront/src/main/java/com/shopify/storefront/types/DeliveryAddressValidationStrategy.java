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
  COUNTRY_CODE_ONLY,

  STRICT
}
