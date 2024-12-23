package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTextFieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTextFieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTextField"));
  }

  public CheckoutBrandingTextFieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBorderProjection<CheckoutBrandingTextFieldProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingBorderProjection<CheckoutBrandingTextFieldProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingTypographyStyleProjection<CheckoutBrandingTextFieldProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyStyleProjection<CheckoutBrandingTextFieldProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
