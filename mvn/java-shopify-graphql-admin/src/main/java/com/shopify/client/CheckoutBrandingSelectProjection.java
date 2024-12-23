package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingSelectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingSelectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingSelect"));
  }

  public CheckoutBrandingSelectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBorderProjection<CheckoutBrandingSelectProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingBorderProjection<CheckoutBrandingSelectProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingTypographyStyleProjection<CheckoutBrandingSelectProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyStyleProjection<CheckoutBrandingSelectProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
