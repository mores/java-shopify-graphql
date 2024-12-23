package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingHeaderCartLinkProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingHeaderCartLinkProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingHeaderCartLink"));
  }

  public CheckoutBrandingHeaderCartLinkProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCartLinkContentTypeProjection<CheckoutBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> contentType(
      ) {
     CheckoutBrandingCartLinkContentTypeProjection<CheckoutBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCartLinkContentTypeProjection<>(this, getRoot());
     getFields().put("contentType", projection);
     return projection;
  }

  public ImageProjection<CheckoutBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CheckoutBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }
}
