package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityExtensionAppErrorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityExtensionAppErrorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityExtensionAppErrors"));
  }

  public MarketingActivityExtensionAppErrorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityExtensionAppErrorCodeProjection<MarketingActivityExtensionAppErrorsProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MarketingActivityExtensionAppErrorCodeProjection<MarketingActivityExtensionAppErrorsProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityExtensionAppErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UserErrorProjection<MarketingActivityExtensionAppErrorsProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     UserErrorProjection<MarketingActivityExtensionAppErrorsProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }
}
