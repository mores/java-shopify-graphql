package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationOverrideProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationOverrideProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationOverride"));
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT>, ROOT> branding(
      ) {
     CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingProjection<>(this, getRoot());
     getFields().put("branding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
