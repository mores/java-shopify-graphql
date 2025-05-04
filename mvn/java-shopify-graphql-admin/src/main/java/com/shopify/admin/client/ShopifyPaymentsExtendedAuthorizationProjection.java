package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsExtendedAuthorizationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsExtendedAuthorizationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsExtendedAuthorization"));
  }

  public ShopifyPaymentsExtendedAuthorizationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsExtendedAuthorizationProjection<PARENT, ROOT> extendedAuthorizationExpiresAt(
      ) {
    getFields().put("extendedAuthorizationExpiresAt", null);
    return this;
  }

  public ShopifyPaymentsExtendedAuthorizationProjection<PARENT, ROOT> standardAuthorizationExpiresAt(
      ) {
    getFields().put("standardAuthorizationExpiresAt", null);
    return this;
  }
}
