package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceExclusionConditionProductTypeRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceExclusionConditionProductTypeRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductTypeRelation"));
  }

  public CollectionSourceExclusionConditionProductTypeRelationProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
