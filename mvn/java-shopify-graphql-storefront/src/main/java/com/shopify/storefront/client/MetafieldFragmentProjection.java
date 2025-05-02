package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetafieldFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metafield"));
  }

  public MetafieldFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldParentResourceProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> parentResource(
      ) {
     MetafieldParentResourceProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldParentResourceProjection<>(this, getRoot());
     getFields().put("parentResource", projection);
     return projection;
  }

  public MetafieldReferenceProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> reference() {
     MetafieldReferenceProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceProjection<>(this, getRoot());
     getFields().put("reference", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> references(
      ) {
     MetafieldReferenceConnectionProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());
     getFields().put("references", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> references(
      String after, String before, Integer first, Integer last) {
    MetafieldReferenceConnectionProjection<MetafieldFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());    
    getFields().put("references", projection);
    getInputArguments().computeIfAbsent("references", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("references").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("references").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("references").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("references").add(lastArg);
    return projection;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MetafieldFragmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Metafield {");
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
