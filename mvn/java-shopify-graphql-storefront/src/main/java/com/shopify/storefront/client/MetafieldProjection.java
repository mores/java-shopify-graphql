package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metafield"));
  }

  public MetafieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldParentResourceProjection<MetafieldProjection<PARENT, ROOT>, ROOT> parentResource(
      ) {
     MetafieldParentResourceProjection<MetafieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldParentResourceProjection<>(this, getRoot());
     getFields().put("parentResource", projection);
     return projection;
  }

  public MetafieldReferenceProjection<MetafieldProjection<PARENT, ROOT>, ROOT> reference() {
     MetafieldReferenceProjection<MetafieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceProjection<>(this, getRoot());
     getFields().put("reference", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetafieldProjection<PARENT, ROOT>, ROOT> references(
      ) {
     MetafieldReferenceConnectionProjection<MetafieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());
     getFields().put("references", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetafieldProjection<PARENT, ROOT>, ROOT> references(
      String after, String before, Integer first, Integer last) {
    MetafieldReferenceConnectionProjection<MetafieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());    
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

  public MetafieldProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MetafieldProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
