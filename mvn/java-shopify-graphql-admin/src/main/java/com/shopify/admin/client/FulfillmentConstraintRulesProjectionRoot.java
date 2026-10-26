package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentConstraintRulesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConstraintRulesProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentConstraintRule"));
  }

  public FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodTypeProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> deliveryMethodTypes(
      ) {
    DeliveryMethodTypeProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new DeliveryMethodTypeProjection<>(this, this);    
    getFields().put("deliveryMethodTypes", projection);
    return projection;
  }

  public ShopifyFunctionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> function(
      ) {
    ShopifyFunctionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new ShopifyFunctionProjection<>(this, this);    
    getFields().put("function", projection);
    return projection;
  }

  public MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys, false, null);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keysReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
