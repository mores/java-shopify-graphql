package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationsProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutAndAccountsConfigurationConnection"));
  }

  public CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationEdgeProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CheckoutAndAccountsConfigurationEdgeProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
