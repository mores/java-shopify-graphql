package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorSchemeSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorSchemeSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColorSchemeSelection"));
  }

  public CheckoutBrandingColorSchemeSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
