package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ShippingConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingConfiguration"));
  }

  public ShippingConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitions(
      ) {
     DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("optionDefinitions", projection);
     return projection;
  }

  public DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitions(
      Boolean active, Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("optionDefinitions", projection);
    getInputArguments().computeIfAbsent("optionDefinitions", k -> new ArrayList<>());                      
    InputArgument activeArg = new InputArgument("active", active, false, null);
    getInputArguments().get("optionDefinitions").add(activeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("optionDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("optionDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("optionDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("optionDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("optionDefinitions").add(reverseArg);
    return projection;
  }

  public DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitionsWithVariableReferences(
      String activeReference, String firstReference, String afterReference, String lastReference,
      String beforeReference, String reverseReference) {
    DeliveryOptionDefinitionConnectionProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("optionDefinitions", projection);
    getInputArguments().computeIfAbsent("optionDefinitions", k -> new ArrayList<>());              
    InputArgument activeArg = new InputArgument("active", activeReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("optionDefinitions").add(activeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("optionDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("optionDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("optionDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("optionDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("optionDefinitions").add(reverseArg);
    return projection;
  }

  public CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitionsCount(
      ) {
     CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("optionDefinitionsCount", projection);
     return projection;
  }

  public CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitionsCount(
      Boolean active) {
    CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("optionDefinitionsCount", projection);
    getInputArguments().computeIfAbsent("optionDefinitionsCount", k -> new ArrayList<>());                      
    InputArgument activeArg = new InputArgument("active", active, false, null);
    getInputArguments().get("optionDefinitionsCount").add(activeArg);
    return projection;
  }

  public CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> optionDefinitionsCountWithVariableReferences(
      String activeReference) {
    CountProjection<ShippingConfigurationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("optionDefinitionsCount", projection);
    getInputArguments().computeIfAbsent("optionDefinitionsCount", k -> new ArrayList<>());              
    InputArgument activeArg = new InputArgument("active", activeReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("optionDefinitionsCount").add(activeArg);
    return projection;
  }

  public ShippingConfigurationProjection<PARENT, ROOT> isEnabled() {
    getFields().put("isEnabled", null);
    return this;
  }
}
