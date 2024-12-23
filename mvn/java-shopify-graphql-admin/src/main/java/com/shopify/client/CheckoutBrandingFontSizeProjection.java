package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFontSizeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFontSizeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFontSize"));
  }

  public CheckoutBrandingFontSizeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingFontSizeProjection<PARENT, ROOT> base() {
    getFields().put("base", null);
    return this;
  }

  public CheckoutBrandingFontSizeProjection<PARENT, ROOT> ratio() {
    getFields().put("ratio", null);
    return this;
  }
}
