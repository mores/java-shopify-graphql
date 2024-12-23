package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailAddressOpenTrackingLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailAddressOpenTrackingLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEmailAddressOpenTrackingLevel"));
  }

  public CustomerEmailAddressOpenTrackingLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
