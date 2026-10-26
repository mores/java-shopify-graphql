package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldStringListFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldStringList"));
  }

  public CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldStringListRelationProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldStringListRelationProjection<CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldStringListRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT> id(
      ) {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<PARENT, ROOT> values(
      ) {
    getFields().put("values", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldStringList {");
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
