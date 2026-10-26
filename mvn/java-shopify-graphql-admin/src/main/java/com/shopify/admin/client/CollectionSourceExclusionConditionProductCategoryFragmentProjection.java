package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceExclusionConditionProductCategoryFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductCategory"));
  }

  public CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductCategoryRelationProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceExclusionConditionProductCategoryRelationProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionConditionProductCategoryRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductCategoryValueProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> values(
      ) {
     CollectionSourceExclusionConditionProductCategoryValueProjection<CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionConditionProductCategoryValueProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductCategoryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceExclusionConditionProductCategory {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
