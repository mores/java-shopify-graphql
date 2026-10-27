package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionMetafieldDefinitionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionMetafieldDefinitionInterface"));
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> ownerType(
      ) {
    MetafieldOwnerTypeProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetafieldOwnerTypeProjection<>(this, this);    
    getFields().put("ownerType", projection);
    return projection;
  }

  public MetafieldDefinitionTypeProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> type(
      ) {
    MetafieldDefinitionTypeProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public MetafieldDefinitionValidationProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> validations(
      ) {
    MetafieldDefinitionValidationProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionValidationProjection<>(this, this);    
    getFields().put("validations", projection);
    return projection;
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public CollectionConditionBasicMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> onCollectionConditionBasicMetafieldDefinition(
      ) {
    CollectionConditionBasicMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> fragment = new CollectionConditionBasicMetafieldDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> onCollectionConditionMetaobjectMetafieldDefinition(
      ) {
    CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>, CollectionConditionMetafieldDefinitionsProjectionRoot<PARENT, ROOT>> fragment = new CollectionConditionMetaobjectMetafieldDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
