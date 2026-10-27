package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceExclusionConditionProductTypeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductType"));
  }

  public CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductTypeRelationProjection<CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceExclusionConditionProductTypeRelationProjection<CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionConditionProductTypeRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceExclusionConditionProductTypeFragmentProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceExclusionConditionProductType {");
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
