package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBalanceTransactionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBalanceTransactionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransactionEdge"));
  }

  public ShopifyPaymentsBalanceTransactionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<ShopifyPaymentsBalanceTransactionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ShopifyPaymentsBalanceTransactionProjection<ShopifyPaymentsBalanceTransactionEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
