package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutLineItemParentRelationshipProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutLineItemParentRelationshipProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItemParentRelationship"));
  }

  public AbandonedCheckoutLineItemParentRelationshipProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemParentRelationshipProjection<PARENT, ROOT>, ROOT> _parent(
      ) {
     AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemParentRelationshipProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemProjection<>(this, getRoot());
     getFields().put("parent", projection);
     return projection;
  }
}
