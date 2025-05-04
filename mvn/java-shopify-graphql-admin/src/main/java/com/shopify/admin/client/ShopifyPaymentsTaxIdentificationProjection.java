package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsTaxIdentificationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsTaxIdentificationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsTaxIdentification"));
  }

  public ShopifyPaymentsTaxIdentificationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsTaxIdentificationTypeProjection<ShopifyPaymentsTaxIdentificationProjection<PARENT, ROOT>, ROOT> taxIdentificationType(
      ) {
     ShopifyPaymentsTaxIdentificationTypeProjection<ShopifyPaymentsTaxIdentificationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTaxIdentificationTypeProjection<>(this, getRoot());
     getFields().put("taxIdentificationType", projection);
     return projection;
  }

  public ShopifyPaymentsTaxIdentificationProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
