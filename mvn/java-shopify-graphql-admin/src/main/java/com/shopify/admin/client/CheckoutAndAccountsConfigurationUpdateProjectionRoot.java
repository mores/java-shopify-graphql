package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutAndAccountsConfigurationUpdatePayload"));
  }

  public CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>> configuration(
      ) {
    CheckoutAndAccountsConfigurationProjection<CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationProjection<>(this, this);    
    getFields().put("configuration", projection);
    return projection;
  }

  public CheckoutAndAccountsConfigurationUserErrorProjection<CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CheckoutAndAccountsConfigurationUserErrorProjection<CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationUpdateProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
