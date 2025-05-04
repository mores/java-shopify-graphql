package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StandardMetafieldDefinitionTemplateFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetafieldDefinitionTemplate"));
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> ownerTypes(
      ) {
     MetafieldOwnerTypeProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerTypes", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<PARENT, ROOT> visibleToStorefrontApi(
      ) {
    getFields().put("visibleToStorefrontApi", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StandardMetafieldDefinitionTemplate {");
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
