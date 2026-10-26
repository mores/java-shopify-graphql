package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldIntFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldInt"));
  }

  public CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldIntRelationProjection<CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldIntRelationProjection<CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldIntRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldIntFragmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldInt {");
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
