package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColors"));
  }

  public CheckoutBrandingColorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorGlobalProjection<CheckoutBrandingColorsProjection<PARENT, ROOT>, ROOT> global(
      ) {
     CheckoutBrandingColorGlobalProjection<CheckoutBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorGlobalProjection<>(this, getRoot());
     getFields().put("global", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemesProjection<CheckoutBrandingColorsProjection<PARENT, ROOT>, ROOT> schemes(
      ) {
     CheckoutBrandingColorSchemesProjection<CheckoutBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemesProjection<>(this, getRoot());
     getFields().put("schemes", projection);
     return projection;
  }
}
