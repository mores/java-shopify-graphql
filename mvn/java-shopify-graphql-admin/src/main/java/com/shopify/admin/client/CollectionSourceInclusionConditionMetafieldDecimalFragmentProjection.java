package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldDecimal"));
  }

  public CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldDecimalRelationProjection<CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldDecimalRelationProjection<CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldDecimalRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<PARENT, ROOT> value(
      ) {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldDecimal {");
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
