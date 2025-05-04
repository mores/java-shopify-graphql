package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMain"));
  }

  public CheckoutBrandingMainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> backgroundImage(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("backgroundImage", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingContainerDividerProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutBrandingContainerDividerProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }

  public CheckoutBrandingMainSectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> section(
      ) {
     CheckoutBrandingMainSectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingMainSectionProjection<>(this, getRoot());
     getFields().put("section", projection);
     return projection;
  }
}
