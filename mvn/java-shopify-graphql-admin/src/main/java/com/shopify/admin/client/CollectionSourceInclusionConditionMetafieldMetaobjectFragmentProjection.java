package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldMetaobject"));
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectRelationProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldMetaobjectRelationProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldMetaobjectRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public MetaobjectProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     MetaobjectProjection<CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<PARENT, ROOT> id(
      ) {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldMetaobject {");
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
