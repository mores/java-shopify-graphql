package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationConnection"));
  }

  public CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationEdgeProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CheckoutAndAccountsConfigurationEdgeProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CheckoutAndAccountsConfigurationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
