package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionProductStatusFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionProductStatus"));
  }

  public CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductStatusRelationProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionProductStatusRelationProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionProductStatusRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public ProductStatusProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> values(
      ) {
     ProductStatusProjection<CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductStatusProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionProductStatusFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionProductStatus {");
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
