package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceExclusionConditionProductCategoryValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceExclusionConditionProductCategoryValueProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductCategoryValue"));
  }

  public CollectionSourceExclusionConditionProductCategoryValueProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryProjection<CollectionSourceExclusionConditionProductCategoryValueProjection<PARENT, ROOT>, ROOT> category(
      ) {
     TaxonomyCategoryProjection<CollectionSourceExclusionConditionProductCategoryValueProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductCategoryValueProjection<PARENT, ROOT> includeDescendants(
      ) {
    getFields().put("includeDescendants", null);
    return this;
  }
}
