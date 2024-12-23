package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectProjectionRoot() {
    super(null, null, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> capabilities(
      ) {
    MetaobjectCapabilityDataProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectCapabilityDataProjection<>(this, this);    
    getFields().put("capabilities", projection);
    return projection;
  }

  public AppProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> createdBy(
      ) {
    AppProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdBy", projection);
    return projection;
  }

  public AppProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> createdByApp(
      ) {
    AppProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("createdByApp", projection);
    return projection;
  }

  public StaffMemberProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> createdByStaff(
      ) {
    StaffMemberProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("createdByStaff", projection);
    return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> definition(
      ) {
    MetaobjectDefinitionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("definition", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> field(
      ) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> field(
      String key) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> fields(
      ) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("fields", projection);
    return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> referencedBy(
      ) {
    MetafieldRelationConnectionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetafieldRelationConnectionProjection<>(this, this);    
    getFields().put("referencedBy", projection);
    return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> referencedBy(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldRelationConnectionProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetafieldRelationConnectionProjection<>(this, this);    
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

  public StaffMemberProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> staffMember(
      ) {
    StaffMemberProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("staffMember", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> thumbnailField(
      ) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("thumbnailField", projection);
    return projection;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
