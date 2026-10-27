package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceInclusionConditionProductTagRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceInclusionConditionProductTagRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductTagRelation"));
  }

  public CollectionSourceInclusionConditionProductTagRelationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
