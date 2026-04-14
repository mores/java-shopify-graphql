package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomFontGroup"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> base(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomFontProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomFontProjection<>(this, getRoot());
     getFields().put("base", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> bold(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomFontProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomFontProjection<>(this, getRoot());
     getFields().put("bold", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> loadingStrategy(
      ) {
     CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<>(this, getRoot());
     getFields().put("loadingStrategy", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<PARENT, ROOT> name(
      ) {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CheckoutAndAccountsConfigurationBrandingCustomFontGroup {");
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
