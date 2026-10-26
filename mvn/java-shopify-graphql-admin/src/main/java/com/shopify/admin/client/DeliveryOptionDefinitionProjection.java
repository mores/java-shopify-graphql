package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryOptionDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryOptionDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryOptionDefinition"));
  }

  public DeliveryOptionDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyCodeProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> freeDeliveryMinimumValue(
      ) {
     MoneyV2Projection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("freeDeliveryMinimumValue", projection);
     return projection;
  }

  public CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedCollections(
      ) {
     CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("includedCollections", projection);
     return projection;
  }

  public CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedCollections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("includedCollections", projection);
    getInputArguments().computeIfAbsent("includedCollections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("includedCollections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("includedCollections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("includedCollections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("includedCollections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("includedCollections").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedCollectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("includedCollections", projection);
    getInputArguments().computeIfAbsent("includedCollections", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedCollections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedCollections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedCollections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedCollections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("includedCollections").add(reverseArg);
    return projection;
  }

  public LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedLocations(
      ) {
     LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("includedLocations", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedLocations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("includedLocations", projection);
    getInputArguments().computeIfAbsent("includedLocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("includedLocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("includedLocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("includedLocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("includedLocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("includedLocations").add(reverseArg);
    return projection;
  }

  public LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> includedLocationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    LocationConnectionProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("includedLocations", projection);
    getInputArguments().computeIfAbsent("includedLocations", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedLocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedLocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("includedLocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("includedLocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("includedLocations").add(reverseArg);
    return projection;
  }

  public DeliveryOptionDefinitionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public DeliveryOptionDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryOptionDefinitionProjection<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public DeliveryCarrierCalculatedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> onDeliveryCarrierCalculatedOptionDefinition(
      ) {
    DeliveryCarrierCalculatedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCarrierCalculatedOptionDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryFlatRateOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> onDeliveryFlatRateOptionDefinition(
      ) {
    DeliveryFlatRateOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryFlatRateOptionDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryValueBasedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> onDeliveryValueBasedOptionDefinition(
      ) {
    DeliveryValueBasedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryValueBasedOptionDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> onDeliveryWeightBasedOptionDefinition(
      ) {
    DeliveryWeightBasedOptionDefinitionFragmentProjection<DeliveryOptionDefinitionProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryWeightBasedOptionDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
