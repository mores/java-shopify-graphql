package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSubCollectionEligibilityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSubCollectionEligibilityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSubCollectionEligibility"));
  }

  public CollectionSubCollectionEligibilityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSubCollectionEligibilityStateProjection<CollectionSubCollectionEligibilityProjection<PARENT, ROOT>, ROOT> exclusion(
      ) {
     CollectionSubCollectionEligibilityStateProjection<CollectionSubCollectionEligibilityProjection<PARENT, ROOT>, ROOT> projection = new CollectionSubCollectionEligibilityStateProjection<>(this, getRoot());
     getFields().put("exclusion", projection);
     return projection;
  }

  public CollectionSubCollectionEligibilityStateProjection<CollectionSubCollectionEligibilityProjection<PARENT, ROOT>, ROOT> inclusion(
      ) {
     CollectionSubCollectionEligibilityStateProjection<CollectionSubCollectionEligibilityProjection<PARENT, ROOT>, ROOT> projection = new CollectionSubCollectionEligibilityStateProjection<>(this, getRoot());
     getFields().put("inclusion", projection);
     return projection;
  }
}
