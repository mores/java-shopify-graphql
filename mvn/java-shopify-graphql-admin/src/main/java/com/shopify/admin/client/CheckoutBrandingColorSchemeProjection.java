package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingColorSchemeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingColorSchemeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingColorScheme"));
  }

  public CheckoutBrandingColorSchemeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> base(
      ) {
     CheckoutBrandingColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("base", projection);
     return projection;
  }

  public CheckoutBrandingControlColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> control(
      ) {
     CheckoutBrandingControlColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingControlColorRolesProjection<>(this, getRoot());
     getFields().put("control", projection);
     return projection;
  }

  public CheckoutBrandingButtonColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> primaryButton(
      ) {
     CheckoutBrandingButtonColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingButtonColorRolesProjection<>(this, getRoot());
     getFields().put("primaryButton", projection);
     return projection;
  }

  public CheckoutBrandingButtonColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> secondaryButton(
      ) {
     CheckoutBrandingButtonColorRolesProjection<CheckoutBrandingColorSchemeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingButtonColorRolesProjection<>(this, getRoot());
     getFields().put("secondaryButton", projection);
     return projection;
  }
}
