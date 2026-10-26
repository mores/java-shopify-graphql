package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceExclusionConditionProductVendorFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionConditionProductVendor"));
  }

  public CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductVendorRelationProjection<CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceExclusionConditionProductVendorRelationProjection<CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionConditionProductVendorRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceExclusionConditionProductVendorFragmentProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceExclusionConditionProductVendor {");
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
