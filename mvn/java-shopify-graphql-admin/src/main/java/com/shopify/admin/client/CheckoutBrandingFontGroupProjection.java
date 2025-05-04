package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFontGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFontGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFontGroup"));
  }

  public CheckoutBrandingFontGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingFontProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> base(
      ) {
     CheckoutBrandingFontProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontProjection<>(this, getRoot());
     getFields().put("base", projection);
     return projection;
  }

  public CheckoutBrandingFontProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> bold(
      ) {
     CheckoutBrandingFontProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontProjection<>(this, getRoot());
     getFields().put("bold", projection);
     return projection;
  }

  public CheckoutBrandingFontLoadingStrategyProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> loadingStrategy(
      ) {
     CheckoutBrandingFontLoadingStrategyProjection<CheckoutBrandingFontGroupProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontLoadingStrategyProjection<>(this, getRoot());
     getFields().put("loadingStrategy", projection);
     return projection;
  }

  public CheckoutBrandingFontGroupProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
