package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetaobjectDefinitionFieldTemplateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetaobjectDefinitionFieldTemplateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetaobjectDefinitionFieldTemplate"));
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionTypeProjection<StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> required() {
    getFields().put("required", null);
    return this;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<PARENT, ROOT> visibleToStorefrontApi(
      ) {
    getFields().put("visibleToStorefrontApi", null);
    return this;
  }
}
