package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfiguration"));
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationProjection<PARENT, ROOT>, ROOT> branding(
      ) {
     CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingProjection<>(this, getRoot());
     getFields().put("branding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationProjection<PARENT, ROOT>, ROOT> overrides(
      ) {
     CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationOverrideProjection<>(this, getRoot());
     getFields().put("overrides", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
