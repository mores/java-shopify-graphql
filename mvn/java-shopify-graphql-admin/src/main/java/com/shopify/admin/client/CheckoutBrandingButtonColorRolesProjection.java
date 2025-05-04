package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingButtonColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingButtonColorRolesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingButtonColorRoles"));
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingColorRolesProjection<CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT>, ROOT> hover(
      ) {
     CheckoutBrandingColorRolesProjection<CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("hover", projection);
     return projection;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> accent() {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> background() {
    getFields().put("background", null);
    return this;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> border() {
    getFields().put("border", null);
    return this;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> decorative() {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutBrandingButtonColorRolesProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }
}
