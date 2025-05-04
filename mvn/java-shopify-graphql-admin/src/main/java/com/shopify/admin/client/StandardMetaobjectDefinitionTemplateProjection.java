package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetaobjectDefinitionTemplateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetaobjectDefinitionTemplateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetaobjectDefinitionTemplate"));
  }

  public StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StandardMetaobjectCapabilityTemplateProjection<StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT>, ROOT> enabledCapabilities(
      ) {
     StandardMetaobjectCapabilityTemplateProjection<StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT>, ROOT> projection = new StandardMetaobjectCapabilityTemplateProjection<>(this, getRoot());
     getFields().put("enabledCapabilities", projection);
     return projection;
  }

  public StandardMetaobjectDefinitionFieldTemplateProjection<StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT>, ROOT> fieldDefinitions(
      ) {
     StandardMetaobjectDefinitionFieldTemplateProjection<StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT>, ROOT> projection = new StandardMetaobjectDefinitionFieldTemplateProjection<>(this, getRoot());
     getFields().put("fieldDefinitions", projection);
     return projection;
  }

  public StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT> displayNameKey() {
    getFields().put("displayNameKey", null);
    return this;
  }

  public StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StandardMetaobjectDefinitionTemplateProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }
}
