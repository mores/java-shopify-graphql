package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountPageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountPageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountPage"));
  }

  public CustomerAccountPageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountPageProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CustomerAccountPageProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CustomerAccountPageProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerAccountPageProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<CustomerAccountPageProjection<PARENT, ROOT>, ROOT> onCustomerAccountAppExtensionPage(
      ) {
    CustomerAccountAppExtensionPageFragmentProjection<CustomerAccountPageProjection<PARENT, ROOT>, ROOT> fragment = new CustomerAccountAppExtensionPageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountNativePageFragmentProjection<CustomerAccountPageProjection<PARENT, ROOT>, ROOT> onCustomerAccountNativePage(
      ) {
    CustomerAccountNativePageFragmentProjection<CustomerAccountPageProjection<PARENT, ROOT>, ROOT> fragment = new CustomerAccountNativePageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
