package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectDefinitionByTypeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionByTypeProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinition"));
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectAccessProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> access(
      ) {
    MetaobjectAccessProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new MetaobjectAccessProjection<>(this, this);    
    getFields().put("access", projection);
    return projection;
  }

  public MetaobjectCapabilitiesProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> capabilities(
      ) {
    MetaobjectCapabilitiesProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new MetaobjectCapabilitiesProjection<>(this, this);    
    getFields().put("capabilities", projection);
    return projection;
  }

  public AppProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> createdByApp(
      ) {
    AppProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdByApp", projection);
    return projection;
  }

  public StaffMemberProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> createdByStaff(
      ) {
    StaffMemberProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("createdByStaff", projection);
    return projection;
  }

  public MetaobjectFieldDefinitionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> fieldDefinitions(
      ) {
    MetaobjectFieldDefinitionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldDefinitionProjection<>(this, this);    
    getFields().put("fieldDefinitions", projection);
    return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> metaobjects(
      ) {
    MetaobjectConnectionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new MetaobjectConnectionProjection<>(this, this);    
    getFields().put("metaobjects", projection);
    return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> metaobjects(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetaobjectConnectionProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new MetaobjectConnectionProjection<>(this, this);    
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

  public StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> standardTemplate(
      ) {
    StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT>> projection = new StandardMetaobjectDefinitionTemplateProjection<>(this, this);    
    getFields().put("standardTemplate", projection);
    return projection;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> displayNameKey() {
    getFields().put("displayNameKey", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> hasThumbnailField() {
    getFields().put("hasThumbnailField", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> metaobjectsCount() {
    getFields().put("metaobjectsCount", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetaobjectDefinitionByTypeProjectionRoot<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }
}
