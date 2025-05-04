package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetaobjectDefinitionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectDefinition"));
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectAccessProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> access(
      ) {
     MetaobjectAccessProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectAccessProjection<>(this, getRoot());
     getFields().put("access", projection);
     return projection;
  }

  public MetaobjectCapabilitiesProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> capabilities(
      ) {
     MetaobjectCapabilitiesProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilitiesProjection<>(this, getRoot());
     getFields().put("capabilities", projection);
     return projection;
  }

  public AppProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> createdByApp() {
     AppProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdByApp", projection);
     return projection;
  }

  public StaffMemberProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> createdByStaff(
      ) {
     StaffMemberProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("createdByStaff", projection);
     return projection;
  }

  public MetaobjectFieldDefinitionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> fieldDefinitions(
      ) {
     MetaobjectFieldDefinitionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldDefinitionProjection<>(this, getRoot());
     getFields().put("fieldDefinitions", projection);
     return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> metaobjects(
      ) {
     MetaobjectConnectionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());
     getFields().put("metaobjects", projection);
     return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> metaobjects(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetaobjectConnectionProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());    
    getFields().put("metaobjects", projection);
    getInputArguments().computeIfAbsent("metaobjects", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metaobjects").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metaobjects").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metaobjects").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metaobjects").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metaobjects").add(reverseArg);
    return projection;
  }

  public StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> standardTemplate(
      ) {
     StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StandardMetaobjectDefinitionTemplateProjection<>(this, getRoot());
     getFields().put("standardTemplate", projection);
     return projection;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> displayNameKey() {
    getFields().put("displayNameKey", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> hasThumbnailField() {
    getFields().put("hasThumbnailField", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> metaobjectsCount() {
    getFields().put("metaobjectsCount", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetaobjectDefinitionFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MetaobjectDefinition {");
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
