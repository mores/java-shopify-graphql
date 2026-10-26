package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldStringFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldString"));
  }

  public CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldStringRelationProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldStringRelationProjection<CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldStringRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldStringFragmentProjection<PARENT, ROOT> values(
      ) {
    getFields().put("values", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldString {");
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
