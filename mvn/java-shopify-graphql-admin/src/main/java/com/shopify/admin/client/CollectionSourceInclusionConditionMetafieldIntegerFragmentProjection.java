package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldInteger"));
  }

  public CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldIntegerRelationProjection<CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldIntegerRelationProjection<CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldIntegerRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<PARENT, ROOT> value(
      ) {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldInteger {");
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
