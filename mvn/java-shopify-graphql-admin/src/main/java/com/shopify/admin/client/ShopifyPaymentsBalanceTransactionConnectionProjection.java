package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBalanceTransactionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransactionConnection"));
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionEdgeProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopifyPaymentsBalanceTransactionEdgeProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopifyPaymentsBalanceTransactionProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ShopifyPaymentsBalanceTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
