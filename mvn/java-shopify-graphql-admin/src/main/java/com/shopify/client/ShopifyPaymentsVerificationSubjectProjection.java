package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsVerificationSubjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsVerificationSubjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsVerificationSubject"));
  }

  public ShopifyPaymentsVerificationSubjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsVerificationSubjectProjection<PARENT, ROOT> familyName() {
    getFields().put("familyName", null);
    return this;
  }

  public ShopifyPaymentsVerificationSubjectProjection<PARENT, ROOT> givenName() {
    getFields().put("givenName", null);
    return this;
  }
}
