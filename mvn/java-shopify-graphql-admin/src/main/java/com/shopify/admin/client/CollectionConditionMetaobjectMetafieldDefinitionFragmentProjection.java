package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionMetaobjectMetafieldDefinition"));
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> metaobjectDefinition(
      ) {
     MetaobjectDefinitionProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinition", projection);
     return projection;
  }

  public MetafieldOwnerTypeProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> description(
      ) {
    getFields().put("description", null);
    return this;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<PARENT, ROOT> namespace(
      ) {
    getFields().put("namespace", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionConditionMetaobjectMetafieldDefinition {");
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
