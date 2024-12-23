package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetaobjectFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> capabilities(
      ) {
     MetaobjectCapabilityDataProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDataProjection<>(this, getRoot());
     getFields().put("capabilities", projection);
     return projection;
  }

  public AppProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> createdBy() {
     AppProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdBy", projection);
     return projection;
  }

  public AppProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> createdByApp() {
     AppProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdByApp", projection);
     return projection;
  }

  public StaffMemberProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> createdByStaff() {
     StaffMemberProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("createdByStaff", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetaobjectDefinitionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> field() {
     MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> field(
      String key) {
    MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> fields() {
     MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("fields", projection);
     return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> referencedBy(
      ) {
     MetafieldRelationConnectionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationConnectionProjection<>(this, getRoot());
     getFields().put("referencedBy", projection);
     return projection;
  }

  public MetafieldRelationConnectionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> referencedBy(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldRelationConnectionProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationConnectionProjection<>(this, getRoot());    
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

  public StaffMemberProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> thumbnailField(
      ) {
     MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("thumbnailField", projection);
     return projection;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Metaobject {");
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
