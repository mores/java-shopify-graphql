package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> capabilities(
      ) {
     MetaobjectCapabilityDataProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDataProjection<>(this, getRoot());
     getFields().put("capabilities", projection);
     return projection;
  }

  public AppProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> createdBy() {
     AppProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdBy", projection);
     return projection;
  }

  public AppProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> createdByApp() {
     AppProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdByApp", projection);
     return projection;
  }

  public StaffMemberProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> createdByStaff() {
     StaffMemberProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("createdByStaff", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> definition() {
     MetaobjectDefinitionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> field() {
     MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> field(String key) {
    MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> fieldWithVariableReferences(
      String keyReference) {
    MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());              
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> fields() {
     MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("fields", projection);
     return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> referencedBy(
      ) {
     MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationConnectionProjection<>(this, getRoot());
     getFields().put("referencedBy", projection);
     return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> referencedBy(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationConnectionProjection<>(this, getRoot());    
    getFields().put("referencedBy", projection);
    getInputArguments().computeIfAbsent("referencedBy", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("referencedBy").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("referencedBy").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("referencedBy").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("referencedBy").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("referencedBy").add(reverseArg);
    return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> referencedByWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MetafieldRelationConnectionProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationConnectionProjection<>(this, getRoot());    
    getFields().put("referencedBy", projection);
    getInputArguments().computeIfAbsent("referencedBy", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("referencedBy").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("referencedBy").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("referencedBy").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("referencedBy").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("referencedBy").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> thumbnailField() {
     MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("thumbnailField", projection);
     return projection;
  }

  public MetaobjectProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }
}
