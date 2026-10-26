package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceInclusionConditionProductCategoryRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceInclusionConditionProductCategoryRelationProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductCategoryRelation"));
  }

  public CollectionSourceInclusionConditionProductCategoryRelationProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
