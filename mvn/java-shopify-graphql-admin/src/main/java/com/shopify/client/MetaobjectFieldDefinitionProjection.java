package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectFieldDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectFieldDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectFieldDefinition"));
  }

  public MetaobjectFieldDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionTypeProjection<MetaobjectFieldDefinitionProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<MetaobjectFieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<MetaobjectFieldDefinitionProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<MetaobjectFieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public MetaobjectFieldDefinitionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetaobjectFieldDefinitionProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetaobjectFieldDefinitionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetaobjectFieldDefinitionProjection<PARENT, ROOT> required() {
    getFields().put("required", null);
    return this;
  }
}
