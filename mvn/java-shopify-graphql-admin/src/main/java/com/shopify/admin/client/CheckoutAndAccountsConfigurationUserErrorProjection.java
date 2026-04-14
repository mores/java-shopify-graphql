package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationUserError"));
  }

  public CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationUserErrorCodeProjection<CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CheckoutAndAccountsConfigurationUserErrorCodeProjection<CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationUserErrorProjection<PARENT, ROOT> reason() {
    getFields().put("reason", null);
    return this;
  }
}
