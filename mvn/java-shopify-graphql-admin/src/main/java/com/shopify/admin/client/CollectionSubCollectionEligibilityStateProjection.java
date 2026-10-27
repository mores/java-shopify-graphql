package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSubCollectionEligibilityStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSubCollectionEligibilityStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSubCollectionEligibilityState"));
  }

  public CollectionSubCollectionEligibilityStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubCollectionIneligibleReasonProjection<CollectionSubCollectionEligibilityStateProjection<PARENT, ROOT>, ROOT> ineligibleReason(
      ) {
     SubCollectionIneligibleReasonProjection<CollectionSubCollectionEligibilityStateProjection<PARENT, ROOT>, ROOT> projection = new SubCollectionIneligibleReasonProjection<>(this, getRoot());
     getFields().put("ineligibleReason", projection);
     return projection;
  }

  public CollectionSubCollectionEligibilityStateProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }
}
