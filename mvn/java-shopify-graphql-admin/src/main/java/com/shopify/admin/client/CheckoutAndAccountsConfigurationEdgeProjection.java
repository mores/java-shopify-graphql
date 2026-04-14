package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationEdge"));
  }

  public CheckoutAndAccountsConfigurationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationEdgeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
