package com.shopify.client;

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
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
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
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public PrivateMetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>, FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public FulfillmentConstraintRulesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
