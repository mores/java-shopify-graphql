package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceExclusionConditionProductTagRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceExclusionConditionProductTagRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductTagRelation"));
  }

  public CollectionSourceExclusionConditionProductTagRelationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
