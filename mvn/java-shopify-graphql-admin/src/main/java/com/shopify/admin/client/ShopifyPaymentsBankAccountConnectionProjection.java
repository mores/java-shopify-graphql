package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBankAccountConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBankAccountConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBankAccountConnection"));
  }

  public ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBankAccountEdgeProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopifyPaymentsBankAccountEdgeProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopifyPaymentsBankAccountProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ShopifyPaymentsBankAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
