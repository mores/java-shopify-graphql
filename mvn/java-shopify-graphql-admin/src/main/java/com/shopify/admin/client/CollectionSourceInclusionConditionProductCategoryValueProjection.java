package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceInclusionConditionProductCategoryValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceInclusionConditionProductCategoryValueProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductCategoryValue"));
  }

  public CollectionSourceInclusionConditionProductCategoryValueProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryProjection<CollectionSourceInclusionConditionProductCategoryValueProjection<PARENT, ROOT>, ROOT> category(
      ) {
     TaxonomyCategoryProjection<CollectionSourceInclusionConditionProductCategoryValueProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductCategoryValueProjection<PARENT, ROOT> includeDescendants(
      ) {
    getFields().put("includeDescendants", null);
    return this;
  }
}
