package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class LocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Location"));
  }

  public LocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddressProjection<LocationProjection<PARENT, ROOT>, ROOT> address() {
     LocationAddressProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new LocationAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<LocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public LocationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LocationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
