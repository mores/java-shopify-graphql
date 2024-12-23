package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountPageProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountPageProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccountPage"));
  }

  public CustomerAccountPageProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountPageProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CustomerAccountPageProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CustomerAccountPageProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerAccountPageProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<CustomerAccountPageProjectionRoot<PARENT, ROOT>, CustomerAccountPageProjectionRoot<PARENT, ROOT>> onCustomerAccountAppExtensionPage(
      ) {
    CustomerAccountAppExtensionPageFragmentProjection<CustomerAccountPageProjectionRoot<PARENT, ROOT>, CustomerAccountPageProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountAppExtensionPageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountNativePageFragmentProjection<CustomerAccountPageProjectionRoot<PARENT, ROOT>, CustomerAccountPageProjectionRoot<PARENT, ROOT>> onCustomerAccountNativePage(
      ) {
    CustomerAccountNativePageFragmentProjection<CustomerAccountPageProjectionRoot<PARENT, ROOT>, CustomerAccountPageProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountNativePageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
