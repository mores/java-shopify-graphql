package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorSchemesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorSchemesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColorSchemes"));
  }

  public CheckoutBrandingColorSchemesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> scheme1(
      ) {
     CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeProjection<>(this, getRoot());
     getFields().put("scheme1", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> scheme2(
      ) {
     CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeProjection<>(this, getRoot());
     getFields().put("scheme2", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> scheme3(
      ) {
     CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeProjection<>(this, getRoot());
     getFields().put("scheme3", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> scheme4(
      ) {
     CheckoutBrandingColorSchemeProjection<CheckoutBrandingColorSchemesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeProjection<>(this, getRoot());
     getFields().put("scheme4", projection);
     return projection;
  }
}
