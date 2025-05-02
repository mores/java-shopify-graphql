package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartBuyerIdentityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartBuyerIdentityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartBuyerIdentity"));
  }

  public CartBuyerIdentityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CustomerProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public DeliveryAddressProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> deliveryAddressPreferences(
      ) {
     DeliveryAddressProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> projection = new DeliveryAddressProjection<>(this, getRoot());
     getFields().put("deliveryAddressPreferences", projection);
     return projection;
  }

  public CartPreferencesProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> preferences() {
     CartPreferencesProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> projection = new CartPreferencesProjection<>(this, getRoot());
     getFields().put("preferences", projection);
     return projection;
  }

  public PurchasingCompanyProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> purchasingCompany(
      ) {
     PurchasingCompanyProjection<CartBuyerIdentityProjection<PARENT, ROOT>, ROOT> projection = new PurchasingCompanyProjection<>(this, getRoot());
     getFields().put("purchasingCompany", projection);
     return projection;
  }

  public CartBuyerIdentityProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CartBuyerIdentityProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
