package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedOptionDefinition"));
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> currency(
      ) {
     CurrencyCodeProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> freeDeliveryMinimumValue(
      ) {
     MoneyV2Projection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("freeDeliveryMinimumValue", projection);
     return projection;
  }

  public CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedCollections(
      ) {
     CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("includedCollections", projection);
     return projection;
  }

  public CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedCollections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedCollectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedLocations(
      ) {
     LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("includedLocations", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedLocations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
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

  public LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> includedLocationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    LocationConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
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

  public DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> rateGroups(
      ) {
     DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupConnectionProjection<>(this, getRoot());
     getFields().put("rateGroups", projection);
     return projection;
  }

  public DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> rateGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupConnectionProjection<>(this, getRoot());    
    getFields().put("rateGroups", projection);
    getInputArguments().computeIfAbsent("rateGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("rateGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("rateGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("rateGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("rateGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("rateGroups").add(reverseArg);
    return projection;
  }

  public DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> rateGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DeliveryWeightBasedRateGroupConnectionProjection<DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupConnectionProjection<>(this, getRoot());    
    getFields().put("rateGroups", projection);
    getInputArguments().computeIfAbsent("rateGroups", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rateGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rateGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rateGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rateGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("rateGroups").add(reverseArg);
    return projection;
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public DeliveryWeightBasedOptionDefinitionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryWeightBasedOptionDefinition {");
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
