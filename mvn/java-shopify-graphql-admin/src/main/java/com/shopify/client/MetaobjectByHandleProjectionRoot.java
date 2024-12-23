package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> capabilities(
      ) {
    MetaobjectCapabilityDataProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectCapabilityDataProjection<>(this, this);    
    getFields().put("capabilities", projection);
    return projection;
  }

  public AppProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> createdBy(
      ) {
    AppProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdBy", projection);
    return projection;
  }

  public AppProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> createdByApp(
      ) {
    AppProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdByApp", projection);
    return projection;
  }

  public StaffMemberProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> createdByStaff(
      ) {
    StaffMemberProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("createdByStaff", projection);
    return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> definition(
      ) {
    MetaobjectDefinitionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("definition", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> field(
      ) {
    MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> field(
      String key) {
    MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> fields(
      ) {
    MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("fields", projection);
    return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> referencedBy(
      ) {
    MetafieldRelationConnectionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldRelationConnectionProjection<>(this, this);    
    getFields().put("referencedBy", projection);
    return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> referencedBy(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldRelationConnectionProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldRelationConnectionProjection<>(this, this);    
    getFields().put("referencedBy", projection);
    getInputArguments().computeIfAbsent("referencedBy", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("referencedBy").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("referencedBy").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("referencedBy").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("referencedBy").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("referencedBy").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> staffMember(
      ) {
    StaffMemberProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("staffMember", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> thumbnailField(
      ) {
    MetaobjectFieldProjection<MetaobjectByHandleProjectionRoot<PARENT, ROOT>, MetaobjectByHandleProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("thumbnailField", projection);
    return projection;
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectByHandleProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
