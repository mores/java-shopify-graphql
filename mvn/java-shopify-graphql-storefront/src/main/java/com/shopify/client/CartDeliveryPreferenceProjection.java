package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryPreferenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryPreferenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryPreference"));
  }

  public CartDeliveryPreferenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryCoordinatesPreferenceProjection<CartDeliveryPreferenceProjection<PARENT, ROOT>, ROOT> coordinates(
      ) {
     CartDeliveryCoordinatesPreferenceProjection<CartDeliveryPreferenceProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryCoordinatesPreferenceProjection<>(this, getRoot());
     getFields().put("coordinates", projection);
     return projection;
  }

  public PreferenceDeliveryMethodTypeProjection<CartDeliveryPreferenceProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     PreferenceDeliveryMethodTypeProjection<CartDeliveryPreferenceProjection<PARENT, ROOT>, ROOT> projection = new PreferenceDeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public CartDeliveryPreferenceProjection<PARENT, ROOT> pickupHandle() {
    getFields().put("pickupHandle", null);
    return this;
  }
}
