package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingControlColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingControlColorRolesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingControlColorRoles"));
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<CheckoutBrandingControlColorRolesProjection<PARENT, ROOT>, ROOT> selected(
      ) {
     CheckoutBrandingColorRolesProjection<CheckoutBrandingControlColorRolesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("selected", projection);
     return projection;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> accent() {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> background() {
    getFields().put("background", null);
    return this;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> border() {
    getFields().put("border", null);
    return this;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> decorative() {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutBrandingControlColorRolesProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }
}
