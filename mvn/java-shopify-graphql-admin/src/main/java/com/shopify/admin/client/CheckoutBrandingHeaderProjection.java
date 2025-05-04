package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingHeaderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingHeaderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingHeader"));
  }

  public CheckoutBrandingHeaderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingHeaderAlignmentProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutBrandingHeaderAlignmentProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeaderAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> banner(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("banner", projection);
     return projection;
  }

  public CheckoutBrandingHeaderCartLinkProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> cartLink(
      ) {
     CheckoutBrandingHeaderCartLinkProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeaderCartLinkProjection<>(this, getRoot());
     getFields().put("cartLink", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingLogoProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> logo(
      ) {
     CheckoutBrandingLogoProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingLogoProjection<>(this, getRoot());
     getFields().put("logo", projection);
     return projection;
  }

  public CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutBrandingHeaderPositionProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> position(
      ) {
     CheckoutBrandingHeaderPositionProjection<CheckoutBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeaderPositionProjection<>(this, getRoot());
     getFields().put("position", projection);
     return projection;
  }

  public CheckoutBrandingHeaderProjection<PARENT, ROOT> divided() {
    getFields().put("divided", null);
    return this;
  }
}
