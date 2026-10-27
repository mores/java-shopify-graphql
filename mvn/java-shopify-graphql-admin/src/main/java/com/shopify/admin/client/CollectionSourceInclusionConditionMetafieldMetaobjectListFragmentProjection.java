package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionConditionMetafieldMetaobjectList"));
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetafieldDefinitionProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectListRelationProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> relation(
      ) {
     CollectionSourceInclusionConditionMetafieldMetaobjectListRelationProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionConditionMetafieldMetaobjectListRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public MetaobjectProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> values(
      ) {
     MetaobjectProjection<CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<PARENT, ROOT> id(
      ) {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionSourceInclusionConditionMetafieldMetaobjectList {");
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
