package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryCoordinatesPreferenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryCoordinatesPreferenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryCoordinatesPreference"));
  }

  public CartDeliveryCoordinatesPreferenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CartDeliveryCoordinatesPreferenceProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<CartDeliveryCoordinatesPreferenceProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CartDeliveryCoordinatesPreferenceProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public CartDeliveryCoordinatesPreferenceProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }
}
