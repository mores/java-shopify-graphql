package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingShopifyFontGroup"));
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> base(
      ) {
     CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<>(this, getRoot());
     getFields().put("base", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> bold(
      ) {
     CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<>(this, getRoot());
     getFields().put("bold", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> loadingStrategy(
      ) {
     CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFontLoadingStrategyProjection<>(this, getRoot());
     getFields().put("loadingStrategy", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<PARENT, ROOT> name(
      ) {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CheckoutAndAccountsConfigurationBrandingShopifyFontGroup {");
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
