package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingControlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingControl"));
  }

  public CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingLabelPositionProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> labelPosition(
      ) {
     CheckoutAndAccountsConfigurationBrandingLabelPositionProjection<CheckoutAndAccountsConfigurationBrandingControlProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingLabelPositionProjection<>(this, getRoot());
     getFields().put("labelPosition", projection);
     return projection;
  }
}
