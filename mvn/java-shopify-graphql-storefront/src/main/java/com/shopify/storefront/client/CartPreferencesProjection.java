package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartPreferencesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartPreferencesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartPreferences"));
  }

  public CartPreferencesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryPreferenceProjection<CartPreferencesProjection<PARENT, ROOT>, ROOT> delivery(
      ) {
     CartDeliveryPreferenceProjection<CartPreferencesProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryPreferenceProjection<>(this, getRoot());
     getFields().put("delivery", projection);
     return projection;
  }

  public CartPreferencesProjection<PARENT, ROOT> wallet() {
    getFields().put("wallet", null);
    return this;
  }
}
