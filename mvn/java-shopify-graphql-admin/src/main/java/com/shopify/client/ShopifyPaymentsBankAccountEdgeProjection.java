package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBankAccountEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBankAccountEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBankAccountEdge"));
  }

  public ShopifyPaymentsBankAccountEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<ShopifyPaymentsBankAccountEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ShopifyPaymentsBankAccountProjection<ShopifyPaymentsBankAccountEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
