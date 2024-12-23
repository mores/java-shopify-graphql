package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountsV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountsV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountsV2"));
  }

  public CustomerAccountsV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountsVersionProjection<CustomerAccountsV2Projection<PARENT, ROOT>, ROOT> customerAccountsVersion(
      ) {
     CustomerAccountsVersionProjection<CustomerAccountsV2Projection<PARENT, ROOT>, ROOT> projection = new CustomerAccountsVersionProjection<>(this, getRoot());
     getFields().put("customerAccountsVersion", projection);
     return projection;
  }

  public CustomerAccountsV2Projection<PARENT, ROOT> loginLinksVisibleOnStorefrontAndCheckout() {
    getFields().put("loginLinksVisibleOnStorefrontAndCheckout", null);
    return this;
  }

  public CustomerAccountsV2Projection<PARENT, ROOT> loginRequiredAtCheckout() {
    getFields().put("loginRequiredAtCheckout", null);
    return this;
  }

  public CustomerAccountsV2Projection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
