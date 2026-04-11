package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CheckoutAndAccountsConfigurationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CheckoutAndAccountsConfigurationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfiguration"));
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT>, ROOT> branding(
      ) {
     CheckoutAndAccountsConfigurationBrandingProjection<CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingProjection<>(this, getRoot());
     getFields().put("branding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT>, ROOT> overrides(
      ) {
     CheckoutAndAccountsConfigurationOverrideProjection<CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationOverrideProjection<>(this, getRoot());
     getFields().put("overrides", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CheckoutAndAccountsConfiguration {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
