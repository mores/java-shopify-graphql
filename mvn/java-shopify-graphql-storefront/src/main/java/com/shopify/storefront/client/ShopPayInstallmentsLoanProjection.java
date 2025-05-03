package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsLoanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsLoanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsLoan"));
  }

  public ShopPayInstallmentsLoanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
