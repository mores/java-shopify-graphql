package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionMetafieldDefinitionInterfaceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionMetafieldDefinitionInterface"));
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public CollectionConditionBasicMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> onCollectionConditionBasicMetafieldDefinition(
      ) {
    CollectionConditionBasicMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionConditionBasicMetafieldDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> onCollectionConditionMetaobjectMetafieldDefinition(
      ) {
    CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionInterfaceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
