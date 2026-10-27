package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionProductCategoryFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductCategory"));
  }

  public CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductCategoryRelationProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionProductCategoryRelationProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionProductCategoryRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductCategoryValueProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> values(
      ) {
     CollectionSourceInclusionConditionProductCategoryValueProjection<CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionProductCategoryValueProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductCategoryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionProductCategory {");
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
