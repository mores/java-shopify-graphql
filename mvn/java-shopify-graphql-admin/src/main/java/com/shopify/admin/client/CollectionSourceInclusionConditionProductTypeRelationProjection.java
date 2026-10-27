package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceInclusionConditionProductTypeRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceInclusionConditionProductTypeRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductTypeRelation"));
  }

  public CollectionSourceInclusionConditionProductTypeRelationProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
