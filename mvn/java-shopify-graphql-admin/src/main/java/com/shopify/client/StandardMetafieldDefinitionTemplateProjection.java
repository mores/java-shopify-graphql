package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionTemplateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionTemplateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetafieldDefinitionTemplate"));
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> ownerTypes(
      ) {
     MetafieldOwnerTypeProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerTypes", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<PARENT, ROOT> visibleToStorefrontApi() {
    getFields().put("visibleToStorefrontApi", null);
    return this;
  }
}
