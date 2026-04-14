package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutAndAccountsConfiguration"));
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>> branding(
      ) {
    CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationBrandingProjection<>(this, this);    
    getFields().put("branding", projection);
    return projection;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>> overrides(
      ) {
    CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>, CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT>> projection = new CheckoutAndAccountsConfigurationOverrideProjection<>(this, this);    
    getFields().put("overrides", projection);
    return projection;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
