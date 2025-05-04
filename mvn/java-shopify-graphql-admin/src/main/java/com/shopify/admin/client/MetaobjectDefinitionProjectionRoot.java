package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectDefinitionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinition"));
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectAccessProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> access(
      ) {
    MetaobjectAccessProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetaobjectAccessProjection<>(this, this);    
    getFields().put("access", projection);
    return projection;
  }

  public MetaobjectCapabilitiesProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> capabilities(
      ) {
    MetaobjectCapabilitiesProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetaobjectCapabilitiesProjection<>(this, this);    
    getFields().put("capabilities", projection);
    return projection;
  }

  public AppProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> createdByApp(
      ) {
    AppProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdByApp", projection);
    return projection;
  }

  public StaffMemberProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> createdByStaff(
      ) {
    StaffMemberProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("createdByStaff", projection);
    return projection;
  }

  public MetaobjectFieldDefinitionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> fieldDefinitions(
      ) {
    MetaobjectFieldDefinitionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldDefinitionProjection<>(this, this);    
    getFields().put("fieldDefinitions", projection);
    return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> metaobjects(
      ) {
    MetaobjectConnectionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetaobjectConnectionProjection<>(this, this);    
    getFields().put("metaobjects", projection);
    return projection;
  }

  public MetaobjectConnectionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> metaobjects(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetaobjectConnectionProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetaobjectConnectionProjection<>(this, this);    
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

  public StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> standardTemplate(
      ) {
    StandardMetaobjectDefinitionTemplateProjection<MetaobjectDefinitionProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionProjectionRoot<PARENT, ROOT>> projection = new StandardMetaobjectDefinitionTemplateProjection<>(this, this);    
    getFields().put("standardTemplate", projection);
    return projection;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> displayNameKey() {
    getFields().put("displayNameKey", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> hasThumbnailField() {
    getFields().put("hasThumbnailField", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> metaobjectsCount() {
    getFields().put("metaobjectsCount", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetaobjectDefinitionProjectionRoot<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }
}
